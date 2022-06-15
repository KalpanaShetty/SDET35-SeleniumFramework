package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromNextCell 
{

	public static void main(String[] args) throws Throwable {
		FileInputStream fis= new FileInputStream("./Data/DataDrivenExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		//get the last used row count
		int count = sh.getLastRowNum();
		System.out.println(count);
		for (int i = 1; i < count; i++) {
			Row row = sh.getRow(i);
			String firstColoumnData = row.getCell(0).getStringCellValue();
			String secondColoumnData = row.getCell(1).getStringCellValue();
			System.out.println(firstColoumnData + "\t"+secondColoumnData);
		}

	}

}
