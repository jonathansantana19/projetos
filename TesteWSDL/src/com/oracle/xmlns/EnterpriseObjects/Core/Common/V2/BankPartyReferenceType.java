/**
 * .java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class BankPartyReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankPartyReferenceType custom;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] organizationPartyReferenceType;  // attribute

    public BankPartyReferenceType () {
    }

    public BankPartyReferenceType (
    		   com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] organizationPartyReferenceType,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankPartyReferenceType custom) {

    	this.organizationPartyReferenceType = organizationPartyReferenceType;
        this.custom = custom;
    }


    /**
     * Gets the custom value for this .
     * 
     * @return custom
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankPartyReferenceType getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this .
     * 
     * @param custom
     */
    public void setCustom(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankPartyReferenceType custom) {
        this.custom = custom;
    }


    /**
     * Gets the organizationPartyReferenceType value for this .
     * 
     * @return organizationPartyReferenceType
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] getOrganizationPartyReferenceType() {
        return organizationPartyReferenceType;
    }


    /**
     * Sets the organizationPartyReferenceType value for this .
     * 
     * @param organizationPartyReferenceType
     */
    public void setOrganizationPartyReferenceType(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] organizationPartyReferenceType) {
        this.organizationPartyReferenceType = organizationPartyReferenceType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankPartyReferenceType)) return false;
        BankPartyReferenceType other = (BankPartyReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
            ((this.organizationPartyReferenceType==null && other.getOrganizationPartyReferenceType()==null) || 
             (this.organizationPartyReferenceType!=null &&
              java.util.Arrays.equals(this.organizationPartyReferenceType, other.getOrganizationPartyReferenceType())));
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
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getOrganizationPartyReferenceType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizationPartyReferenceType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizationPartyReferenceType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankPartyReferenceType.class, true);

    static {
    	
    	
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankPartyReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "Custom"));
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
