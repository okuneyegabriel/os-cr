/*
 * XML Type:  file-loader-config
 * Namespace: http://configuration.openempi.openhie.org/file-loader
 * Java type: org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig
 *
 * Automatically generated - do not modify.
 */
package org.openhie.openempi.configuration.xml.fileloader;


/**
 * An XML file-loader-config(@http://configuration.openempi.openhie.org/file-loader).
 *
 * This is a complex type.
 */
public interface FileLoaderConfig extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)schema.system.s677C2BB6A526EE09418A5F3BEF00561F.TypeSystemHolder.typeSystem.resolveHandle("fileloaderconfige600type");
    
    /**
     * Gets the "header-line-present" element
     */
    boolean getHeaderLinePresent();
    
    /**
     * Gets (as xml) the "header-line-present" element
     */
    org.apache.xmlbeans.XmlBoolean xgetHeaderLinePresent();
    
    /**
     * Sets the "header-line-present" element
     */
    void setHeaderLinePresent(boolean headerLinePresent);
    
    /**
     * Sets (as xml) the "header-line-present" element
     */
    void xsetHeaderLinePresent(org.apache.xmlbeans.XmlBoolean headerLinePresent);
    
    /**
     * Gets the "data-fields" element
     */
    org.openhie.openempi.configuration.xml.fileloader.DataFields getDataFields();
    
    /**
     * Sets the "data-fields" element
     */
    void setDataFields(org.openhie.openempi.configuration.xml.fileloader.DataFields dataFields);
    
    /**
     * Appends and returns a new empty "data-fields" element
     */
    org.openhie.openempi.configuration.xml.fileloader.DataFields addNewDataFields();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig newInstance() {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.lang.String s) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.lang.String s, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( s, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.io.File f) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.io.File f, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( f, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /*public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        public static org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig parse(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return (org.openhie.openempi.configuration.xml.fileloader.FileLoaderConfig) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        public static weblogic.xml.stream.XMLInputStream newValidatingXMLInputStream(weblogic.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, weblogic.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }*/
        
        private Factory() { } // No instance of this class allowed
    }
}
