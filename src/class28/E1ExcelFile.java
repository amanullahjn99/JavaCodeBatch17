package class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path = "C:\\Users\\ahmad\\IdeaProjects\\Main\\Files\\Employees.xlsx";
        //class that bring the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        //THat special class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");
        Row row = null;
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            //getting  all of the rows one by one and placing them inside the row variable
            row = sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }
    }
}