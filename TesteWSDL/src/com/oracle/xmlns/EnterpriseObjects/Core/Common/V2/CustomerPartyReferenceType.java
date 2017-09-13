/**
 * CustomerPartyReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class CustomerPartyReferenceType  extends com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType customerPartyAccountIdentification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyReferenceType custom;

    public CustomerPartyReferenceType() {
    }

    public CustomerPartyReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType partyIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType locationReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType customerPartyAccountIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyReferenceType custom) {
        super(
            partyIdentification,
            locationReference);
        this.customerPartyAccountIdentification = customerPartyAccountIdentification;
        this.custom = custom;
    }


    /**
     * Gets the customerPartyAccountIdentification value for this CustomerPartyReferenceType.
     * 
     * @return customerPartyAccountIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType getCustomerPartyAccountIdentification() {
        return customerPartyAccountIdentification;
    }


    /**
     * Sets the customerPartyAccountIdentification value for this CustomerPartyReferenceType.
     * 
     * @param customerPartyAccountIdentification
     */
    public void setCustomerPartyAccountIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType customerPartyAccountIdentification) {
        this.customerPartyAccountIdentification = customerPartyAccountIdentification;
    }


    /**
     * Gets the custom value for this CustomerPartyReferenceType.
     * 
     * @return custom
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyReferenceType getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this CustomerPartyReferenceType.
     * 
     * @param custom
     */
    public void setCustom(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyReferenceType custom) {
        this.custom = custom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomerPartyReferenceType)) return false;
        CustomerPartyReferenceType other = (CustomerPartyReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerPartyAccountIdentification==null && other.getCustomerPartyAccountIdentification()==null) || 
             (this.customerPartyAccountIdentification!=null &&
              this.customerPartyAccountIdentification.equals(other.getCustomerPartyAccountIdentification()))) &&
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
        int _hashCode = super.hashCode();
        if (getCustomerPartyAccountIdentification() != null) {
            _hashCode += getCustomerPartyAccountIdentification().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomerPartyReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPartyAccountIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountIdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyReferenceType"));
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
