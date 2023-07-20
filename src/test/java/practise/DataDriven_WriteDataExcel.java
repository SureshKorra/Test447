package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataDriven_WriteDataExcel {

	public static void main(String[] args) throws Throwable {


		// open file in Read mode
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Suresh\\eclipse-workspace\\myProject\\src\\test\\resources\\data\\input.xlsx");
       Workbook wb= WorkbookFactory.create(fis);
       
   Sheet sh=wb.getSheet("Sheet1");
   Row r=sh.getRow(9);
 
   Cell c=r.createCell(1);
   c.setCellValue("Writing in excel create cell");
   
   // file should write mode
   
   FileOutputStream fos=new FileOutputStream("C:\\Users\\Suresh\\eclipse-workspace\\myProject\\src\\test\\resources\\data\\input.xlsx");
   wb.write(fos);
   
   System.out.println("writing done notation");
       
       
	}

}
