/**
 * ResourceType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package _04.cd.schema.context._0._2.xacml.tc.names.oasis;

public class ResourceType  implements java.io.Serializable {
    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceContentType resourceContent;

    private _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] attribute;

    public ResourceType() {
    }

    public ResourceType(
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceContentType resourceContent,
           _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] attribute) {
           this.resourceContent = resourceContent;
           this.attribute = attribute;
    }


    /**
     * Gets the resourceContent value for this ResourceType.
     * 
     * @return resourceContent
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceContentType getResourceContent() {
        return resourceContent;
    }


    /**
     * Sets the resourceContent value for this ResourceType.
     * 
     * @param resourceContent
     */
    public void setResourceContent(_04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceContentType resourceContent) {
        this.resourceContent = resourceContent;
    }


    /**
     * Gets the attribute value for this ResourceType.
     * 
     * @return attribute
     */
    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this ResourceType.
     * 
     * @param attribute
     */
    public void setAttribute(_04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][] attribute) {
        this.attribute = attribute;
    }

    public _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[] getAttribute(int i) {
        return this.attribute[i];
    }

    public void setAttribute(int i, _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[] _value) {
        this.attribute[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResourceType)) return false;
        ResourceType other = (ResourceType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resourceContent==null && other.getResourceContent()==null) || 
             (this.resourceContent!=null &&
              this.resourceContent.equals(other.getResourceContent()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              java.util.Arrays.equals(this.attribute, other.getAttribute())));
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
        if (getResourceContent() != null) {
            _hashCode += getResourceContent().hashCode();
        }
        if (getAttribute() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttribute());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttribute(), i);
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
        new org.apache.axis.description.TypeDesc(ResourceType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ResourceType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceContent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ResourceContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ResourceContentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Attribute"));
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
