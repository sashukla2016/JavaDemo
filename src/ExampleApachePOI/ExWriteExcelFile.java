package ExampleApachePOI;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExWriteExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//new workbook
		XSSFWorkbook wb=new XSSFWorkbook();
		
		//create blank sheet
		XSSFSheet sheet=wb.createSheet("Student Details");
		
		//Enter data
		
		Map<String, Object[]> data=new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"ID","FName","LName"});
		data.put("2", new Object[] {"1","Saumya","Shukla"});
		data.put("3", new Object[] {"2","Patrick","Sharma"});
		
		//Iterate 
		Set<String> keySet=data.keySet();
		int rowNum=0;
		
		for(String key:keySet) {
			
			Row row=sheet.createRow(rowNum++);
			Object[] arr=data.get(key);
			int cellnum=0;
			
			for(Object obj: arr) {
				Cell cell=row.createCell(cellnum++);
				
				if(obj instanceof String) {
					cell.setCellValue((String)obj);
					
				}
				else if(obj instanceof Integer) {
					cell.setCellValue((Integer)obj);
				}
			}
			
			try { 
	            // this Writes the workbook Saumya 
	            FileOutputStream out = new FileOutputStream(new File("D:\\saumya.xlsx")); 
	            wb.write(out); 
	            out.close(); 
	            System.out.println("saumya.xlsx written successfully on disk."); 
	        } 
	        catch (Exception e) { 
	            e.printStackTrace(); 
	        } 
			
			row.removeCell(row.getCell(1));
			System.out.println("cell deleted");
			row.createCell(1);
			row.getCell(1).setCellValue("EEkyness");
			}
		
		wb.close();
	}

}
