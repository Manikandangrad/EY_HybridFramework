package day5;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AutomatedScript{
    public static void main(String[] args){
        //Open the browser//
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();

        //Launch the browser//
        driver.get("https://www.unionbankofindia.co.in/english/loan-emi-calculator.aspx");

        //Maximize the window//
        driver.manage().window().maximize();

        //Enter the value//
        driver.findElement(By.id("loanamount")).sendKeys("15000");
        driver.findElement(By.id("rate")).sendKeys("20");
        driver.findElement(By.id("pmonths")).sendKeys("10");

        //Click the Button//
        driver.findElement(By.id("Button1")).click();

        //Clicking on the link Bank Holidays//
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div/div[5]/a")).click();

        //Close the Browser
        driver.quit();
    }
}