package com.datadrivern;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_All_Data {

	
	public static void all_Data() throws IOException{
		
		File f = new File("C:\\Users\\Tharani\\eclipse-workspace\\Oct31_Mvn_Project\\Sample_Sheet_For_Read.xlsx");
	
		FileInputStream fis= new FileInputStream(f);
	
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheetAt(0);
		
		for(int i=0; i<s.getPhysicalNumberOfRows(); i++)
		{
			Row r = s.getRow(i);
			
			for(int j=0; j<r.getPhysicalNumberOfCells(); j++)
			{
				Cell c = r.getCell(j);
				
				CellType cType = c.getCellType();
				
				if(cType.equals(CellType.STRING))
				{
					String value = c.getStringCellValue();
					
					System.out.print(" " +value);
				}
				
				else if(cType.equals(CellType.NUMERIC))
				{
					double d = c.getNumericCellValue();
					
					int a = (int)d;
					
					String value = String.valueOf(a);
					
					System.out.print(" "+value);
				}
			}
			System.out.println();
		}
		
		wb.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		all_Data();
	}
}
