package day17;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestNGAutomation2 extends BaseScript2 {
    @Test(dataProvider = "emiDataProvider", dataProviderClass = DataProvider2.class)
    public void valid_emiCalculations(String amount,String rate,String tenure,String ExpectedEMI){

        //Enter the value//
        driver.findElement(By.id("loanamount")).sendKeys(amount);
        driver.findElement(By.id("rate")).sendKeys(rate);
        driver.findElement(By.id("pmonths")).sendKeys(tenure);

        //Click the Button//
        driver.findElement(By.id("Button1")).click();

        //Get EMI value//
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        if (output.equals(ExpectedEMI))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        //Close the Browser
        driver.quit();
    }
}
