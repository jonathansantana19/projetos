/**
 * CustomInvoiceReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2;

public class CustomInvoiceReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType netAmount;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType previousDueAmount;

    public CustomInvoiceReferenceType() {
    }

    public CustomInvoiceReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType netAmount,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType previousDueAmount) {
           this.netAmount = netAmount;
           this.previousDueAmount = previousDueAmount;
    }


    /**
     * Gets the netAmount value for this CustomInvoiceReferenceType.
     * 
     * @return netAmount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this CustomInvoiceReferenceType.
     * 
     * @param netAmount
     */
    public void setNetAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the previousDueAmount value for this CustomInvoiceReferenceType.
     * 
     * @return previousDueAmount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getPreviousDueAmount() {
        return previousDueAmount;
    }


    /**
     * Sets the previousDueAmount value for this CustomInvoiceReferenceType.
     * 
     * @param previousDueAmount
     */
    public void setPreviousDueAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType previousDueAmount) {
        this.previousDueAmount = previousDueAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceReferenceType)) return false;
        CustomInvoiceReferenceType other = (CustomInvoiceReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.previousDueAmount==null && other.getPreviousDueAmount()==null) || 
             (this.previousDueAmount!=null &&
              this.previousDueAmount.equals(other.getPreviousDueAmount())));
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
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getPreviousDueAmount() != null) {
            _hashCode += getPreviousDueAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomInvoiceReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "NetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousDueAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "PreviousDueAmount"));
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
