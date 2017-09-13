/**
 * InteroperabilityHeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.sky.www.ArchitectureSchemas;

public class InteroperabilityHeaderType  implements java.io.Serializable {
    private java.lang.String consumerSystem;

    private java.lang.String userId;

    public InteroperabilityHeaderType() {
    }

    public InteroperabilityHeaderType(
           java.lang.String consumerSystem,
           java.lang.String userId) {
           this.consumerSystem = consumerSystem;
           this.userId = userId;
    }


    /**
     * Gets the consumerSystem value for this InteroperabilityHeaderType.
     * 
     * @return consumerSystem
     */
    public java.lang.String getConsumerSystem() {
        return consumerSystem;
    }


    /**
     * Sets the consumerSystem value for this InteroperabilityHeaderType.
     * 
     * @param consumerSystem
     */
    public void setConsumerSystem(java.lang.String consumerSystem) {
        this.consumerSystem = consumerSystem;
    }


    /**
     * Gets the userId value for this InteroperabilityHeaderType.
     * 
     * @return userId
     */
    public java.lang.String getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this InteroperabilityHeaderType.
     * 
     * @param userId
     */
    public void setUserId(java.lang.String userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InteroperabilityHeaderType)) return false;
        InteroperabilityHeaderType other = (InteroperabilityHeaderType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consumerSystem==null && other.getConsumerSystem()==null) || 
             (this.consumerSystem!=null &&
              this.consumerSystem.equals(other.getConsumerSystem()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
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
        if (getConsumerSystem() != null) {
            _hashCode += getConsumerSystem().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InteroperabilityHeaderType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "InteroperabilityHeaderType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumerSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "consumerSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
