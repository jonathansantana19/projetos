/**
 * InvoiceEBOType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class InvoiceEBOType  implements java.io.Serializable {
    /* Invoice Identification. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification;

    /* Total value of the items billed on the invoice including taxes
     * or
     * 						charges, this value does not include the prior balance amount
     * and
     * 						should be derived from Invoice Lines. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount;

    /* Total value of the items billed on the invoice not including
     * taxes or
     * 						charges. This is the sum of all the line item Extended Amounts */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType extendedAmount;

    /* Date printed on invoice, basis of due date calculation. */
    private java.util.Calendar invoiceDateTime;

    /* Total amount paid during the current billing cycle against
     * prior bills. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType lastCyclePaymentAmount;

    /* Date the invoice is Due. */
    private java.util.Date dueDate;

    /* Details about the the status of the invoice */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.StatusType status;

    /* Details about the party to whom the invoice is issued. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BillToPartyReferenceType billToPartyReference;

    /* Identifies the primary invoice that groups multiple invoices
     * that have no
     * 						lines but only header information. The invoices that are being
     * 						consolidated will have the ConsolidationIndicator set to "Y"
     * and
     * 						the ConsolidatedInvoiceReference will have the ID of the primary
     * 						invoice. If an invoice is not part of a consolidation group,
     * this
     * 						field will be left blank. */
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.InvoiceReferenceType consolidatedInvoiceReference;

    /* Details about the Invoice Line */
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType[] invoiceLine;

    /* Details about all actual payments received for the invoice. */
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType[] invoicePayment;

    /* This is a Business Reference for capturing information about
     * the sold
     * 						to customer on the associated order. */
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType invoiceCustomerParty;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType custom;

    private java.lang.String actionCode;  // attribute

    public InvoiceEBOType() {
    }

    public InvoiceEBOType(
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
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType custom,
           java.lang.String actionCode) {
           this.identification = identification;
           this.totalAmount = totalAmount;
           this.extendedAmount = extendedAmount;
           this.invoiceDateTime = invoiceDateTime;
           this.lastCyclePaymentAmount = lastCyclePaymentAmount;
           this.dueDate = dueDate;
           this.status = status;
           this.billToPartyReference = billToPartyReference;
           this.consolidatedInvoiceReference = consolidatedInvoiceReference;
           this.invoiceLine = invoiceLine;
           this.invoicePayment = invoicePayment;
           this.invoiceCustomerParty = invoiceCustomerParty;
           this.custom = custom;
           this.actionCode = actionCode;
    }


    /**
     * Gets the identification value for this InvoiceEBOType.
     * 
     * @return identification   * Invoice Identification.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this InvoiceEBOType.
     * 
     * @param identification   * Invoice Identification.
     */
    public void setIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification) {
        this.identification = identification;
    }


    /**
     * Gets the totalAmount value for this InvoiceEBOType.
     * 
     * @return totalAmount   * Total value of the items billed on the invoice including taxes
     * or
     * 						charges, this value does not include the prior balance amount
     * and
     * 						should be derived from Invoice Lines.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this InvoiceEBOType.
     * 
     * @param totalAmount   * Total value of the items billed on the invoice including taxes
     * or
     * 						charges, this value does not include the prior balance amount
     * and
     * 						should be derived from Invoice Lines.
     */
    public void setTotalAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the extendedAmount value for this InvoiceEBOType.
     * 
     * @return extendedAmount   * Total value of the items billed on the invoice not including
     * taxes or
     * 						charges. This is the sum of all the line item Extended Amounts
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getExtendedAmount() {
        return extendedAmount;
    }


    /**
     * Sets the extendedAmount value for this InvoiceEBOType.
     * 
     * @param extendedAmount   * Total value of the items billed on the invoice not including
     * taxes or
     * 						charges. This is the sum of all the line item Extended Amounts
     */
    public void setExtendedAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType extendedAmount) {
        this.extendedAmount = extendedAmount;
    }


    /**
     * Gets the invoiceDateTime value for this InvoiceEBOType.
     * 
     * @return invoiceDateTime   * Date printed on invoice, basis of due date calculation.
     */
    public java.util.Calendar getInvoiceDateTime() {
        return invoiceDateTime;
    }


    /**
     * Sets the invoiceDateTime value for this InvoiceEBOType.
     * 
     * @param invoiceDateTime   * Date printed on invoice, basis of due date calculation.
     */
    public void setInvoiceDateTime(java.util.Calendar invoiceDateTime) {
        this.invoiceDateTime = invoiceDateTime;
    }


    /**
     * Gets the lastCyclePaymentAmount value for this InvoiceEBOType.
     * 
     * @return lastCyclePaymentAmount   * Total amount paid during the current billing cycle against
     * prior bills.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getLastCyclePaymentAmount() {
        return lastCyclePaymentAmount;
    }


    /**
     * Sets the lastCyclePaymentAmount value for this InvoiceEBOType.
     * 
     * @param lastCyclePaymentAmount   * Total amount paid during the current billing cycle against
     * prior bills.
     */
    public void setLastCyclePaymentAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType lastCyclePaymentAmount) {
        this.lastCyclePaymentAmount = lastCyclePaymentAmount;
    }


    /**
     * Gets the dueDate value for this InvoiceEBOType.
     * 
     * @return dueDate   * Date the invoice is Due.
     */
    public java.util.Date getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this InvoiceEBOType.
     * 
     * @param dueDate   * Date the invoice is Due.
     */
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the status value for this InvoiceEBOType.
     * 
     * @return status   * Details about the the status of the invoice
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.StatusType getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InvoiceEBOType.
     * 
     * @param status   * Details about the the status of the invoice
     */
    public void setStatus(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.StatusType status) {
        this.status = status;
    }


    /**
     * Gets the billToPartyReference value for this InvoiceEBOType.
     * 
     * @return billToPartyReference   * Details about the party to whom the invoice is issued.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BillToPartyReferenceType getBillToPartyReference() {
        return billToPartyReference;
    }


    /**
     * Sets the billToPartyReference value for this InvoiceEBOType.
     * 
     * @param billToPartyReference   * Details about the party to whom the invoice is issued.
     */
    public void setBillToPartyReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BillToPartyReferenceType billToPartyReference) {
        this.billToPartyReference = billToPartyReference;
    }


    /**
     * Gets the consolidatedInvoiceReference value for this InvoiceEBOType.
     * 
     * @return consolidatedInvoiceReference   * Identifies the primary invoice that groups multiple invoices
     * that have no
     * 						lines but only header information. The invoices that are being
     * 						consolidated will have the ConsolidationIndicator set to "Y"
     * and
     * 						the ConsolidatedInvoiceReference will have the ID of the primary
     * 						invoice. If an invoice is not part of a consolidation group,
     * this
     * 						field will be left blank.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.InvoiceReferenceType getConsolidatedInvoiceReference() {
        return consolidatedInvoiceReference;
    }


    /**
     * Sets the consolidatedInvoiceReference value for this InvoiceEBOType.
     * 
     * @param consolidatedInvoiceReference   * Identifies the primary invoice that groups multiple invoices
     * that have no
     * 						lines but only header information. The invoices that are being
     * 						consolidated will have the ConsolidationIndicator set to "Y"
     * and
     * 						the ConsolidatedInvoiceReference will have the ID of the primary
     * 						invoice. If an invoice is not part of a consolidation group,
     * this
     * 						field will be left blank.
     */
    public void setConsolidatedInvoiceReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.InvoiceReferenceType consolidatedInvoiceReference) {
        this.consolidatedInvoiceReference = consolidatedInvoiceReference;
    }


    /**
     * Gets the invoiceLine value for this InvoiceEBOType.
     * 
     * @return invoiceLine   * Details about the Invoice Line
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType[] getInvoiceLine() {
        return invoiceLine;
    }


    /**
     * Sets the invoiceLine value for this InvoiceEBOType.
     * 
     * @param invoiceLine   * Details about the Invoice Line
     */
    public void setInvoiceLine(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType[] invoiceLine) {
        this.invoiceLine = invoiceLine;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType getInvoiceLine(int i) {
        return this.invoiceLine[i];
    }

    public void setInvoiceLine(int i, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType _value) {
        this.invoiceLine[i] = _value;
    }


    /**
     * Gets the invoicePayment value for this InvoiceEBOType.
     * 
     * @return invoicePayment   * Details about all actual payments received for the invoice.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType[] getInvoicePayment() {
        return invoicePayment;
    }


    /**
     * Sets the invoicePayment value for this InvoiceEBOType.
     * 
     * @param invoicePayment   * Details about all actual payments received for the invoice.
     */
    public void setInvoicePayment(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType[] invoicePayment) {
        this.invoicePayment = invoicePayment;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType getInvoicePayment(int i) {
        return this.invoicePayment[i];
    }

    public void setInvoicePayment(int i, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType _value) {
        this.invoicePayment[i] = _value;
    }


    /**
     * Gets the invoiceCustomerParty value for this InvoiceEBOType.
     * 
     * @return invoiceCustomerParty   * This is a Business Reference for capturing information about
     * the sold
     * 						to customer on the associated order.
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType getInvoiceCustomerParty() {
        return invoiceCustomerParty;
    }


    /**
     * Sets the invoiceCustomerParty value for this InvoiceEBOType.
     * 
     * @param invoiceCustomerParty   * This is a Business Reference for capturing information about
     * the sold
     * 						to customer on the associated order.
     */
    public void setInvoiceCustomerParty(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType invoiceCustomerParty) {
        this.invoiceCustomerParty = invoiceCustomerParty;
    }


    /**
     * Gets the custom value for this InvoiceEBOType.
     * 
     * @return custom
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this InvoiceEBOType.
     * 
     * @param custom
     */
    public void setCustom(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType custom) {
        this.custom = custom;
    }


    /**
     * Gets the actionCode value for this InvoiceEBOType.
     * 
     * @return actionCode
     */
    public java.lang.String getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this InvoiceEBOType.
     * 
     * @param actionCode
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceEBOType)) return false;
        InvoiceEBOType other = (InvoiceEBOType) obj;
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
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.extendedAmount==null && other.getExtendedAmount()==null) || 
             (this.extendedAmount!=null &&
              this.extendedAmount.equals(other.getExtendedAmount()))) &&
            ((this.invoiceDateTime==null && other.getInvoiceDateTime()==null) || 
             (this.invoiceDateTime!=null &&
              this.invoiceDateTime.equals(other.getInvoiceDateTime()))) &&
            ((this.lastCyclePaymentAmount==null && other.getLastCyclePaymentAmount()==null) || 
             (this.lastCyclePaymentAmount!=null &&
              this.lastCyclePaymentAmount.equals(other.getLastCyclePaymentAmount()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.billToPartyReference==null && other.getBillToPartyReference()==null) || 
             (this.billToPartyReference!=null &&
              this.billToPartyReference.equals(other.getBillToPartyReference()))) &&
            ((this.consolidatedInvoiceReference==null && other.getConsolidatedInvoiceReference()==null) || 
             (this.consolidatedInvoiceReference!=null &&
              this.consolidatedInvoiceReference.equals(other.getConsolidatedInvoiceReference()))) &&
            ((this.invoiceLine==null && other.getInvoiceLine()==null) || 
             (this.invoiceLine!=null &&
              java.util.Arrays.equals(this.invoiceLine, other.getInvoiceLine()))) &&
            ((this.invoicePayment==null && other.getInvoicePayment()==null) || 
             (this.invoicePayment!=null &&
              java.util.Arrays.equals(this.invoicePayment, other.getInvoicePayment()))) &&
            ((this.invoiceCustomerParty==null && other.getInvoiceCustomerParty()==null) || 
             (this.invoiceCustomerParty!=null &&
              this.invoiceCustomerParty.equals(other.getInvoiceCustomerParty()))) &&
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
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getExtendedAmount() != null) {
            _hashCode += getExtendedAmount().hashCode();
        }
        if (getInvoiceDateTime() != null) {
            _hashCode += getInvoiceDateTime().hashCode();
        }
        if (getLastCyclePaymentAmount() != null) {
            _hashCode += getLastCyclePaymentAmount().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getBillToPartyReference() != null) {
            _hashCode += getBillToPartyReference().hashCode();
        }
        if (getConsolidatedInvoiceReference() != null) {
            _hashCode += getConsolidatedInvoiceReference().hashCode();
        }
        if (getInvoiceLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoicePayment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoicePayment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoicePayment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoiceCustomerParty() != null) {
            _hashCode += getInvoiceCustomerParty().hashCode();
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
        new org.apache.axis.description.TypeDesc(InvoiceEBOType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceEBOType"));
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
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "ExtendedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCyclePaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "LastCyclePaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "StatusType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billToPartyReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BillToPartyReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BillToPartyReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedInvoiceReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ConsolidatedInvoiceReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "InvoiceReferenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoicePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoicePayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoicePayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceCustomerParty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceCustomerParty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceCustomerPartyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CustomInvoiceEBOType"));
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
