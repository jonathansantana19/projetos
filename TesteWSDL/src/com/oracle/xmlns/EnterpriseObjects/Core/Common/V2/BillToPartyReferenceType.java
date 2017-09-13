/**
 * BillToPartyReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class BillToPartyReferenceType  extends com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyReferenceType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType customerPartyAccountIdentification;

    public BillToPartyReferenceType() {
    }

    public BillToPartyReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType partyIdentification,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType locationReference,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType customerPartyAccountIdentification) {
        super(
            partyIdentification,
            locationReference);
        this.customerPartyAccountIdentification = customerPartyAccountIdentification;
    }


    /**
     * Gets the customerPartyAccountIdentification value for this BillToPartyReferenceType.
     * 
     * @return customerPartyAccountIdentification
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType getCustomerPartyAccountIdentification() {
        return customerPartyAccountIdentification;
    }


    /**
     * Sets the customerPartyAccountIdentification value for this BillToPartyReferenceType.
     * 
     * @param customerPartyAccountIdentification
     */
    public void setCustomerPartyAccountIdentification(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType customerPartyAccountIdentification) {
        this.customerPartyAccountIdentification = customerPartyAccountIdentification;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillToPartyReferenceType)) return false;
        BillToPartyReferenceType other = (BillToPartyReferenceType) obj;
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
              this.customerPartyAccountIdentification.equals(other.getCustomerPartyAccountIdentification())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillToPartyReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BillToPartyReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPartyAccountIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountIdentificationType"));
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
