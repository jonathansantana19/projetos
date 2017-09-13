/**
 * IdentifierType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;


/**
 * A character string to identify and distinguish
 * 				uniquely, one instance of an object in an identification scheme
 * from
 * 				all other objects in the same scheme together with relevant
 * 				supplementary information
 */
public class IdentifierType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.apache.axis.types.NormalizedString _value;

    private org.apache.axis.types.NormalizedString schemeID;  // attribute

    private org.apache.axis.types.NormalizedString schemeAgencyID;  // attribute

    private org.apache.axis.types.NormalizedString schemeVersionID;  // attribute

    public IdentifierType() {
    }

    // Simple Types must have a String constructor
    public IdentifierType(org.apache.axis.types.NormalizedString _value) {
        this._value = _value;
    }
    public IdentifierType(java.lang.String _value) {
        this._value = new org.apache.axis.types.NormalizedString(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : _value.toString();
    }


    /**
     * Gets the _value value for this IdentifierType.
     * 
     * @return _value
     */
    public org.apache.axis.types.NormalizedString get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this IdentifierType.
     * 
     * @param _value
     */
    public void set_value(org.apache.axis.types.NormalizedString _value) {
        this._value = _value;
    }


    /**
     * Gets the schemeID value for this IdentifierType.
     * 
     * @return schemeID
     */
    public org.apache.axis.types.NormalizedString getSchemeID() {
        return schemeID;
    }


    /**
     * Sets the schemeID value for this IdentifierType.
     * 
     * @param schemeID
     */
    public void setSchemeID(org.apache.axis.types.NormalizedString schemeID) {
        this.schemeID = schemeID;
    }


    /**
     * Gets the schemeAgencyID value for this IdentifierType.
     * 
     * @return schemeAgencyID
     */
    public org.apache.axis.types.NormalizedString getSchemeAgencyID() {
        return schemeAgencyID;
    }


    /**
     * Sets the schemeAgencyID value for this IdentifierType.
     * 
     * @param schemeAgencyID
     */
    public void setSchemeAgencyID(org.apache.axis.types.NormalizedString schemeAgencyID) {
        this.schemeAgencyID = schemeAgencyID;
    }


    /**
     * Gets the schemeVersionID value for this IdentifierType.
     * 
     * @return schemeVersionID
     */
    public org.apache.axis.types.NormalizedString getSchemeVersionID() {
        return schemeVersionID;
    }


    /**
     * Sets the schemeVersionID value for this IdentifierType.
     * 
     * @param schemeVersionID
     */
    public void setSchemeVersionID(org.apache.axis.types.NormalizedString schemeVersionID) {
        this.schemeVersionID = schemeVersionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IdentifierType)) return false;
        IdentifierType other = (IdentifierType) obj;
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
            ((this.schemeID==null && other.getSchemeID()==null) || 
             (this.schemeID!=null &&
              this.schemeID.equals(other.getSchemeID()))) &&
            ((this.schemeAgencyID==null && other.getSchemeAgencyID()==null) || 
             (this.schemeAgencyID!=null &&
              this.schemeAgencyID.equals(other.getSchemeAgencyID()))) &&
            ((this.schemeVersionID==null && other.getSchemeVersionID()==null) || 
             (this.schemeVersionID!=null &&
              this.schemeVersionID.equals(other.getSchemeVersionID())));
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
        if (getSchemeID() != null) {
            _hashCode += getSchemeID().hashCode();
        }
        if (getSchemeAgencyID() != null) {
            _hashCode += getSchemeAgencyID().hashCode();
        }
        if (getSchemeVersionID() != null) {
            _hashCode += getSchemeVersionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentifierType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentifierType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemeID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemeID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemeAgencyID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemeAgencyID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("schemeVersionID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "schemeVersionID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
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
