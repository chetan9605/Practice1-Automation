package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis=new FileInputStream("C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\TestData\\data.xlsx.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int row = ws.getLastRowNum();
		
		int totalCells = ws.getRow(1).getLastCellNum();
		
		System.out.println("no. of rows " + row);
		
		System.out.println("no. of totalCell " + totalCells);
		
		for(int r=0;r<=row;r++)
		{
			XSSFRow currentRow = ws.getRow(r);
			
			for(int c=0;c<totalCells;c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				
				System.out.print(cell.toString() + "\t");
			}
			
			System.out.println();
		}
		
		wb.close();
		
		fis.close();

	}

}
