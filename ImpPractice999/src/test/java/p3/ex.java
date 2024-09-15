package p3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ex {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\Excel\\F1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheet("Sheet1");
		
		int row = sh.getLastRowNum();
		
		int cell = sh.getRow(0).getLastCellNum();
		
		System.out.println(row);
		
		System.out.println(cell);
		
		
		for(int r=0;r<row;r++)
		{
			       XSSFRow CurrentRow = sh.getRow(r);
			
			for(int c=0; c<cell;c++)
			{
				XSSFCell CurrentCell = CurrentRow.getCell(c);
				
				System.out.print(CurrentCell.toString() + "\t");
			}
			
			System.out.println();
		}
		
		wb.close();
		fis.close();
		
		
	}

}
