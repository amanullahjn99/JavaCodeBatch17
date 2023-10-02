package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "C:\\Users\\ahmad\\IdeaProjects\\Main\\Files\\Employees.xlsx";
        //Class that brings the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        // That special Class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("EmpData");
        // A Nested Data Structure that is going to hold all the info from the sheet
        List<Map<String,String>> empListMap=new ArrayList<>();
        Row headerRow=sheet.getRow(0);
        for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
            //getting all of the rows one by one and placing them inside the row variable
            Row row = sheet.getRow(i);
            Map<String,String> rowMap=new  LinkedHashMap<>();

            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                String keyCell=headerRow.getCell(j).toString();
                String valueCell=row.getCell(j).toString();

                rowMap.put(keyCell,valueCell);

            }

            empListMap.add(rowMap);

        }


        System.out.println(empListMap);
    }
}