/**
 * CustomCustomerPartyAccountType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2;

public class CustomCustomerPartyAccountType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType customerPartyAccountIdentification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType relationshipDescriptionText;

    public CustomCustomerPartyAccountType() {
    }

    public CustomCustomerPartyAccountType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType customerPartyAccountIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType relationshipDescriptionText) {
           this.customerPartyAccountIdentification = customerPartyAccountIdentification;
           this.relationshipDescriptionText = relationshipDescriptionText;
    }


    /**
     * Gets the customerPartyAccountIdentification value for this CustomCustomerPartyAccountType.
     * 
     * @return customerPartyAccountIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType getCustomerPartyAccountIdentification() {
        return customerPartyAccountIdentification;
    }


    /**
     * Sets the customerPartyAccountIdentification value for this CustomCustomerPartyAccountType.
     * 
     * @param customerPartyAccountIdentification
     */
    public void setCustomerPartyAccountIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType customerPartyAccountIdentification) {
        this.customerPartyAccountIdentification = customerPartyAccountIdentification;
    }


    /**
     * Gets the relationshipDescriptionText value for this CustomCustomerPartyAccountType.
     * 
     * @return relationshipDescriptionText
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType getRelationshipDescriptionText() {
        return relationshipDescriptionText;
    }


    /**
     * Sets the relationshipDescriptionText value for this CustomCustomerPartyAccountType.
     * 
     * @param relationshipDescriptionText
     */
    public void setRelationshipDescriptionText(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType relationshipDescriptionText) {
        this.relationshipDescriptionText = relationshipDescriptionText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCustomerPartyAccountType)) return false;
        CustomCustomerPartyAccountType other = (CustomCustomerPartyAccountType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPartyAccountIdentification==null && other.getCustomerPartyAccountIdentification()==null) || 
             (this.customerPartyAccountIdentification!=null &&
              this.customerPartyAccountIdentification.equals(other.getCustomerPartyAccountIdentification()))) &&
            ((this.relationshipDescriptionText==null && other.getRelationshipDescriptionText()==null) || 
             (this.relationshipDescriptionText!=null &&
              this.relationshipDescriptionText.equals(other.getRelationshipDescriptionText())));
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
        if (getCustomerPartyAccountIdentification() != null) {
            _hashCode += getCustomerPartyAccountIdentification().hashCode();
        }
        if (getRelationshipDescriptionText() != null) {
            _hashCode += getRelationshipDescriptionText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCustomerPartyAccountType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyAccountType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPartyAccountIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomerPartyAccountIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipDescriptionText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "RelationshipDescriptionText"));
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
