
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.formula.functions.Substitute;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;

import br.com.gruposervices.connection.ConectaBanco;

public class App2 {

	
	 public static void main(String[] args) throws IOException {
		
		 Long tempoInicial = System.currentTimeMillis();
		 
		 BufferedInputStream buf = new BufferedInputStream(
                 new FileInputStream("C:\\startcode\\TabulacoesAssessorias.xls"));
		 
		 POIFSFileSystem fileSystem = new POIFSFileSystem(buf);
		 HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
		 
		 HSSFSheet sheet = workbook.getSheetAt(0);
		 
		 java.util.Iterator<Row> linhas = sheet.rowIterator();
		 
		 
          RelatorioVO relatorio = new RelatorioVO();
          
          
          Connection con = null;
			 java.sql.Statement statement = null;
			 
			  try {
				  con = ConectaBanco.getConectaBanco();
				statement = con.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          
          
          
		 
		 while (linhas.hasNext()) {
			 HSSFRow linha = (HSSFRow) linhas.next();
             java.util.Iterator<Cell> celulas = linha.cellIterator();
             
             while (celulas.hasNext()) {
            	 HSSFCell celula = (HSSFCell) celulas.next();
                 int z = celula.getColumnIndex();
                 
                 System.out.println("NUMERO DA COLUNA: " + z);
                 
                 System.out.println("NUMERO DA LINHA: " + linha.getRowNum());
                 System.out.println("TEXTO DA LINHA: " + celula.toString());
                 
                 
               
                 
                 if(linha.getRowNum() != 0){
                	 System.out.println("Não é cabecalho");
                 
	                switch (z) {
	     				case 0:
	     					System.out.println("Coluna Ilha");
	     					relatorio.setIlha(celula.toString());
	     					break;
	     				
	     				case 1:
	     					System.out.println("Coluna operador");
	     					String operador=""; 
	     					
	     					if(celula.toString().contains(".")){
	     						 operador = celula.toString().replace(".", "");
		     					operador = operador.substring( 0 , operador.length() -1);
	     					}else{
	     						operador.toString();
	     					}
	     					
	     					relatorio.setOperador(operador);
	     					break;
	     					
	     				case 2:
	     					System.out.println("Coluna nome");
	     					relatorio.setNome(celula.toString());
	     					break;
	     					
	     				case 3:
	     					System.out.println("Coluna supervisor");
	     					relatorio.setSupervisor(celula.toString());
	     					break;	
	                      
	     				case 4:
	     					System.out.println("Coluna cpf");
	     					String cpf = "";
	     					if(celula.toString().contains(".")){
	     						cpf = celula.toString().replace(".", "");
	     					}else{
	     						cpf.toString();
	     					}
	     					
	     					relatorio.setCpf(cpf);
	     					break;
	     					
	     				case 5:
	     					System.out.println("Coluna tabulacao");
	     					relatorio.setTabulacao(celula.toString());
	     					break;
	     					
	     				case 6:
	     					System.out.println("Coluna data");
	     					relatorio.setData(celula.getDateCellValue());
	     					break;
	     				
	     				case 7:
	     					System.out.println("Coluna hora");
	     					
	     					
	     					relatorio.setHora(celula.getDateCellValue());
	     					break;
	     					
	     				case 8:
	     					System.out.println("Coluna status");
	     					relatorio.setStatus(celula.toString());
	     					break;
	     				
	     				case 9:
	     					System.out.println("Coluna status2");
	     					relatorio.setStatus2(celula.toString());
	     					break;
	     					
	                  case 10:
	     					System.out.println("Coluna TMO");
	     					relatorio.setTmo(celula.getDateCellValue());
	     					break;
	     					
	                  case 11:
	     					System.out.println("Coluna telefone");
	     					String telefone = "";
	     					
	     					if(celula.toString().contains(".")){
	     						telefone = celula.toString().replace(".", "");
	     					}else{
	     						telefone.toString();
	     					}
	     					
	     					relatorio.setTelefone(telefone);
	     					break;
	                  case 12:
	     					System.out.println("Coluna email");
	     					relatorio.setEmail(celula.toString());
	     					break;
	                  
	                  case 13:
	     					System.out.println("Coluna produto");
	     					relatorio.setProduto(celula.toString());
	     					
	     					break;
	                  
	                  case 14:
	     					System.out.println("Coluna digital");
	     					
	     					String digital = "";
	     					
	     					if(celula.toString().contains(".")){
	     						digital = celula.toString().replace(".", "");
	     						digital = digital.substring( 0 , digital.length() -1);
	     					}else{
	     						digital.toString();
	     					}
	     					
	     					
	     					
	     					relatorio.setDigital(Integer.parseInt(digital));
	     					break;
	                      }  
                    }
                 
                 
                 
               }
//             lista.add(relatorio);
             System.out.println(relatorio.toString());
             AdicionaBancoObjetoComConexao(relatorio,con,statement);
             
            
		 }
//		 AdicionaBanco(lista);
//		 System.out.println(lista.size());
		 long elapsed = System.currentTimeMillis() - tempoInicial;
		 
		 System.out.println("Fim de Execução Tempo : " + elapsed);
	 }
	 
	 
	 
	 
	 private static void AdicionaBancoObjetoComConexao(RelatorioVO obj, Connection con, Statement statement) {
			// TODO Auto-generated method stub
			 
			 try {
				 
				  
				  if(con != null){
					  if(obj.getNome() != null) {
				  
						  String sql = " INSERT INTO [dbo].[Tabulacoes_Para_Assessorias] ( [ILHA] ,  [OPERADOR] ,   [NOME] ,   [SUPERVISOR] ,    [CPF] ,   [TABULACAO] ,    [DATA] , "
							  		+ "   [HORA] ,  [STATUS] ,  [STATUS_2] ,  [TMO] ,  [TELEFONE] ,  [EMAIL] ,   [PRODUTO] ,  [DIGITAL] ,   [Usuario_Gerador]  ) VALUES  "
							  		+ "( ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ? ,"
							  		+ " ?  )";			
								System.out.println(sql);
								
								PreparedStatement prstm = con.prepareStatement(sql);
								prstm.setString(1, obj.getIlha());
								prstm.setString(2,obj.getOperador());
								prstm.setString(3, obj.getNome());
								prstm.setString(4,obj.getSupervisor());
								prstm.setString (5,obj.getCpf());
								prstm.setString(6, obj.getTabulacao());
								
								SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy"); 
								String data = out.format(obj.getData());
								
								prstm.setString(7, data);
								
								
								SimpleDateFormat out2 = new SimpleDateFormat("HH:mm:ss"); 
								String hora = out2.format(obj.getHora());
								
								
								prstm.setString(8, hora);
								
								prstm.setString(9,obj.getStatus());
								prstm.setString(10, obj.getStatus2());
								
								
								
								SimpleDateFormat out3 = new SimpleDateFormat("HH:mm:ss"); 
								String horaTmo = out3.format(obj.getTmo());
								
								prstm.setString(11, horaTmo);
								prstm.setString(12, obj.getTelefone());
								prstm.setString(13, obj.getEmail());
								prstm.setString(14,obj.getProduto());
								prstm.setInt(15, obj.getDigital());
								prstm.setString(16, "santana1.jonathan");
								
								
								prstm.execute();
								prstm.close();
					  }	
				  }				
			 } catch (SQLException e) {
					// TODO: handle exception
					e.printStackTrace();
					System.out.println(e);
			 }
			
		}

//	private static void AdicionaBancoObjeto(RelatorioVO obj) {
//		// TODO Auto-generated method stub
//		 
//		 try {
//			 
//			 Connection con = null;
//			 java.sql.Statement statement = null;
//			 
//			 con = new ConectaBanco().getConectaBanco();
//			  statement = con.createStatement();
//			  
//			  if(con != null){
//				  if(obj.getNome() != null) {
//			  
//					  String sql = " INSERT INTO [dbo].[Tabulacoes_Para_Assessorias] ( [ILHA] ,  [OPERADOR] ,   [NOME] ,   [SUPERVISOR] ,    [CPF] ,   [TABULACAO] ,    [DATA] , "
//						  		+ "   [HORA] ,  [STATUS] ,  [STATUS_2] ,  [TMO] ,  [TELEFONE] ,  [EMAIL] ,   [PRODUTO] ,  [DIGITAL] ,   [Usuario_Gerador]  ) VALUES  "
//						  		+ "( ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ? ,"
//						  		+ " ?  )";			
//							System.out.println(sql);
//							
//							PreparedStatement prstm = con.prepareStatement(sql);
//							prstm.setString(1, obj.getIlha());
//							prstm.setString(2,obj.getOperador());
//							prstm.setString(3, obj.getNome());
//							prstm.setString(4,obj.getSupervisor());
//							prstm.setString (5,obj.getCpf());
//							prstm.setString(6, obj.getTabulacao());
//							
//							SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy"); 
//							String data = out.format(obj.getData());
//							
//							prstm.setString(7, data);
//							
//							
//							SimpleDateFormat out2 = new SimpleDateFormat("HH:mm:ss"); 
//							String hora = out2.format(obj.getHora());
//							
//							
//							prstm.setString(8, hora);
//							
//							prstm.setString(9,obj.getStatus());
//							prstm.setString(10, obj.getStatus2());
//							
//							
//							
//							SimpleDateFormat out3 = new SimpleDateFormat("HH:mm:ss"); 
//							String horaTmo = out3.format(obj.getTmo());
//							
//							prstm.setString(11, horaTmo);
//							prstm.setString(12, obj.getTelefone());
//							prstm.setString(13, obj.getEmail());
//							prstm.setString(14,obj.getProduto());
//							prstm.setInt(15, obj.getDigital());
//							prstm.setString(16, "santana1.jonathan");
//							
//							
//							prstm.execute();
//							prstm.close();
//				  }	
//			  }				
//		 } catch (SQLException e) {
//				// TODO: handle exception
//				e.printStackTrace();
//				System.out.println(e);
//		 }
//		
//	}

//	private static void AdicionaBanco(List<RelatorioVO> lista) {
//		// TODO Auto-generated method stub
//		Connection con = null;
//		 java.sql.Statement statement = null;
//		 
//		 
//		 try {
//			 
//			 
//			 
//			 con = new ConectaBanco().getConectaBanco();
//			  statement = con.createStatement();
//			  
//			 if(con != null){
//				  for (RelatorioVO obj : lista) {
//					  if(obj.getNome() != null) {
//
//						  String sql = " INSERT INTO [dbo].[Tabulacoes_Para_Assessorias] ( [ILHA] ,  [OPERADOR] ,   [NOME] ,   [SUPERVISOR] ,    [CPF] ,   [TABULACAO] ,    [DATA] , "
//					  		+ "   [HORA] ,  [STATUS] ,  [STATUS_2] ,  [TMO] ,  [TELEFONE] ,  [EMAIL] ,   [PRODUTO] ,  [DIGITAL] ,   [Usuario_Gerador]  ) VALUES  "
//					  		+ "( ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ? ,"
//					  		+ " ?  )";			
//						System.out.println(sql);
//						
//						PreparedStatement prstm = con.prepareStatement(sql);
//						prstm.setString(1, obj.getIlha());
//						prstm.setString(2,obj.getOperador());
//						prstm.setString(3, obj.getNome());
//						prstm.setString(4,obj.getSupervisor());
//						prstm.setString(5,obj.getCpf());
//						prstm.setString(6, obj.getTabulacao());
//						
//						SimpleDateFormat out = new SimpleDateFormat("dd/MM/yyyy"); 
//						String result = out.format(obj.getData());
//						
//						prstm.setString(7, result);
//						prstm.setString(8, obj.getHora());
//						prstm.setString(9,obj.getStatus());
//						prstm.setString(10, obj.getStatus2());
//						prstm.setString(11,obj.getTmo());
//						prstm.setString(12, obj.getTelefone());
//						prstm.setString(13, obj.getEmail());
//						prstm.setString(14,obj.getProduto());
//						prstm.setInt(15, obj.getDigital());
//						prstm.setString(16, "santana1.jonathan");
//						
//						
//						prstm.execute();
//						prstm.close();
//					 
//				}else{
//					System.out.println("Vazio não inserir");
//				}
//			  }
//			 }
//			
//			 
//			 
//			 
//			  
//			 
//		 } catch (SQLException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(e);
//			
//		}
//	}
}
