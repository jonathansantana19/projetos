/**
 * CustomInvoiceEBOTypeDebtInstallmentDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3;

public class CustomInvoiceEBOTypeDebtInstallmentDetail  implements java.io.Serializable {
    private java.lang.String currentInstallmentNumber;

    private java.util.Calendar dateInstallmentBilling;

    private java.lang.String installmentNumber;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType installmentAmount;

    private java.lang.String installmentStatus;

    public CustomInvoiceEBOTypeDebtInstallmentDetail() {
    }

    public CustomInvoiceEBOTypeDebtInstallmentDetail(
           java.lang.String currentInstallmentNumber,
           java.util.Calendar dateInstallmentBilling,
           java.lang.String installmentNumber,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType installmentAmount,
           java.lang.String installmentStatus) {
           this.currentInstallmentNumber = currentInstallmentNumber;
           this.dateInstallmentBilling = dateInstallmentBilling;
           this.installmentNumber = installmentNumber;
           this.installmentAmount = installmentAmount;
           this.installmentStatus = installmentStatus;
    }


    /**
     * Gets the currentInstallmentNumber value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @return currentInstallmentNumber
     */
    public java.lang.String getCurrentInstallmentNumber() {
        return currentInstallmentNumber;
    }


    /**
     * Sets the currentInstallmentNumber value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @param currentInstallmentNumber
     */
    public void setCurrentInstallmentNumber(java.lang.String currentInstallmentNumber) {
        this.currentInstallmentNumber = currentInstallmentNumber;
    }


    /**
     * Gets the dateInstallmentBilling value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @return dateInstallmentBilling
     */
    public java.util.Calendar getDateInstallmentBilling() {
        return dateInstallmentBilling;
    }


    /**
     * Sets the dateInstallmentBilling value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @param dateInstallmentBilling
     */
    public void setDateInstallmentBilling(java.util.Calendar dateInstallmentBilling) {
        this.dateInstallmentBilling = dateInstallmentBilling;
    }


    /**
     * Gets the installmentNumber value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @return installmentNumber
     */
    public java.lang.String getInstallmentNumber() {
        return installmentNumber;
    }


    /**
     * Sets the installmentNumber value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @param installmentNumber
     */
    public void setInstallmentNumber(java.lang.String installmentNumber) {
        this.installmentNumber = installmentNumber;
    }


    /**
     * Gets the installmentAmount value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @return installmentAmount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getInstallmentAmount() {
        return installmentAmount;
    }


    /**
     * Sets the installmentAmount value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @param installmentAmount
     */
    public void setInstallmentAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType installmentAmount) {
        this.installmentAmount = installmentAmount;
    }


    /**
     * Gets the installmentStatus value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @return installmentStatus
     */
    public java.lang.String getInstallmentStatus() {
        return installmentStatus;
    }


    /**
     * Sets the installmentStatus value for this CustomInvoiceEBOTypeDebtInstallmentDetail.
     * 
     * @param installmentStatus
     */
    public void setInstallmentStatus(java.lang.String installmentStatus) {
        this.installmentStatus = installmentStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceEBOTypeDebtInstallmentDetail)) return false;
        CustomInvoiceEBOTypeDebtInstallmentDetail other = (CustomInvoiceEBOTypeDebtInstallmentDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentInstallmentNumber==null && other.getCurrentInstallmentNumber()==null) || 
             (this.currentInstallmentNumber!=null &&
              this.currentInstallmentNumber.equals(other.getCurrentInstallmentNumber()))) &&
            ((this.dateInstallmentBilling==null && other.getDateInstallmentBilling()==null) || 
             (this.dateInstallmentBilling!=null &&
              this.dateInstallmentBilling.equals(other.getDateInstallmentBilling()))) &&
            ((this.installmentNumber==null && other.getInstallmentNumber()==null) || 
             (this.installmentNumber!=null &&
              this.installmentNumber.equals(other.getInstallmentNumber()))) &&
            ((this.installmentAmount==null && other.getInstallmentAmount()==null) || 
             (this.installmentAmount!=null &&
              this.installmentAmount.equals(other.getInstallmentAmount()))) &&
            ((this.installmentStatus==null && other.getInstallmentStatus()==null) || 
             (this.installmentStatus!=null &&
              this.installmentStatus.equals(other.getInstallmentStatus())));
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
        if (getCurrentInstallmentNumber() != null) {
            _hashCode += getCurrentInstallmentNumber().hashCode();
        }
        if (getDateInstallmentBilling() != null) {
            _hashCode += getDateInstallmentBilling().hashCode();
        }
        if (getInstallmentNumber() != null) {
            _hashCode += getInstallmentNumber().hashCode();
        }
        if (getInstallmentAmount() != null) {
            _hashCode += getInstallmentAmount().hashCode();
        }
        if (getInstallmentStatus() != null) {
            _hashCode += getInstallmentStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceEBOTypeDebtInstallmentDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>DebtInstallmentDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentInstallmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CurrentInstallmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateInstallmentBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "DateInstallmentBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "InstallmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "InstallmentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("installmentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "InstallmentStatus"));
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
