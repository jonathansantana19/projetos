/**
 * ValueExpressionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class ValueExpressionType  implements java.io.Serializable {
    private java.lang.String elementPath;

    private java.lang.String[] value;

    private java.lang.String queryOperatorCode;  // attribute

    public ValueExpressionType() {
    }
// ORIGINAL
//    public ValueExpressionType(
//           java.lang.String elementPath,
//           java.lang.String[] value,
//           java.lang.String queryOperatorCode) {
//           this.elementPath = elementPath;
//           this.value = value;
//           this.queryOperatorCode = queryOperatorCode;
//    }
    
    
    public ValueExpressionType(
            java.lang.String elementPath,
            java.lang.String[] value) {
            this.elementPath = elementPath;
            this.value = value;
            
     }


    /**
     * Gets the elementPath value for this ValueExpressionType.
     * 
     * @return elementPath
     */
    public java.lang.String getElementPath() {
        return elementPath;
    }


    /**
     * Sets the elementPath value for this ValueExpressionType.
     * 
     * @param elementPath
     */
    public void setElementPath(java.lang.String elementPath) {
        this.elementPath = elementPath;
    }


    /**
     * Gets the value value for this ValueExpressionType.
     * 
     * @return value
     */
    public java.lang.String[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this ValueExpressionType.
     * 
     * @param value
     */
    public void setValue(java.lang.String[] value) {
        this.value = value;
    }

    public java.lang.String getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, java.lang.String _value) {
        this.value[i] = _value;
    }


    /**
     * Gets the queryOperatorCode value for this ValueExpressionType.
     * 
     * @return queryOperatorCode
     */
    public java.lang.String getQueryOperatorCode() {
        return queryOperatorCode;
    }


    /**
     * Sets the queryOperatorCode value for this ValueExpressionType.
     * 
     * @param queryOperatorCode
     */
    public void setQueryOperatorCode(java.lang.String queryOperatorCode) {
        this.queryOperatorCode = queryOperatorCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValueExpressionType)) return false;
        ValueExpressionType other = (ValueExpressionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.elementPath==null && other.getElementPath()==null) || 
             (this.elementPath!=null &&
              this.elementPath.equals(other.getElementPath()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue()))) &&
            ((this.queryOperatorCode==null && other.getQueryOperatorCode()==null) || 
             (this.queryOperatorCode!=null &&
              this.queryOperatorCode.equals(other.getQueryOperatorCode())));
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
        if (getElementPath() != null) {
            _hashCode += getElementPath().hashCode();
        }
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQueryOperatorCode() != null) {
            _hashCode += getQueryOperatorCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValueExpressionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ValueExpressionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("queryOperatorCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "queryOperatorCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryOperatorCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elementPath");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ElementPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "StringType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
