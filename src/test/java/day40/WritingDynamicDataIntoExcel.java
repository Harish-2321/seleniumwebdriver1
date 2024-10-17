package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");
		
	XSSFWorkbook  workbook =new XSSFWorkbook();
		
	XSSFSheet sheet=workbook.createSheet("DynamicData");

	Scanner sc =new Scanner(System.in);
	System.out.println("enter how many rows");
	int noOfrows=sc.nextInt();	
	
	System.out.println("enter how many cells");
	int noOfCells=sc.nextInt();	
	
	for (int r=0;r<=noOfrows;r++)
	{
		XSSFRow	currentrow=sheet.createRow(r);
		for(int c=0;c<noOfCells;c++)
		{
	XSSFCell cell=currentrow.createCell(c);
	cell.setCellValue(sc.next());
		}
	}
	
	workbook.write(file);  // attach workbook to the file
	workbook.close();
	file.close();
		
		System.out.println("file is created");
		
		
		
		
		
		}
	
	
	
	
	
	
}
