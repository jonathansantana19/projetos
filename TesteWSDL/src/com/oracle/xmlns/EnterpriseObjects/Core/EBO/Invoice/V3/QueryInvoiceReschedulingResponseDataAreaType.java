/**
 * QueryInvoiceReschedulingResponseDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReschedulingResponseDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseType queryInvoiceReschedulingResponse;

    public QueryInvoiceReschedulingResponseDataAreaType() {
    }

    public QueryInvoiceReschedulingResponseDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseType queryInvoiceReschedulingResponse) {
           this.queryResponse = queryResponse;
           this.queryInvoiceReschedulingResponse = queryInvoiceReschedulingResponse;
    }


    /**
     * Gets the queryResponse value for this QueryInvoiceReschedulingResponseDataAreaType.
     * 
     * @return queryResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType getQueryResponse() {
        return queryResponse;
    }


    /**
     * Sets the queryResponse value for this QueryInvoiceReschedulingResponseDataAreaType.
     * 
     * @param queryResponse
     */
    public void setQueryResponse(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse) {
        this.queryResponse = queryResponse;
    }


    /**
     * Gets the queryInvoiceReschedulingResponse value for this QueryInvoiceReschedulingResponseDataAreaType.
     * 
     * @return queryInvoiceReschedulingResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseType getQueryInvoiceReschedulingResponse() {
        return queryInvoiceReschedulingResponse;
    }


    /**
     * Sets the queryInvoiceReschedulingResponse value for this QueryInvoiceReschedulingResponseDataAreaType.
     * 
     * @param queryInvoiceReschedulingResponse
     */
    public void setQueryInvoiceReschedulingResponse(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseType queryInvoiceReschedulingResponse) {
        this.queryInvoiceReschedulingResponse = queryInvoiceReschedulingResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReschedulingResponseDataAreaType)) return false;
        QueryInvoiceReschedulingResponseDataAreaType other = (QueryInvoiceReschedulingResponseDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryResponse==null && other.getQueryResponse()==null) || 
             (this.queryResponse!=null &&
              this.queryResponse.equals(other.getQueryResponse()))) &&
            ((this.queryInvoiceReschedulingResponse==null && other.getQueryInvoiceReschedulingResponse()==null) || 
             (this.queryInvoiceReschedulingResponse!=null &&
              this.queryInvoiceReschedulingResponse.equals(other.getQueryInvoiceReschedulingResponse())));
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
        if (getQueryResponse() != null) {
            _hashCode += getQueryResponse().hashCode();
        }
        if (getQueryInvoiceReschedulingResponse() != null) {
            _hashCode += getQueryInvoiceReschedulingResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReschedulingResponseDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryInvoiceReschedulingResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseType"));
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
