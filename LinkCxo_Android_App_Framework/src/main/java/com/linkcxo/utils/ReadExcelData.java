package com.linkcxo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.google.common.collect.Table.Cell;

public class ReadExcelData {

 @DataProvider(name = "readexcel")		 
 public Object[][] readexcel() throws IOException{	
	    FileInputStream file = new FileInputStream("C:\\Users\\rahul\\git\\repository\\LinkCxo_Android_App_Framework\\CoreData\\readdata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("sheet1");
         int rowCount = sheet.getPhysicalNumberOfRows();
         int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
   
   Object[][]data=null;
   data = new Object[rowCount - 1][colCount];
  
   for (int i = 1; i < rowCount; i++) {
       XSSFRow row = sheet.getRow(i);

       for (int j = 0; j < colCount; j++) {
           XSSFCell cell = row.getCell(j);

           if (cell.getCellType() == CellType.STRING) {
               data[i - 1][j] = cell.getStringCellValue();
           } else if (cell.getCellType() == CellType.NUMERIC) {
        	   DecimalFormat df = new DecimalFormat("#");
        	   data[i - 1][j] = df.format(cell.getNumericCellValue());
           }

       }
   }

   workbook.close();

	return data	; 
   }
}





