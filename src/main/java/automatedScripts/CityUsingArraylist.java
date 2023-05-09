package automatedScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;

public class CityUsingArraylist {
    public static void main(String[] args)
    {
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DEVI\\IdeaProjects\\EY-Trainings\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver(chromeOptions);

        driver.get("https://www.carwale.com/used/cars-in-kochi/#sc=-1&so=-1&city=9&pc=9&pn=1");
        driver.manage().window().maximize();

        List<WebElement> elements = driver.findElements(By.xpath("//select[@id='drpCity']/option"));

//        Fetching All Cities
        Iterator<WebElement> iterator=elements.iterator();
//        while (iterator.hasNext())
//        {
//            WebElement cities=iterator.next();
//            System.out.println(cities.getText());
//        }

//               Fetching Only limited Cities

        int k=0;
        while (iterator.hasNext() && k<3)
        {
            WebElement cities=iterator.next();
            System.out.println(cities.getText());
            k++;
        }

//        Fetching Only limited Cities
        for(int i=0;i<5;i++)
        {
            System.out.println(elements.get(i).getText());
        }
    }
}
