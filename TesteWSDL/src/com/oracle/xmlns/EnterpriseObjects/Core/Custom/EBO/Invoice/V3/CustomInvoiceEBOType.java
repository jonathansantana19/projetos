/**
 * CustomInvoiceEBOType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3;

public class CustomInvoiceEBOType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType writeOffValue;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType revertedDiscountAmount;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType notApplyValue;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeOverdueInvoice overdueInvoice;

    private java.lang.Boolean fineExemption;

    private org.apache.axis.types.NonNegativeInteger updateResultsCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NoteType comment;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType resubmitStatus;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType issuerChannelCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType emissionChannelCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocument bankPayableDocument;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BinaryObjectType outputFileBytes;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType outputFileType;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypePromisePayment promisePayment;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail[] debtInstallmentDetail;

    private java.util.Date cancellationDate;

    private java.util.Date startDateInvoice;

    private java.util.Date endDateInvoice;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType proRata;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType unitaryInstallment;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType discount;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType sumUnbilledInstallment;

    public CustomInvoiceEBOType() {
    }

    public CustomInvoiceEBOType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType writeOffValue,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType revertedDiscountAmount,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType notApplyValue,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeOverdueInvoice overdueInvoice,
           java.lang.Boolean fineExemption,
           org.apache.axis.types.NonNegativeInteger updateResultsCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NoteType comment,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType resubmitStatus,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType issuerChannelCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType emissionChannelCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocument bankPayableDocument,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BinaryObjectType outputFileBytes,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType outputFileType,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypePromisePayment promisePayment,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail[] debtInstallmentDetail,
           java.util.Date cancellationDate,
           java.util.Date startDateInvoice,
           java.util.Date endDateInvoice,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType proRata,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType unitaryInstallment,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType discount,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType sumUnbilledInstallment) {
           this.writeOffValue = writeOffValue;
           this.revertedDiscountAmount = revertedDiscountAmount;
           this.notApplyValue = notApplyValue;
           this.overdueInvoice = overdueInvoice;
           this.fineExemption = fineExemption;
           this.updateResultsCode = updateResultsCode;
           this.comment = comment;
           this.resubmitStatus = resubmitStatus;
           this.issuerChannelCode = issuerChannelCode;
           this.emissionChannelCode = emissionChannelCode;
           this.bankPayableDocument = bankPayableDocument;
           this.outputFileBytes = outputFileBytes;
           this.outputFileType = outputFileType;
           this.promisePayment = promisePayment;
           this.debtInstallmentDetail = debtInstallmentDetail;
           this.cancellationDate = cancellationDate;
           this.startDateInvoice = startDateInvoice;
           this.endDateInvoice = endDateInvoice;
           this.proRata = proRata;
           this.unitaryInstallment = unitaryInstallment;
           this.discount = discount;
           this.sumUnbilledInstallment = sumUnbilledInstallment;
    }


    /**
     * Gets the writeOffValue value for this CustomInvoiceEBOType.
     * 
     * @return writeOffValue
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getWriteOffValue() {
        return writeOffValue;
    }


    /**
     * Sets the writeOffValue value for this CustomInvoiceEBOType.
     * 
     * @param writeOffValue
     */
    public void setWriteOffValue(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType writeOffValue) {
        this.writeOffValue = writeOffValue;
    }


    /**
     * Gets the revertedDiscountAmount value for this CustomInvoiceEBOType.
     * 
     * @return revertedDiscountAmount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getRevertedDiscountAmount() {
        return revertedDiscountAmount;
    }


    /**
     * Sets the revertedDiscountAmount value for this CustomInvoiceEBOType.
     * 
     * @param revertedDiscountAmount
     */
    public void setRevertedDiscountAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType revertedDiscountAmount) {
        this.revertedDiscountAmount = revertedDiscountAmount;
    }


    /**
     * Gets the notApplyValue value for this CustomInvoiceEBOType.
     * 
     * @return notApplyValue
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getNotApplyValue() {
        return notApplyValue;
    }


    /**
     * Sets the notApplyValue value for this CustomInvoiceEBOType.
     * 
     * @param notApplyValue
     */
    public void setNotApplyValue(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType notApplyValue) {
        this.notApplyValue = notApplyValue;
    }


    /**
     * Gets the overdueInvoice value for this CustomInvoiceEBOType.
     * 
     * @return overdueInvoice
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeOverdueInvoice getOverdueInvoice() {
        return overdueInvoice;
    }


    /**
     * Sets the overdueInvoice value for this CustomInvoiceEBOType.
     * 
     * @param overdueInvoice
     */
    public void setOverdueInvoice(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeOverdueInvoice overdueInvoice) {
        this.overdueInvoice = overdueInvoice;
    }


    /**
     * Gets the fineExemption value for this CustomInvoiceEBOType.
     * 
     * @return fineExemption
     */
    public java.lang.Boolean getFineExemption() {
        return fineExemption;
    }


    /**
     * Sets the fineExemption value for this CustomInvoiceEBOType.
     * 
     * @param fineExemption
     */
    public void setFineExemption(java.lang.Boolean fineExemption) {
        this.fineExemption = fineExemption;
    }


    /**
     * Gets the updateResultsCode value for this CustomInvoiceEBOType.
     * 
     * @return updateResultsCode
     */
    public org.apache.axis.types.NonNegativeInteger getUpdateResultsCode() {
        return updateResultsCode;
    }


    /**
     * Sets the updateResultsCode value for this CustomInvoiceEBOType.
     * 
     * @param updateResultsCode
     */
    public void setUpdateResultsCode(org.apache.axis.types.NonNegativeInteger updateResultsCode) {
        this.updateResultsCode = updateResultsCode;
    }


    /**
     * Gets the comment value for this CustomInvoiceEBOType.
     * 
     * @return comment
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NoteType getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this CustomInvoiceEBOType.
     * 
     * @param comment
     */
    public void setComment(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NoteType comment) {
        this.comment = comment;
    }


    /**
     * Gets the resubmitStatus value for this CustomInvoiceEBOType.
     * 
     * @return resubmitStatus
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getResubmitStatus() {
        return resubmitStatus;
    }


    /**
     * Sets the resubmitStatus value for this CustomInvoiceEBOType.
     * 
     * @param resubmitStatus
     */
    public void setResubmitStatus(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType resubmitStatus) {
        this.resubmitStatus = resubmitStatus;
    }


    /**
     * Gets the issuerChannelCode value for this CustomInvoiceEBOType.
     * 
     * @return issuerChannelCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getIssuerChannelCode() {
        return issuerChannelCode;
    }


    /**
     * Sets the issuerChannelCode value for this CustomInvoiceEBOType.
     * 
     * @param issuerChannelCode
     */
    public void setIssuerChannelCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType issuerChannelCode) {
        this.issuerChannelCode = issuerChannelCode;
    }


    /**
     * Gets the emissionChannelCode value for this CustomInvoiceEBOType.
     * 
     * @return emissionChannelCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getEmissionChannelCode() {
        return emissionChannelCode;
    }


    /**
     * Sets the emissionChannelCode value for this CustomInvoiceEBOType.
     * 
     * @param emissionChannelCode
     */
    public void setEmissionChannelCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType emissionChannelCode) {
        this.emissionChannelCode = emissionChannelCode;
    }


    /**
     * Gets the bankPayableDocument value for this CustomInvoiceEBOType.
     * 
     * @return bankPayableDocument
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocument getBankPayableDocument() {
        return bankPayableDocument;
    }


    /**
     * Sets the bankPayableDocument value for this CustomInvoiceEBOType.
     * 
     * @param bankPayableDocument
     */
    public void setBankPayableDocument(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocument bankPayableDocument) {
        this.bankPayableDocument = bankPayableDocument;
    }


    /**
     * Gets the outputFileBytes value for this CustomInvoiceEBOType.
     * 
     * @return outputFileBytes
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BinaryObjectType getOutputFileBytes() {
        return outputFileBytes;
    }


    /**
     * Sets the outputFileBytes value for this CustomInvoiceEBOType.
     * 
     * @param outputFileBytes
     */
    public void setOutputFileBytes(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BinaryObjectType outputFileBytes) {
        this.outputFileBytes = outputFileBytes;
    }


    /**
     * Gets the outputFileType value for this CustomInvoiceEBOType.
     * 
     * @return outputFileType
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getOutputFileType() {
        return outputFileType;
    }


    /**
     * Sets the outputFileType value for this CustomInvoiceEBOType.
     * 
     * @param outputFileType
     */
    public void setOutputFileType(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType outputFileType) {
        this.outputFileType = outputFileType;
    }


    /**
     * Gets the promisePayment value for this CustomInvoiceEBOType.
     * 
     * @return promisePayment
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypePromisePayment getPromisePayment() {
        return promisePayment;
    }


    /**
     * Sets the promisePayment value for this CustomInvoiceEBOType.
     * 
     * @param promisePayment
     */
    public void setPromisePayment(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypePromisePayment promisePayment) {
        this.promisePayment = promisePayment;
    }


    /**
     * Gets the debtInstallmentDetail value for this CustomInvoiceEBOType.
     * 
     * @return debtInstallmentDetail
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail[] getDebtInstallmentDetail() {
        return debtInstallmentDetail;
    }


    /**
     * Sets the debtInstallmentDetail value for this CustomInvoiceEBOType.
     * 
     * @param debtInstallmentDetail
     */
    public void setDebtInstallmentDetail(com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail[] debtInstallmentDetail) {
        this.debtInstallmentDetail = debtInstallmentDetail;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail getDebtInstallmentDetail(int i) {
        return this.debtInstallmentDetail[i];
    }

    public void setDebtInstallmentDetail(int i, com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail _value) {
        this.debtInstallmentDetail[i] = _value;
    }


    /**
     * Gets the cancellationDate value for this CustomInvoiceEBOType.
     * 
     * @return cancellationDate
     */
    public java.util.Date getCancellationDate() {
        return cancellationDate;
    }


    /**
     * Sets the cancellationDate value for this CustomInvoiceEBOType.
     * 
     * @param cancellationDate
     */
    public void setCancellationDate(java.util.Date cancellationDate) {
        this.cancellationDate = cancellationDate;
    }


    /**
     * Gets the startDateInvoice value for this CustomInvoiceEBOType.
     * 
     * @return startDateInvoice
     */
    public java.util.Date getStartDateInvoice() {
        return startDateInvoice;
    }


    /**
     * Sets the startDateInvoice value for this CustomInvoiceEBOType.
     * 
     * @param startDateInvoice
     */
    public void setStartDateInvoice(java.util.Date startDateInvoice) {
        this.startDateInvoice = startDateInvoice;
    }


    /**
     * Gets the endDateInvoice value for this CustomInvoiceEBOType.
     * 
     * @return endDateInvoice
     */
    public java.util.Date getEndDateInvoice() {
        return endDateInvoice;
    }


    /**
     * Sets the endDateInvoice value for this CustomInvoiceEBOType.
     * 
     * @param endDateInvoice
     */
    public void setEndDateInvoice(java.util.Date endDateInvoice) {
        this.endDateInvoice = endDateInvoice;
    }


    /**
     * Gets the proRata value for this CustomInvoiceEBOType.
     * 
     * @return proRata
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getProRata() {
        return proRata;
    }


    /**
     * Sets the proRata value for this CustomInvoiceEBOType.
     * 
     * @param proRata
     */
    public void setProRata(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType proRata) {
        this.proRata = proRata;
    }


    /**
     * Gets the unitaryInstallment value for this CustomInvoiceEBOType.
     * 
     * @return unitaryInstallment
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getUnitaryInstallment() {
        return unitaryInstallment;
    }


    /**
     * Sets the unitaryInstallment value for this CustomInvoiceEBOType.
     * 
     * @param unitaryInstallment
     */
    public void setUnitaryInstallment(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType unitaryInstallment) {
        this.unitaryInstallment = unitaryInstallment;
    }


    /**
     * Gets the discount value for this CustomInvoiceEBOType.
     * 
     * @return discount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getDiscount() {
        return discount;
    }


    /**
     * Sets the discount value for this CustomInvoiceEBOType.
     * 
     * @param discount
     */
    public void setDiscount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType discount) {
        this.discount = discount;
    }


    /**
     * Gets the sumUnbilledInstallment value for this CustomInvoiceEBOType.
     * 
     * @return sumUnbilledInstallment
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getSumUnbilledInstallment() {
        return sumUnbilledInstallment;
    }


    /**
     * Sets the sumUnbilledInstallment value for this CustomInvoiceEBOType.
     * 
     * @param sumUnbilledInstallment
     */
    public void setSumUnbilledInstallment(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType sumUnbilledInstallment) {
        this.sumUnbilledInstallment = sumUnbilledInstallment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceEBOType)) return false;
        CustomInvoiceEBOType other = (CustomInvoiceEBOType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.writeOffValue==null && other.getWriteOffValue()==null) || 
             (this.writeOffValue!=null &&
              this.writeOffValue.equals(other.getWriteOffValue()))) &&
            ((this.revertedDiscountAmount==null && other.getRevertedDiscountAmount()==null) || 
             (this.revertedDiscountAmount!=null &&
              this.revertedDiscountAmount.equals(other.getRevertedDiscountAmount()))) &&
            ((this.notApplyValue==null && other.getNotApplyValue()==null) || 
             (this.notApplyValue!=null &&
              this.notApplyValue.equals(other.getNotApplyValue()))) &&
            ((this.overdueInvoice==null && other.getOverdueInvoice()==null) || 
             (this.overdueInvoice!=null &&
              this.overdueInvoice.equals(other.getOverdueInvoice()))) &&
            ((this.fineExemption==null && other.getFineExemption()==null) || 
             (this.fineExemption!=null &&
              this.fineExemption.equals(other.getFineExemption()))) &&
            ((this.updateResultsCode==null && other.getUpdateResultsCode()==null) || 
             (this.updateResultsCode!=null &&
              this.updateResultsCode.equals(other.getUpdateResultsCode()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.resubmitStatus==null && other.getResubmitStatus()==null) || 
             (this.resubmitStatus!=null &&
              this.resubmitStatus.equals(other.getResubmitStatus()))) &&
            ((this.issuerChannelCode==null && other.getIssuerChannelCode()==null) || 
             (this.issuerChannelCode!=null &&
              this.issuerChannelCode.equals(other.getIssuerChannelCode()))) &&
            ((this.emissionChannelCode==null && other.getEmissionChannelCode()==null) || 
             (this.emissionChannelCode!=null &&
              this.emissionChannelCode.equals(other.getEmissionChannelCode()))) &&
            ((this.bankPayableDocument==null && other.getBankPayableDocument()==null) || 
             (this.bankPayableDocument!=null &&
              this.bankPayableDocument.equals(other.getBankPayableDocument()))) &&
            ((this.outputFileBytes==null && other.getOutputFileBytes()==null) || 
             (this.outputFileBytes!=null &&
              this.outputFileBytes.equals(other.getOutputFileBytes()))) &&
            ((this.outputFileType==null && other.getOutputFileType()==null) || 
             (this.outputFileType!=null &&
              this.outputFileType.equals(other.getOutputFileType()))) &&
            ((this.promisePayment==null && other.getPromisePayment()==null) || 
             (this.promisePayment!=null &&
              this.promisePayment.equals(other.getPromisePayment()))) &&
            ((this.debtInstallmentDetail==null && other.getDebtInstallmentDetail()==null) || 
             (this.debtInstallmentDetail!=null &&
              java.util.Arrays.equals(this.debtInstallmentDetail, other.getDebtInstallmentDetail()))) &&
            ((this.cancellationDate==null && other.getCancellationDate()==null) || 
             (this.cancellationDate!=null &&
              this.cancellationDate.equals(other.getCancellationDate()))) &&
            ((this.startDateInvoice==null && other.getStartDateInvoice()==null) || 
             (this.startDateInvoice!=null &&
              this.startDateInvoice.equals(other.getStartDateInvoice()))) &&
            ((this.endDateInvoice==null && other.getEndDateInvoice()==null) || 
             (this.endDateInvoice!=null &&
              this.endDateInvoice.equals(other.getEndDateInvoice()))) &&
            ((this.proRata==null && other.getProRata()==null) || 
             (this.proRata!=null &&
              this.proRata.equals(other.getProRata()))) &&
            ((this.unitaryInstallment==null && other.getUnitaryInstallment()==null) || 
             (this.unitaryInstallment!=null &&
              this.unitaryInstallment.equals(other.getUnitaryInstallment()))) &&
            ((this.discount==null && other.getDiscount()==null) || 
             (this.discount!=null &&
              this.discount.equals(other.getDiscount()))) &&
            ((this.sumUnbilledInstallment==null && other.getSumUnbilledInstallment()==null) || 
             (this.sumUnbilledInstallment!=null &&
              this.sumUnbilledInstallment.equals(other.getSumUnbilledInstallment())));
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
        if (getWriteOffValue() != null) {
            _hashCode += getWriteOffValue().hashCode();
        }
        if (getRevertedDiscountAmount() != null) {
            _hashCode += getRevertedDiscountAmount().hashCode();
        }
        if (getNotApplyValue() != null) {
            _hashCode += getNotApplyValue().hashCode();
        }
        if (getOverdueInvoice() != null) {
            _hashCode += getOverdueInvoice().hashCode();
        }
        if (getFineExemption() != null) {
            _hashCode += getFineExemption().hashCode();
        }
        if (getUpdateResultsCode() != null) {
            _hashCode += getUpdateResultsCode().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getResubmitStatus() != null) {
            _hashCode += getResubmitStatus().hashCode();
        }
        if (getIssuerChannelCode() != null) {
            _hashCode += getIssuerChannelCode().hashCode();
        }
        if (getEmissionChannelCode() != null) {
            _hashCode += getEmissionChannelCode().hashCode();
        }
        if (getBankPayableDocument() != null) {
            _hashCode += getBankPayableDocument().hashCode();
        }
        if (getOutputFileBytes() != null) {
            _hashCode += getOutputFileBytes().hashCode();
        }
        if (getOutputFileType() != null) {
            _hashCode += getOutputFileType().hashCode();
        }
        if (getPromisePayment() != null) {
            _hashCode += getPromisePayment().hashCode();
        }
        if (getDebtInstallmentDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebtInstallmentDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebtInstallmentDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCancellationDate() != null) {
            _hashCode += getCancellationDate().hashCode();
        }
        if (getStartDateInvoice() != null) {
            _hashCode += getStartDateInvoice().hashCode();
        }
        if (getEndDateInvoice() != null) {
            _hashCode += getEndDateInvoice().hashCode();
        }
        if (getProRata() != null) {
            _hashCode += getProRata().hashCode();
        }
        if (getUnitaryInstallment() != null) {
            _hashCode += getUnitaryInstallment().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getSumUnbilledInstallment() != null) {
            _hashCode += getSumUnbilledInstallment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceEBOType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CustomInvoiceEBOType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writeOffValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "WriteOffValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revertedDiscountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "RevertedDiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notApplyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "NotApplyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "OverdueInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>OverdueInvoice"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fineExemption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "FineExemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateResultsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "UpdateResultsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NoteType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resubmitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "ResubmitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuerChannelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "IssuerChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emissionChannelCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "EmissionChannelCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankPayableDocument");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "BankPayableDocument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>BankPayableDocument"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFileBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "OutputFileBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BinaryObjectType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "OutputFileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promisePayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "PromisePayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>PromisePayment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debtInstallmentDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "DebtInstallmentDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>DebtInstallmentDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancellationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CancellationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "StartDateInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "EndDateInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proRata");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "ProRata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitaryInstallment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "UnitaryInstallment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "Discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sumUnbilledInstallment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "SumUnbilledInstallment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
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
