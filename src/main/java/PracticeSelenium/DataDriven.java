package PracticeSelenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genericUtility.IConstantUtility;

public class DataDriven {
	public static void main(String args[]) throws IOException
	{
		    FileInputStream fis= new FileInputStream("C:\\SeleniumSS\\test.properties");
			Properties p= new Properties();
			p.load(fis);
			String ans= p.getProperty("url");
			System.out.println(ans);
			
		
		
	}
}
