package automatedScripts.TestScripts;

import automatedScripts.Commons.BaseScript2;
import automatedScripts.DataProviders.DataSearch;
import automatedScripts.Pages.HomePage;
import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SearchScript extends BaseScript2 {
    @Test(dataProvider = "validSearch",dataProviderClass = DataSearch.class)
public  void valid_Search(String TC_ID,String Scriptname,String SearchItem,String ExpectedCount) throws InterruptedException {
    HomePage homePage=new HomePage(driver);

    mytest = extent.createTest(TC_ID);
    Assert.assertTrue(driver.getTitle().contains("Buy Books Online"),"Title of the application");
    mytest.log(Status.PASS,"Successfully Launched Application");

    Assert.assertTrue(homePage.validateErrorMessage(SearchItem),"Error message not dispalyed");
    mytest.log(Status.PASS,TC_ID+"has successfully passed");
}
    @Test(dataProvider = "invalidSearch",dataProviderClass = DataSearch.class)
    public  void invalid_Search(String TC_ID,String Scriptname,String SearchItem,String ExpectedCount) throws InterruptedException {
        HomePage homePage=new HomePage(driver);

        mytest = extent.createTest(TC_ID);
        Assert.assertTrue(driver.getTitle().contains("Buy Books Online"),"Title of the application");
        mytest.log(Status.PASS,"Successfully Launched Application");

        homePage.enter_searchItems(SearchItem);

        Assert.assertEquals(homePage.getSearchCount(),ExpectedCount.replace(".0",""), "Search count is not matching");
        mytest.log(Status.PASS,TC_ID+"has successfully passed");
    }
}
