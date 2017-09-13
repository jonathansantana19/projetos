/**
 * EBMHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Common.V2;

public class EBMHeaderType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType EBMID;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] EBMName;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] EBOName;

    private java.util.Calendar creationDateTime;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType verbCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.MessageProcessingInstructionType messageProcessingInstruction;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.SenderType sender;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TargetType target;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType[] EBMTracking;

    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.RequestType request;

    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType custom;

    private java.lang.String languageCode;  // attribute

    public EBMHeaderType() {
    }

    public EBMHeaderType(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType EBMID,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] EBMName,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] EBOName,
           java.util.Calendar creationDateTime,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType verbCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.MessageProcessingInstructionType messageProcessingInstruction,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.SenderType sender,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TargetType target,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType[] EBMTracking,
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.RequestType request,
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType custom,
           java.lang.String languageCode) {
           this.EBMID = EBMID;
           this.EBMName = EBMName;
           this.EBOName = EBOName;
           this.creationDateTime = creationDateTime;
           this.verbCode = verbCode;
           this.messageProcessingInstruction = messageProcessingInstruction;
           this.sender = sender;
           this.target = target;
           this.EBMTracking = EBMTracking;
           this.request = request;
           this.custom = custom;
           this.languageCode = languageCode;
    }


    /**
     * Gets the EBMID value for this EBMHeaderType.
     * 
     * @return EBMID
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType getEBMID() {
        return EBMID;
    }


    /**
     * Sets the EBMID value for this EBMHeaderType.
     * 
     * @param EBMID
     */
    public void setEBMID(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType EBMID) {
        this.EBMID = EBMID;
    }


    /**
     * Gets the EBMName value for this EBMHeaderType.
     * 
     * @return EBMName
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] getEBMName() {
        return EBMName;
    }


    /**
     * Sets the EBMName value for this EBMHeaderType.
     * 
     * @param EBMName
     */
    public void setEBMName(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] EBMName) {
        this.EBMName = EBMName;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType getEBMName(int i) {
        return this.EBMName[i];
    }

    public void setEBMName(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType _value) {
        this.EBMName[i] = _value;
    }


    /**
     * Gets the EBOName value for this EBMHeaderType.
     * 
     * @return EBOName
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] getEBOName() {
        return EBOName;
    }


    /**
     * Sets the EBOName value for this EBMHeaderType.
     * 
     * @param EBOName
     */
    public void setEBOName(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[] EBOName) {
        this.EBOName = EBOName;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType getEBOName(int i) {
        return this.EBOName[i];
    }

    public void setEBOName(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType _value) {
        this.EBOName[i] = _value;
    }


    /**
     * Gets the creationDateTime value for this EBMHeaderType.
     * 
     * @return creationDateTime
     */
    public java.util.Calendar getCreationDateTime() {
        return creationDateTime;
    }


    /**
     * Sets the creationDateTime value for this EBMHeaderType.
     * 
     * @param creationDateTime
     */
    public void setCreationDateTime(java.util.Calendar creationDateTime) {
        this.creationDateTime = creationDateTime;
    }


    /**
     * Gets the verbCode value for this EBMHeaderType.
     * 
     * @return verbCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType getVerbCode() {
        return verbCode;
    }


    /**
     * Sets the verbCode value for this EBMHeaderType.
     * 
     * @param verbCode
     */
    public void setVerbCode(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType verbCode) {
        this.verbCode = verbCode;
    }


    /**
     * Gets the messageProcessingInstruction value for this EBMHeaderType.
     * 
     * @return messageProcessingInstruction
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.MessageProcessingInstructionType getMessageProcessingInstruction() {
        return messageProcessingInstruction;
    }


    /**
     * Sets the messageProcessingInstruction value for this EBMHeaderType.
     * 
     * @param messageProcessingInstruction
     */
    public void setMessageProcessingInstruction(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.MessageProcessingInstructionType messageProcessingInstruction) {
        this.messageProcessingInstruction = messageProcessingInstruction;
    }


    /**
     * Gets the sender value for this EBMHeaderType.
     * 
     * @return sender
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.SenderType getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this EBMHeaderType.
     * 
     * @param sender
     */
    public void setSender(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.SenderType sender) {
        this.sender = sender;
    }


    /**
     * Gets the target value for this EBMHeaderType.
     * 
     * @return target
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TargetType getTarget() {
        return target;
    }


    /**
     * Sets the target value for this EBMHeaderType.
     * 
     * @param target
     */
    public void setTarget(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TargetType target) {
        this.target = target;
    }


    /**
     * Gets the EBMTracking value for this EBMHeaderType.
     * 
     * @return EBMTracking
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType[] getEBMTracking() {
        return EBMTracking;
    }


    /**
     * Sets the EBMTracking value for this EBMHeaderType.
     * 
     * @param EBMTracking
     */
    public void setEBMTracking(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType[] EBMTracking) {
        this.EBMTracking = EBMTracking;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType getEBMTracking(int i) {
        return this.EBMTracking[i];
    }

    public void setEBMTracking(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType _value) {
        this.EBMTracking[i] = _value;
    }


    /**
     * Gets the request value for this EBMHeaderType.
     * 
     * @return request
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.RequestType getRequest() {
        return request;
    }


    /**
     * Sets the request value for this EBMHeaderType.
     * 
     * @param request
     */
    public void setRequest(_04.cd.schema.context._0._2.xacml.tc.names.oasis.RequestType request) {
        this.request = request;
    }


    /**
     * Gets the custom value for this EBMHeaderType.
     * 
     * @return custom
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType getCustom() {
        return custom;
    }


    /**
     * Sets the custom value for this EBMHeaderType.
     * 
     * @param custom
     */
    public void setCustom(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType custom) {
        this.custom = custom;
    }


    /**
     * Gets the languageCode value for this EBMHeaderType.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this EBMHeaderType.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EBMHeaderType)) return false;
        EBMHeaderType other = (EBMHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EBMID==null && other.getEBMID()==null) || 
             (this.EBMID!=null &&
              this.EBMID.equals(other.getEBMID()))) &&
            ((this.EBMName==null && other.getEBMName()==null) || 
             (this.EBMName!=null &&
              java.util.Arrays.equals(this.EBMName, other.getEBMName()))) &&
            ((this.EBOName==null && other.getEBOName()==null) || 
             (this.EBOName!=null &&
              java.util.Arrays.equals(this.EBOName, other.getEBOName()))) &&
            ((this.creationDateTime==null && other.getCreationDateTime()==null) || 
             (this.creationDateTime!=null &&
              this.creationDateTime.equals(other.getCreationDateTime()))) &&
            ((this.verbCode==null && other.getVerbCode()==null) || 
             (this.verbCode!=null &&
              this.verbCode.equals(other.getVerbCode()))) &&
            ((this.messageProcessingInstruction==null && other.getMessageProcessingInstruction()==null) || 
             (this.messageProcessingInstruction!=null &&
              this.messageProcessingInstruction.equals(other.getMessageProcessingInstruction()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.EBMTracking==null && other.getEBMTracking()==null) || 
             (this.EBMTracking!=null &&
              java.util.Arrays.equals(this.EBMTracking, other.getEBMTracking()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              this.request.equals(other.getRequest()))) &&
            ((this.custom==null && other.getCustom()==null) || 
             (this.custom!=null &&
              this.custom.equals(other.getCustom()))) &&
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
        if (getEBMID() != null) {
            _hashCode += getEBMID().hashCode();
        }
        if (getEBMName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBMName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBMName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBOName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBOName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBOName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreationDateTime() != null) {
            _hashCode += getCreationDateTime().hashCode();
        }
        if (getVerbCode() != null) {
            _hashCode += getVerbCode().hashCode();
        }
        if (getMessageProcessingInstruction() != null) {
            _hashCode += getMessageProcessingInstruction().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getEBMTracking() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBMTracking());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBMTracking(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequest() != null) {
            _hashCode += getRequest().hashCode();
        }
        if (getCustom() != null) {
            _hashCode += getCustom().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EBMHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMHeaderType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("languageCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "languageCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LanguageCodeType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBMID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentifierType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBMName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBOName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBOName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NameType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CreationDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verbCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "VerbCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageProcessingInstruction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MessageProcessingInstruction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MessageProcessingInstructionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBMTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMTracking"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "RequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Custom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomEBMHeaderType"));
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
