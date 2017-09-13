/**
 * InvoiceCustomerPartyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class InvoiceCustomerPartyType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType customerPartyReference;

    private java.lang.String actionCode;  // attribute

    public InvoiceCustomerPartyType() {
    }

    public InvoiceCustomerPartyType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType customerPartyReference,
           java.lang.String actionCode) {
           this.customerPartyReference = customerPartyReference;
           this.actionCode = actionCode;
    }


    /**
     * Gets the customerPartyReference value for this InvoiceCustomerPartyType.
     * 
     * @return customerPartyReference
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType getCustomerPartyReference() {
        return customerPartyReference;
    }


    /**
     * Sets the customerPartyReference value for this InvoiceCustomerPartyType.
     * 
     * @param customerPartyReference
     */
    public void setCustomerPartyReference(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType customerPartyReference) {
        this.customerPartyReference = customerPartyReference;
    }


    /**
     * Gets the actionCode value for this InvoiceCustomerPartyType.
     * 
     * @return actionCode
     */
    public java.lang.String getActionCode() {
        return actionCode;
    }


    /**
     * Sets the actionCode value for this InvoiceCustomerPartyType.
     * 
     * @param actionCode
     */
    public void setActionCode(java.lang.String actionCode) {
        this.actionCode = actionCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InvoiceCustomerPartyType)) return false;
        InvoiceCustomerPartyType other = (InvoiceCustomerPartyType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customerPartyReference==null && other.getCustomerPartyReference()==null) || 
             (this.customerPartyReference!=null &&
              this.customerPartyReference.equals(other.getCustomerPartyReference()))) &&
            ((this.actionCode==null && other.getActionCode()==null) || 
             (this.actionCode!=null &&
              this.actionCode.equals(other.getActionCode())));
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
        if (getCustomerPartyReference() != null) {
            _hashCode += getCustomerPartyReference().hashCode();
        }
        if (getActionCode() != null) {
            _hashCode += getActionCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InvoiceCustomerPartyType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceCustomerPartyType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("actionCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "actionCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ActionCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerPartyReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyReferenceType"));
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
