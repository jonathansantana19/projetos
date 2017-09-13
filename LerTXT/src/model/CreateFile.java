package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import bean.InfoVO;

public class CreateFile {

	private static FileWriter arq ;
	private static PrintWriter gravarArq;
	
	
	public static void CreateLayout10(String nomeArquivo, List<InfoVO> lista) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando Metodo");
		
		
		try {
			File f = new File("C://arquivos//"+nomeArquivo+".txt");
			arq = new FileWriter(f);
			gravarArq = new PrintWriter(arq);
			
			
			for (InfoVO obj : lista) {
				gravarArq.print(23+ ";");
				gravarArq.print(10+ ";");
				gravarArq.print(obj.getNumCPF()+ ";");
				gravarArq.print(obj.getNomeCliente()+ ";");
				gravarArq.print(";"); //ENDERECO
				gravarArq.print(";"); //COMPL_ENDE_CLI
				gravarArq.print(";"); //BAIRRO_CLI
				gravarArq.print(obj.getCidade());
				gravarArq.print(obj.getUf());
				gravarArq.print(";"); //CEP_CLI
				gravarArq.print(obj.getTel1());
				gravarArq.print(obj.getTel2());
				gravarArq.print(";"); //EMPRESA
				gravarArq.print(";"); //ENDERECO_COMERCIAL
				gravarArq.print(";"); //COMPL_COMERCIAL
				gravarArq.print(";"); //BAIRRO_COMERCIAL
				gravarArq.print(";"); //CIDADE_COMERCIAL
				gravarArq.print(";"); //UF_COMERCIAL
				gravarArq.print(";"); //CEP_COMERCIAL
				gravarArq.print(";"); //FONE1_COMERCIAL
				gravarArq.print(";"); //FONE2_COMERCIAL
				gravarArq.print(obj.getCampanha()+";"); //TIPO_CONTRATO
				gravarArq.print(1+";"); //FILIAL
				gravarArq.print(obj.getRegistroCliente()+";"); //CONTRATO
				gravarArq.print(obj.getSegmentoPacote()+";");
				gravarArq.print(obj.getDataCancelamento()+";"); //FILIAL
				gravarArq.print(1+";");
				gravarArq.print(1+";");
				gravarArq.print(1+";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.print(";");
				gravarArq.println(";");
			}
			
			arq.close();
			
			System.out.println("Fim de Metodo");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ocorreu um erro ao gerar"+nomeArquivo  + e);
		}
	}	

	public static void CreateLayout30(String nomeArquivo, List<InfoVO> lista) {
		// TODO Auto-generated method stub
		
		System.out.println("Iniciando Metodo");
		
		
		try {
			File f = new File("C://arquivos//"+nomeArquivo+".txt");
			arq = new FileWriter(f);
			gravarArq = new PrintWriter(arq);
			
			for (InfoVO obj : lista) {
				gravarArq.print(23+ ";");
				gravarArq.print(30+ ";");
				gravarArq.print(obj.getNumCPF()+ ";");
				gravarArq.print(obj.getRegistroCliente()+";"); //CONTRATO
				gravarArq.print(1+";");
				gravarArq.print(obj.getCampanha()+";"); //TIPO_CONTRATO
				gravarArq.print(obj.getDataExport()+";");
				gravarArq.print(obj.getDataVigencia()+";");
				gravarArq.print(obj.getNomeCliente()+ ";");
				gravarArq.print(obj.getRegistroCliente()+";"); //CONTRATO
				gravarArq.print(obj.getNumCPF()+ ";");
				gravarArq.print(obj.getTel1()+";");
				gravarArq.print(obj.getTel2()+";");
				gravarArq.print(obj.getTel3()+";");
				gravarArq.print(obj.getTel4()+";");
				gravarArq.print(obj.getTel5()+";");
				gravarArq.print(obj.getTel6()+";");
				gravarArq.print(obj.getTel7()+";");
				gravarArq.print(obj.getTel8()+";");
				gravarArq.print(obj.getTel9()+";");
				gravarArq.print(obj.getTel10()+";");
				gravarArq.print(obj.getSegmentoPacote()+";");
				gravarArq.print(obj.getPriMotivo()+";");
				gravarArq.print(obj.getUltMotivo()+";");
				gravarArq.print(obj.getDataCancelamento()+";");
				gravarArq.print(obj.getDataSolicitacao()+";");
				gravarArq.print(obj.getCidade()+";");
				gravarArq.print(obj.getUf()+";");
				gravarArq.print(obj.getDataInstalacao()+";");
				gravarArq.print(obj.getFormaPagamento()+"");
				gravarArq.print(obj.getFlagScob()+";");
				gravarArq.print(obj.getFlagFidelidade()+";");
				gravarArq.print(obj.getScore()+";");
				gravarArq.print(obj.getAtritado()+";"); 
				gravarArq.print(obj.getReincidente()+";"); 
				gravarArq.print(obj.getQuartis()+";"); 
				gravarArq.print(obj.getRetencao()+";"); 
				gravarArq.print(obj.getFl_bl()+";"); 
				gravarArq.print(obj.getPostecipado()+";"); 
				gravarArq.println(obj.getEquipamento()+";"); 
				
			}
			arq.close();
			
			System.out.println("Fim de Metodo");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ocorreu um erro ao gerar"+nomeArquivo  + e);
		}
		
	}

	public static void CreateLayout16(String nomeArquivo, List<InfoVO> lista) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando Metodo");
		
		try {
			File f = new File("C://arquivos//"+nomeArquivo+".txt");
			arq = new FileWriter(f);
			gravarArq = new PrintWriter(arq);
			
			for (InfoVO obj : lista) {
				gravarArq.print(23+ ";");
				gravarArq.print(16+ ";");
				gravarArq.print(obj.getNumCPF()+ ";");
				gravarArq.print(1+";");
				gravarArq.print(";"); 
				gravarArq.print(obj.getTel1());
				gravarArq.print(obj.getTel1());
				gravarArq.print(1+";"); 
				gravarArq.print(";"); 
				gravarArq.print(";"); 
				gravarArq.print(";"); 
				gravarArq.print(";"); 
				gravarArq.println(";"); 				
			}
			arq.close();
			
			System.out.println("Fim de Metodo");
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Ocorreu um erro ao gerar"+nomeArquivo  + e);
		}
		
	}

}
