/**
 * EBMType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class EBMType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType EBMHeader;

    private java.lang.String versionID;  // attribute

    private java.lang.String languageCode;  // attribute

    public EBMType() {
    }

    public EBMType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType EBMHeader,
           java.lang.String versionID,
           java.lang.String languageCode) {
           this.EBMHeader = EBMHeader;
           this.versionID = versionID;
           this.languageCode = languageCode;
    }


    /**
     * Gets the EBMHeader value for this EBMType.
     * 
     * @return EBMHeader
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType getEBMHeader() {
        return EBMHeader;
    }


    /**
     * Sets the EBMHeader value for this EBMType.
     * 
     * @param EBMHeader
     */
    public void setEBMHeader(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType EBMHeader) {
        this.EBMHeader = EBMHeader;
    }


    /**
     * Gets the versionID value for this EBMType.
     * 
     * @return versionID
     */
    public java.lang.String getVersionID() {
        return versionID;
    }


    /**
     * Sets the versionID value for this EBMType.
     * 
     * @param versionID
     */
    public void setVersionID(java.lang.String versionID) {
        this.versionID = versionID;
    }


    /**
     * Gets the languageCode value for this EBMType.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this EBMType.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EBMType)) return false;
        EBMType other = (EBMType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EBMHeader==null && other.getEBMHeader()==null) || 
             (this.EBMHeader!=null &&
              this.EBMHeader.equals(other.getEBMHeader()))) &&
            ((this.versionID==null && other.getVersionID()==null) || 
             (this.versionID!=null &&
              this.versionID.equals(other.getVersionID()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode())));
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
        if (getEBMHeader() != null) {
            _hashCode += getEBMHeader().hashCode();
        }
        if (getVersionID() != null) {
            _hashCode += getVersionID().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EBMType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("versionID");
        attrField.setXmlName(new javax.xml.namespace.QName("", "versionID"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "StringType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "languageCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LanguageCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBMHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMHeaderType"));
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
