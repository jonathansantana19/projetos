import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class App {
	
	
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("-------------- Iniciando Leitura do Arquivo");
		
//			Workbook workbook = Workbook.getWorkbook(new File("C:\\startcode\\jxlrwtest.xls"));
			
			 FileInputStream arquivo = new FileInputStream(new File("C:\\startcode\\jxlrwtest.xls"));
			
			 System.out.println("-------------- Arquivo Encontrado");
			 
			HSSFWorkbook workbook = new HSSFWorkbook(arquivo);
			
			HSSFSheet sheetAba = workbook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheetAba.iterator();
			
			
			while (rowIterator.hasNext()) {
				Row row = (Row) rowIterator.next();
				
			}
			
//			for (int i = 0; i < linhas; i++) {
//				Cell a1 = sheet.getCell(0,i);
//				Cell a2 = sheet.getCell(1,i);
//				Cell a3 = sheet.getCell(2,i);
//				
//				String as1 = a1.getContents().toString();
//				
//				System.out.println(as1);
//				
//				String as2 = a2.getContents().toString();
//				System.out.println(as2);
//				
//				String as3 = a3.getContents().toString();
//				System.out.println(as3);
//			}
//			
//			
//			
//
//			
//			
//		} catch (BiffException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
