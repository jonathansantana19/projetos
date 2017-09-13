/**
 * QueryExpressionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class QueryExpressionType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType[] valueExpression;

    private java.lang.String logicalOperatorCode;  // attribute

    private java.lang.Boolean logicalNegationIndicator;  // attribute

    public QueryExpressionType() {
    }

    public QueryExpressionType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType[] valueExpression,
           java.lang.String logicalOperatorCode,
           java.lang.Boolean logicalNegationIndicator) {
           this.valueExpression = valueExpression;
           this.logicalOperatorCode = logicalOperatorCode;
           this.logicalNegationIndicator = logicalNegationIndicator;
    }


    /**
     * Gets the valueExpression value for this QueryExpressionType.
     * 
     * @return valueExpression
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType[] getValueExpression() {
        return valueExpression;
    }


    /**
     * Sets the valueExpression value for this QueryExpressionType.
     * 
     * @param valueExpression
     */
    public void setValueExpression(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType[] valueExpression) {
        this.valueExpression = valueExpression;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType getValueExpression(int i) {
        return this.valueExpression[i];
    }

    public void setValueExpression(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType _value) {
        this.valueExpression[i] = _value;
    }


    /**
     * Gets the logicalOperatorCode value for this QueryExpressionType.
     * 
     * @return logicalOperatorCode
     */
    public java.lang.String getLogicalOperatorCode() {
        return logicalOperatorCode;
    }


    /**
     * Sets the logicalOperatorCode value for this QueryExpressionType.
     * 
     * @param logicalOperatorCode
     */
    public void setLogicalOperatorCode(java.lang.String logicalOperatorCode) {
        this.logicalOperatorCode = logicalOperatorCode;
    }


    /**
     * Gets the logicalNegationIndicator value for this QueryExpressionType.
     * 
     * @return logicalNegationIndicator
     */
    public java.lang.Boolean getLogicalNegationIndicator() {
        return logicalNegationIndicator;
    }


    /**
     * Sets the logicalNegationIndicator value for this QueryExpressionType.
     * 
     * @param logicalNegationIndicator
     */
    public void setLogicalNegationIndicator(java.lang.Boolean logicalNegationIndicator) {
        this.logicalNegationIndicator = logicalNegationIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryExpressionType)) return false;
        QueryExpressionType other = (QueryExpressionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valueExpression==null && other.getValueExpression()==null) || 
             (this.valueExpression!=null &&
              java.util.Arrays.equals(this.valueExpression, other.getValueExpression()))) &&
            ((this.logicalOperatorCode==null && other.getLogicalOperatorCode()==null) || 
             (this.logicalOperatorCode!=null &&
              this.logicalOperatorCode.equals(other.getLogicalOperatorCode()))) &&
            ((this.logicalNegationIndicator==null && other.getLogicalNegationIndicator()==null) || 
             (this.logicalNegationIndicator!=null &&
              this.logicalNegationIndicator.equals(other.getLogicalNegationIndicator())));
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
        if (getValueExpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValueExpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValueExpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogicalOperatorCode() != null) {
            _hashCode += getLogicalOperatorCode().hashCode();
        }
        if (getLogicalNegationIndicator() != null) {
            _hashCode += getLogicalNegationIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryExpressionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryExpressionType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("logicalOperatorCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "logicalOperatorCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LogicalOperatorCodeType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("logicalNegationIndicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "logicalNegationIndicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IndicatorType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueExpression");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ValueExpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ValueExpression"));
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
