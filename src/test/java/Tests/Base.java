package Tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import static  Helper.Helper.*;

public class Base {
   public WebDriver driver;
   @BeforeSuite
    public void  setup() throws InterruptedException {
      readConfig();

       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get(prop.getProperty("BaseUrl"));

   }

   @AfterSuite
    public void teardown(){
       driver.close();
   }
}
