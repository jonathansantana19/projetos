/**
 * MessageProcessingInstructionType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class MessageProcessingInstructionType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType environmentCode;

    public MessageProcessingInstructionType() {
    }

    public MessageProcessingInstructionType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType environmentCode) {
           this.environmentCode = environmentCode;
    }


    /**
     * Gets the environmentCode value for this MessageProcessingInstructionType.
     * 
     * @return environmentCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getEnvironmentCode() {
        return environmentCode;
    }


    /**
     * Sets the environmentCode value for this MessageProcessingInstructionType.
     * 
     * @param environmentCode
     */
    public void setEnvironmentCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType environmentCode) {
        this.environmentCode = environmentCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageProcessingInstructionType)) return false;
        MessageProcessingInstructionType other = (MessageProcessingInstructionType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.environmentCode==null && other.getEnvironmentCode()==null) || 
             (this.environmentCode!=null &&
              this.environmentCode.equals(other.getEnvironmentCode())));
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
        if (getEnvironmentCode() != null) {
            _hashCode += getEnvironmentCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageProcessingInstructionType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MessageProcessingInstructionType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environmentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EnvironmentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
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
