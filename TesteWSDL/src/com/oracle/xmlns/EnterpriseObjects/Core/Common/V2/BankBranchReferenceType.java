/**
 * BankBranchReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class BankBranchReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchIdentificationType bankBranchIdentification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankBranchReferenceType custom;

    public BankBranchReferenceType() {
    }

    public BankBranchReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchIdentificationType bankBranchIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankBranchReferenceType custom) {
           this.bankBranchIdentification = bankBranchIdentification;
           this.custom = custom;
    }


    /**
     * Gets the bankBranchIdentification value for this BankBranchReferenceType.
     * 
     * @return bankBranchIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchIdentificationType getBankBranchIdentification() {
        return bankBranchIdentification;
    }


    /**
     * Sets the bankBranchIdentification value for this BankBranchReferenceType.
     * 
     * @param bankBranchIdentification
     */
    public void setBankBranchIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchIdentificationType bankBranchIdentification) {
        this.bankBranchIdentification = bankBranchIdentification;
    }


    /**
     * Gets the custom value for this BankBranchReferenceType.
     * 
     * @return custom
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankBranchReferenceType getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this BankBranchReferenceType.
     * 
     * @param custom
     */
    public void setCustom(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankBranchReferenceType custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankBranchReferenceType)) return false;
        BankBranchReferenceType other = (BankBranchReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankBranchIdentification==null && other.getBankBranchIdentification()==null) || 
             (this.bankBranchIdentification!=null &&
              this.bankBranchIdentification.equals(other.getBankBranchIdentification()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom())));
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
        if (getBankBranchIdentification() != null) {
            _hashCode += getBankBranchIdentification().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankBranchReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankBranchIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchIdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomBankBranchReferenceType"));
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
