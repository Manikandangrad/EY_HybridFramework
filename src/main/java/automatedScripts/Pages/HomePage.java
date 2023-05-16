package automatedScripts.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//    Find The Elements
    public WebDriver driver;
    @FindBy(linkText="Sign In")
    public WebElement SignIn_lk;

    @FindBy(id="username")
    public WebElement lbl_ValidLogin;

    @FindBy(id="srchword")
    public WebElement txt_searchbox;

    @FindBy(xpath = "//input[@type='button' and @value='Search for books']")
    public WebElement btn_searchItem;

    @FindBy(xpath = "//p[@class='sorrymsg']")
    public WebElement error_searchMsg;

    @FindBy(xpath="//div[@id='myDataDiv']/div/p[contains(text(),'Found')]")
    public WebElement valid_SearchResult;

//    Constructor
    public HomePage(WebDriver wdriver)
    {
       driver=wdriver;
        PageFactory.initElements(driver,this);
    }

//    Do The Actions

    public void SignIn()
    {
        SignIn_lk.click();
    }

//    Hii ICT message appear
    public boolean successMessageDisplayed()
    {
        return lbl_ValidLogin.isDisplayed();
    }

    public void enter_searchItems(String searchItem)
    {
        txt_searchbox.sendKeys(searchItem);
        btn_searchItem.click();
    }

    public boolean validateErrorMessage(String searchItem) throws InterruptedException {
        Thread.sleep(15000);
        String actual_output = error_searchMsg.getText();
        String expected_output="Sorry..."+ searchItem + "does not match any product on Rediff Books.";
        if (actual_output.equals(expected_output))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getSearchCount()
    {

        String search = valid_SearchResult.getText().split(" ")[1];
        return search;
    }
}
