/**
 * QueryInvoiceReportBankSlipInputLineDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReportBankSlipInputLineDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineType queryInvoiceReportBankSlipInputLine;

    public QueryInvoiceReportBankSlipInputLineDataAreaType() {
    }

    public QueryInvoiceReportBankSlipInputLineDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineType queryInvoiceReportBankSlipInputLine) {
           this.queryInvoiceReportBankSlipInputLine = queryInvoiceReportBankSlipInputLine;
    }


    /**
     * Gets the queryInvoiceReportBankSlipInputLine value for this QueryInvoiceReportBankSlipInputLineDataAreaType.
     * 
     * @return queryInvoiceReportBankSlipInputLine
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineType getQueryInvoiceReportBankSlipInputLine() {
        return queryInvoiceReportBankSlipInputLine;
    }


    /**
     * Sets the queryInvoiceReportBankSlipInputLine value for this QueryInvoiceReportBankSlipInputLineDataAreaType.
     * 
     * @param queryInvoiceReportBankSlipInputLine
     */
    public void setQueryInvoiceReportBankSlipInputLine(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineType queryInvoiceReportBankSlipInputLine) {
        this.queryInvoiceReportBankSlipInputLine = queryInvoiceReportBankSlipInputLine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReportBankSlipInputLineDataAreaType)) return false;
        QueryInvoiceReportBankSlipInputLineDataAreaType other = (QueryInvoiceReportBankSlipInputLineDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryInvoiceReportBankSlipInputLine==null && other.getQueryInvoiceReportBankSlipInputLine()==null) || 
             (this.queryInvoiceReportBankSlipInputLine!=null &&
              this.queryInvoiceReportBankSlipInputLine.equals(other.getQueryInvoiceReportBankSlipInputLine())));
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
        if (getQueryInvoiceReportBankSlipInputLine() != null) {
            _hashCode += getQueryInvoiceReportBankSlipInputLine().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReportBankSlipInputLineDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryInvoiceReportBankSlipInputLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineType"));
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
