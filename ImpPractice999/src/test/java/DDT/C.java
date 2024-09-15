package DDT;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class C {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\TestData\\NewExcel.xlsx");

		XSSFWorkbook wb=new XSSFWorkbook();
		
		XSSFSheet sh = wb.createSheet("NewSheet");
		
		XSSFRow row1 = sh.createRow(0);
		
		row1.createCell(0).setCellValue("Chetan");
		
		row1.createCell(1).setCellValue("777");
		
		row1.createCell(2).setCellValue("Automation");
		
		XSSFRow row2 = sh.createRow(1);
		
		row2.createCell(0).setCellValue("Arjun");
		
		row2.createCell(1).setCellValue("999");
		
		row2.createCell(2).setCellValue("Manual Testing");
		
		wb.write(fos);
		
		wb.close();
		
		fos.close();
		
		
		
		
		
	}

}
