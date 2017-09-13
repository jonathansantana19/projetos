/**
 * EnumLogCriticallyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.sky.www.ArchitectureSchemas;

public class EnumLogCriticallyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EnumLogCriticallyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Debug = "Debug";
    public static final java.lang.String _Info = "Info";
    public static final java.lang.String _Warning = "Warning";
    public static final java.lang.String _Error = "Error";
    public static final java.lang.String _Fatal = "Fatal";
    public static final java.lang.String _Audit = "Audit";
    public static final EnumLogCriticallyType Debug = new EnumLogCriticallyType(_Debug);
    public static final EnumLogCriticallyType Info = new EnumLogCriticallyType(_Info);
    public static final EnumLogCriticallyType Warning = new EnumLogCriticallyType(_Warning);
    public static final EnumLogCriticallyType Error = new EnumLogCriticallyType(_Error);
    public static final EnumLogCriticallyType Fatal = new EnumLogCriticallyType(_Fatal);
    public static final EnumLogCriticallyType Audit = new EnumLogCriticallyType(_Audit);
    public java.lang.String getValue() { return _value_;}
    public static EnumLogCriticallyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EnumLogCriticallyType enumeration = (EnumLogCriticallyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EnumLogCriticallyType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
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
        new org.apache.axis.description.TypeDesc(EnumLogCriticallyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "EnumLogCriticallyType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
