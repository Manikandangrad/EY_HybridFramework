package automatedScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Instagram {
    public ChromeDriver driver;
    //Set up the Chrome
    public void launchApp(String url)
    {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webDriver.chrome.driver", "C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
        driver = new ChromeDriver(chromeOptions);

        //Launch the Url and maximize it
        driver.get(url);
        driver.manage().window().maximize();
    }

    //Search the elements
    public void Search()
    {
        String output=driver.findElement(By.id("result-stats")).getText();
        System.out.println(output);
    }

    //Close the browser
    public void TearDown()
    {
        driver.close();
    }

}
