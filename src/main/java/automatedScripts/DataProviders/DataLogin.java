package automatedScripts.DataProviders;
import day14_excel.ExcelRW;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DataLogin {
    @DataProvider(name = "validLogin")
    public static Object[][] validLogin() throws IOException {
        return getData("Sheet1", "valid_Login");
    }

    @DataProvider(name = "invalidLogin")
    public static Object[][] invalidLogin() throws IOException {
        return getData("Sheet1", "invalid_Login");
    }

    public static Object[][] getData(String Sheetname, String Scriptname) throws IOException {
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\Rediff.xlsx");
        int irows = excelRW.getRowCount(Sheetname);
        int icols = excelRW.getColumnCount(Sheetname);
        int count = 0;
        //        find the number of rows required
        for (int ireq_row = 1; ireq_row <= irows; ireq_row++)
        {
            if (excelRW.readCellValue(Sheetname, ireq_row, 1).equals(Scriptname))
            {
                count++;
            }
        }
        Object[][] objarr = new Object[count][icols];
        int rowindex = 0;
        //        iterate through each row
        for (int irow = 1; irow <= irows; irow++)
        {
            if (excelRW.readCellValue(Sheetname, irow, 1).equals(Scriptname))
            {
                //            iterate through each column
                for (int icol = 0; icol < icols; icol++)
                {
                    objarr[rowindex][icol] = excelRW.readCellValue(Sheetname, irow, icol);

                }
                rowindex++;
            }
        }
        return objarr;
    }

}

