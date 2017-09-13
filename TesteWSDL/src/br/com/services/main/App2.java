package br.com.services.main;

import java.rmi.RemoteException;

import org.apache.axis.types.NormalizedString;

import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodIdentificationType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType;
import com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceDataAreaType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceEBMType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceResponseEBMType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryLastInvoiceType;
import com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBSProxy;

import br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType;

public class App2 {
	
	
	public static void main(String[] args) throws FaultType, RemoteException {
		
		
		
		//TESTANDO WEB SERVICE QUERY LAST INVOICE 
		CommunicationsInvoiceEBSProxy CommunicationsInvoiceEBSProxy = new CommunicationsInvoiceEBSProxy();
		
		QueryLastInvoiceEBMType queryLastInvoiceEBMType  = new QueryLastInvoiceEBMType();

		
		EBMHeaderType ebmHeader = new EBMHeaderType();
		
		CustomEBMHeaderType c  = new CustomEBMHeaderType();
		
		c.setInteroperabilityHeader(new InteroperabilityHeaderType("ICARE", "ICARE"));
		
		ebmHeader.setCustom(c);
		
		queryLastInvoiceEBMType.setEBMHeader(ebmHeader);
		
		QueryLastInvoiceDataAreaType queryLastInvoiceDataAreaType = new QueryLastInvoiceDataAreaType();
		
		
//	 		abre TAG InvoiceCustomerParty
	 	InvoiceCustomerPartyType invoiceCustomerPartyType = new InvoiceCustomerPartyType();
	 	
	 	CustomerPartyReferenceType customerPartyReference  = new CustomerPartyReferenceType();
	 	
	 	PartyIdentificationType PartyIdentification = new PartyIdentificationType(new IdentifierType("116539599"));
	 	customerPartyReference.setPartyIdentification(PartyIdentification);

	 	//FECHA TAG InvoiceCustomerParty
	 	invoiceCustomerPartyType.setCustomerPartyReference(customerPartyReference);
	 	
	 	customerPartyReference.setPartyIdentification(PartyIdentification);
	 	
	 	invoiceCustomerPartyType.setCustomerPartyReference(customerPartyReference);
		
		QueryLastInvoiceType queryLastInvoiceType = new QueryLastInvoiceType();
		
		queryLastInvoiceType.setInvoiceCustomerParty(invoiceCustomerPartyType);		
		
		queryLastInvoiceDataAreaType.setQueryLastInvoice(queryLastInvoiceType);
		
		
		queryLastInvoiceEBMType.setDataArea(queryLastInvoiceDataAreaType);
		
		QueryLastInvoiceResponseEBMType response =	CommunicationsInvoiceEBSProxy.queryLastInvoice(queryLastInvoiceEBMType);
		
		System.out.println("Return " + response.getEBMHeader().getCustom().getResponseHeader().getReturnMessage());
		
		
		System.out.println("Total "+ response.getDataArea().getQueryLastInvoiceResponse().getTotalAmount());
		
		
		
	}
		
	

}
