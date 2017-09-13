/**
 * NameType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;


/**
 * A character string that consititues the
 * 				distinctive designation of a person, place, thing or concept
 */
public class NameType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;

    private org.apache.axis.types.NormalizedString languageCode;  // attribute

    private org.apache.axis.types.NormalizedString languageLocaleCode;  // attribute

    public NameType() {
    }

    // Simple Types must have a String constructor
    public NameType(java.lang.String _value) {
        this._value = _value;
    }
    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the _value value for this NameType.
     * 
     * @return _value
     */
    public java.lang.String get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this NameType.
     * 
     * @param _value
     */
    public void set_value(java.lang.String _value) {
        this._value = _value;
    }


    /**
     * Gets the languageCode value for this NameType.
     * 
     * @return languageCode
     */
    public org.apache.axis.types.NormalizedString getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this NameType.
     * 
     * @param languageCode
     */
    public void setLanguageCode(org.apache.axis.types.NormalizedString languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the languageLocaleCode value for this NameType.
     * 
     * @return languageLocaleCode
     */
    public org.apache.axis.types.NormalizedString getLanguageLocaleCode() {
        return languageLocaleCode;
    }


    /**
     * Sets the languageLocaleCode value for this NameType.
     * 
     * @param languageLocaleCode
     */
    public void setLanguageLocaleCode(org.apache.axis.types.NormalizedString languageLocaleCode) {
        this.languageLocaleCode = languageLocaleCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NameType)) return false;
        NameType other = (NameType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.languageLocaleCode==null && other.getLanguageLocaleCode()==null) || 
             (this.languageLocaleCode!=null &&
              this.languageLocaleCode.equals(other.getLanguageLocaleCode())));
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
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getLanguageLocaleCode() != null) {
            _hashCode += getLanguageLocaleCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NameType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NameType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "languageCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageLocaleCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "languageLocaleCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
