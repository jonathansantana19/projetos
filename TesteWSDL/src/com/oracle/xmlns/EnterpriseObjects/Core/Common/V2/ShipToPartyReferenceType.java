/**
 * ShipToPartyReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class ShipToPartyReferenceType  extends com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountContactIdentificationType customerPartyAccountContactIdentification;

    public ShipToPartyReferenceType() {
    }

    public ShipToPartyReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType partyIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType locationReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountContactIdentificationType customerPartyAccountContactIdentification) {
        super(
            partyIdentification,
            locationReference);
        this.customerPartyAccountContactIdentification = customerPartyAccountContactIdentification;
    }


    /**
     * Gets the customerPartyAccountContactIdentification value for this ShipToPartyReferenceType.
     * 
     * @return customerPartyAccountContactIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountContactIdentificationType getCustomerPartyAccountContactIdentification() {
        return customerPartyAccountContactIdentification;
    }


    /**
     * Sets the customerPartyAccountContactIdentification value for this ShipToPartyReferenceType.
     * 
     * @param customerPartyAccountContactIdentification
     */
    public void setCustomerPartyAccountContactIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountContactIdentificationType customerPartyAccountContactIdentification) {
        this.customerPartyAccountContactIdentification = customerPartyAccountContactIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipToPartyReferenceType)) return false;
        ShipToPartyReferenceType other = (ShipToPartyReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customerPartyAccountContactIdentification==null && other.getCustomerPartyAccountContactIdentification()==null) || 
             (this.customerPartyAccountContactIdentification!=null &&
              this.customerPartyAccountContactIdentification.equals(other.getCustomerPartyAccountContactIdentification())));
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
        if (getCustomerPartyAccountContactIdentification() != null) {
            _hashCode += getCustomerPartyAccountContactIdentification().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipToPartyReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ShipToPartyReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPartyAccountContactIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountContactIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountContactIdentificationType"));
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
