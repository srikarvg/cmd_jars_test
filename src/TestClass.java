import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
     
    public class TestClass
    {
       public static void main(String[] args)
       {
           WebDriver driver = new FirefoxDriver();
           driver.get("http://google.com");
           System.out.println(driver.getTitle());
           driver.close();
       }
    }
