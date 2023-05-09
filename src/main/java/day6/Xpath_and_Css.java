package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_and_Css {
    public static void main(String[] args)
    {
        //OPEN THE BROWSER
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        //Maximize the window
        driver.manage().window().maximize();

        //Enter the Url
        driver.get("https://www.facebook.com/campaign/landing.php?&campaign_id=15316858002&extra_1=s%7Cc%7C563139538007%7Cb%7Cfacebook%7C&placement=&creative=563139538007&keyword=facebook&partner_id=googlesem&extra_2=campaignid%3D15316858002%26adgroupid%3D130780223435%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-592856129%26loc_physical_ms%3D9050513%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwitShBhA6EiwAq3RqA74_nbfydmFSn5uprqWAkXMfJPmMxsfCx5eT9UwxkNb1jmnYWeC2ahoCHnkQAvD_BwE");

        //Find the element using Relative Css
        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("XXX");
        driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("YYY");

        //Find the element using Relative Css : (using OR)
        driver.findElement(By.cssSelector("input[name='reg_email_'],input[id='u_0_g_bE']")).sendKeys("hello@gmail.com");

        //Find the element using Relative Xpath:
        driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("hello");

    }
}
