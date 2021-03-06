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
package org.openempi.webapp.client.model;

import com.extjs.gxt.ui.client.data.BaseModelData;

public class JobEntryEventLogWeb extends BaseModelData
{

	public JobEntryEventLogWeb() {
	}

	public java.lang.Integer getEventEntryEventLogId() {
		return get("eventEntryEventLogId");
	}

	public void setEventEntryEventLogId(java.lang.Integer eventEntryEventLogId) {
		set("eventEntryEventLogId", eventEntryEventLogId);
	}

	public java.lang.String getLogMessage() {
		return get("logMessage");
	}

	public void setLogMessage(java.lang.String logMessage) {
		set("logMessage", logMessage);
	}

	public java.util.Date getDateCreated() {
		return get("dateCreated");
	}

	public void setDateCreated(java.util.Date dateCreated) {
		set("dateCreated", dateCreated);
	}
}
