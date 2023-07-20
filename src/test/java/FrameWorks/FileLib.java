package FrameWorks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	public String readExcelData(String excelpath, String SheetName, int row, int cell) throws Throwable {
		FileInputStream fis =new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		String excelValue=wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return excelValue;
	}
	
	// get LastRow Count because to print Loop last value we have to know the last value
	
	public int getLastRow(String excelpath, String SheetName) throws Throwable {
		
		FileInputStream fis =new FileInputStream(excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		int rowCount=wb.getSheet(SheetName).getLastRowNum();
		return rowCount;
	}
	// write Data in excel
	public void writeExcelData(String excelpath, String SheetName, int row, int cell, String data) throws Throwable {
		FileInputStream fis= new FileInputStream(excelpath);
		Workbook wb =WorkbookFactory.create(fis);
		wb.getSheet(SheetName).getRow(row).createCell(cell).setCellValue(data);
		FileOutputStream fos= new FileOutputStream(excelpath);
		wb.write(fos);
	}
	
	public String readPropertyData(String proppath, String key) throws Throwable {
		
		FileInputStream fis= new FileInputStream(proppath);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String Propvalue=prop.getProperty(key, "Incorrectkey");
		return Propvalue;
	}
}
