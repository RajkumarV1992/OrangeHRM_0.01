//package Utility;
//
//
//	import java.io.FileInputStream;
//	import java.io.IOException;
//	import java.util.*;
//	import org.apache.poi.ss.usermodel.*;
//
//	public class ExcelReader {
//
//	    /**
//	     * Reads data from an Excel sheet and returns it as a list of maps.
//	     * Each map represents a row with "ColumnName" as key and "CellValue" as value.
//	     */
//	    public static List<Map<String, String>> getData(String filePath, String sheetName) throws IOException {
//
//	        List<Map<String, String>> allData = new ArrayList<>();
//
//	        FileInputStream fis = new FileInputStream(filePath);
//	        Workbook workbook = WorkbookFactory.create(fis);
//	        Sheet sheet = workbook.getSheet(sheetName);
//
//	        // Read header row (first row)
//	        Row headerRow = sheet.getRow(0);
//	        int colCount = headerRow.getLastCellNum();
//
//	        // Loop through all rows after header
//	        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
//	            Row currentRow = sheet.getRow(i);
//	            Map<String, String> rowData = new LinkedHashMap<>();
//
//	            for (int j = 0; j < colCount; j++) {
//	                Cell headerCell = headerRow.getCell(j);
//	                Cell valueCell = currentRow.getCell(j);
//
//	                String header = headerCell.getStringCellValue().trim();
//	                String value = "";
//
//	                if (valueCell != null) {
//	                    valueCell.setCellType(CellType.STRING);
//	                    value = valueCell.getStringCellValue().trim();
//	                }
//
//	                rowData.put(header, value);
//	            }
//	            allData.add(rowData);
//	        }
//
//	        workbook.close();
//	        fis.close();
//
//	        return allData;
//	    }
//	}
//
//
//
