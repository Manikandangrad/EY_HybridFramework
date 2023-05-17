package automatedScripts.TestScripts;

import automatedScripts.Commons.BaseScript;
import automatedScripts.DataProviders.DataLogin;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginScript extends BaseScript {
    @Test(dataProvider = "validLogin",dataProviderClass = DataLogin.class)
    public void validLogin(String TC_ID,String Scriptname,String Username,String Password)
    {
        //        Click on Sign IN
        driver.findElement(By.linkText("Sign In")).click();

//        Enter Login Details
        driver.findElement(By.name("logid")).sendKeys(Username);
        driver.findElement(By.name("pswd")).sendKeys(Password);

//        Click on Login
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        Check Whether Hii ICT comes on the Home Page
        boolean name = driver.findElement(By.id("username")).isDisplayed();
        if (name)
        {
            System.out.println(TC_ID + "Pass");
        }
        else
        {
            System.out.println(TC_ID + "Fail");
        }

    }
    @Test(dataProvider = "invalidLogin",dataProviderClass = DataLogin.class)
    public void invalidLogin(String TC_ID,String Scriptname, String Username,String Password)
    {
//        Click on Sign IN
        driver.findElement(By.linkText("Sign In")).click();

//        Enter Login Details
        driver.findElement(By.name("logid")).sendKeys(Username);
        driver.findElement(By.name("pswd")).sendKeys(Password);

//        Click on Login
        driver.findElement(By.xpath("//input[@type='submit']")).click();

//        Checking alert
        boolean text = driver.findElement(By.xpath("//b[text()=\"Sorry we were unable to complete this step because :\"]")).isDisplayed();
        if(text)
        {
            System.out.println(TC_ID + "Pass");
        }
        else
        {
            System.out.println(TC_ID + "Fail");
        }
    }
}
