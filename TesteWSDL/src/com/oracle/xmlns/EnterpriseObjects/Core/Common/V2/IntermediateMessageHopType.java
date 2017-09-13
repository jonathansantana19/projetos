/**
 * IntermediateMessageHopType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;


/**
 * This component allows for capturing of messaging properties in
 * a multi-hopping messaging. The information can be used to support,
 * for example, guaranteed delivery and auto recovery/resubmit of faulted
 * messages. Note that the component does not capture the information
 * of the first hop, the originator, because other fields in the EBMHeader
 * already captures those such as the Sender and EBMID element.
 */
public class IntermediateMessageHopType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType senderResourceTypeCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType senderResourceID;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType senderMessageID;

    public IntermediateMessageHopType() {
    }

    public IntermediateMessageHopType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType senderResourceTypeCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType senderResourceID,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType senderMessageID) {
           this.senderResourceTypeCode = senderResourceTypeCode;
           this.senderResourceID = senderResourceID;
           this.senderMessageID = senderMessageID;
    }


    /**
     * Gets the senderResourceTypeCode value for this IntermediateMessageHopType.
     * 
     * @return senderResourceTypeCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getSenderResourceTypeCode() {
        return senderResourceTypeCode;
    }


    /**
     * Sets the senderResourceTypeCode value for this IntermediateMessageHopType.
     * 
     * @param senderResourceTypeCode
     */
    public void setSenderResourceTypeCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType senderResourceTypeCode) {
        this.senderResourceTypeCode = senderResourceTypeCode;
    }


    /**
     * Gets the senderResourceID value for this IntermediateMessageHopType.
     * 
     * @return senderResourceID
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType getSenderResourceID() {
        return senderResourceID;
    }


    /**
     * Sets the senderResourceID value for this IntermediateMessageHopType.
     * 
     * @param senderResourceID
     */
    public void setSenderResourceID(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType senderResourceID) {
        this.senderResourceID = senderResourceID;
    }


    /**
     * Gets the senderMessageID value for this IntermediateMessageHopType.
     * 
     * @return senderMessageID
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType getSenderMessageID() {
        return senderMessageID;
    }


    /**
     * Sets the senderMessageID value for this IntermediateMessageHopType.
     * 
     * @param senderMessageID
     */
    public void setSenderMessageID(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType senderMessageID) {
        this.senderMessageID = senderMessageID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IntermediateMessageHopType)) return false;
        IntermediateMessageHopType other = (IntermediateMessageHopType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.senderResourceTypeCode==null && other.getSenderResourceTypeCode()==null) || 
             (this.senderResourceTypeCode!=null &&
              this.senderResourceTypeCode.equals(other.getSenderResourceTypeCode()))) &&
            ((this.senderResourceID==null && other.getSenderResourceID()==null) || 
             (this.senderResourceID!=null &&
              this.senderResourceID.equals(other.getSenderResourceID()))) &&
            ((this.senderMessageID==null && other.getSenderMessageID()==null) || 
             (this.senderMessageID!=null &&
              this.senderMessageID.equals(other.getSenderMessageID())));
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
        if (getSenderResourceTypeCode() != null) {
            _hashCode += getSenderResourceTypeCode().hashCode();
        }
        if (getSenderResourceID() != null) {
            _hashCode += getSenderResourceID().hashCode();
        }
        if (getSenderMessageID() != null) {
            _hashCode += getSenderMessageID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IntermediateMessageHopType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IntermediateMessageHopType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderResourceTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderResourceTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderResourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderResourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderMessageID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderMessageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentifierType"));
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
