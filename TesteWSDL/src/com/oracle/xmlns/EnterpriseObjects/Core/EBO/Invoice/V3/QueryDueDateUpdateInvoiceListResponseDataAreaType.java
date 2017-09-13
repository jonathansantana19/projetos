/**
 * QueryDueDateUpdateInvoiceListResponseDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryDueDateUpdateInvoiceListResponseDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseType queryDueDateUpdateInvoiceListResponse;

    public QueryDueDateUpdateInvoiceListResponseDataAreaType() {
    }

    public QueryDueDateUpdateInvoiceListResponseDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseType queryDueDateUpdateInvoiceListResponse) {
           this.queryResponse = queryResponse;
           this.queryDueDateUpdateInvoiceListResponse = queryDueDateUpdateInvoiceListResponse;
    }


    /**
     * Gets the queryResponse value for this QueryDueDateUpdateInvoiceListResponseDataAreaType.
     * 
     * @return queryResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType getQueryResponse() {
        return queryResponse;
    }


    /**
     * Sets the queryResponse value for this QueryDueDateUpdateInvoiceListResponseDataAreaType.
     * 
     * @param queryResponse
     */
    public void setQueryResponse(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse) {
        this.queryResponse = queryResponse;
    }


    /**
     * Gets the queryDueDateUpdateInvoiceListResponse value for this QueryDueDateUpdateInvoiceListResponseDataAreaType.
     * 
     * @return queryDueDateUpdateInvoiceListResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseType getQueryDueDateUpdateInvoiceListResponse() {
        return queryDueDateUpdateInvoiceListResponse;
    }


    /**
     * Sets the queryDueDateUpdateInvoiceListResponse value for this QueryDueDateUpdateInvoiceListResponseDataAreaType.
     * 
     * @param queryDueDateUpdateInvoiceListResponse
     */
    public void setQueryDueDateUpdateInvoiceListResponse(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseType queryDueDateUpdateInvoiceListResponse) {
        this.queryDueDateUpdateInvoiceListResponse = queryDueDateUpdateInvoiceListResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDueDateUpdateInvoiceListResponseDataAreaType)) return false;
        QueryDueDateUpdateInvoiceListResponseDataAreaType other = (QueryDueDateUpdateInvoiceListResponseDataAreaType) obj;
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
            ((this.queryDueDateUpdateInvoiceListResponse==null && other.getQueryDueDateUpdateInvoiceListResponse()==null) || 
             (this.queryDueDateUpdateInvoiceListResponse!=null &&
              this.queryDueDateUpdateInvoiceListResponse.equals(other.getQueryDueDateUpdateInvoiceListResponse())));
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
        if (getQueryDueDateUpdateInvoiceListResponse() != null) {
            _hashCode += getQueryDueDateUpdateInvoiceListResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDueDateUpdateInvoiceListResponseDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDueDateUpdateInvoiceListResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseType"));
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
