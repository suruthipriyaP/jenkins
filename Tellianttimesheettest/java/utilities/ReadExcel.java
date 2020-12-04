package utilities;
import baseclass.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel extends test {
	public static XSSFWorkbook wb1=null;
	public static Sheet sh =null;
	public static void ReadExcelvalue() throws Exception {
		File excel = new File(System.getProperty("user.dir") + "//ObjectRepo//testData.xlsx");
		FileInputStream inputfile = new FileInputStream(excel);
		 wb1 = new XSSFWorkbook(inputfile);
//		Sheet sh = wb1.getSheet("Time");
//		System.out.println(sh.getSheetName());
//		System.out.println(sh.getPhysicalNumberOfRows());
	//int data=(int)wb1.getSheetAt(0).getRow(7).getCell(2).getNumericCellValue();
//	String data=(String)wb1.getSheetAt(0).getRow(7).getCell(2).getStringCellValue();
	//System.out.println(""+data);
//driver.findElement(By.xpath("//*[@class='timesheet-cell ']")).click();
	//driver.findElement(By.xpath(prop.getProperty("mon"))).sendKeys(""+data);
//int data=(int)wb1.getSheetAt(0).getRow(1).getCell(2).getNumericCellValue();	System.out.println();

		

}
}