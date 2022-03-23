package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Alldata {
	
	public static void All_Data() throws IOException {
		
		File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sample_Maven\\duplicate.xlsx");
		 
		 FileInputStream fis=new FileInputStream(f);
		 
		 Workbook wb=new XSSFWorkbook(fis);
		 
		 Sheet s = wb.getSheetAt(0);
		 
		 for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			 
			 Row r = s.getRow(i);
			 
			 for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				 
				 Cell c = r.getCell(j);
				 
				 CellType type = c.getCellType();
				 
				 if (type.equals(CellType.STRING)) {
					 
					 String value = c.getStringCellValue();
					 System.out.println(value);
				 }
					 else if (type.equals(CellType.NUMERIC)) {
						double numericCellValue = c.getNumericCellValue(); 
					System.out.println(numericCellValue);	
					}
					 
					
				}
				
			}
		wb.close();	
		}
		 
		public static void main(String[] args) throws IOException {
			All_Data();
		
	}

}
