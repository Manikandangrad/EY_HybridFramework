//package automatedScripts.TestScripts;
//
//import automatedScripts.Commons.BaseScript;
//import automatedScripts.DataProviders.DataLogin;
//import automatedScripts.DataProviders.HomePage;
//import automatedScripts.DataProviders.SignInPage;
//import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.Status;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class LoginScript2 extends BaseScript {
//    @Test(dataProvider = "validLogin",dataProviderClass = DataLogin.class)
//    public void validLogin(String TC_ID,String scriptname,String username,String password)
//    {
//        HomePage homePage = new HomePage(driver);
//        SignInPage signInPage = new SignInPage(driver);
//
//        mytest=extent.createTest(TC_ID);
//        mytest.log(Status.PASS,"Successfully Launched Application");
//
//        //        Click on Sign IN
//       homePage.SignIn();
//
////        Enter Login Details
//        signInPage.enterUserDetails(username, password);
//        mytest.log(Status.PASS,"Successfully entered login details");
//
//
////        Check Whether Hii ICT comes on the Home Page
//        boolean name = homePage.successMessageDisplayed();
//        if (name)
//        {
//            mytest.log(Status.PASS,"has successfully passed");
//            System.out.println(TC_ID + "has successfully Passed");
//        }
//        else
//        {
//            mytest.log(Status.PASS,"has Failed");
//            System.out.println(TC_ID + "has Failed");
//        }
//
//    }
//    @Test(dataProvider = "invalidLogin",dataProviderClass = DataLogin.class)
//    public void invalidLogin(String username,String password,String TC_ID) throws IOException {
//        HomePage homePage = new HomePage(driver);
//        SignInPage signInPage = new SignInPage(driver);
//
//        mytest=extent.createTest(TC_ID);
//        mytest.log(Status.PASS,"Successfully Launched Application");
//
////        Click on Sign In
//        homePage.SignIn();
//
////        Enter Login Details
//       signInPage.enterUserDetails(username, password);
//        mytest.log(Status.PASS,"Successfully entered login details");
//
////        Checking alert
//        boolean displayed = signInPage.ErrorMessageDisplayed();
//        if(displayed)
//        {
//            mytest.log(Status.PASS,"has successfully passed");
//            System.out.println(TC_ID + "Pass");
//        }
//        else
//        {
//            System.out.println(TC_ID + "Fail");
//            mytest.log(Status.PASS,"has Failed", MediaEntityBuilder.createScreenCaptureFromPath(ScreenShot().replace(System.getProperty("user.dir"),"")).build());
//        }
//    }
//}
