package p3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class p3 {
	
	public static void main(String[] args) throws IOException {
		
	
	
	FileInputStream fis=new FileInputStream("C:\\Auto2\\MyWorkplace\\ChetanAutomation\\ImpPractice999\\p.properties");
   
	Properties p=new Properties();
	
	p.load(fis);
	
	String naam = p.getProperty("name");
	
	System.out.println(naam);
	
	String j=p.getProperty("job");
	
	System.out.println(j);
	
	String pa=p.getProperty("package");
	
	System.out.println(pa);
}
	
}
