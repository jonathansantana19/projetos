/**
 * QueryInvoiceReportBankSlipInputLineResponseDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReportBankSlipInputLineResponseDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseType queryInvoiceReportBankSlipInputLineResponse;

    public QueryInvoiceReportBankSlipInputLineResponseDataAreaType() {
    }

    public QueryInvoiceReportBankSlipInputLineResponseDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseType queryInvoiceReportBankSlipInputLineResponse) {
           this.queryResponse = queryResponse;
           this.queryInvoiceReportBankSlipInputLineResponse = queryInvoiceReportBankSlipInputLineResponse;
    }


    /**
     * Gets the queryResponse value for this QueryInvoiceReportBankSlipInputLineResponseDataAreaType.
     * 
     * @return queryResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType getQueryResponse() {
        return queryResponse;
    }


    /**
     * Sets the queryResponse value for this QueryInvoiceReportBankSlipInputLineResponseDataAreaType.
     * 
     * @param queryResponse
     */
    public void setQueryResponse(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse) {
        this.queryResponse = queryResponse;
    }


    /**
     * Gets the queryInvoiceReportBankSlipInputLineResponse value for this QueryInvoiceReportBankSlipInputLineResponseDataAreaType.
     * 
     * @return queryInvoiceReportBankSlipInputLineResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseType getQueryInvoiceReportBankSlipInputLineResponse() {
        return queryInvoiceReportBankSlipInputLineResponse;
    }


    /**
     * Sets the queryInvoiceReportBankSlipInputLineResponse value for this QueryInvoiceReportBankSlipInputLineResponseDataAreaType.
     * 
     * @param queryInvoiceReportBankSlipInputLineResponse
     */
    public void setQueryInvoiceReportBankSlipInputLineResponse(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseType queryInvoiceReportBankSlipInputLineResponse) {
        this.queryInvoiceReportBankSlipInputLineResponse = queryInvoiceReportBankSlipInputLineResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReportBankSlipInputLineResponseDataAreaType)) return false;
        QueryInvoiceReportBankSlipInputLineResponseDataAreaType other = (QueryInvoiceReportBankSlipInputLineResponseDataAreaType) obj;
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
            ((this.queryInvoiceReportBankSlipInputLineResponse==null && other.getQueryInvoiceReportBankSlipInputLineResponse()==null) || 
             (this.queryInvoiceReportBankSlipInputLineResponse!=null &&
              this.queryInvoiceReportBankSlipInputLineResponse.equals(other.getQueryInvoiceReportBankSlipInputLineResponse())));
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
        if (getQueryInvoiceReportBankSlipInputLineResponse() != null) {
            _hashCode += getQueryInvoiceReportBankSlipInputLineResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReportBankSlipInputLineResponseDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineResponseDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryInvoiceReportBankSlipInputLineResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineResponseType"));
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
