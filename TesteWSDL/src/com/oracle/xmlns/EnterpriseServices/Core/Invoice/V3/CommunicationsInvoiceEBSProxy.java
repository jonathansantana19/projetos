package com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3;

public class CommunicationsInvoiceEBSProxy implements com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBS_PortType {
  private String _endpoint = null;
  private com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBS_PortType communicationsInvoiceEBS_PortType = null;
  
  public CommunicationsInvoiceEBSProxy() {
    _initCommunicationsInvoiceEBSProxy();
  }
  
  public CommunicationsInvoiceEBSProxy(String endpoint) {
    _endpoint = endpoint;
    _initCommunicationsInvoiceEBSProxy();
  }
  
  private void _initCommunicationsInvoiceEBSProxy() {
    try {
      communicationsInvoiceEBS_PortType = (new com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBS_ServiceLocator()).getCommunicationsInvoiceEBSPort();
      if (communicationsInvoiceEBS_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)communicationsInvoiceEBS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)communicationsInvoiceEBS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (communicationsInvoiceEBS_PortType != null)
      ((javax.xml.rpc.Stub)communicationsInvoiceEBS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBS_PortType getCommunicationsInvoiceEBS_PortType() {
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType;
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListResponseEBMType queryInvoiceARList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceARListEBMType queryInvoiceARListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryInvoiceARList(queryInvoiceARListEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListResponseEBMType queryDueDateUpdateInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDueDateUpdateInvoiceListEBMType queryDueDateUpdateInvoiceListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryDueDateUpdateInvoiceList(queryDueDateUpdateInvoiceListEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceResponseEBMType customUpdateInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CustomUpdateInvoiceEBMType customUpdateInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.customUpdateInvoice(customUpdateInvoiceEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType createInvoiceDocument(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentEBMType createInvoiceDocumentEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.createInvoiceDocument(createInvoiceDocumentEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingResponseEBMType queryInvoiceRescheduling(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceReschedulingEBMType queryInvoiceReschedulingEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryInvoiceRescheduling(queryInvoiceReschedulingEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListResponseEBMType queryInvoiceDetailList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceDetailListEBMType queryInvoiceDetailListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryInvoiceDetailList(queryInvoiceDetailListEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType queryLastInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceEBMType queryLastInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryLastInvoice(queryLastInvoiceEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListResponseEBMType queryInvoiceList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryInvoiceListEBMType queryInvoiceListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryInvoiceList(queryInvoiceListEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceResponseEBMType queryTrialInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryTrialInvoiceEBMType queryTrialInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryTrialInvoice(queryTrialInvoiceEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType queryDebtInstallmentDetailList(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListEBMType queryDebtInstallmentDetailListEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryDebtInstallmentDetailList(queryDebtInstallmentDetailListEBM);
  }
  
  public com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceResponseEBMType queryPreviewInvoice(com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryPreviewInvoiceEBMType queryPreviewInvoiceEBM) throws java.rmi.RemoteException, com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType{
    if (communicationsInvoiceEBS_PortType == null)
      _initCommunicationsInvoiceEBSProxy();
    return communicationsInvoiceEBS_PortType.queryPreviewInvoice(queryPreviewInvoiceEBM);
  }
  
  
}