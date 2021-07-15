package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("C:\\Users\\CHASHAIK\\Desktop\\ExcelSheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
	int sheets	=workbook.getNumberOfSheets();
	for(int i=0;i<sheets;i++)
	{
		if(workbook.getSheetName(i).equalsIgnoreCase("LoginTestData"));
		{
			XSSFSheet	sheet=	workbook.getSheetAt(i);
		}
	}
	
	}

}
