/*
 * XML Type:  probabilistic-matching-type
 * Namespace: http://configuration.openempi.openhie.org/probabilistic-matching
 * Java type: org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.probabilisticmatching;


/**
 * An XML probabilistic-matching-type(@http://configuration.openempi.openhie.org/probabilistic-matching).
 *
 * This is a complex type.
 */
public interface ProbabilisticMatchingType extends org.openhie.openempi.configuration.xml.MatchingConfigurationType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("probabilisticmatchingtypea638type");
    
    /**
     * Gets the "false-negative-probability" element
     */
    float getFalseNegativeProbability();
    
    /**
     * Gets (as xml) the "false-negative-probability" element
     */
    org.apache.xmlbeans.XmlFloat xgetFalseNegativeProbability();
    
    /**
     * True if has "false-negative-probability" element
     */
    boolean isSetFalseNegativeProbability();
    
    /**
     * Sets the "false-negative-probability" element
     */
    void setFalseNegativeProbability(float falseNegativeProbability);
    
    /**
     * Sets (as xml) the "false-negative-probability" element
     */
    void xsetFalseNegativeProbability(org.apache.xmlbeans.XmlFloat falseNegativeProbability);
    
    /**
     * Unsets the "false-negative-probability" element
     */
    void unsetFalseNegativeProbability();
    
    /**
     * Gets the "false-positive-probability" element
     */
    float getFalsePositiveProbability();
    
    /**
     * Gets (as xml) the "false-positive-probability" element
     */
    org.apache.xmlbeans.XmlFloat xgetFalsePositiveProbability();
    
    /**
     * True if has "false-positive-probability" element
     */
    boolean isSetFalsePositiveProbability();
    
    /**
     * Sets the "false-positive-probability" element
     */
    void setFalsePositiveProbability(float falsePositiveProbability);
    
    /**
     * Sets (as xml) the "false-positive-probability" element
     */
    void xsetFalsePositiveProbability(org.apache.xmlbeans.XmlFloat falsePositiveProbability);
    
    /**
     * Unsets the "false-positive-probability" element
     */
    void unsetFalsePositiveProbability();
    
    /**
     * Gets the "match-fields" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.MatchFields getMatchFields();
    
    /**
     * Sets the "match-fields" element
     */
    void setMatchFields(org.openhie.openempi.configuration.xml.probabilisticmatching.MatchFields matchFields);
    
    /**
     * Appends and returns a new empty "match-fields" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.MatchFields addNewMatchFields();
    
    /**
     * Gets the "config-file-directory" element
     */
    java.lang.String getConfigFileDirectory();
    
    /**
     * Gets (as xml) the "config-file-directory" element
     */
    org.apache.xmlbeans.XmlString xgetConfigFileDirectory();
    
    /**
     * Sets the "config-file-directory" element
     */
    void setConfigFileDirectory(java.lang.String configFileDirectory);
    
    /**
     * Sets (as xml) the "config-file-directory" element
     */
    void xsetConfigFileDirectory(org.apache.xmlbeans.XmlString configFileDirectory);
    
    /**
     * Gets the "logging-configuration" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.LoggingConfiguration getLoggingConfiguration();
    
    /**
     * True if has "logging-configuration" element
     */
    boolean isSetLoggingConfiguration();
    
    /**
     * Sets the "logging-configuration" element
     */
    void setLoggingConfiguration(org.openhie.openempi.configuration.xml.probabilisticmatching.LoggingConfiguration loggingConfiguration);
    
    /**
     * Appends and returns a new empty "logging-configuration" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.LoggingConfiguration addNewLoggingConfiguration();
    
    /**
     * Unsets the "logging-configuration" element
     */
    void unsetLoggingConfiguration();
    
    /**
     * Gets the "vector-classifications" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.VectorClassifications getVectorClassifications();
    
    /**
     * True if has "vector-classifications" element
     */
    boolean isSetVectorClassifications();
    
    /**
     * Sets the "vector-classifications" element
     */
    void setVectorClassifications(org.openhie.openempi.configuration.xml.probabilisticmatching.VectorClassifications vectorClassifications);
    
    /**
     * Appends and returns a new empty "vector-classifications" element
     */
    org.openhie.openempi.configuration.xml.probabilisticmatching.VectorClassifications addNewVectorClassifications();
    
    /**
     * Unsets the "vector-classifications" element
     */
    void unsetVectorClassifications();
    
    /**
     * Gets the "entity-name" attribute
     */
    java.lang.String getEntityName();
    
    /**
     * Gets (as xml) the "entity-name" attribute
     */
    org.apache.xmlbeans.XmlString xgetEntityName();
    
    /**
     * True if has "entity-name" attribute
     */
    boolean isSetEntityName();
    
    /**
     * Sets the "entity-name" attribute
     */
    void setEntityName(java.lang.String entityName);
    
    /**
     * Sets (as xml) the "entity-name" attribute
     */
    void xsetEntityName(org.apache.xmlbeans.XmlString entityName);
    
    /**
     * Unsets the "entity-name" attribute
     */
    void unsetEntityName();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType newInstance() {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.probabilisticmatching.ProbabilisticMatchingType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
