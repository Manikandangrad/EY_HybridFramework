package automatedScripts.DataProviders;
import day14_excel.ExcelRW;
import org.testng.annotations.DataProvider;
import java.io.IOException;
public class DataSearch {
    @DataProvider(name = "validSearch")
    public static Object[][] validSearch() throws IOException {
        return DataProvider("Search","valid_Search");
    }

    @DataProvider(name = "invalidSearch")
    public static Object[][] invalidSearch() throws IOException {
        return DataProvider("Search","invalid_Search");
    }

    public static Object[][] DataProvider(String Sheetname, String Scriptname) throws IOException {
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\Search.xlsx");
        int irows = excelRW.getRowCount(Sheetname);
        int icols = excelRW.getColumnCount(Sheetname);

//        find the number of rows required
        int count=0;
        for (int ireq_row = 1; ireq_row <= irows; ireq_row++) {
            if (excelRW.readCellValue(Sheetname, ireq_row, 1).equals(Scriptname)) {
                count++;
            }
        }
        Object[][] objarr = new Object[count][icols];
        int rowindex = 0;
        //        iterate through each row
        for (int irow = 0; irow <=irows; irow++) {
            if (excelRW.readCellValue(Sheetname, irow, 1).equals(Scriptname)) {
                //            iterate through each column
                for (int icol = 0; icol < icols; icol++) {
                    objarr[rowindex][icol] = excelRW.readCellValue(Sheetname, irow, icol);
                }
                rowindex++;
            }
        }
        return objarr;
    }
}
