/**
 * CustomUpdateInvoiceDataAreaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class CustomUpdateInvoiceDataAreaType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceType customUpdateInvoice;

    public CustomUpdateInvoiceDataAreaType() {
    }

    public CustomUpdateInvoiceDataAreaType(
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceType customUpdateInvoice) {
           this.customUpdateInvoice = customUpdateInvoice;
    }


    /**
     * Gets the customUpdateInvoice value for this CustomUpdateInvoiceDataAreaType.
     * 
     * @return customUpdateInvoice
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceType getCustomUpdateInvoice() {
        return customUpdateInvoice;
    }


    /**
     * Sets the customUpdateInvoice value for this CustomUpdateInvoiceDataAreaType.
     * 
     * @param customUpdateInvoice
     */
    public void setCustomUpdateInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceType customUpdateInvoice) {
        this.customUpdateInvoice = customUpdateInvoice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomUpdateInvoiceDataAreaType)) return false;
        CustomUpdateInvoiceDataAreaType other = (CustomUpdateInvoiceDataAreaType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customUpdateInvoice==null && other.getCustomUpdateInvoice()==null) || 
             (this.customUpdateInvoice!=null &&
              this.customUpdateInvoice.equals(other.getCustomUpdateInvoice())));
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
        if (getCustomUpdateInvoice() != null) {
            _hashCode += getCustomUpdateInvoice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomUpdateInvoiceDataAreaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceDataAreaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customUpdateInvoice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceType"));
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
