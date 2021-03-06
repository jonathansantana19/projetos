/**
 * QueryDebtInstallmentDetailListResponseDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryDebtInstallmentDetailListResponseDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] query;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseType queryDebtInstallmentDetailListResponse;

    public QueryDebtInstallmentDetailListResponseDataAreaType() {
    }

    public QueryDebtInstallmentDetailListResponseDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] query,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseType queryDebtInstallmentDetailListResponse) {
           this.query = query;
           this.queryDebtInstallmentDetailListResponse = queryDebtInstallmentDetailListResponse;
    }


    /**
     * Gets the query value for this QueryDebtInstallmentDetailListResponseDataAreaType.
     * 
     * @return query
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this QueryDebtInstallmentDetailListResponseDataAreaType.
     * 
     * @param query
     */
    public void setQuery(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] query) {
        this.query = query;
    }


    /**
     * Gets the queryDebtInstallmentDetailListResponse value for this QueryDebtInstallmentDetailListResponseDataAreaType.
     * 
     * @return queryDebtInstallmentDetailListResponse
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseType getQueryDebtInstallmentDetailListResponse() {
        return queryDebtInstallmentDetailListResponse;
    }


    /**
     * Sets the queryDebtInstallmentDetailListResponse value for this QueryDebtInstallmentDetailListResponseDataAreaType.
     * 
     * @param queryDebtInstallmentDetailListResponse
     */
    public void setQueryDebtInstallmentDetailListResponse(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseType queryDebtInstallmentDetailListResponse) {
        this.queryDebtInstallmentDetailListResponse = queryDebtInstallmentDetailListResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDebtInstallmentDetailListResponseDataAreaType)) return false;
        QueryDebtInstallmentDetailListResponseDataAreaType other = (QueryDebtInstallmentDetailListResponseDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              java.util.Arrays.equals(this.query, other.getQuery()))) &&
            ((this.queryDebtInstallmentDetailListResponse==null && other.getQueryDebtInstallmentDetailListResponse()==null) || 
             (this.queryDebtInstallmentDetailListResponse!=null &&
              this.queryDebtInstallmentDetailListResponse.equals(other.getQueryDebtInstallmentDetailListResponse())));
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
        if (getQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryDebtInstallmentDetailListResponse() != null) {
            _hashCode += getQueryDebtInstallmentDetailListResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDebtInstallmentDetailListResponseDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDebtInstallmentDetailListResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseType"));
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
