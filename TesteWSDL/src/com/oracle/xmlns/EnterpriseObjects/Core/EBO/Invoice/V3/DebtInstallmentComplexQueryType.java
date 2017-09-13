/**
 * DebtInstallmentComplexQueryType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3;

public class DebtInstallmentComplexQueryType  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentQueryCodeType queryCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentResponseCodeType responseCode;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] queryCriteria;

    private java.lang.Boolean getAllTranslationsIndicator;  // attribute

    private org.apache.axis.types.PositiveInteger recordSetStart;  // attribute

    private org.apache.axis.types.PositiveInteger recordSetCount;  // attribute

    private org.apache.axis.types.PositiveInteger maxItems;  // attribute

    public DebtInstallmentComplexQueryType() {
    }

    public DebtInstallmentComplexQueryType(
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentQueryCodeType queryCode,
           com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentResponseCodeType responseCode,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] queryCriteria,
           java.lang.Boolean getAllTranslationsIndicator,
           org.apache.axis.types.PositiveInteger recordSetStart,
           org.apache.axis.types.PositiveInteger recordSetCount,
           org.apache.axis.types.PositiveInteger maxItems) {
           this.queryCode = queryCode;
           this.responseCode = responseCode;
           this.queryCriteria = queryCriteria;
           this.getAllTranslationsIndicator = getAllTranslationsIndicator;
           this.recordSetStart = recordSetStart;
           this.recordSetCount = recordSetCount;
           this.maxItems = maxItems;
    }


    /**
     * Gets the queryCode value for this DebtInstallmentComplexQueryType.
     * 
     * @return queryCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentQueryCodeType getQueryCode() {
        return queryCode;
    }


    /**
     * Sets the queryCode value for this DebtInstallmentComplexQueryType.
     * 
     * @param queryCode
     */
    public void setQueryCode(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentQueryCodeType queryCode) {
        this.queryCode = queryCode;
    }


    /**
     * Gets the responseCode value for this DebtInstallmentComplexQueryType.
     * 
     * @return responseCode
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentResponseCodeType getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this DebtInstallmentComplexQueryType.
     * 
     * @param responseCode
     */
    public void setResponseCode(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentResponseCodeType responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the queryCriteria value for this DebtInstallmentComplexQueryType.
     * 
     * @return queryCriteria
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] getQueryCriteria() {
        return queryCriteria;
    }


    /**
     * Sets the queryCriteria value for this DebtInstallmentComplexQueryType.
     * 
     * @param queryCriteria
     */
    public void setQueryCriteria(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[] queryCriteria) {
        this.queryCriteria = queryCriteria;
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType getQueryCriteria(int i) {
        return this.queryCriteria[i];
    }

    public void setQueryCriteria(int i, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType _value) {
        this.queryCriteria[i] = _value;
    }


    /**
     * Gets the getAllTranslationsIndicator value for this DebtInstallmentComplexQueryType.
     * 
     * @return getAllTranslationsIndicator
     */
    public java.lang.Boolean getGetAllTranslationsIndicator() {
        return getAllTranslationsIndicator;
    }


    /**
     * Sets the getAllTranslationsIndicator value for this DebtInstallmentComplexQueryType.
     * 
     * @param getAllTranslationsIndicator
     */
    public void setGetAllTranslationsIndicator(java.lang.Boolean getAllTranslationsIndicator) {
        this.getAllTranslationsIndicator = getAllTranslationsIndicator;
    }


    /**
     * Gets the recordSetStart value for this DebtInstallmentComplexQueryType.
     * 
     * @return recordSetStart
     */
    public org.apache.axis.types.PositiveInteger getRecordSetStart() {
        return recordSetStart;
    }


    /**
     * Sets the recordSetStart value for this DebtInstallmentComplexQueryType.
     * 
     * @param recordSetStart
     */
    public void setRecordSetStart(org.apache.axis.types.PositiveInteger recordSetStart) {
        this.recordSetStart = recordSetStart;
    }


    /**
     * Gets the recordSetCount value for this DebtInstallmentComplexQueryType.
     * 
     * @return recordSetCount
     */
    public org.apache.axis.types.PositiveInteger getRecordSetCount() {
        return recordSetCount;
    }


    /**
     * Sets the recordSetCount value for this DebtInstallmentComplexQueryType.
     * 
     * @param recordSetCount
     */
    public void setRecordSetCount(org.apache.axis.types.PositiveInteger recordSetCount) {
        this.recordSetCount = recordSetCount;
    }


    /**
     * Gets the maxItems value for this DebtInstallmentComplexQueryType.
     * 
     * @return maxItems
     */
    public org.apache.axis.types.PositiveInteger getMaxItems() {
        return maxItems;
    }


    /**
     * Sets the maxItems value for this DebtInstallmentComplexQueryType.
     * 
     * @param maxItems
     */
    public void setMaxItems(org.apache.axis.types.PositiveInteger maxItems) {
        this.maxItems = maxItems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DebtInstallmentComplexQueryType)) return false;
        DebtInstallmentComplexQueryType other = (DebtInstallmentComplexQueryType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryCode==null && other.getQueryCode()==null) || 
             (this.queryCode!=null &&
              this.queryCode.equals(other.getQueryCode()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.queryCriteria==null && other.getQueryCriteria()==null) || 
             (this.queryCriteria!=null &&
              java.util.Arrays.equals(this.queryCriteria, other.getQueryCriteria()))) &&
            ((this.getAllTranslationsIndicator==null && other.getGetAllTranslationsIndicator()==null) || 
             (this.getAllTranslationsIndicator!=null &&
              this.getAllTranslationsIndicator.equals(other.getGetAllTranslationsIndicator()))) &&
            ((this.recordSetStart==null && other.getRecordSetStart()==null) || 
             (this.recordSetStart!=null &&
              this.recordSetStart.equals(other.getRecordSetStart()))) &&
            ((this.recordSetCount==null && other.getRecordSetCount()==null) || 
             (this.recordSetCount!=null &&
              this.recordSetCount.equals(other.getRecordSetCount()))) &&
            ((this.maxItems==null && other.getMaxItems()==null) || 
             (this.maxItems!=null &&
              this.maxItems.equals(other.getMaxItems())));
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
        if (getQueryCode() != null) {
            _hashCode += getQueryCode().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getQueryCriteria() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueryCriteria());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueryCriteria(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGetAllTranslationsIndicator() != null) {
            _hashCode += getGetAllTranslationsIndicator().hashCode();
        }
        if (getRecordSetStart() != null) {
            _hashCode += getRecordSetStart().hashCode();
        }
        if (getRecordSetCount() != null) {
            _hashCode += getRecordSetCount().hashCode();
        }
        if (getMaxItems() != null) {
            _hashCode += getMaxItems().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DebtInstallmentComplexQueryType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DebtInstallmentComplexQueryType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("getAllTranslationsIndicator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "getAllTranslationsIndicator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IndicatorType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recordSetStart");
        attrField.setXmlName(new javax.xml.namespace.QName("", "recordSetStart"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PositiveIntegerType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("recordSetCount");
        attrField.setXmlName(new javax.xml.namespace.QName("", "recordSetCount"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PositiveIntegerType"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("maxItems");
        attrField.setXmlName(new javax.xml.namespace.QName("", "maxItems"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PositiveIntegerType"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DebtInstallmentQueryCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "ResponseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DebtInstallmentResponseCodeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteria"));
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
