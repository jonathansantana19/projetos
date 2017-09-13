/**
 * QueryDueDateUpdateInvoiceListResponseEBMType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryDueDateUpdateInvoiceListResponseEBMType  extends com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType[] dataArea;

    public QueryDueDateUpdateInvoiceListResponseEBMType() {
    }

    public QueryDueDateUpdateInvoiceListResponseEBMType(
           java.lang.String versionID,
           java.lang.String languageCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType EBMHeader,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType[] dataArea) {
    	super();
        this.dataArea = dataArea;
    }


    /**
     * Gets the dataArea value for this QueryDueDateUpdateInvoiceListResponseEBMType.
     * 
     * @return dataArea
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType[] getDataArea() {
        return dataArea;
    }


    /**
     * Sets the dataArea value for this QueryDueDateUpdateInvoiceListResponseEBMType.
     * 
     * @param dataArea
     */
    public void setDataArea(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType[] dataArea) {
        this.dataArea = dataArea;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType getDataArea(int i) {
        return this.dataArea[i];
    }

    public void setDataArea(int i, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType _value) {
        this.dataArea[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDueDateUpdateInvoiceListResponseEBMType)) return false;
        QueryDueDateUpdateInvoiceListResponseEBMType other = (QueryDueDateUpdateInvoiceListResponseEBMType) obj;
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
              java.util.Arrays.equals(this.dataArea, other.getDataArea())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataArea());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataArea(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDueDateUpdateInvoiceListResponseEBMType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseEBMType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataArea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DataArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseDataAreaType"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
