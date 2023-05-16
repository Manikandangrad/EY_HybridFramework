package day17;

import day14_excel.ExcelRW;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProvider2 {
    @DataProvider(name="emiDataProvider")
    public static Object[][] getData() throws IOException {
        ExcelRW excelRW = new ExcelRW("C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\src\\main\\resources\\EMIScript.xlsx");
        int irows = excelRW.getRowCount("EMI")+1;
        int icols= excelRW.getColumnCount("EMI")-1;
        Object[][] objarr = new Object[irows][icols];
//        iterate through each row
        for (int irow=1;irow<irows;irow++)
        {
//            iterate through each column
            for (int icol=0;icol<icols;icol++)
            {
                objarr[irow][icol]=excelRW.readCellValue("EMI",irow,icol);
            }
        }
        return objarr;
    }
}