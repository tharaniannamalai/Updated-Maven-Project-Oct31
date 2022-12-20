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

public class Read_Particular_Rdata {
	
	public static void particular_Row_Data() throws IOException
	{
		File f = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Sample_Sheet_For_Read.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		System.out.println("Print Particular Row Details\n");
		
		Row r = s.getRow(4);
		
		for(int i=0; i<r.getPhysicalNumberOfCells(); i++)
		{
				Cell c = r.getCell(i);
				
				CellType ctype = c.getCellType();
				
				if(ctype.equals(CellType.STRING))
				{
					String value = c.getStringCellValue();
					
					System.out.print(value);
				}
				
				else if(ctype.equals(CellType.NUMERIC))
				{
					double d = c.getNumericCellValue();
					
					int a = (int) d;
					
					String value = String.valueOf(a);
					
					System.out.print(value);
				}
			}
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		particular_Row_Data();
	}
}
