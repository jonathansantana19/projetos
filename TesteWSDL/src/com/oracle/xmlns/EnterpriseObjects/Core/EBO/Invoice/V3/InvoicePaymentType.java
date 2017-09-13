/**
 * InvoicePaymentType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class InvoicePaymentType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType receiptMethodReference;

    private java.lang.String actionCode;  // attribute

    public InvoicePaymentType() {
    }

//    public InvoicePaymentType(
//           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference,
//           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType receiptMethodReference,
//           java.lang.String actionCode) {
//           this.receivedPaymentReference = receivedPaymentReference;
//           this.receiptMethodReference = receiptMethodReference;
//           this.actionCode = actionCode;
//    }
    
    public InvoicePaymentType(
            com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference,
            com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType receiptMethodReference) {
            this.receivedPaymentReference = receivedPaymentReference;
            this.receiptMethodReference = receiptMethodReference;
     }


    /**
     * Gets the receivedPaymentReference value for this InvoicePaymentType.
     * 
     * @return receivedPaymentReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType getReceivedPaymentReference() {
        return receivedPaymentReference;
    }


    /**
     * Sets the receivedPaymentReference value for this InvoicePaymentType.
     * 
     * @param receivedPaymentReference
     */
    public void setReceivedPaymentReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference) {
        this.receivedPaymentReference = receivedPaymentReference;
    }


    /**
     * Gets the receiptMethodReference value for this InvoicePaymentType.
     * 
     * @return receiptMethodReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType getReceiptMethodReference() {
        return receiptMethodReference;
    }


    /**
     * Sets the receiptMethodReference value for this InvoicePaymentType.
     * 
     * @param receiptMethodReference
     */
    public void setReceiptMethodReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType receiptMethodReference) {
        this.receiptMethodReference = receiptMethodReference;
    }


    /**
     * Gets the actionCode value for this InvoicePaymentType.
     * 
     * @return actionCode
     */
    public java.lang.String getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this InvoicePaymentType.
     * 
     * @param actionCode
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoicePaymentType)) return false;
        InvoicePaymentType other = (InvoicePaymentType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.receivedPaymentReference==null && other.getReceivedPaymentReference()==null) || 
             (this.receivedPaymentReference!=null &&
              this.receivedPaymentReference.equals(other.getReceivedPaymentReference()))) &&
            ((this.receiptMethodReference==null && other.getReceiptMethodReference()==null) || 
             (this.receiptMethodReference!=null &&
              this.receiptMethodReference.equals(other.getReceiptMethodReference()))) &&
            ((this.actionCode==null && other.getActionCode()==null) || 
             (this.actionCode!=null &&
              this.actionCode.equals(other.getActionCode())));
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
        if (getReceivedPaymentReference() != null) {
            _hashCode += getReceivedPaymentReference().hashCode();
        }
        if (getReceiptMethodReference() != null) {
            _hashCode += getReceiptMethodReference().hashCode();
        }
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoicePaymentType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoicePaymentType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actionCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "actionCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ActionCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedPaymentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceivedPaymentReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PaymentReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiptMethodReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceiptMethodReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceiptMethodReferenceType"));
        elemField.setMinOccurs(0);
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
