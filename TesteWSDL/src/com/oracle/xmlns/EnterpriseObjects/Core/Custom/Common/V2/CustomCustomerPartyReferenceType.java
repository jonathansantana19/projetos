/**
 * CustomCustomerPartyReferenceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2;

public class CustomCustomerPartyReferenceType  implements java.io.Serializable {
    /* List of Accounts related to the Client (CustomerParty) */
    private com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyAccountType[] customCustomerPartyAccountList;

    public CustomCustomerPartyReferenceType() {
    }

    public CustomCustomerPartyReferenceType(
           com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyAccountType[] customCustomerPartyAccountList) {
           this.customCustomerPartyAccountList = customCustomerPartyAccountList;
    }


    /**
     * Gets the customCustomerPartyAccountList value for this CustomCustomerPartyReferenceType.
     * 
     * @return customCustomerPartyAccountList   * List of Accounts related to the Client (CustomerParty)
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyAccountType[] getCustomCustomerPartyAccountList() {
        return customCustomerPartyAccountList;
    }


    /**
     * Sets the customCustomerPartyAccountList value for this CustomCustomerPartyReferenceType.
     * 
     * @param customCustomerPartyAccountList   * List of Accounts related to the Client (CustomerParty)
     */
    public void setCustomCustomerPartyAccountList(com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyAccountType[] customCustomerPartyAccountList) {
        this.customCustomerPartyAccountList = customCustomerPartyAccountList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomCustomerPartyReferenceType)) return false;
        CustomCustomerPartyReferenceType other = (CustomCustomerPartyReferenceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customCustomerPartyAccountList==null && other.getCustomCustomerPartyAccountList()==null) || 
             (this.customCustomerPartyAccountList!=null &&
              java.util.Arrays.equals(this.customCustomerPartyAccountList, other.getCustomCustomerPartyAccountList())));
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
        if (getCustomCustomerPartyAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomCustomerPartyAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomCustomerPartyAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomCustomerPartyReferenceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyReferenceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customCustomerPartyAccountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyAccountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyAccountListType"));
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
