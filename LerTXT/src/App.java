import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import model.CreateFile;
import bean.InfoVO;


public class App {
	
	
	public static void main(String[] args) {
		System.out.println("iniciando");
		
//		FileInputStream stream;
		try {
//			stream = new FileInputStream("C:/arquivos/ORA_TESTE_RTPR_D_30JUN16_MAILING+TESTE.txt");
//			InputStreamReader reader = new InputStreamReader(stream);
//			BufferedReader br = new BufferedReader(reader);
//			
//			String linha;
//			linha = br.readLine();
			
			
//			while (linha != null) {
//				String campanha = linha.substring(0, linha.indexOf('|'));
//				 String data = linha.substring(linha.indexOf('|') + 1, linha.lastIndexOf('|'));
//				
//				System.out.println(campanha  + data);
//				linha = br.readLine();
//			}
			
			
			
			InfoVO obj = new InfoVO();
			
			List<InfoVO> lista = new ArrayList<InfoVO>();
			
			
			Scanner scanner2 = new Scanner(new FileReader("C:/arquivos/ORA_TESTE_RTPR_D_30JUN16_MAILING+TESTE.txt"));
			Scanner scanner = scanner2.useDelimiter("\\||\\n");
				while (scanner.hasNext()) {
				
				obj.setCampanha(scanner.next());
				obj.setDataExport(scanner.next());
				obj.setDataVigencia(scanner.next());
				obj.setNomeCliente(scanner.next())	;
				obj.setRegistroCliente(scanner.next());
				obj.setNumCPF(scanner.next());
				obj.setTel1(scanner.next());
				obj.setTel2(scanner.next());
				obj.setTel3(scanner.next());
				obj.setTel4(scanner.next());
				obj.setTel5(scanner.next());
				obj.setTel6(scanner.next());
				obj.setTel7(scanner.next());
				obj.setTel8(scanner.next());
				obj.setTel9(scanner.next());
				obj.setTel10(scanner.next());
				obj.setSegmentoPacote(scanner.next());
				obj.setPriMotivo(scanner.next());
				obj.setUltMotivo(scanner.next());
				obj.setDataCancelamento(scanner.next());
				obj.setDataSolicitacao(scanner.next());
				obj.setCidade(scanner.next());
				obj.setUf(scanner.next());
				obj.setDataInstalacao(scanner.next());
				obj.setFormaPagamento(scanner.next());
				obj.setFlagScob(scanner.next());
				obj.setFlagFidelidade(scanner.next());
				obj.setScore(scanner.next());
				obj.setAtritado(scanner.next());
				obj.setReincidente(scanner.next());
				obj.setQuartis(scanner.next());
				obj.setRetencao(scanner.next());
				obj.setFl_bl(scanner.next());
				obj.setPostecipado(scanner.next());
				obj.setEquipamento(scanner.next());
				
				System.out.println(obj.toString());
				lista.add(obj);
				}
				
				SimpleDateFormat formatoData = new SimpleDateFormat("ddMMyyyy_HHmmss");
				Calendar data = Calendar.getInstance();
				 String dataHora = formatoData.format(data.getTime());
				
				String nomeArquivo = "Layout10"+"_"+dataHora;
				String nomeArquivo2 = "Layout16"+"_"+dataHora;
				String nomeArquivo3= "Layout30"+"_"+dataHora;
				
				CreateFile.CreateLayout10(nomeArquivo,lista);
				CreateFile.CreateLayout30(nomeArquivo2,lista);
				CreateFile.CreateLayout16(nomeArquivo3,lista);
				
				
				
				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
