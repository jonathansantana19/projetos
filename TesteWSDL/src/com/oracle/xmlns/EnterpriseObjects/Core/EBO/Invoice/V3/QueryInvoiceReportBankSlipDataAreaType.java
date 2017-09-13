/**
 * QueryInvoiceReportBankSlipDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReportBankSlipDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipType queryInvoiceReportBankSlip;

    public QueryInvoiceReportBankSlipDataAreaType() {
    }

    public QueryInvoiceReportBankSlipDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipType queryInvoiceReportBankSlip) {
           this.queryInvoiceReportBankSlip = queryInvoiceReportBankSlip;
    }


    /**
     * Gets the queryInvoiceReportBankSlip value for this QueryInvoiceReportBankSlipDataAreaType.
     * 
     * @return queryInvoiceReportBankSlip
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipType getQueryInvoiceReportBankSlip() {
        return queryInvoiceReportBankSlip;
    }


    /**
     * Sets the queryInvoiceReportBankSlip value for this QueryInvoiceReportBankSlipDataAreaType.
     * 
     * @param queryInvoiceReportBankSlip
     */
    public void setQueryInvoiceReportBankSlip(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipType queryInvoiceReportBankSlip) {
        this.queryInvoiceReportBankSlip = queryInvoiceReportBankSlip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReportBankSlipDataAreaType)) return false;
        QueryInvoiceReportBankSlipDataAreaType other = (QueryInvoiceReportBankSlipDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryInvoiceReportBankSlip==null && other.getQueryInvoiceReportBankSlip()==null) || 
             (this.queryInvoiceReportBankSlip!=null &&
              this.queryInvoiceReportBankSlip.equals(other.getQueryInvoiceReportBankSlip())));
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
        if (getQueryInvoiceReportBankSlip() != null) {
            _hashCode += getQueryInvoiceReportBankSlip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReportBankSlipDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryInvoiceReportBankSlip");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipType"));
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
