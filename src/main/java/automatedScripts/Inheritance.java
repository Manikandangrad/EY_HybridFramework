package automatedScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Inheritance {

   public ChromeDriver driver;
        //Setup the Chrome
        public void launchapp(String url)
        {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\drivers\\chromedriver_win32 (1)\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();

            //Launch the Url and maximize it
            driver.get(url);
            driver.manage().window().maximize();
        }

        //Search the elements
        public void Search(String SearchItem)
        {
            driver.findElement(By.id("input")).sendKeys(SearchItem);
            driver.findElement(By.id("icon")).click();

            String output=driver.findElement(By.id("result-stats")).getText();
            System.out.println(output);
        }

        //Close the browser
        public void TearDown()
        {
            driver.close();
        }

    }

