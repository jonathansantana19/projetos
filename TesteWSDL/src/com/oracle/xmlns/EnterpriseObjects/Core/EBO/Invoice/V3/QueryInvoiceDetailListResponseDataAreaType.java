/**
 * QueryInvoiceDetailListResponseDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceDetailListResponseDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseType queryInvoiceDetailListResponse;

    public QueryInvoiceDetailListResponseDataAreaType() {
    }

    public QueryInvoiceDetailListResponseDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseType queryInvoiceDetailListResponse) {
           this.queryInvoiceDetailListResponse = queryInvoiceDetailListResponse;
    }


    /**
     * Gets the queryInvoiceDetailListResponse value for this QueryInvoiceDetailListResponseDataAreaType.
     * 
     * @return queryInvoiceDetailListResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseType getQueryInvoiceDetailListResponse() {
        return queryInvoiceDetailListResponse;
    }


    /**
     * Sets the queryInvoiceDetailListResponse value for this QueryInvoiceDetailListResponseDataAreaType.
     * 
     * @param queryInvoiceDetailListResponse
     */
    public void setQueryInvoiceDetailListResponse(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseType queryInvoiceDetailListResponse) {
        this.queryInvoiceDetailListResponse = queryInvoiceDetailListResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceDetailListResponseDataAreaType)) return false;
        QueryInvoiceDetailListResponseDataAreaType other = (QueryInvoiceDetailListResponseDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryInvoiceDetailListResponse==null && other.getQueryInvoiceDetailListResponse()==null) || 
             (this.queryInvoiceDetailListResponse!=null &&
              this.queryInvoiceDetailListResponse.equals(other.getQueryInvoiceDetailListResponse())));
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
        if (getQueryInvoiceDetailListResponse() != null) {
            _hashCode += getQueryInvoiceDetailListResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceDetailListResponseDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryInvoiceDetailListResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseType"));
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
