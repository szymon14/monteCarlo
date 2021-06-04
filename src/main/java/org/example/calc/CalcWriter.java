package org.example.calc;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.Throw;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CalcWriter {
    private static final String FILE_LOCATION = "src/main/java/org/example/calc/result.xlsx";

    public static void generateXlsx(List<CalcSheetObject> calcs) throws IOException {
        FileOutputStream out = new FileOutputStream(FILE_LOCATION);
        XSSFWorkbook workbook = new XSSFWorkbook();
        for(CalcSheetObject object: calcs){
            generateXlsxSheet(object.getName(),object.getCalcResult(),workbook);
        }
        workbook.write(out);
        out.close();
        workbook.close();

    }

    private static void generateXlsxSheet(String name, CalcResult calcResult,XSSFWorkbook workbook) {
        try {
            int i = 1;
            XSSFSheet sheet = workbook.createSheet(name);
            XSSFRow row;
            List<Throw> aThrows = calcResult.getSuccessThrows();
            if(aThrows!=null) {
                for (Throw aThrow : aThrows) {
                    row = sheet.createRow(i);
                    fillRow(row
                            , aThrow.getX()
                            , aThrow.getY()
                            , aThrow.isSuccessful());
                    i++;

                }
            }
            aThrows = calcResult.getFailThrows();
            i++;
            if(aThrows!=null) {
                for (Throw aThrow : aThrows) {
                    row = sheet.createRow(i);
                    fillRow(row
                            , aThrow.getX()
                            , aThrow.getY()
                            , aThrow.isSuccessful());
                    i++;

                }
            }
            row = sheet.createRow(i+1);
            fillRow(row
                    ,calcResult.getEstimatedValue()
                    ,calcResult.getNumberOfThrows()
                    ,calcResult.getEquation());

        } catch (Exception ioe) {
            ioe.printStackTrace();
        }

    }

    private static void fillRow(XSSFRow row,double c1,double c2, boolean c3){
        if (row != null) {
            XSSFCell cell1 = row.createCell( 2);
            XSSFCell cell2 = row.createCell(3);
            XSSFCell cell3 = row.createCell(4);
            if (cell1 != null) {
                cell1.setCellValue(c1);
            }
            if (cell2 != null) {
                cell2.setCellValue(c2);
            }
            if (cell3 != null) {
                cell3.setCellValue(c3);
            }

        }
    }

    private static void fillRow(XSSFRow row,double c1,int c2, String c3){
        if (row != null) {
            XSSFCell cell1 = row.createCell( 2);
            XSSFCell cell2 = row.createCell(3);
            XSSFCell cell3 = row.createCell(4);
            if (cell1 != null) {
                cell1.setCellValue(c1);
            }
            if (cell2 != null) {
                cell2.setCellValue(c2);
            }
            if (cell3 != null) {
                cell3.setCellValue(c3);
            }

        }
    }
}
