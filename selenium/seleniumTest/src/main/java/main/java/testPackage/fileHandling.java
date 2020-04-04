package main.java.testPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class fileHandling {

    public void readExcel(String filePath,String fileName,String sheetName) throws FileNotFoundException {
        File file = new File("C:\\Sayali\\testSelenium");

        FileInputStream inputStream = new FileInputStream(file);


        try {
            Workbook w = new XSSFWorkbook(inputStream);
            Sheet s = w.getSheet("testSelenium");




        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
