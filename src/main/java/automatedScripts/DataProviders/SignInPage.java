package automatedScripts.DataProviders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public WebDriver driver;
    @FindBy(name="logid")
    public WebElement txt_username;

    @FindBy(name="pswd")
    public WebElement txt_password;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement btn_Login;

    @FindBy(xpath="//b[text()='Sorry we were unable to complete this step because:]")
    public  WebElement lbl_errorMsg;

//    Constructor
    public SignInPage(WebDriver wdriver)
    {
        driver=wdriver;
        PageFactory.initElements(driver,this);
    }

//    Actions
    public void enterUserDetails(String username,String password)
    {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_Login.click();
    }
    public boolean ErrorMessageDisplayed()
    {
        return lbl_errorMsg.isDisplayed();
    }
}
