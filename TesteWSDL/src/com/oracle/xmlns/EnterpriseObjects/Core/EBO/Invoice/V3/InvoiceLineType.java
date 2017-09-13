/**
 * InvoiceLineType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class InvoiceLineType  implements java.io.Serializable {
    /* Line Identification */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification;

    /* Description of the line item or service */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] description;

    /* The total amount of the invoice line not including taxes or
     * charges.
     * 						This generally equals the Unit Price times the Order Quantity. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType extendedAmount;

    /* The total amount of the invoice line, including the Price and
     * the
     * 						total of all the charges, allowances and taxes. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount;

    /* Identifies if the invoice line has been adjusted or not */
    private java.lang.Boolean adjustedIndicator;

    /* Effective Time Period for which the invoice line has been generated. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TimePeriodType effectiveTimePeriod;

    /* Details about the item being invoiced */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] itemReference;

    /* Details about the Party to whom the line items on the invoice
     * line are
     * 						shipped or the services on the invoice line are provided. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ShipToPartyReferenceType shipToPartyReference;

    /* Identifies the invoice lines that are being adjusted by this
     * invoice line. */
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType[] invoiceLineAdjustment;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceLineType custom;

    private java.lang.String actionCode;  // attribute

    public InvoiceLineType() {
    }

    public InvoiceLineType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] description,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType extendedAmount,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount,
           java.lang.Boolean adjustedIndicator,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TimePeriodType effectiveTimePeriod,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] itemReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ShipToPartyReferenceType shipToPartyReference,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType[] invoiceLineAdjustment,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceLineType custom,
           java.lang.String actionCode) {
           this.identification = identification;
           this.description = description;
           this.extendedAmount = extendedAmount;
           this.totalAmount = totalAmount;
           this.adjustedIndicator = adjustedIndicator;
           this.effectiveTimePeriod = effectiveTimePeriod;
           this.itemReference = itemReference;
           this.shipToPartyReference = shipToPartyReference;
           this.invoiceLineAdjustment = invoiceLineAdjustment;
           this.custom = custom;
           this.actionCode = actionCode;
    }


    /**
     * Gets the identification value for this InvoiceLineType.
     * 
     * @return identification   * Line Identification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this InvoiceLineType.
     * 
     * @param identification   * Line Identification
     */
    public void setIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification) {
        this.identification = identification;
    }


    /**
     * Gets the description value for this InvoiceLineType.
     * 
     * @return description   * Description of the line item or service
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InvoiceLineType.
     * 
     * @param description   * Description of the line item or service
     */
    public void setDescription(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] description) {
        this.description = description;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType _value) {
        this.description[i] = _value;
    }


    /**
     * Gets the extendedAmount value for this InvoiceLineType.
     * 
     * @return extendedAmount   * The total amount of the invoice line not including taxes or
     * charges.
     * 						This generally equals the Unit Price times the Order Quantity.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getExtendedAmount() {
        return extendedAmount;
    }


    /**
     * Sets the extendedAmount value for this InvoiceLineType.
     * 
     * @param extendedAmount   * The total amount of the invoice line not including taxes or
     * charges.
     * 						This generally equals the Unit Price times the Order Quantity.
     */
    public void setExtendedAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType extendedAmount) {
        this.extendedAmount = extendedAmount;
    }


    /**
     * Gets the totalAmount value for this InvoiceLineType.
     * 
     * @return totalAmount   * The total amount of the invoice line, including the Price and
     * the
     * 						total of all the charges, allowances and taxes.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this InvoiceLineType.
     * 
     * @param totalAmount   * The total amount of the invoice line, including the Price and
     * the
     * 						total of all the charges, allowances and taxes.
     */
    public void setTotalAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the adjustedIndicator value for this InvoiceLineType.
     * 
     * @return adjustedIndicator   * Identifies if the invoice line has been adjusted or not
     */
    public java.lang.Boolean getAdjustedIndicator() {
        return adjustedIndicator;
    }


    /**
     * Sets the adjustedIndicator value for this InvoiceLineType.
     * 
     * @param adjustedIndicator   * Identifies if the invoice line has been adjusted or not
     */
    public void setAdjustedIndicator(java.lang.Boolean adjustedIndicator) {
        this.adjustedIndicator = adjustedIndicator;
    }


    /**
     * Gets the effectiveTimePeriod value for this InvoiceLineType.
     * 
     * @return effectiveTimePeriod   * Effective Time Period for which the invoice line has been generated.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TimePeriodType getEffectiveTimePeriod() {
        return effectiveTimePeriod;
    }


    /**
     * Sets the effectiveTimePeriod value for this InvoiceLineType.
     * 
     * @param effectiveTimePeriod   * Effective Time Period for which the invoice line has been generated.
     */
    public void setEffectiveTimePeriod(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TimePeriodType effectiveTimePeriod) {
        this.effectiveTimePeriod = effectiveTimePeriod;
    }


    /**
     * Gets the itemReference value for this InvoiceLineType.
     * 
     * @return itemReference   * Details about the item being invoiced
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] getItemReference() {
        return itemReference;
    }


    /**
     * Sets the itemReference value for this InvoiceLineType.
     * 
     * @param itemReference   * Details about the item being invoiced
     */
    public void setItemReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[] itemReference) {
        this.itemReference = itemReference;
    }


    /**
     * Gets the shipToPartyReference value for this InvoiceLineType.
     * 
     * @return shipToPartyReference   * Details about the Party to whom the line items on the invoice
     * line are
     * 						shipped or the services on the invoice line are provided.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ShipToPartyReferenceType getShipToPartyReference() {
        return shipToPartyReference;
    }


    /**
     * Sets the shipToPartyReference value for this InvoiceLineType.
     * 
     * @param shipToPartyReference   * Details about the Party to whom the line items on the invoice
     * line are
     * 						shipped or the services on the invoice line are provided.
     */
    public void setShipToPartyReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ShipToPartyReferenceType shipToPartyReference) {
        this.shipToPartyReference = shipToPartyReference;
    }


    /**
     * Gets the invoiceLineAdjustment value for this InvoiceLineType.
     * 
     * @return invoiceLineAdjustment   * Identifies the invoice lines that are being adjusted by this
     * invoice line.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType[] getInvoiceLineAdjustment() {
        return invoiceLineAdjustment;
    }


    /**
     * Sets the invoiceLineAdjustment value for this InvoiceLineType.
     * 
     * @param invoiceLineAdjustment   * Identifies the invoice lines that are being adjusted by this
     * invoice line.
     */
    public void setInvoiceLineAdjustment(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType[] invoiceLineAdjustment) {
        this.invoiceLineAdjustment = invoiceLineAdjustment;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType getInvoiceLineAdjustment(int i) {
        return this.invoiceLineAdjustment[i];
    }

    public void setInvoiceLineAdjustment(int i, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType _value) {
        this.invoiceLineAdjustment[i] = _value;
    }


    /**
     * Gets the custom value for this InvoiceLineType.
     * 
     * @return custom
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceLineType getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this InvoiceLineType.
     * 
     * @param custom
     */
    public void setCustom(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceLineType custom) {
        this.custom = custom;
    }


    /**
     * Gets the actionCode value for this InvoiceLineType.
     * 
     * @return actionCode
     */
    public java.lang.String getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this InvoiceLineType.
     * 
     * @param actionCode
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceLineType)) return false;
        InvoiceLineType other = (InvoiceLineType) obj;
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
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.extendedAmount==null && other.getExtendedAmount()==null) || 
             (this.extendedAmount!=null &&
              this.extendedAmount.equals(other.getExtendedAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.adjustedIndicator==null && other.getAdjustedIndicator()==null) || 
             (this.adjustedIndicator!=null &&
              this.adjustedIndicator.equals(other.getAdjustedIndicator()))) &&
            ((this.effectiveTimePeriod==null && other.getEffectiveTimePeriod()==null) || 
             (this.effectiveTimePeriod!=null &&
              this.effectiveTimePeriod.equals(other.getEffectiveTimePeriod()))) &&
            ((this.itemReference==null && other.getItemReference()==null) || 
             (this.itemReference!=null &&
              java.util.Arrays.equals(this.itemReference, other.getItemReference()))) &&
            ((this.shipToPartyReference==null && other.getShipToPartyReference()==null) || 
             (this.shipToPartyReference!=null &&
              this.shipToPartyReference.equals(other.getShipToPartyReference()))) &&
            ((this.invoiceLineAdjustment==null && other.getInvoiceLineAdjustment()==null) || 
             (this.invoiceLineAdjustment!=null &&
              java.util.Arrays.equals(this.invoiceLineAdjustment, other.getInvoiceLineAdjustment()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
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
        if (getIdentification() != null) {
            _hashCode += getIdentification().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtendedAmount() != null) {
            _hashCode += getExtendedAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getAdjustedIndicator() != null) {
            _hashCode += getAdjustedIndicator().hashCode();
        }
        if (getEffectiveTimePeriod() != null) {
            _hashCode += getEffectiveTimePeriod().hashCode();
        }
        if (getItemReference() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemReference());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemReference(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipToPartyReference() != null) {
            _hashCode += getShipToPartyReference().hashCode();
        }
        if (getInvoiceLineAdjustment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceLineAdjustment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceLineAdjustment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceLineType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLineType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actionCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "actionCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ActionCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Identification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "ExtendedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "AdjustedIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveTimePeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EffectiveTimePeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TimePeriodType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ItemReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ItemReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipToPartyReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ShipToPartyReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ShipToPartyReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceLineAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLineAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLineAdjustment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CustomInvoiceLineType"));
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
