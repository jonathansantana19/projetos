/**
 * EBMTrackingType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class EBMTrackingType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IntermediateMessageHopType intermediateMessageHop;

    public EBMTrackingType() {
    }

    public EBMTrackingType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IntermediateMessageHopType intermediateMessageHop) {
           this.intermediateMessageHop = intermediateMessageHop;
    }


    /**
     * Gets the intermediateMessageHop value for this EBMTrackingType.
     * 
     * @return intermediateMessageHop
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IntermediateMessageHopType getIntermediateMessageHop() {
        return intermediateMessageHop;
    }


    /**
     * Sets the intermediateMessageHop value for this EBMTrackingType.
     * 
     * @param intermediateMessageHop
     */
    public void setIntermediateMessageHop(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IntermediateMessageHopType intermediateMessageHop) {
        this.intermediateMessageHop = intermediateMessageHop;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EBMTrackingType)) return false;
        EBMTrackingType other = (EBMTrackingType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intermediateMessageHop==null && other.getIntermediateMessageHop()==null) || 
             (this.intermediateMessageHop!=null &&
              this.intermediateMessageHop.equals(other.getIntermediateMessageHop())));
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
        if (getIntermediateMessageHop() != null) {
            _hashCode += getIntermediateMessageHop().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EBMTrackingType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMTrackingType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intermediateMessageHop");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IntermediateMessageHop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IntermediateMessageHopType"));
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
