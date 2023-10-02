package class27_FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path = "C:\\Users\\ahmad\\IdeaProjects\\Main\\Files\\Employees.xlsx";
        //class that bring the data in the form of bytes into the memory
        FileInputStream fis = new FileInputStream(path);
        // That special Class which knows how to handle Excel files
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        //Accessing the sheet from the xlsx file
        Sheet sheet = workbook.getSheet("Sheet1");
        // gives us the row at index 1
        Row row=sheet.getRow(1);
        //Gives us the column/cell at index number 2
        Cell cell=row.getCell(2);
        System.out.println(cell);

    }
}
