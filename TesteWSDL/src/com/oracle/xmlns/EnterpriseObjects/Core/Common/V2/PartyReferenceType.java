/**
 * PartyReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public abstract class PartyReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType partyIdentification;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType locationReference;

    public PartyReferenceType() {
    }

    public PartyReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType partyIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType locationReference) {
           this.partyIdentification = partyIdentification;
           this.locationReference = locationReference;
    }


    /**
     * Gets the partyIdentification value for this PartyReferenceType.
     * 
     * @return partyIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType getPartyIdentification() {
        return partyIdentification;
    }


    /**
     * Sets the partyIdentification value for this PartyReferenceType.
     * 
     * @param partyIdentification
     */
    public void setPartyIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType partyIdentification) {
        this.partyIdentification = partyIdentification;
    }


    /**
     * Gets the locationReference value for this PartyReferenceType.
     * 
     * @return locationReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType getLocationReference() {
        return locationReference;
    }


    /**
     * Sets the locationReference value for this PartyReferenceType.
     * 
     * @param locationReference
     */
    public void setLocationReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType locationReference) {
        this.locationReference = locationReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartyReferenceType)) return false;
        PartyReferenceType other = (PartyReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partyIdentification==null && other.getPartyIdentification()==null) || 
             (this.partyIdentification!=null &&
              this.partyIdentification.equals(other.getPartyIdentification()))) &&
            ((this.locationReference==null && other.getLocationReference()==null) || 
             (this.locationReference!=null &&
              this.locationReference.equals(other.getLocationReference())));
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
        if (getPartyIdentification() != null) {
            _hashCode += getPartyIdentification().hashCode();
        }
        if (getLocationReference() != null) {
            _hashCode += getLocationReference().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PartyReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PartyReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PartyIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PartyIdentificationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LocationReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LocationReferenceType"));
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
