package practice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;

import genericUtility.ExcelUtility;

public class FetchingDataFromExcelFile 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		FileInputStream fis = new FileInputStream("D:\\Abhijna\\TestDataWorksheet.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
//		Row r = sh.getRow(4);
//		Cell c = r.getCell(1);
//		String value = c.getStringCellValue();
//		DataFormatter df = new DataFormatter();
//		String values = df.formatCellValue(c);
		ExcelUtility eUtil = new ExcelUtility();
		String value1 = eUtil.getSingleCellDataFromExcel("Animal", 1, 1);
		String value2 = eUtil.getSingleCellDataFromExcel("Fish", 2, 2);
		System.out.println(value1);
		System.out.println(value2);
			
	}
	

}
