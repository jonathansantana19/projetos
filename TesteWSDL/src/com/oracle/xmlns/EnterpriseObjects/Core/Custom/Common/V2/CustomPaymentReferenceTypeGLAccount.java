/**
 * CustomPaymentReferenceTypeGLAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2;

public class CustomPaymentReferenceTypeGLAccount  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType description;

    public CustomPaymentReferenceTypeGLAccount() {
    }

    public CustomPaymentReferenceTypeGLAccount(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType description) {
           this.identification = identification;
           this.description = description;
    }


    /**
     * Gets the identification value for this CustomPaymentReferenceTypeGLAccount.
     * 
     * @return identification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getIdentification() {
        return identification;
    }


    /**
     * Sets the identification value for this CustomPaymentReferenceTypeGLAccount.
     * 
     * @param identification
     */
    public void setIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType identification) {
        this.identification = identification;
    }


    /**
     * Gets the description value for this CustomPaymentReferenceTypeGLAccount.
     * 
     * @return description
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CustomPaymentReferenceTypeGLAccount.
     * 
     * @param description
     */
    public void setDescription(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomPaymentReferenceTypeGLAccount)) return false;
        CustomPaymentReferenceTypeGLAccount other = (CustomPaymentReferenceTypeGLAccount) obj;
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
              this.description.equals(other.getDescription())));
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
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomPaymentReferenceTypeGLAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", ">CustomPaymentReferenceType>GLAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Identification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType"));
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
