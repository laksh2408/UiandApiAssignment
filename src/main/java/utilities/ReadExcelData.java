package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	        public static String readData(int rowNum, int cellNum, String filePath) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);  
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheetAt(0); 
	        Row row = sheet.getRow(rowNum); 
	        Cell cell = row.getCell(cellNum); 

	        return cell.getStringCellValue();
	    }
	}


