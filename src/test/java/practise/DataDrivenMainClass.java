package practise;

public class DataDrivenMainClass {

	public static void main(String[] args) throws Throwable {
		
		FileLib flib=new FileLib();
	int rc=	flib.getLastRow("C:\\Users\\Suresh\\eclipse-workspace\\myProject\\src\\test\\resources\\data\\input.xlsx", "Sheet1");
		
		for (int i = 0; i <=rc; i++) {
		String value=flib.readExcelData("C:\\Users\\Suresh\\eclipse-workspace\\myProject\\src\\test\\resources\\data\\input.xlsx", "Sheet1", i, 1);
			System.out.println(value);
			
			flib.writeExcelData("C:\\Users\\Suresh\\eclipse-workspace\\myProject\\src\\test\\resources\\data\\input.xlsx", "Sheet1", i, 1, "abc det");
		}
	}

}
