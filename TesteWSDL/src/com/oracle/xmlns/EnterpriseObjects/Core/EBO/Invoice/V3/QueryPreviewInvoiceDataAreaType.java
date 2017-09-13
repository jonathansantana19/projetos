/**
 * QueryPreviewInvoiceDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryPreviewInvoiceDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceType queryPreviewInvoice;

    public QueryPreviewInvoiceDataAreaType() {
    }

    public QueryPreviewInvoiceDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceType queryPreviewInvoice) {
           this.queryPreviewInvoice = queryPreviewInvoice;
    }


    /**
     * Gets the queryPreviewInvoice value for this QueryPreviewInvoiceDataAreaType.
     * 
     * @return queryPreviewInvoice
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceType getQueryPreviewInvoice() {
        return queryPreviewInvoice;
    }


    /**
     * Sets the queryPreviewInvoice value for this QueryPreviewInvoiceDataAreaType.
     * 
     * @param queryPreviewInvoice
     */
    public void setQueryPreviewInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceType queryPreviewInvoice) {
        this.queryPreviewInvoice = queryPreviewInvoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryPreviewInvoiceDataAreaType)) return false;
        QueryPreviewInvoiceDataAreaType other = (QueryPreviewInvoiceDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryPreviewInvoice==null && other.getQueryPreviewInvoice()==null) || 
             (this.queryPreviewInvoice!=null &&
              this.queryPreviewInvoice.equals(other.getQueryPreviewInvoice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getQueryPreviewInvoice() != null) {
            _hashCode += getQueryPreviewInvoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryPreviewInvoiceDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryPreviewInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
