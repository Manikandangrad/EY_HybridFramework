package day14_excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;

public class ExcelReadWrite {
    //-----OBJECTIVE-----
//    1. To read the Amount,Interest,Tenure from Excel.
//    2. To insert the Amount,Interest,Tenure in the Application.
//    3. To capture EMI from the App and Validate against the emi in Excel.
//    4. If matching write Pass in Excel else write Fail.
    public static void main(String[] args) throws IOException {

//        Copy and Paste the Excel file path
        ExcelRW myxl = new ExcelRW("C:\\Excel\\EMI.xlsx");

//        Launch the EMI Application
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");
        driver.manage().window().maximize();

//        Get the Rowcount
        int rowCount = myxl.getRowCount("Sheet1");

        for (int iRow = 1; iRow <=rowCount; iRow++)
        {
            String amount = myxl.readCellValue("Sheet1", iRow, 0);
            String rate = myxl.readCellValue("Sheet1", iRow, 1);
            String tenure = myxl.readCellValue("Sheet1", iRow, 2);
//            System.out.println(amount+rate+tenure);

//            Find and Do the Action in the element
         driver.findElement(By.id("loanamount")).clear();
           driver.findElement(By.id("loanamount")).sendKeys(amount);

           driver.findElement(By.name("rate")).clear();
           driver.findElement(By.name("rate")).sendKeys(rate);

            driver.findElement(By.id("pmonths")).clear();
            driver.findElement(By.id("pmonths")).sendKeys(tenure);
//
            //            Click to Calculate
          driver.findElement(By.name("Button1")).click();

//            Get the EMI value
           String output=driver.findElement(By.id("EMI")).getAttribute("value");


            if (output.equals(myxl.readCellValue("Sheet1",iRow,3)))
            {
                myxl.writeCellValue("Sheet1",iRow,4,"Pass");
            }
            else
            {
                myxl.writeCellValue("Sheet1",iRow,4,"Fail");
            }
            System.out.println(output);

//            Saving Excel Sheet
               myxl.saveAndCloseWorkbook("C:\\Excel\\EMI.xlsx");
        }

    }
}
