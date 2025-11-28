package practice;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;

import genericUtility.ExcelUtility;

public class FetchingDataFromMultipleCell
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		FileInputStream fis = new FileInputStream("D:\\Abhijna\\TestDataWorksheet.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Insects");
//		int lastRowNum = sh.getLastRowNum();
//		DataFormatter df = new DataFormatter();
//		for (int i=1; i<=lastRowNum; i++)
//		{
//			Row r = sh.getRow(i);
//			int lastCellNum = r.getLastCellNum();
//			for (int j=0; j<lastCellNum; j++)
//			{
//				Cell c = r.getCell(j);
//				String value = df.formatCellValue(c);
//				System.out.print(value + " ");
//			}
//			System.out.println();
//		}
		ExcelUtility eUtil = new ExcelUtility();
		ArrayList<String> value1 = eUtil.getMultipleCellDataFromExcel("Insects", 1, 0);
		System.out.println(value1);
	}

}
