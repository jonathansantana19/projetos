/**
 * CustomEBMHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2;

public class CustomEBMHeaderType  implements java.io.Serializable {
    private br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType interoperabilityHeader;

    private br.com.sky.www.ArchitectureSchemas.RespondeHeaderType responseHeader;

    public CustomEBMHeaderType() {
    }

    public CustomEBMHeaderType(
           br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType interoperabilityHeader,
           br.com.sky.www.ArchitectureSchemas.RespondeHeaderType responseHeader) {
           this.interoperabilityHeader = interoperabilityHeader;
           this.responseHeader = responseHeader;
    }


    /**
     * Gets the interoperabilityHeader value for this CustomEBMHeaderType.
     * 
     * @return interoperabilityHeader
     */
    public br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType getInteroperabilityHeader() {
        return interoperabilityHeader;
    }


    /**
     * Sets the interoperabilityHeader value for this CustomEBMHeaderType.
     * 
     * @param interoperabilityHeader
     */
    public void setInteroperabilityHeader(br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType interoperabilityHeader) {
        this.interoperabilityHeader = interoperabilityHeader;
    }


    /**
     * Gets the responseHeader value for this CustomEBMHeaderType.
     * 
     * @return responseHeader
     */
    public br.com.sky.www.ArchitectureSchemas.RespondeHeaderType getResponseHeader() {
        return responseHeader;
    }


    /**
     * Sets the responseHeader value for this CustomEBMHeaderType.
     * 
     * @param responseHeader
     */
    public void setResponseHeader(br.com.sky.www.ArchitectureSchemas.RespondeHeaderType responseHeader) {
        this.responseHeader = responseHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomEBMHeaderType)) return false;
        CustomEBMHeaderType other = (CustomEBMHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.interoperabilityHeader==null && other.getInteroperabilityHeader()==null) || 
             (this.interoperabilityHeader!=null &&
              this.interoperabilityHeader.equals(other.getInteroperabilityHeader()))) &&
            ((this.responseHeader==null && other.getResponseHeader()==null) || 
             (this.responseHeader!=null &&
              this.responseHeader.equals(other.getResponseHeader())));
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
        if (getInteroperabilityHeader() != null) {
            _hashCode += getInteroperabilityHeader().hashCode();
        }
        if (getResponseHeader() != null) {
            _hashCode += getResponseHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomEBMHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomEBMHeaderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interoperabilityHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "InteroperabilityHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "InteroperabilityHeaderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "ResponseHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "RespondeHeaderType"));
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
