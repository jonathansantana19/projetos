/**
 * RelationshipTypeValues.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.xmlsoap.schemas.ws._2003._03.addressing;

public class RelationshipTypeValues implements java.io.Serializable {
    private javax.xml.namespace.QName _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RelationshipTypeValues(javax.xml.namespace.QName value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final javax.xml.namespace.QName _value1 = javax.xml.namespace.QName.valueOf("{http://schemas.xmlsoap.org/ws/2003/03/addressing}Response");
    public static final RelationshipTypeValues value1 = new RelationshipTypeValues(_value1);
    public javax.xml.namespace.QName getValue() { return _value_;}
    public static RelationshipTypeValues fromValue(javax.xml.namespace.QName value)
          throws java.lang.IllegalArgumentException {
        RelationshipTypeValues enumeration = (RelationshipTypeValues)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RelationshipTypeValues fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        try {
            return fromValue(javax.xml.namespace.QName.valueOf(value));
        } catch (Exception e) {
            throw new java.lang.IllegalArgumentException();
        }
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_.toString();}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RelationshipTypeValues.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "RelationshipTypeValues"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
