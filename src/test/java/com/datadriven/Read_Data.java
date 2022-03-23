package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.Get;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
 public static void particular_Cell_Data() throws IOException {
	
	 File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Sample_Maven\\duplicate.xlsx");
	 
	 FileInputStream fis=new FileInputStream(f);
	 
	 Workbook wb=new XSSFWorkbook(fis);
	 
	 Sheet s = wb.getSheetAt(0);
	 
	 Row r = s.getRow(2);
	 
	 Cell c = r.getCell(1);
	 
	 CellType type = c.getCellType();
	 
	 if (type.equals(CellType.STRING)) {
		 String cellValue = c.getStringCellValue();
		 System.out.println("your password is:" +cellValue); 
		
	}
	 else if (type.equals(CellType.NUMERIC)) {
		 
		 double cellValue = c.getNumericCellValue();
		 System.out.println("your password is:" +cellValue);
		
	} 
	 
	wb.close(); 	 
}
		
	public static void main(String[] args) throws IOException {
	particular_Cell_Data();	}
}
