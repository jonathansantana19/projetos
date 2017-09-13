/**
 * CustomInvoiceEBOTypeBankPayableDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3;

public class CustomInvoiceEBOTypeBankPayableDocument  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankPartyReferenceType bankPartyReference;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchReferenceType bankBranchReference;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType chargeType;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType barCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType bankSpecificInvoiceNumber;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType inputableLine;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType paymentInstructions;

    private java.util.Date dueDate;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType typeCode;

    private java.lang.Boolean acceptance;

    private java.util.Calendar creationDateTime;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] paymentInstruction;

    private org.apache.axis.types.URI publishedURL;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocumentRescheduling rescheduling;

    public CustomInvoiceEBOTypeBankPayableDocument() {
    }

    public CustomInvoiceEBOTypeBankPayableDocument(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankPartyReferenceType bankPartyReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchReferenceType bankBranchReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType chargeType,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType barCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType bankSpecificInvoiceNumber,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType inputableLine,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType paymentInstructions,
           java.util.Date dueDate,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType typeCode,
           java.lang.Boolean acceptance,
           java.util.Calendar creationDateTime,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] paymentInstruction,
           org.apache.axis.types.URI publishedURL,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocumentRescheduling rescheduling) {
           this.identification = identification;
           this.bankPartyReference = bankPartyReference;
           this.bankBranchReference = bankBranchReference;
           this.chargeType = chargeType;
           this.barCode = barCode;
           this.bankSpecificInvoiceNumber = bankSpecificInvoiceNumber;
           this.inputableLine = inputableLine;
           this.paymentInstructions = paymentInstructions;
           this.dueDate = dueDate;
           this.typeCode = typeCode;
           this.acceptance = acceptance;
           this.creationDateTime = creationDateTime;
           this.paymentInstruction = paymentInstruction;
           this.publishedURL = publishedURL;
           this.rescheduling = rescheduling;
    }


    /**
     * Gets the identification value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return identification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param identification
     */
    public void setIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification) {
        this.identification = identification;
    }


    /**
     * Gets the bankPartyReference value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return bankPartyReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankPartyReferenceType getBankPartyReference() {
        return bankPartyReference;
    }


    /**
     * Sets the bankPartyReference value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param bankPartyReference
     */
    public void setBankPartyReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankPartyReferenceType bankPartyReference) {
        this.bankPartyReference = bankPartyReference;
    }


    /**
     * Gets the bankBranchReference value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return bankBranchReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchReferenceType getBankBranchReference() {
        return bankBranchReference;
    }


    /**
     * Sets the bankBranchReference value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param bankBranchReference
     */
    public void setBankBranchReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchReferenceType bankBranchReference) {
        this.bankBranchReference = bankBranchReference;
    }


    /**
     * Gets the chargeType value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return chargeType
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getChargeType() {
        return chargeType;
    }


    /**
     * Sets the chargeType value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param chargeType
     */
    public void setChargeType(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType chargeType) {
        this.chargeType = chargeType;
    }


    /**
     * Gets the barCode value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return barCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getBarCode() {
        return barCode;
    }


    /**
     * Sets the barCode value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param barCode
     */
    public void setBarCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType barCode) {
        this.barCode = barCode;
    }


    /**
     * Gets the bankSpecificInvoiceNumber value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return bankSpecificInvoiceNumber
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getBankSpecificInvoiceNumber() {
        return bankSpecificInvoiceNumber;
    }


    /**
     * Sets the bankSpecificInvoiceNumber value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param bankSpecificInvoiceNumber
     */
    public void setBankSpecificInvoiceNumber(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType bankSpecificInvoiceNumber) {
        this.bankSpecificInvoiceNumber = bankSpecificInvoiceNumber;
    }


    /**
     * Gets the inputableLine value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return inputableLine
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getInputableLine() {
        return inputableLine;
    }


    /**
     * Sets the inputableLine value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param inputableLine
     */
    public void setInputableLine(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType inputableLine) {
        this.inputableLine = inputableLine;
    }


    /**
     * Gets the paymentInstructions value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return paymentInstructions
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getPaymentInstructions() {
        return paymentInstructions;
    }


    /**
     * Sets the paymentInstructions value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param paymentInstructions
     */
    public void setPaymentInstructions(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType paymentInstructions) {
        this.paymentInstructions = paymentInstructions;
    }


    /**
     * Gets the dueDate value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return dueDate
     */
    public java.util.Date getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the typeCode value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return typeCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getTypeCode() {
        return typeCode;
    }


    /**
     * Sets the typeCode value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param typeCode
     */
    public void setTypeCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType typeCode) {
        this.typeCode = typeCode;
    }


    /**
     * Gets the acceptance value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return acceptance
     */
    public java.lang.Boolean getAcceptance() {
        return acceptance;
    }


    /**
     * Sets the acceptance value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param acceptance
     */
    public void setAcceptance(java.lang.Boolean acceptance) {
        this.acceptance = acceptance;
    }


    /**
     * Gets the creationDateTime value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return creationDateTime
     */
    public java.util.Calendar getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the paymentInstruction value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return paymentInstruction
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] getPaymentInstruction() {
        return paymentInstruction;
    }


    /**
     * Sets the paymentInstruction value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param paymentInstruction
     */
    public void setPaymentInstruction(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] paymentInstruction) {
        this.paymentInstruction = paymentInstruction;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getPaymentInstruction(int i) {
        return this.paymentInstruction[i];
    }

    public void setPaymentInstruction(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType _value) {
        this.paymentInstruction[i] = _value;
    }


    /**
     * Gets the publishedURL value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return publishedURL
     */
    public org.apache.axis.types.URI getPublishedURL() {
        return publishedURL;
    }


    /**
     * Sets the publishedURL value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param publishedURL
     */
    public void setPublishedURL(org.apache.axis.types.URI publishedURL) {
        this.publishedURL = publishedURL;
    }


    /**
     * Gets the rescheduling value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @return rescheduling
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocumentRescheduling getRescheduling() {
        return rescheduling;
    }


    /**
     * Sets the rescheduling value for this CustomInvoiceEBOTypeBankPayableDocument.
     * 
     * @param rescheduling
     */
    public void setRescheduling(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocumentRescheduling rescheduling) {
        this.rescheduling = rescheduling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceEBOTypeBankPayableDocument)) return false;
        CustomInvoiceEBOTypeBankPayableDocument other = (CustomInvoiceEBOTypeBankPayableDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identification==null && other.getIdentification()==null) || 
             (this.identification!=null &&
              this.identification.equals(other.getIdentification()))) &&
            ((this.bankPartyReference==null && other.getBankPartyReference()==null) || 
             (this.bankPartyReference!=null &&
              this.bankPartyReference.equals(other.getBankPartyReference()))) &&
            ((this.bankBranchReference==null && other.getBankBranchReference()==null) || 
             (this.bankBranchReference!=null &&
              this.bankBranchReference.equals(other.getBankBranchReference()))) &&
            ((this.chargeType==null && other.getChargeType()==null) || 
             (this.chargeType!=null &&
              this.chargeType.equals(other.getChargeType()))) &&
            ((this.barCode==null && other.getBarCode()==null) || 
             (this.barCode!=null &&
              this.barCode.equals(other.getBarCode()))) &&
            ((this.bankSpecificInvoiceNumber==null && other.getBankSpecificInvoiceNumber()==null) || 
             (this.bankSpecificInvoiceNumber!=null &&
              this.bankSpecificInvoiceNumber.equals(other.getBankSpecificInvoiceNumber()))) &&
            ((this.inputableLine==null && other.getInputableLine()==null) || 
             (this.inputableLine!=null &&
              this.inputableLine.equals(other.getInputableLine()))) &&
            ((this.paymentInstructions==null && other.getPaymentInstructions()==null) || 
             (this.paymentInstructions!=null &&
              this.paymentInstructions.equals(other.getPaymentInstructions()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.typeCode==null && other.getTypeCode()==null) || 
             (this.typeCode!=null &&
              this.typeCode.equals(other.getTypeCode()))) &&
            ((this.acceptance==null && other.getAcceptance()==null) || 
             (this.acceptance!=null &&
              this.acceptance.equals(other.getAcceptance()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.paymentInstruction==null && other.getPaymentInstruction()==null) || 
             (this.paymentInstruction!=null &&
              java.util.Arrays.equals(this.paymentInstruction, other.getPaymentInstruction()))) &&
            ((this.publishedURL==null && other.getPublishedURL()==null) || 
             (this.publishedURL!=null &&
              this.publishedURL.equals(other.getPublishedURL()))) &&
            ((this.rescheduling==null && other.getRescheduling()==null) || 
             (this.rescheduling!=null &&
              this.rescheduling.equals(other.getRescheduling())));
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
        if (getIdentification() != null) {
            _hashCode += getIdentification().hashCode();
        }
        if (getBankPartyReference() != null) {
            _hashCode += getBankPartyReference().hashCode();
        }
        if (getBankBranchReference() != null) {
            _hashCode += getBankBranchReference().hashCode();
        }
        if (getChargeType() != null) {
            _hashCode += getChargeType().hashCode();
        }
        if (getBarCode() != null) {
            _hashCode += getBarCode().hashCode();
        }
        if (getBankSpecificInvoiceNumber() != null) {
            _hashCode += getBankSpecificInvoiceNumber().hashCode();
        }
        if (getInputableLine() != null) {
            _hashCode += getInputableLine().hashCode();
        }
        if (getPaymentInstructions() != null) {
            _hashCode += getPaymentInstructions().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getTypeCode() != null) {
            _hashCode += getTypeCode().hashCode();
        }
        if (getAcceptance() != null) {
            _hashCode += getAcceptance().hashCode();
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getPaymentInstruction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentInstruction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentInstruction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublishedURL() != null) {
            _hashCode += getPublishedURL().hashCode();
        }
        if (getRescheduling() != null) {
            _hashCode += getRescheduling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceEBOTypeBankPayableDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>BankPayableDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "Identification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankPartyReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankPartyReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankPartyReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankBranchReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "ChargeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("barCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "BarCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankSpecificInvoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "BankSpecificInvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputableLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "InputableLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstructions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "PaymentInstructions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "TypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acceptance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "Acceptance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CreationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "PaymentInstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "PublishedURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyURI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rescheduling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "Rescheduling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">>CustomInvoiceEBOType>BankPayableDocument>Rescheduling"));
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
