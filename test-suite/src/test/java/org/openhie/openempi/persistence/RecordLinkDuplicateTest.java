/**
 *
 * Copyright (C) 2002-2012 "SYSNET International, Inc."
 * support@sysnetint.com [http://www.sysnetint.com]
 *
 * This file is part of OpenEMPI.
 *
 * OpenEMPI is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openhie.openempi.persistence;

import java.util.Date;
import java.util.List;

import org.openhie.openempi.ApplicationException;
import org.openhie.openempi.context.Context;
import org.openhie.openempi.entity.EntityDefinitionManagerService;
import org.openhie.openempi.entity.RecordManagerService;
import org.openhie.openempi.model.Entity;
import org.openhie.openempi.model.Record;
import org.openhie.openempi.model.RecordLink;
import org.openhie.openempi.service.BaseServiceTestCase;

public class RecordLinkDuplicateTest extends BaseServiceTestCase
{
	public void testAddPerson() {
		RecordManagerService manager = Context.getRecordManagerService();
		EntityDefinitionManagerService defService = Context.getEntityDefinitionManagerService();
		List<Entity> entities = defService.loadEntities();
		if (entities.size() == 0) {
			assertTrue("You need to define some entities in the database for this to work.", false);
		}
		Entity entity = entities.get(0);
		log.debug("Testing with entity " + entity);
		Date dateOfBirth = new Date();
		Record recordLeft=null, recordRight=null;
        try {
            recordLeft = new Record(entity);
            recordLeft.set("givenName", "John");
            recordLeft.set("familyName", "Smith");
            recordLeft.set("city", "Herndon");
            recordLeft.set("postalCode", "20170");
            recordLeft.set("dateOfBirth", dateOfBirth);
            recordLeft = manager.addRecord(entity, recordLeft);

            recordRight = new Record(entity);
            recordRight.set("givenName", "John");
            recordRight.set("familyName", "James");
            recordRight.set("city", "Los Angeles");
            recordRight.set("postalCode", "20170");
            recordRight.set("dateOfBirth", dateOfBirth);
            recordRight = manager.addRecord(entity, recordRight);

            List<RecordLink> links = Context.getRecordQueryService().loadRecordLinks(entity, recordRight.getRecordId());
            log.debug("Found: " + links.size() + " links.");
            if (links.size() > 0) {
                log.debug("The records were linked due to a mis-configured matching algorithm; test will be aborted.");
                return;
            }
            RecordLink link = new RecordLink();
            link.setLeftRecord(recordLeft);
            link.setRightRecord(recordRight);
            link.setWeight(0.0);
            link.setVector(0);
            RecordLink link1 = manager.addRecordLink(link);
            log.warn("Created link " + link1);
            link.setRecordLinkId(null);
            try {
                RecordLink link2 = manager.addRecordLink(link);
                log.warn("Created link " + link2);
                assertFalse("The system should not allow you to create the same link twice.", link1.getRecordLinkId().equals(link2.getRecordLinkId()));
            } catch (ApplicationException e) {
                assertTrue("The system should have thrown this exception to prevent the duplicate link from being created.", true);
            }
        } catch (ApplicationException e) {
            log.error("Failed due to: " + e, e);
            assertTrue("Failed due to " + e.getMessage(), false);
        } finally {
            try {
                manager.removeRecord(entity, recordLeft);
                manager.removeRecord(entity, recordRight);            
            } catch (ApplicationException e) {
            }
        }
	}
	/**

	public void testAnotherPerson() {
		EntityManagerService manager = Context.getEntityManagerService();
		EntityDefinitionManagerService defService = Context.getEntityDefinitionManagerService();
		List<Entity> entities = defService.loadEntities();
		if (entities.size() == 0) {
			assertTrue("You need to define some entities in the database for this to work.", false);
		}
		Entity entity = entities.get(0);
		log.debug("Testing with entity " + entity);
		try {
			Record recordRight = new Record(entity);
			recordRight.set("firstName", "Jon");
			recordRight.set("lastName", "Smith");
			recordRight = manager.addEntity(entity, recordRight);

		} catch (ApplicationException e) {
			log.error("Failed due to: " + e, e);
			assertTrue("Failed due to " + e.getMessage(), false);
		}
	}
			Record recordRight = new Record(entity);
			recordRight.set("firstName", "Jon");
			recordRight.set("lastName", "Smith");
			recordRight = manager.addEntity(entity, recordRight);

			Record recordNext = new Record(entity);
			recordNext.set("firstName", "Johnny");
			recordNext.set("lastName", "Smith");
			recordNext = manager.addEntity(entity, recordNext);

			EntityLink link = new EntityLink();
			link.setLeftRecord(recordLeft);
			link.setRightRecord(recordRight);
			link.setWeight(1.0);
			link.setVector(8);
			link.setState(EntityLinkState.MATCH);
			link.setLinkSource(new LinkSource(LinkSource.MANUAL_MATCHING_SOURCE));
			manager.addEntityLink(link);
			
			link = new EntityLink();
			link.setLeftRecord(recordRight);
			link.setRightRecord(recordNext);
			link.setWeight(1.0);
			link.setVector(8);
			link.setState(EntityLinkState.MATCH);
			link.setLinkSource(new LinkSource(LinkSource.MANUAL_MATCHING_SOURCE));
			manager.addEntityLink(link);
	*/		
}
