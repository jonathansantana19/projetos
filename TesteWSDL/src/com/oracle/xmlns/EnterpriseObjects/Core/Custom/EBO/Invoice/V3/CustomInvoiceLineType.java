/**
 * CustomInvoiceLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3;

public class CustomInvoiceLineType  implements java.io.Serializable {
    private java.util.Calendar invoiceLineDateTime;

    private java.lang.Boolean adjustmentImpactIndicator;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType balanceImpactIdentification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType userId;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType paymentControl;

    private java.lang.String GLID;

    private java.lang.String coment;

    public CustomInvoiceLineType() {
    }

    public CustomInvoiceLineType(
           java.util.Calendar invoiceLineDateTime,
           java.lang.Boolean adjustmentImpactIndicator,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType balanceImpactIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType userId,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType paymentControl,
           java.lang.String GLID,
           java.lang.String coment) {
           this.invoiceLineDateTime = invoiceLineDateTime;
           this.adjustmentImpactIndicator = adjustmentImpactIndicator;
           this.balanceImpactIdentification = balanceImpactIdentification;
           this.userId = userId;
           this.receivedPaymentReference = receivedPaymentReference;
           this.paymentControl = paymentControl;
           this.GLID = GLID;
           this.coment = coment;
    }


    /**
     * Gets the invoiceLineDateTime value for this CustomInvoiceLineType.
     * 
     * @return invoiceLineDateTime
     */
    public java.util.Calendar getInvoiceLineDateTime() {
        return invoiceLineDateTime;
    }


    /**
     * Sets the invoiceLineDateTime value for this CustomInvoiceLineType.
     * 
     * @param invoiceLineDateTime
     */
    public void setInvoiceLineDateTime(java.util.Calendar invoiceLineDateTime) {
        this.invoiceLineDateTime = invoiceLineDateTime;
    }


    /**
     * Gets the adjustmentImpactIndicator value for this CustomInvoiceLineType.
     * 
     * @return adjustmentImpactIndicator
     */
    public java.lang.Boolean getAdjustmentImpactIndicator() {
        return adjustmentImpactIndicator;
    }


    /**
     * Sets the adjustmentImpactIndicator value for this CustomInvoiceLineType.
     * 
     * @param adjustmentImpactIndicator
     */
    public void setAdjustmentImpactIndicator(java.lang.Boolean adjustmentImpactIndicator) {
        this.adjustmentImpactIndicator = adjustmentImpactIndicator;
    }


    /**
     * Gets the balanceImpactIdentification value for this CustomInvoiceLineType.
     * 
     * @return balanceImpactIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getBalanceImpactIdentification() {
        return balanceImpactIdentification;
    }


    /**
     * Sets the balanceImpactIdentification value for this CustomInvoiceLineType.
     * 
     * @param balanceImpactIdentification
     */
    public void setBalanceImpactIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType balanceImpactIdentification) {
        this.balanceImpactIdentification = balanceImpactIdentification;
    }


    /**
     * Gets the userId value for this CustomInvoiceLineType.
     * 
     * @return userId
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this CustomInvoiceLineType.
     * 
     * @param userId
     */
    public void setUserId(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType userId) {
        this.userId = userId;
    }


    /**
     * Gets the receivedPaymentReference value for this CustomInvoiceLineType.
     * 
     * @return receivedPaymentReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType getReceivedPaymentReference() {
        return receivedPaymentReference;
    }


    /**
     * Sets the receivedPaymentReference value for this CustomInvoiceLineType.
     * 
     * @param receivedPaymentReference
     */
    public void setReceivedPaymentReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType receivedPaymentReference) {
        this.receivedPaymentReference = receivedPaymentReference;
    }


    /**
     * Gets the paymentControl value for this CustomInvoiceLineType.
     * 
     * @return paymentControl
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getPaymentControl() {
        return paymentControl;
    }


    /**
     * Sets the paymentControl value for this CustomInvoiceLineType.
     * 
     * @param paymentControl
     */
    public void setPaymentControl(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType paymentControl) {
        this.paymentControl = paymentControl;
    }


    /**
     * Gets the GLID value for this CustomInvoiceLineType.
     * 
     * @return GLID
     */
    public java.lang.String getGLID() {
        return GLID;
    }


    /**
     * Sets the GLID value for this CustomInvoiceLineType.
     * 
     * @param GLID
     */
    public void setGLID(java.lang.String GLID) {
        this.GLID = GLID;
    }


    /**
     * Gets the coment value for this CustomInvoiceLineType.
     * 
     * @return coment
     */
    public java.lang.String getComent() {
        return coment;
    }


    /**
     * Sets the coment value for this CustomInvoiceLineType.
     * 
     * @param coment
     */
    public void setComent(java.lang.String coment) {
        this.coment = coment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceLineType)) return false;
        CustomInvoiceLineType other = (CustomInvoiceLineType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.invoiceLineDateTime==null && other.getInvoiceLineDateTime()==null) || 
             (this.invoiceLineDateTime!=null &&
              this.invoiceLineDateTime.equals(other.getInvoiceLineDateTime()))) &&
            ((this.adjustmentImpactIndicator==null && other.getAdjustmentImpactIndicator()==null) || 
             (this.adjustmentImpactIndicator!=null &&
              this.adjustmentImpactIndicator.equals(other.getAdjustmentImpactIndicator()))) &&
            ((this.balanceImpactIdentification==null && other.getBalanceImpactIdentification()==null) || 
             (this.balanceImpactIdentification!=null &&
              this.balanceImpactIdentification.equals(other.getBalanceImpactIdentification()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId()))) &&
            ((this.receivedPaymentReference==null && other.getReceivedPaymentReference()==null) || 
             (this.receivedPaymentReference!=null &&
              this.receivedPaymentReference.equals(other.getReceivedPaymentReference()))) &&
            ((this.paymentControl==null && other.getPaymentControl()==null) || 
             (this.paymentControl!=null &&
              this.paymentControl.equals(other.getPaymentControl()))) &&
            ((this.GLID==null && other.getGLID()==null) || 
             (this.GLID!=null &&
              this.GLID.equals(other.getGLID()))) &&
            ((this.coment==null && other.getComent()==null) || 
             (this.coment!=null &&
              this.coment.equals(other.getComent())));
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
        if (getInvoiceLineDateTime() != null) {
            _hashCode += getInvoiceLineDateTime().hashCode();
        }
        if (getAdjustmentImpactIndicator() != null) {
            _hashCode += getAdjustmentImpactIndicator().hashCode();
        }
        if (getBalanceImpactIdentification() != null) {
            _hashCode += getBalanceImpactIdentification().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        if (getReceivedPaymentReference() != null) {
            _hashCode += getReceivedPaymentReference().hashCode();
        }
        if (getPaymentControl() != null) {
            _hashCode += getPaymentControl().hashCode();
        }
        if (getGLID() != null) {
            _hashCode += getGLID().hashCode();
        }
        if (getComent() != null) {
            _hashCode += getComent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceLineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CustomInvoiceLineType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceLineDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "InvoiceLineDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentImpactIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "AdjustmentImpactIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceImpactIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "BalanceImpactIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedPaymentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceivedPaymentReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PaymentReferenceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "PaymentControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GLID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "GLID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "Coment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
