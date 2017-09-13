package br.com.services.main;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.xml.rpc.ServiceException;

import org.apache.axis.AxisFault;
import org.apache.axis.types.NormalizedString;

import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.AmountType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.BillToPartyReferenceType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CodeType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.CustomerPartyReferenceType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentificationType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.IdentifierType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.LocationReferenceType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.NameType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.PartyIdentificationType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodIdentificationType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ReceiptMethodReferenceType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType;
import com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType;
import com.oracle.xmlns.EnterpriseObjects.Core.Custom.EBO.Invoice.V3.CustomInvoiceEBOType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentDataAreaType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentEBMType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseEBMType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentResponseType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.CreateInvoiceDocumentType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoiceCustomerPartyType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.InvoicePaymentType;
import com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBSProxy;
import com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBSSOAP11BindingStub;

import br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType;

public class App {
	
	public static void main(String[] args) throws ParseException   {
		
		
		System.out.println("Inicioo");
		
		
		try {
				CommunicationsInvoiceEBSProxy CommunicationsInvoiceEBSProxy = new CommunicationsInvoiceEBSProxy();
			
			
				//ABRE TAG GERAL
					CreateInvoiceDocumentEBMType createInvoiceDocumentEBM = new CreateInvoiceDocumentEBMType();
					
					//ABRE TAG AREA
					CreateInvoiceDocumentDataAreaType createInvoiceDocumentDataAreaType = new CreateInvoiceDocumentDataAreaType();
					
					//ABRE TAG CREATE INVOICE DENTRO DA TAG AREAM
					CreateInvoiceDocumentType createInvoiceDocument = new CreateInvoiceDocumentType();
					
					
					EBMHeaderType ebmHeader = new EBMHeaderType();
					
					
					
					CustomEBMHeaderType custom  = new CustomEBMHeaderType();
					
					custom.setInteroperabilityHeader(new InteroperabilityHeaderType("ICARE", "ICARE"));
					ebmHeader.setCustom(custom);
					
					createInvoiceDocumentEBM.setEBMHeader(ebmHeader);
					
					
					
					//VALOR IDENTIFICACAO
					 IdentificationType identificationType = new IdentificationType();
			         identificationType.setID(new IdentifierType("400108711832"));
					
			         createInvoiceDocument.setIdentification(identificationType);
			         
			         
			         //VALORES TOTAL AMOUNT 
			         AmountType totalAmount = new AmountType();
			         totalAmount = new AmountType(new BigDecimal(295.38));
			         
			         createInvoiceDocument.setTotalAmount(totalAmount);
			         
			         
//			         VALORES DUAL DATE
			         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			         LocalDate data = LocalDate.parse("23/11/2015", formato);
			         System.out.println(data);
			         
			         
			 	      createInvoiceDocument.setDueDate(java.sql.Date.valueOf(data));
			 	      
//			 	      abre a tag BillToPartyReference
			 	     BillToPartyReferenceType billToPartyReferenceType = new BillToPartyReferenceType();
//			 	     
			 	     LocationReferenceType locationReference = new LocationReferenceType();
			 	     
			 	     //TAG ENDEREÇO
			 	     NameType[] nameType = new NameType[1] ;
			 	    nameType[0] = new NameType("XX");
			 	    
			 	    locationReference.setAddress(nameType);
					
			 	     //FECHA TAG BillToPartyReference
			 	    billToPartyReferenceType.setLocationReference(locationReference);
			 	     
			 	   createInvoiceDocument.setBillToPartyReference(billToPartyReferenceType);
			 	  
			 	  //ABRE TAG InvoicePayment
//			 	  InvoicePaymentType invoicePayment = new InvoicePaymentType();
			 	  
			 	 InvoicePaymentType[] invoicePayment = new InvoicePaymentType[1];
			 	 
			 	 ReceiptMethodReferenceType receiptMethodReference = new ReceiptMethodReferenceType();
			 	  
			 	  ReceiptMethodIdentificationType receiptMethodIdentification = new ReceiptMethodIdentificationType();
			 	 receiptMethodIdentification.setID(new IdentifierType(new NormalizedString("20000")));
			 	  
			 	receiptMethodReference.setReceiptMethodIdentification(receiptMethodIdentification);
			 	
			 	
			 	invoicePayment[0] = new InvoicePaymentType();
			 	invoicePayment[0].setReceiptMethodReference(receiptMethodReference);
			 	
			 	createInvoiceDocument.setInvoicePayment(invoicePayment);
			 	
//			 	abre TAG InvoiceCustomerParty
			 	InvoiceCustomerPartyType invoiceCustomerParty = new InvoiceCustomerPartyType();
			 	
			 	CustomerPartyReferenceType customerPartyReference = new CustomerPartyReferenceType();
			 	
			 	
			 	PartyIdentificationType partyIdentificationType  = new PartyIdentificationType();
			 	partyIdentificationType.setID(new IdentifierType());
			 	partyIdentificationType.getID().set_value(new NormalizedString("1500122485"));
			 	
			 	customerPartyReference.setPartyIdentification(partyIdentificationType);
			 	//FECHA TAG InvoiceCustomerParty
			 	invoiceCustomerParty.setCustomerPartyReference(customerPartyReference);
			 	
			 	createInvoiceDocument.setInvoiceCustomerParty(invoiceCustomerParty);
			 	
					
					CustomInvoiceEBOType custom2 =
									new CustomInvoiceEBOType();
					
					CodeType IssuerChannelCode = new CodeType();
					IssuerChannelCode.set_value(new NormalizedString("99"));
					
					CodeType EmissionChannelCode = new CodeType();
					EmissionChannelCode.set_value(new NormalizedString("6"));
					
					custom2.setIssuerChannelCode(IssuerChannelCode);
					custom2.setEmissionChannelCode(EmissionChannelCode);
					
					createInvoiceDocument.setCustom(custom2);
					
					//SETA VALORES NA TAG AREA
					createInvoiceDocumentDataAreaType.setCreateInvoiceDocument(createInvoiceDocument);
					
					
					//SETANDO VALORE NA TAG GERAL
					createInvoiceDocumentEBM.setDataArea(createInvoiceDocumentDataAreaType);
					
					CommunicationsInvoiceEBSProxy.
					createInvoiceDocument(createInvoiceDocumentEBM);
					

//					System.out.println(response.getEBMHeader().getCustom().getResponseHeader().getReturnMessage());
					
					
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
			
				
				
		
	}

}
