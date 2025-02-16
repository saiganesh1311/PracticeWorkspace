package PracticeSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	
	public void getData() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream("C:\\SeleniumSS\\Cricketers.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet s= wb.getSheet("India");
		s.getRow(3).getCell(3).setCellValue("BUMRAH");
		FileOutputStream fos= new FileOutputStream("C:\\SeleniumSS\\Cricketers.xlsx");
		wb.write(fos);
	}

	
	

}
