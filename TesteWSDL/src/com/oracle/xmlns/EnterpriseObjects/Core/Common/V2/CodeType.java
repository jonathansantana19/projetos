/**
 * CodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;


/**
 * A character string (letters, figures, or symbols)
 * 				that for brevity and/or languange independence may be used to
 * 				represent or replace a definitive value or text of an attribute
 * 				together with relevant supplementary information
 */
public class CodeType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private org.apache.axis.types.NormalizedString _value;

    private org.apache.axis.types.NormalizedString listID;  // attribute

    private org.apache.axis.types.NormalizedString listAgencyID;  // attribute

    private org.apache.axis.types.NormalizedString listVersionID;  // attribute

    public CodeType() {
    }

    // Simple Types must have a String constructor
    public CodeType(org.apache.axis.types.NormalizedString _value) {
        this._value = _value;
    }
    public CodeType(java.lang.String _value) {
        this._value = new org.apache.axis.types.NormalizedString(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : _value.toString();
    }


    /**
     * Gets the _value value for this CodeType.
     * 
     * @return _value
     */
    public org.apache.axis.types.NormalizedString get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this CodeType.
     * 
     * @param _value
     */
    public void set_value(org.apache.axis.types.NormalizedString _value) {
        this._value = _value;
    }


    /**
     * Gets the listID value for this CodeType.
     * 
     * @return listID
     */
    public org.apache.axis.types.NormalizedString getListID() {
        return listID;
    }


    /**
     * Sets the listID value for this CodeType.
     * 
     * @param listID
     */
    public void setListID(org.apache.axis.types.NormalizedString listID) {
        this.listID = listID;
    }


    /**
     * Gets the listAgencyID value for this CodeType.
     * 
     * @return listAgencyID
     */
    public org.apache.axis.types.NormalizedString getListAgencyID() {
        return listAgencyID;
    }


    /**
     * Sets the listAgencyID value for this CodeType.
     * 
     * @param listAgencyID
     */
    public void setListAgencyID(org.apache.axis.types.NormalizedString listAgencyID) {
        this.listAgencyID = listAgencyID;
    }


    /**
     * Gets the listVersionID value for this CodeType.
     * 
     * @return listVersionID
     */
    public org.apache.axis.types.NormalizedString getListVersionID() {
        return listVersionID;
    }


    /**
     * Sets the listVersionID value for this CodeType.
     * 
     * @param listVersionID
     */
    public void setListVersionID(org.apache.axis.types.NormalizedString listVersionID) {
        this.listVersionID = listVersionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CodeType)) return false;
        CodeType other = (CodeType) obj;
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
            ((this.listID==null && other.getListID()==null) || 
             (this.listID!=null &&
              this.listID.equals(other.getListID()))) &&
            ((this.listAgencyID==null && other.getListAgencyID()==null) || 
             (this.listAgencyID!=null &&
              this.listAgencyID.equals(other.getListAgencyID()))) &&
            ((this.listVersionID==null && other.getListVersionID()==null) || 
             (this.listVersionID!=null &&
              this.listVersionID.equals(other.getListVersionID())));
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
        if (getListID() != null) {
            _hashCode += getListID().hashCode();
        }
        if (getListAgencyID() != null) {
            _hashCode += getListAgencyID().hashCode();
        }
        if (getListVersionID() != null) {
            _hashCode += getListVersionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CodeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "listID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listAgencyID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "listAgencyID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "normalizedString"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("listVersionID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "listVersionID"));
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
