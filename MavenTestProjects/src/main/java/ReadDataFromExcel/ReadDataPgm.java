package ReadDataFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataPgm {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static FileInputStream fis;
	
	public static String getStringData(int a,int b) throws IOException {
		
		fis =new FileInputStream("C:\\excel\\testData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("data");
				
		Row r = sheet.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
		
		
	}

public static double getNumData(int a,int b) throws IOException {
		
		fis =new FileInputStream("C:\\excel\\testData.xlsx");
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("data");
				
		Row r = sheet.getRow(a);
		Cell c=r.getCell(b);
		return c.getNumericCellValue();
		
		
		
	}
}
