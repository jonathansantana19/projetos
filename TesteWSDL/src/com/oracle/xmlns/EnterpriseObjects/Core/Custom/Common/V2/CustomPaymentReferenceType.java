/**
 * CustomPaymentReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2;

public class CustomPaymentReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeGLAccount GLAccount;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeAdditionalPayment additionalPayment;

    private java.util.Calendar processingDateTime;

    private java.util.Calendar paymentReceiptDate;

    public CustomPaymentReferenceType() {
    }

    public CustomPaymentReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeGLAccount GLAccount,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeAdditionalPayment additionalPayment,
           java.util.Calendar processingDateTime,
           java.util.Calendar paymentReceiptDate) {
           this.GLAccount = GLAccount;
           this.additionalPayment = additionalPayment;
           this.processingDateTime = processingDateTime;
           this.paymentReceiptDate = paymentReceiptDate;
    }


    /**
     * Gets the GLAccount value for this CustomPaymentReferenceType.
     * 
     * @return GLAccount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeGLAccount getGLAccount() {
        return GLAccount;
    }


    /**
     * Sets the GLAccount value for this CustomPaymentReferenceType.
     * 
     * @param GLAccount
     */
    public void setGLAccount(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeGLAccount GLAccount) {
        this.GLAccount = GLAccount;
    }


    /**
     * Gets the additionalPayment value for this CustomPaymentReferenceType.
     * 
     * @return additionalPayment
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeAdditionalPayment getAdditionalPayment() {
        return additionalPayment;
    }


    /**
     * Sets the additionalPayment value for this CustomPaymentReferenceType.
     * 
     * @param additionalPayment
     */
    public void setAdditionalPayment(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeAdditionalPayment additionalPayment) {
        this.additionalPayment = additionalPayment;
    }


    /**
     * Gets the processingDateTime value for this CustomPaymentReferenceType.
     * 
     * @return processingDateTime
     */
    public java.util.Calendar getProcessingDateTime() {
        return processingDateTime;
    }


    /**
     * Sets the processingDateTime value for this CustomPaymentReferenceType.
     * 
     * @param processingDateTime
     */
    public void setProcessingDateTime(java.util.Calendar processingDateTime) {
        this.processingDateTime = processingDateTime;
    }


    /**
     * Gets the paymentReceiptDate value for this CustomPaymentReferenceType.
     * 
     * @return paymentReceiptDate
     */
    public java.util.Calendar getPaymentReceiptDate() {
        return paymentReceiptDate;
    }


    /**
     * Sets the paymentReceiptDate value for this CustomPaymentReferenceType.
     * 
     * @param paymentReceiptDate
     */
    public void setPaymentReceiptDate(java.util.Calendar paymentReceiptDate) {
        this.paymentReceiptDate = paymentReceiptDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPaymentReferenceType)) return false;
        CustomPaymentReferenceType other = (CustomPaymentReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GLAccount==null && other.getGLAccount()==null) || 
             (this.GLAccount!=null &&
              this.GLAccount.equals(other.getGLAccount()))) &&
            ((this.additionalPayment==null && other.getAdditionalPayment()==null) || 
             (this.additionalPayment!=null &&
              this.additionalPayment.equals(other.getAdditionalPayment()))) &&
            ((this.processingDateTime==null && other.getProcessingDateTime()==null) || 
             (this.processingDateTime!=null &&
              this.processingDateTime.equals(other.getProcessingDateTime()))) &&
            ((this.paymentReceiptDate==null && other.getPaymentReceiptDate()==null) || 
             (this.paymentReceiptDate!=null &&
              this.paymentReceiptDate.equals(other.getPaymentReceiptDate())));
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
        if (getGLAccount() != null) {
            _hashCode += getGLAccount().hashCode();
        }
        if (getAdditionalPayment() != null) {
            _hashCode += getAdditionalPayment().hashCode();
        }
        if (getProcessingDateTime() != null) {
            _hashCode += getProcessingDateTime().hashCode();
        }
        if (getPaymentReceiptDate() != null) {
            _hashCode += getPaymentReceiptDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomPaymentReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomPaymentReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "GLAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", ">CustomPaymentReferenceType>GLAccount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "AdditionalPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", ">CustomPaymentReferenceType>AdditionalPayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "ProcessingDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentReceiptDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "PaymentReceiptDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
