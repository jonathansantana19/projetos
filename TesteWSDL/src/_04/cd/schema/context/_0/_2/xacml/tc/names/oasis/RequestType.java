/**
 * RequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _04.cd.schema.context._0._2.xacml.tc.names.oasis;

public class RequestType  implements java.io.Serializable {
    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][][] subject;

    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType[] resource;

    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] action;

    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] environment;

    public RequestType() {
    }

    public RequestType(
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][][] subject,
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType[] resource,
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] action,
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] environment) {
           this.subject = subject;
           this.resource = resource;
           this.action = action;
           this.environment = environment;
    }


    /**
     * Gets the subject value for this RequestType.
     * 
     * @return subject
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][][] getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this RequestType.
     * 
     * @param subject
     */
    public void setSubject(_04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][][] subject) {
        this.subject = subject;
    }

    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] getSubject(int i) {
        return this.subject[i];
    }

    public void setSubject(int i, _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] _value) {
        this.subject[i] = _value;
    }


    /**
     * Gets the resource value for this RequestType.
     * 
     * @return resource
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this RequestType.
     * 
     * @param resource
     */
    public void setResource(_04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType[] resource) {
        this.resource = resource;
    }

    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType _value) {
        this.resource[i] = _value;
    }


    /**
     * Gets the action value for this RequestType.
     * 
     * @return action
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] getAction() {
        return action;
    }


    /**
     * Sets the action value for this RequestType.
     * 
     * @param action
     */
    public void setAction(_04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] action) {
        this.action = action;
    }


    /**
     * Gets the environment value for this RequestType.
     * 
     * @return environment
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] getEnvironment() {
        return environment;
    }


    /**
     * Sets the environment value for this RequestType.
     * 
     * @param environment
     */
    public void setEnvironment(_04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] environment) {
        this.environment = environment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestType)) return false;
        RequestType other = (RequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              java.util.Arrays.equals(this.subject, other.getSubject()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              java.util.Arrays.equals(this.action, other.getAction()))) &&
            ((this.environment==null && other.getEnvironment()==null) || 
             (this.environment!=null &&
              java.util.Arrays.equals(this.environment, other.getEnvironment())));
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
        if (getSubject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnvironment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnvironment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnvironment(), i);
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
        new org.apache.axis.description.TypeDesc(RequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "RequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Subject"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Resource"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Action"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ActionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("environment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Environment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "EnvironmentType"));
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
