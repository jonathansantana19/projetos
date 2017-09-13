/**
 * BinaryObjectType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;


/**
 * A set of finite-length sequences of binary octets
 */
public class BinaryObjectType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private byte[] _value;

    private org.apache.axis.types.NormalizedString mimeCode;  // attribute

    private org.apache.axis.types.NormalizedString characterSetCode;  // attribute

    private org.apache.axis.types.NormalizedString fileName;  // attribute

    public BinaryObjectType() {
    }

    // Simple Types must have a String constructor
    public BinaryObjectType(byte[] _value) {
        this._value = _value;
    }
    public BinaryObjectType(java.lang.String _value) {
        this._value = org.apache.axis.encoding.Base64.decode(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : org.apache.axis.encoding.Base64.encode(_value);
    }


    /**
     * Gets the _value value for this BinaryObjectType.
     * 
     * @return _value
     */
    public byte[] get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this BinaryObjectType.
     * 
     * @param _value
     */
    public void set_value(byte[] _value) {
        this._value = _value;
    }


    /**
     * Gets the mimeCode value for this BinaryObjectType.
     * 
     * @return mimeCode
     */
    public org.apache.axis.types.NormalizedString getMimeCode() {
        return mimeCode;
    }


    /**
     * Sets the mimeCode value for this BinaryObjectType.
     * 
     * @param mimeCode
     */
    public void setMimeCode(org.apache.axis.types.NormalizedString mimeCode) {
        this.mimeCode = mimeCode;
    }


    /**
     * Gets the characterSetCode value for this BinaryObjectType.
     * 
     * @return characterSetCode
     */
    public org.apache.axis.types.NormalizedString getCharacterSetCode() {
        return characterSetCode;
    }


    /**
     * Sets the characterSetCode value for this BinaryObjectType.
     * 
     * @param characterSetCode
     */
    public void setCharacterSetCode(org.apache.axis.types.NormalizedString characterSetCode) {
        this.characterSetCode = characterSetCode;
    }


    /**
     * Gets the fileName value for this BinaryObjectType.
     * 
     * @return fileName
     */
    public org.apache.axis.types.NormalizedString getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this BinaryObjectType.
     * 
     * @param fileName
     */
    public void setFileName(org.apache.axis.types.NormalizedString fileName) {
        this.fileName = fileName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BinaryObjectType)) return false;
        BinaryObjectType other = (BinaryObjectType) obj;
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
              java.util.Arrays.equals(this._value, other.get_value()))) &&
            ((this.mimeCode==null && other.getMimeCode()==null) || 
             (this.mimeCode!=null &&
              this.mimeCode.equals(other.getMimeCode()))) &&
            ((this.characterSetCode==null && other.getCharacterSetCode()==null) || 
             (this.characterSetCode!=null &&
              this.characterSetCode.equals(other.getCharacterSetCode()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_value());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_value(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMimeCode() != null) {
            _hashCode += getMimeCode().hashCode();
        }
        if (getCharacterSetCode() != null) {
            _hashCode += getCharacterSetCode().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BinaryObjectType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BinaryObjectType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("mimeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "mimeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("characterSetCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "characterSetCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("fileName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
