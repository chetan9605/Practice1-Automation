package DDT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class D {
	
	public static FileInputStream fi;
	
	public static FileOutputStream fo;
	
	public static XSSFWorkbook wb;
	
	public static XSSFSheet ws;
	
	public static XSSFRow row;
	
	public static XSSFCell cell;

	
	public static int getRowCount(String xlFile,String xlSheet) throws IOException
	{
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		int row=ws.getLastRowNum();
		wb.close();
		fi.close();
		return row;
	}
	
	
	public static  int getCellCount(String xlFile,String xlSheet,int rownum) throws IOException
	{
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		int cell=row.getLastCellNum();
		wb.close();
		fi.close();
		
		return cell;
		
	}
	
	public static String  getCellData(String xlFile,String xlSheet,int rownum,int colnum) throws IOException
	{
		fi=new FileInputStream( xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		cell=row.getCell(colnum);
		
		String data;
		try {
			
			DataFormatter formatter=new DataFormatter();
			data=formatter.formatCellValue(cell);
			
		} catch (Exception e) {
			data="";
		}
		
		wb.close();
		fi.close();
		return data;
		}
	
	public static void setCellData(String xlFile,String xlSheet,int rownum,int colnum,String data) throws IOException
	{
		fi=new FileInputStream(xlFile);
		wb=new XSSFWorkbook(fi);
		ws=wb.getSheet(xlSheet);
		row=ws.getRow(rownum);
		cell=row.createCell(colnum);
		cell.setCellValue(data);
		fo=new FileOutputStream(xlFile);
		wb.write(fo);
		wb.close();
		fi.close();
		
		
	}
	
}
