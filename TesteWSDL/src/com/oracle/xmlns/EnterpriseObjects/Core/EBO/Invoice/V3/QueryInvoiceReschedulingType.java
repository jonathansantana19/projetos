/**
 * QueryInvoiceReschedulingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class QueryInvoiceReschedulingType  extends com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceEBMType  implements java.io.Serializable {
    public QueryInvoiceReschedulingType() {
    }

    public QueryInvoiceReschedulingType(
           java.lang.String actionCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType extendedAmount,
           java.util.Calendar invoiceDateTime,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType lastCyclePaymentAmount,
           java.util.Date dueDate,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.StatusType status,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BillToPartyReferenceType billToPartyReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.InvoiceReferenceType consolidatedInvoiceReference,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType[] invoiceLine,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType[] invoicePayment,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType invoiceCustomerParty,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType custom) {
        super(
            actionCode,
            identification,
            totalAmount,
            extendedAmount,
            invoiceDateTime,
            lastCyclePaymentAmount,
            dueDate,
            status,
            billToPartyReference,
            consolidatedInvoiceReference,
            invoiceLine,
            invoicePayment,
            invoiceCustomerParty,
            custom);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryInvoiceReschedulingType)) return false;
        QueryInvoiceReschedulingType other = (QueryInvoiceReschedulingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryInvoiceReschedulingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingType"));
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
