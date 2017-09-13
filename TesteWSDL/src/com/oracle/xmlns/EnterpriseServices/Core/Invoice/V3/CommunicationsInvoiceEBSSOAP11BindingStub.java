/**
 * CommunicationsInvoiceEBSSOAP11BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3;

public class CommunicationsInvoiceEBSSOAP11BindingStub extends org.apache.axis.client.Stub implements com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBS_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryInvoiceARList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryDueDateUpdateInvoiceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomUpdateInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateInvoiceDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryInvoiceRescheduling");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryTrialInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryInvoiceDetailList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryLastInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryInvoiceList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryDebtInstallmentDetailList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryPreviewInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceEBM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceEBMType"), com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceEBMType.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceResponseEBMType"));
        oper.setReturnClass(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceResponseEBM"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Fault"),
                      "com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType",
                      new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType"), 
                      true
                     ));
        _operations[10] = oper;

    }

    public CommunicationsInvoiceEBSSOAP11BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CommunicationsInvoiceEBSSOAP11BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CommunicationsInvoiceEBSSOAP11BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/03/addressing", "RelationshipTypeValues");
            cachedSerQNames.add(qName);
            cls = org.xmlsoap.schemas.ws._2003._03.addressing.RelationshipTypeValues.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "EnumLogCriticallyType");
            cachedSerQNames.add(qName);
            cls = br.com.sky.www.ArchitectureSchemas.EnumLogCriticallyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "InteroperabilityHeaderType");
            cachedSerQNames.add(qName);
            cls = br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.sky.com.br/ArchitectureSchemas", "RespondeHeaderType");
            cachedSerQNames.add(qName);
            cls = br.com.sky.www.ArchitectureSchemas.RespondeHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ActionCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AddressType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NameType");
            qName2 = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "StateName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AmountType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AnyDateTimePointBaseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AnyDateTimePointBaseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "AnyDateTimePointPrecisionCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchIdentificationType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchIdentificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BankBranchReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankBranchReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BankPartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BillToPartyReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BillToPartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BinaryObjectType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BinaryObjectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "BusinessScopeCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CodeType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountContactIdentificationType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountContactIdentificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyAccountIdentificationType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyAccountIdentificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "CustomerPartyReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "DateTimeType");
            cachedSerQNames.add(qName);
            cls = java.util.Calendar.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "DateType");
            cachedSerQNames.add(qName);
            cls = java.util.Date.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "DebugLevelCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "DurationType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Duration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMHeaderType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMTrackingType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMTrackingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "EBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "FaultType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentificationType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IdentifierType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ImplementationCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IndicatorType");
            cachedSerQNames.add(qName);
            cls = boolean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IntegerType");
            cachedSerQNames.add(qName);
            cls = java.math.BigInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "IntermediateMessageHopType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IntermediateMessageHopType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "InvoiceReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.InvoiceReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ItemReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType");
            qName2 = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "Description");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LanguageCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LocationReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "LogicalOperatorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MessageProcessingInstructionType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.MessageProcessingInstructionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MonthDayType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.MonthDay.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "MonthType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.NormalizedString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NameType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NonNegativeIntegerType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.NonNegativeInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NoteType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NoteType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NumericType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "OrganizationPartyReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "NameType");
//            qName2 = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "");
//            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PartyIdentificationType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PartyReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PaymentReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PaymentReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PercentType");
            cachedSerQNames.add(qName);
            cls = java.math.BigDecimal.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "PositiveIntegerType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.PositiveInteger.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteriaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryExpressionType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryExpressionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryOperatorCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceiptMethodIdentificationType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodIdentificationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ReceiptMethodReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ResponseCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SenderType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.SenderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ShipToPartyReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ShipToPartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SortDirectionCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "StatusType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.StatusType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "StringType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "SyncActionCodeType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TargetType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TargetType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TextType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TextType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TimePeriodType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.TimePeriodType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "TimeType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Time.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "URIType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.URI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "ValueExpressionType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "YearType");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.Year.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", ">CustomPaymentReferenceType>AdditionalPayment");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeAdditionalPayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", ">CustomPaymentReferenceType>GLAccount");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceTypeGLAccount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomBankBranchReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankBranchReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "Custom");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomBankPartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyAccountListType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyAccountType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyAccount");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyAccountType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyAccountType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomCustomerPartyReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomCustomerPartyReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomEBMHeaderType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomInvoiceReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomInvoiceReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/Common/V2", "CustomPaymentReferenceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomPaymentReferenceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">>CustomInvoiceEBOType>BankPayableDocument>Rescheduling");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocumentRescheduling.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>BankPayableDocument");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeBankPayableDocument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>DebtInstallmentDetail");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeDebtInstallmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>OverdueInvoice");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypeOverdueInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", ">CustomInvoiceEBOType>PromisePayment");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOTypePromisePayment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CustomInvoiceEBOType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Custom/EBO/Invoice/V3", "CustomInvoiceLineType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CreateInvoiceDocumentType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "CustomUpdateInvoiceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DebtInstallmentComplexQueryType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentComplexQueryType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DebtInstallmentQueryCodeType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentQueryCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "DebtInstallmentResponseCodeType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentResponseCodeType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceComplexQueryType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/Common/V2", "QueryCriteria");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceCustomerPartyType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceEBOType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceEBOType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLineAdjustmentType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineAdjustmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoiceLineType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "InvoicePaymentType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryAcquittanceTermDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryAcquittanceTermDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryAcquittanceTermEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryAcquittanceTermEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryAcquittanceTermResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryAcquittanceTermResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryAcquittanceTermResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryAcquittanceTermResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryAcquittanceTermResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryAcquittanceTermResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryAcquittanceTermType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryAcquittanceTermType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDebtInstallmentDetailListResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryDueDateUpdateInvoiceListType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceARListType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceDetailListResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceListResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipInputLineType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipInputLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportBankSlipType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportBankSlipType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReportType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryInvoiceReschedulingType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryLastInvoiceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryPreviewInvoiceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceResponseDataAreaType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseDataAreaType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceResponseEBMType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceResponseType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlns.oracle.com/EnterpriseObjects/Core/EBO/Invoice/V3", "QueryTrialInvoiceType");
            cachedSerQNames.add(qName);
            cls = com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ActionType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Attribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "AttributeType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "AttributeValue");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "AttributeValueType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "DecisionType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.DecisionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "EnvironmentType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Attribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "RequestType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.RequestType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ResourceContentType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceContentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "ResourceType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.ResourceType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "SubjectType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.context._0._2.xacml.tc.names.oasis.AttributeValueType[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:context:schema:cd:04", "Attribute");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:cd:04", "EffectType");
            cachedSerQNames.add(qName);
            cls = _04.cd.schema.policy._0._2.xacml.tc.names.oasis.EffectType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:cd:04", "VersionMatchType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("urn:oasis:names:tc:xacml:2.0:policy:schema:cd:04", "VersionType");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType queryInvoiceARList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListEBMType queryInvoiceARListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/QueryInvoiceARList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryInvoiceARList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryInvoiceARListEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType queryDueDateUpdateInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListEBMType queryDueDateUpdateInvoiceListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/QueryDueDateUpdateInvoiceList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryDueDateUpdateInvoiceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryDueDateUpdateInvoiceListEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType customUpdateInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceEBMType customUpdateInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/CustomUpdateInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CustomUpdateInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {customUpdateInvoiceEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType createInvoiceDocument(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentEBMType createInvoiceDocumentEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/CreateInvoiceDocument");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateInvoiceDocument"));
        
        
        
        setRequestHeaders(_call);
        setAttachments(_call);
 try {        
	 java.lang.Object _resp = _call.invoke(new java.lang.Object[] {createInvoiceDocumentEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType queryInvoiceRescheduling(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingEBMType queryInvoiceReschedulingEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/QueryInvoiceRescheduling");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryInvoiceRescheduling"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryInvoiceReschedulingEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType queryTrialInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceEBMType queryTrialInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/QueryTrialInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryTrialInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryTrialInvoiceEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType queryInvoiceDetailList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListEBMType queryInvoiceDetailListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Person/V1/QueryInvoiceDetailList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryInvoiceDetailList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryInvoiceDetailListEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType queryLastInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceEBMType queryLastInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Invoice/V2/QueryLastInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryLastInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryLastInvoiceEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType queryInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListEBMType queryInvoiceListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Invoice/V2/QueryInvoiceList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryInvoiceList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryInvoiceListEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType queryDebtInstallmentDetailList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListEBMType queryDebtInstallmentDetailListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Invoice/V2/QueryDebtInstallmentDetailList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryDebtInstallmentDetailList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryDebtInstallmentDetailListEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType queryPreviewInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceEBMType queryPreviewInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://xmlns.oracle.com/EnterpriseServices/Core/Invoice/V2/QueryPreviewInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryPreviewInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {queryPreviewInvoiceEBM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType) org.apache.axis.utils.JavaUtils.convert(_resp, com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) {
              throw (com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
