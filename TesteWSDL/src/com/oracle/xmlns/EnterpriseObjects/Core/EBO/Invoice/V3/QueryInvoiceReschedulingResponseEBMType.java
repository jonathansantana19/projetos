/**
 * QueryInvoiceReschedulingResponseEBMType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReschedulingResponseEBMType  extends com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseDataAreaType dataArea;

    public QueryInvoiceReschedulingResponseEBMType() {
    }

    public QueryInvoiceReschedulingResponseEBMType(
           java.lang.String versionID,
           java.lang.String languageCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType EBMHeader,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseDataAreaType dataArea) {
    	super();
        this.dataArea = dataArea;
    }


    /**
     * Gets the dataArea value for this QueryInvoiceReschedulingResponseEBMType.
     * 
     * @return dataArea
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseDataAreaType getDataArea() {
        return dataArea;
    }


    /**
     * Sets the dataArea value for this QueryInvoiceReschedulingResponseEBMType.
     * 
     * @param dataArea
     */
    public void setDataArea(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseDataAreaType dataArea) {
        this.dataArea = dataArea;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReschedulingResponseEBMType)) return false;
        QueryInvoiceReschedulingResponseEBMType other = (QueryInvoiceReschedulingResponseEBMType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataArea==null && other.getDataArea()==null) || 
             (this.dataArea!=null &&
              this.dataArea.equals(other.getDataArea())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDataArea() != null) {
            _hashCode += getDataArea().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReschedulingResponseEBMType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseEBMType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DataArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseDataAreaType"));
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
