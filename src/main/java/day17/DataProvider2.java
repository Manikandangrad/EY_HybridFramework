package day17;

import day14_excel.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProvider2 {
    @DataProvider(name="emiDataProvider")
    public static Object[][] getData() throws IOException {
        ExcelRW excelRW = new ExcelRW("C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\src\\main\\resources\\EMI.xlsx");
        int irows = excelRW.getRowCount("Sheet1");
        int icols= excelRW.getColumnCount("Sheet1");
        Object[][] objarr = new Object[irows][icols];
//        iterate through each row
        for (int irow=0;irow<=irows;irow++)
        {
//            iterate through each column
            for (int icol=1;icol<=icols;icol++)
            {
                objarr[irow][icol]=excelRW.readCellValue("Sheet1",irow,icol);
            }
        }
        return objarr;
    }
}