/**
 * AnyDateTimePointBaseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;


/**
 * From UN/CEFACT XML NDR, this is considered a built-in type.
 */
public class AnyDateTimePointBaseType  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.lang.String _value;
    public AnyDateTimePointBaseType() {
    }

    // Simple Types must have a String constructor
    public AnyDateTimePointBaseType(java.lang.String _value) {
        this._value = _value;
    }
    public AnyDateTimePointBaseType(org.apache.axis.types.Year _value) {
        setGYearValue(_value);
    }

    public AnyDateTimePointBaseType(org.apache.axis.types.YearMonth _value) {
        setGYearMonthValue(_value);
    }

    public AnyDateTimePointBaseType(java.util.Date _value) {
        setDateValue(_value);
    }

    public AnyDateTimePointBaseType(java.util.Calendar _value) {
        setDateTimeValue(_value);
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value;
    }


    /**
     * Gets the gYearValue value for this AnyDateTimePointBaseType.
     * 
     * @return gYearValue
     */
    public org.apache.axis.types.Year getGYearValue() {
        return new org.apache.axis.types.Year(_value);
    }


    /**
     * Sets the _value value for this AnyDateTimePointBaseType.
     * 
     * @param _value
     */
    public void setGYearValue(org.apache.axis.types.Year _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the gYearMonthValue value for this AnyDateTimePointBaseType.
     * 
     * @return gYearMonthValue
     */
    public org.apache.axis.types.YearMonth getGYearMonthValue() {
        return new org.apache.axis.types.YearMonth(_value);
    }


    /**
     * Sets the _value value for this AnyDateTimePointBaseType.
     * 
     * @param _value
     */
    public void setGYearMonthValue(org.apache.axis.types.YearMonth _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the dateValue value for this AnyDateTimePointBaseType.
     * 
     * @return dateValue
     */
    public java.util.Date getDateValue() {
        try {
            return (java.text.DateFormat.getDateTimeInstance()).parse(_value);
        }
        catch (java.text.ParseException e){
            throw new java.lang.RuntimeException(e.toString());
        }
    }


    /**
     * Sets the _value value for this AnyDateTimePointBaseType.
     * 
     * @param _value
     */
    public void setDateValue(java.util.Date _value) {
        this._value = _value == null ? null : _value.toString();
    }


    /**
     * Gets the dateTimeValue value for this AnyDateTimePointBaseType.
     * 
     * @return dateTimeValue
     */
    public java.util.Calendar getDateTimeValue() {
        java.util.Calendar cal =
            (java.util.Calendar) new org.apache.axis.encoding.ser.CalendarDeserializer(
                java.lang.String.class, org.apache.axis.Constants.XSD_STRING).makeValue(_value);
        return cal;
    }


    /**
     * Sets the _value value for this AnyDateTimePointBaseType.
     * 
     * @param _value
     */
    public void setDateTimeValue(java.util.Calendar _value) {
        this._value = _value == null ? null : new org.apache.axis.encoding.ser.CalendarSerializer().getValueAsString(_value, null);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AnyDateTimePointBaseType)) return false;
        AnyDateTimePointBaseType other = (AnyDateTimePointBaseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&  this.toString().equals(obj.toString());
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
        if (this._value != null) {
            _hashCode += this._value.hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AnyDateTimePointBaseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AnyDateTimePointBaseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GYearValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gYearValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYear"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GYearMonthValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gYearMonthValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "gYearMonth"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateTimeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
