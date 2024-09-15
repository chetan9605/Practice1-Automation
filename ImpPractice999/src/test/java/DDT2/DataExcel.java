package DDT2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataExcel {
	
	public static FileInputStream fi;
	
	public static XSSFWorkbook wb;
	
	public static XSSFSheet sh;
	
	
	
	@DataProvider(name="MyShop")
	public Object[][] getMyShopExcelData() throws IOException
	{
		Object [] [] data=DataExcel.readDataForMyShop("Sheet1");
		 
		return data;
	}
	
	
	public static  Object[][] readDataForMyShop(String sheetName) throws IOException
	{
		fi=new FileInputStream("C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\ExcelData\\Data.xlsx");
		wb=new XSSFWorkbook(fi);
		sh=wb.getSheet(sheetName);
		int rows=sh.getLastRowNum();
		int cols=sh.getRow(0).getLastCellNum();
		
		Object [][] data=new Object[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			XSSFRow row = sh.getRow(i+1);
			
			for(int j=0;j<cols;j++)
			{
				XSSFCell cell = row.getCell(j);
				
		            data[i][j] =cell.toString();
			}
		}
		
		return data;
		
	}
	
	

}
