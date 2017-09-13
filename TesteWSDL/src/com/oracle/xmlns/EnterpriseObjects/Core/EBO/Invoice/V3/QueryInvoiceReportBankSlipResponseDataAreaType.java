/**
 * QueryInvoiceReportBankSlipResponseDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReportBankSlipResponseDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseType queryInvoiceReportBankSlipResponse;

    public QueryInvoiceReportBankSlipResponseDataAreaType() {
    }

    public QueryInvoiceReportBankSlipResponseDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseType queryInvoiceReportBankSlipResponse) {
           this.queryResponse = queryResponse;
           this.queryInvoiceReportBankSlipResponse = queryInvoiceReportBankSlipResponse;
    }


    /**
     * Gets the queryResponse value for this QueryInvoiceReportBankSlipResponseDataAreaType.
     * 
     * @return queryResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType getQueryResponse() {
        return queryResponse;
    }


    /**
     * Sets the queryResponse value for this QueryInvoiceReportBankSlipResponseDataAreaType.
     * 
     * @param queryResponse
     */
    public void setQueryResponse(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType queryResponse) {
        this.queryResponse = queryResponse;
    }


    /**
     * Gets the queryInvoiceReportBankSlipResponse value for this QueryInvoiceReportBankSlipResponseDataAreaType.
     * 
     * @return queryInvoiceReportBankSlipResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseType getQueryInvoiceReportBankSlipResponse() {
        return queryInvoiceReportBankSlipResponse;
    }


    /**
     * Sets the queryInvoiceReportBankSlipResponse value for this QueryInvoiceReportBankSlipResponseDataAreaType.
     * 
     * @param queryInvoiceReportBankSlipResponse
     */
    public void setQueryInvoiceReportBankSlipResponse(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseType queryInvoiceReportBankSlipResponse) {
        this.queryInvoiceReportBankSlipResponse = queryInvoiceReportBankSlipResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReportBankSlipResponseDataAreaType)) return false;
        QueryInvoiceReportBankSlipResponseDataAreaType other = (QueryInvoiceReportBankSlipResponseDataAreaType) obj;
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
            ((this.queryInvoiceReportBankSlipResponse==null && other.getQueryInvoiceReportBankSlipResponse()==null) || 
             (this.queryInvoiceReportBankSlipResponse!=null &&
              this.queryInvoiceReportBankSlipResponse.equals(other.getQueryInvoiceReportBankSlipResponse())));
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
        if (getQueryInvoiceReportBankSlipResponse() != null) {
            _hashCode += getQueryInvoiceReportBankSlipResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReportBankSlipResponseDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipResponseDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryInvoiceReportBankSlipResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipResponseType"));
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
