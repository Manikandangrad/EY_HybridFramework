package automatedScripts.DataProviders;
import day14_excel.ExcelRW;
import org.testng.annotations.DataProvider;
import java.io.IOException;

public class DataLogin {
    @DataProvider(name = "validLogin")
    public static Object[][] validLogin() throws IOException {
        return getData("Sheet1", "validLogin");
    }

    @DataProvider(name = "invalidLogin")
    public static Object[][] invalidLogin() throws IOException {
        return getData("Sheet1", "invalidLogin");
    }

    public static Object[][] getData(String Sheetname, String ScriptName) throws IOException {
        ExcelRW excelRW = new ExcelRW(System.getProperty("user.dir") + "\\src\\main\\resources\\Rediff.xlsx");
        int rows = excelRW.getRowCount(Sheetname);
        int cols = excelRW.getColumnCount(Sheetname);

        int count = 0;
//       Find the number of rows required
        for (int row = 1; row <= rows; row++) {
            if (excelRW.readCellValue(Sheetname, row, 1).equals(ScriptName)) {
                count++;
            }
        }
        Object[][] objar = new Object[count][cols];
        int rowindex = 0;
//        iterate through each row
        for (int irow = 1; irow <= rows; irow++) {
            if (excelRW.readCellValue(Sheetname, irow, 1).equals(ScriptName)) {
//           iterate through each column
                for (int icol = 0; icol < cols; icol++) {
                    objar[rowindex][icol] = excelRW.readCellValue(Sheetname, irow, icol);
                }
                rowindex++;
            }
        }
        return objar;
    }
}

