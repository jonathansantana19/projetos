/**
 * CustomInvoiceEBOTypeBankPayableDocumentRescheduling.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3;

public class CustomInvoiceEBOTypeBankPayableDocumentRescheduling  implements java.io.Serializable {
    private java.util.Date referenceDate;

    private org.apache.axis.types.NonNegativeInteger workDaysCount;

    private java.lang.Boolean blockingAuthorizationFlag;

    private java.util.Date blockingEffectiveDate;

    private java.util.Date targetDate;

    public CustomInvoiceEBOTypeBankPayableDocumentRescheduling() {
    }

    public CustomInvoiceEBOTypeBankPayableDocumentRescheduling(
           java.util.Date referenceDate,
           org.apache.axis.types.NonNegativeInteger workDaysCount,
           java.lang.Boolean blockingAuthorizationFlag,
           java.util.Date blockingEffectiveDate,
           java.util.Date targetDate) {
           this.referenceDate = referenceDate;
           this.workDaysCount = workDaysCount;
           this.blockingAuthorizationFlag = blockingAuthorizationFlag;
           this.blockingEffectiveDate = blockingEffectiveDate;
           this.targetDate = targetDate;
    }


    /**
     * Gets the referenceDate value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @return referenceDate
     */
    public java.util.Date getReferenceDate() {
        return referenceDate;
    }


    /**
     * Sets the referenceDate value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @param referenceDate
     */
    public void setReferenceDate(java.util.Date referenceDate) {
        this.referenceDate = referenceDate;
    }


    /**
     * Gets the workDaysCount value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @return workDaysCount
     */
    public org.apache.axis.types.NonNegativeInteger getWorkDaysCount() {
        return workDaysCount;
    }


    /**
     * Sets the workDaysCount value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @param workDaysCount
     */
    public void setWorkDaysCount(org.apache.axis.types.NonNegativeInteger workDaysCount) {
        this.workDaysCount = workDaysCount;
    }


    /**
     * Gets the blockingAuthorizationFlag value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @return blockingAuthorizationFlag
     */
    public java.lang.Boolean getBlockingAuthorizationFlag() {
        return blockingAuthorizationFlag;
    }


    /**
     * Sets the blockingAuthorizationFlag value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @param blockingAuthorizationFlag
     */
    public void setBlockingAuthorizationFlag(java.lang.Boolean blockingAuthorizationFlag) {
        this.blockingAuthorizationFlag = blockingAuthorizationFlag;
    }


    /**
     * Gets the blockingEffectiveDate value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @return blockingEffectiveDate
     */
    public java.util.Date getBlockingEffectiveDate() {
        return blockingEffectiveDate;
    }


    /**
     * Sets the blockingEffectiveDate value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @param blockingEffectiveDate
     */
    public void setBlockingEffectiveDate(java.util.Date blockingEffectiveDate) {
        this.blockingEffectiveDate = blockingEffectiveDate;
    }


    /**
     * Gets the targetDate value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @return targetDate
     */
    public java.util.Date getTargetDate() {
        return targetDate;
    }


    /**
     * Sets the targetDate value for this CustomInvoiceEBOTypeBankPayableDocumentRescheduling.
     * 
     * @param targetDate
     */
    public void setTargetDate(java.util.Date targetDate) {
        this.targetDate = targetDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceEBOTypeBankPayableDocumentRescheduling)) return false;
        CustomInvoiceEBOTypeBankPayableDocumentRescheduling other = (CustomInvoiceEBOTypeBankPayableDocumentRescheduling) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceDate==null && other.getReferenceDate()==null) || 
             (this.referenceDate!=null &&
              this.referenceDate.equals(other.getReferenceDate()))) &&
            ((this.workDaysCount==null && other.getWorkDaysCount()==null) || 
             (this.workDaysCount!=null &&
              this.workDaysCount.equals(other.getWorkDaysCount()))) &&
            ((this.blockingAuthorizationFlag==null && other.getBlockingAuthorizationFlag()==null) || 
             (this.blockingAuthorizationFlag!=null &&
              this.blockingAuthorizationFlag.equals(other.getBlockingAuthorizationFlag()))) &&
            ((this.blockingEffectiveDate==null && other.getBlockingEffectiveDate()==null) || 
             (this.blockingEffectiveDate!=null &&
              this.blockingEffectiveDate.equals(other.getBlockingEffectiveDate()))) &&
            ((this.targetDate==null && other.getTargetDate()==null) || 
             (this.targetDate!=null &&
              this.targetDate.equals(other.getTargetDate())));
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
        if (getReferenceDate() != null) {
            _hashCode += getReferenceDate().hashCode();
        }
        if (getWorkDaysCount() != null) {
            _hashCode += getWorkDaysCount().hashCode();
        }
        if (getBlockingAuthorizationFlag() != null) {
            _hashCode += getBlockingAuthorizationFlag().hashCode();
        }
        if (getBlockingEffectiveDate() != null) {
            _hashCode += getBlockingEffectiveDate().hashCode();
        }
        if (getTargetDate() != null) {
            _hashCode += getTargetDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceEBOTypeBankPayableDocumentRescheduling.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">>CustomInvoiceEBOType>BankPayableDocument>Rescheduling"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "ReferenceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workDaysCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "WorkDaysCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingAuthorizationFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "BlockingAuthorizationFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockingEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "BlockingEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "TargetDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
