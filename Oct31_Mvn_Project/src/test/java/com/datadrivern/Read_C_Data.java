package com.datadrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_C_Data {

	public static void particular_Cell_Data() throws IOException {
		
		File f = new File ("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Sample_Sheet_For_Read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		Row r = s.getRow(3);
		
		Cell c = r.getCell(1);
		
		System.out.println("Particular Cell Data: ");
		
		CellType ctype = c.getCellType();
		
		if(ctype.equals(CellType.STRING))
		{
			String value = c.getStringCellValue();
			System.out.println(value);
		}
		
		else if(ctype.equals(CellType.NUMERIC))
		{
			double d = c.getNumericCellValue();
			
			int i =(int) d;
			
			String value = String.valueOf(i);
			
			System.out.println(value);
		}
		
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		particular_Cell_Data();
	}
}
