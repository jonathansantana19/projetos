package br.com.services.main;

import java.rmi.RemoteException;

import javax.management.Query;

import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.EBMHeaderType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.FaultType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryCriteriaType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.QueryExpressionType;
import com.oracle.xmlns.EnterpriseObjects.Core.Common.V2.ValueExpressionType;
import com.oracle.xmlns.EnterpriseObjects.Core.Custom.Common.V2.CustomEBMHeaderType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.DebtInstallmentComplexQueryType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListDataAreaType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListEBMType;
import com.oracle.xmlns.EnterpriseObjects.Core.EBO.Invoice.V3.QueryDebtInstallmentDetailListResponseEBMType;
import com.oracle.xmlns.EnterpriseServices.Core.Invoice.V3.CommunicationsInvoiceEBSProxy;

import br.com.sky.www.ArchitectureSchemas.InteroperabilityHeaderType;

public class App3 {
	
	public static void main(String[] args) throws FaultType, RemoteException {
		
		//TESTANDO WEB SERVICE 	
		CommunicationsInvoiceEBSProxy CommunicationsInvoiceEBSProxy = new CommunicationsInvoiceEBSProxy();
		
		
		
		QueryDebtInstallmentDetailListEBMType queryDebtInstallmentDetailListEBMType = new QueryDebtInstallmentDetailListEBMType();
		
		EBMHeaderType eBMHeader = new EBMHeaderType();
		
		CustomEBMHeaderType custom = new CustomEBMHeaderType();
		custom.setInteroperabilityHeader(new InteroperabilityHeaderType("ICARE", "ICARE"));
		
		
		eBMHeader.setCustom(custom);
		queryDebtInstallmentDetailListEBMType.setEBMHeader(eBMHeader);
		
		
		QueryDebtInstallmentDetailListDataAreaType[] dataArea = new QueryDebtInstallmentDetailListDataAreaType[1];
		
		DebtInstallmentComplexQueryType query = new DebtInstallmentComplexQueryType();
		
		QueryCriteriaType[] queryCriteria = new QueryCriteriaType[1];
		
		QueryExpressionType queryExpression = new QueryExpressionType();
		
		
		ValueExpressionType[] valueExpressionType  = new ValueExpressionType[2];
		
		String[] errorSoon = new String[1];
		errorSoon[0] = "137086323";
//		errorSoon[1] = "200000897551";
		
		String[] errorSoon1 = new String[1];
		errorSoon1[0] = "200000897551";
		
		valueExpressionType[0] = new ValueExpressionType("InvoiceEBO/InvoiceCustomerParty/CustomerPartyReference/CustomerPartyAccountIdentification/ID", 
				errorSoon);
		
		valueExpressionType[1] = new ValueExpressionType("InvoiceEBO/Custom/PromisePayment/ID", 
				errorSoon1);
		
		
		queryExpression.setValueExpression(valueExpressionType);
			
		
		queryCriteria[0] = new QueryCriteriaType(queryExpression);
		
		query.setQueryCriteria(queryCriteria);
		
		
		dataArea[0] = new QueryDebtInstallmentDetailListDataAreaType(query);
		
		
//		//FECHA TAG AREA
		queryDebtInstallmentDetailListEBMType.setDataArea(dataArea);
		
		QueryDebtInstallmentDetailListResponseEBMType resp = CommunicationsInvoiceEBSProxy.queryDebtInstallmentDetailList(queryDebtInstallmentDetailListEBMType);
		
		System.out.println(resp.getEBMHeader().getCustom().getResponseHeader().getReturnMessage());
		
		
		System.out.println(resp.getDataArea(0).getQueryDebtInstallmentDetailListResponse().
				getCustom().getBankPayableDocument().getBarCode().get_value());
		
		System.out.println(resp.getDataArea(0).getQueryDebtInstallmentDetailListResponse().
				getCustom().getDebtInstallmentDetail(0).getInstallmentAmount());
		
	}

}
