package automatedScripts.TestScripts;

import automatedScripts.Commons.BaseScript2;
import automatedScripts.DataProviders.DataLogin;
import automatedScripts.DataProviders.DataLogin2;
import automatedScripts.Pages.HomePage;
import automatedScripts.DataProviders.SignInPage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginScript2 extends BaseScript2 {
    @Test(dataProvider = "valid_Login",dataProviderClass = DataLogin2.class)
    public void validLogin(String TC_ID,String Scriptname,String Username,String Password)
    {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);

        mytest= extent.createTest(TC_ID);
        mytest.log(Status.PASS,"Successfully Launched Application");

        //        Click on Sign IN
       homePage.SignIn();

//        Enter Login Details
        signInPage.enterUserDetails(Username, Password);
        mytest.log(Status.PASS,"Successfully entered login details");


//        Check Whether Hii ICT comes on the Home Page
        boolean name = homePage.successMessageDisplayed();
        if (name)
        {
            mytest.log(Status.PASS,"has successfully passed");
            System.out.println(TC_ID + "has successfully Passed");
        }
        else
        {
            mytest.log(Status.PASS,"has Failed");
            System.out.println(TC_ID + "has Failed");
        }

    }
    @Test(dataProvider = "invalid_Login",dataProviderClass = DataLogin2.class)
    public void invalidLogin(String TC_ID,String Scriptname,String Username,String Password) throws IOException {
        HomePage homePage = new HomePage(driver);
        SignInPage signInPage = new SignInPage(driver);
        mytest= extent.createTest(TC_ID);
        mytest.log(Status.PASS,"Successfully Launched Application");

//        Click on Sign In
        homePage.SignIn();

//        Enter Login Details
       signInPage.enterUserDetails(Username, Password);
        mytest.log(Status.PASS,"Successfully entered login details");

//        Checking alert
        boolean displayed = signInPage.ErrorMessageDisplayed();
        if(displayed)
        {
            mytest.log(Status.PASS,"has successfully passed");
            System.out.println(TC_ID + "Pass");
        }
        else
        {
            System.out.println(TC_ID + "Fail");
            mytest.log(Status.PASS,"has Failed", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot().replace(System.getProperty("user.dir"),"")).build());
        }
    }
}
