/**
 * CommunicationsInvoiceEBS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3;

public interface CommunicationsInvoiceEBS_PortType extends java.rmi.Remote {

    /**
     * This operation is used to QueryInvoiceARList.
     * 					
     * 					SYNC_REQ_RESPONSE
     * 					QueryInvoiceARList
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType queryInvoiceARList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListEBMType queryInvoiceARListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to
     * 						QueryDueDateUpdateInvoiceList.
     * 					SYNC_REQ_RESPONSE
     * 					QueryDueDateUpdateInvoiceList
     * 					
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType queryDueDateUpdateInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListEBMType queryDueDateUpdateInvoiceListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to Update Invoice EBO.
     * 					
     * 					REQUEST_ONLY
     * 					CustomUpdateInvoice
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType customUpdateInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceEBMType customUpdateInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to
     * 						CreateInvoiceDocument.
     * 					REQUEST_ONLY
     * 					CreateInvoiceDocument
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType createInvoiceDocument(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentEBMType createInvoiceDocumentEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to
     * 						QueryInvoiceRescheduling.
     * 					REQUEST_ONLY
     * 					QueryInvoiceRescheduling
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType queryInvoiceRescheduling(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingEBMType queryInvoiceReschedulingEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to Update Invoice EBO.
     * 					
     * 					REQUEST_ONLY
     * 					QueryInvoiceDetailList
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType queryInvoiceDetailList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListEBMType queryInvoiceDetailListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to Query an Invoice EBO.
     * 					
     * 					SYNC_REQ_RESPONSE
     * 					QueryLastInvoice
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType queryLastInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceEBMType queryLastInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to Query multiple
     * 						Invoice EBOs.
     * 					SYNC_REQ_RESPONSE
     * 					QueryInvoiceList
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType queryInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListEBMType queryInvoiceListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to Update Invoice EBO.
     * 					
     * 					REQUEST_ONLY
     * 					QueryTrialInvoice
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType queryTrialInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceEBMType queryTrialInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to Query multiple
     * 						Invoice EBOs.
     * 					SYNC_REQ_RESPONSE
     * 					QueryDebtInstallmentDetailList
     * 					
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType queryDebtInstallmentDetailList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListEBMType queryDebtInstallmentDetailListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;

    /**
     * This operation is used to a preview invoice.
     * 					
     * 					SYNC_REQ_RESPONSE
     * 					QueryPreviewInvoice
     * 					
     * 					Active
     * 					Public
     */
    public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType queryPreviewInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceEBMType queryPreviewInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;
}
