package genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String s,int r, int c ) throws IOException
	{
		FileInputStream fis= new FileInputStream(IConstantUtility.excel);
		Workbook wb= WorkbookFactory.create(fis);
		Cell ans= wb.getSheet(s).getRow(r).getCell(c);
		DataFormatter df= new DataFormatter();
		String value= 	df.formatCellValue(ans);
		return value;
		
	}

}
