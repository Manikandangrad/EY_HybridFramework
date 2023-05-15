package automatedScripts.DataProviders;

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


}
