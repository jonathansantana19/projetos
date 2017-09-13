/**
 * CustomInvoiceEBOTypeOverdueInvoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3;

public class CustomInvoiceEBOTypeOverdueInvoice  implements java.io.Serializable {
    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType lastTotalAmount;

    private com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount;

    private java.util.Date dueDate;

    public CustomInvoiceEBOTypeOverdueInvoice() {
    }

    public CustomInvoiceEBOTypeOverdueInvoice(
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType lastTotalAmount,
           com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount,
           java.util.Date dueDate) {
           this.lastTotalAmount = lastTotalAmount;
           this.totalAmount = totalAmount;
           this.dueDate = dueDate;
    }


    /**
     * Gets the lastTotalAmount value for this CustomInvoiceEBOTypeOverdueInvoice.
     * 
     * @return lastTotalAmount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getLastTotalAmount() {
        return lastTotalAmount;
    }


    /**
     * Sets the lastTotalAmount value for this CustomInvoiceEBOTypeOverdueInvoice.
     * 
     * @param lastTotalAmount
     */
    public void setLastTotalAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType lastTotalAmount) {
        this.lastTotalAmount = lastTotalAmount;
    }


    /**
     * Gets the totalAmount value for this CustomInvoiceEBOTypeOverdueInvoice.
     * 
     * @return totalAmount
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this CustomInvoiceEBOTypeOverdueInvoice.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the dueDate value for this CustomInvoiceEBOTypeOverdueInvoice.
     * 
     * @return dueDate
     */
    public java.util.Date getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this CustomInvoiceEBOTypeOverdueInvoice.
     * 
     * @param dueDate
     */
    public void setDueDate(java.util.Date dueDate) {
        this.dueDate = dueDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomInvoiceEBOTypeOverdueInvoice)) return false;
        CustomInvoiceEBOTypeOverdueInvoice other = (CustomInvoiceEBOTypeOverdueInvoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastTotalAmount==null && other.getLastTotalAmount()==null) || 
             (this.lastTotalAmount!=null &&
              this.lastTotalAmount.equals(other.getLastTotalAmount()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate())));
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
        if (getLastTotalAmount() != null) {
            _hashCode += getLastTotalAmount().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomInvoiceEBOTypeOverdueInvoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>OverdueInvoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTotalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "LastTotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "TotalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "DueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
