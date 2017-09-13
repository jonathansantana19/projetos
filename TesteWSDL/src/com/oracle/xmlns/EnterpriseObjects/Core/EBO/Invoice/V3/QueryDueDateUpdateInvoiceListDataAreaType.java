/**
 * QueryDueDateUpdateInvoiceListDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryDueDateUpdateInvoiceListDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] query;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListType queryDueDateUpdateInvoiceList;

    public QueryDueDateUpdateInvoiceListDataAreaType() {
    }

    public QueryDueDateUpdateInvoiceListDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] query,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListType queryDueDateUpdateInvoiceList) {
           this.query = query;
           this.queryDueDateUpdateInvoiceList = queryDueDateUpdateInvoiceList;
    }


    /**
     * Gets the query value for this QueryDueDateUpdateInvoiceListDataAreaType.
     * 
     * @return query
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this QueryDueDateUpdateInvoiceListDataAreaType.
     * 
     * @param query
     */
    public void setQuery(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] query) {
        this.query = query;
    }


    /**
     * Gets the queryDueDateUpdateInvoiceList value for this QueryDueDateUpdateInvoiceListDataAreaType.
     * 
     * @return queryDueDateUpdateInvoiceList
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListType getQueryDueDateUpdateInvoiceList() {
        return queryDueDateUpdateInvoiceList;
    }


    /**
     * Sets the queryDueDateUpdateInvoiceList value for this QueryDueDateUpdateInvoiceListDataAreaType.
     * 
     * @param queryDueDateUpdateInvoiceList
     */
    public void setQueryDueDateUpdateInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListType queryDueDateUpdateInvoiceList) {
        this.queryDueDateUpdateInvoiceList = queryDueDateUpdateInvoiceList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDueDateUpdateInvoiceListDataAreaType)) return false;
        QueryDueDateUpdateInvoiceListDataAreaType other = (QueryDueDateUpdateInvoiceListDataAreaType) obj;
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
            ((this.queryDueDateUpdateInvoiceList==null && other.getQueryDueDateUpdateInvoiceList()==null) || 
             (this.queryDueDateUpdateInvoiceList!=null &&
              this.queryDueDateUpdateInvoiceList.equals(other.getQueryDueDateUpdateInvoiceList())));
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
        if (getQueryDueDateUpdateInvoiceList() != null) {
            _hashCode += getQueryDueDateUpdateInvoiceList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDueDateUpdateInvoiceListDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "Query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDueDateUpdateInvoiceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListType"));
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
