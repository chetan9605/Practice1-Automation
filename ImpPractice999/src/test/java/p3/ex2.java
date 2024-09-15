package p3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\Excel\\F2.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("data");
		
		XSSFRow row1 = sh.createRow(0);
		
		row1.createCell(0).setCellValue("Chetan");
		
		row1.createCell(1).setCellValue("C");
		
		row1.createCell(2).setCellValue("Bante");
		
		
		XSSFRow row2 = sh.createRow(1);
		
		row2.createCell(0).setCellValue("java");
		
		row2.createCell(1).setCellValue("selenium");
		
		row2.createCell(2).setCellValue("manual");
		
		wb.write(fos);
		
		wb.close();
		
		fos.close();
		
		
	}
	
	
	

}
