/*
 * XML Type:  blocking-round
 * Namespace: http://configuration.openempi.openhie.org/suffix-array-blocking
 * Java type: org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingRound
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.suffixarrayblocking.impl;
/**
 * An XML blocking-round(@http://configuration.openempi.openhie.org/suffix-array-blocking).
 *
 * This is a complex type.
 */
public class BlockingRoundImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingRound
{
    
    public BlockingRoundImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BLOCKINGFIELDS$0 = 
        new javax.xml.namespace.QName("http://configuration.openempi.openhie.org/suffix-array-blocking", "blocking-fields");
    
    
    /**
     * Gets the "blocking-fields" element
     */
    public org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields getBlockingFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields target = null;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields)get_store().find_element_user(BLOCKINGFIELDS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "blocking-fields" element
     */
    public void setBlockingFields(org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields blockingFields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields target = null;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields)get_store().find_element_user(BLOCKINGFIELDS$0, 0);
            if (target == null)
            {
                target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields)get_store().add_element_user(BLOCKINGFIELDS$0);
            }
            target.set(blockingFields);
        }
    }
    
    /**
     * Appends and returns a new empty "blocking-fields" element
     */
    public org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields addNewBlockingFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields target;
            target = (org.openhie.openempi.configuration.xml.suffixarrayblocking.BlockingFields)get_store().add_element_user(BLOCKINGFIELDS$0);
            return target;
        }
    }
}
