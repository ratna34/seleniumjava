package PageObject.LoginPage;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static Helper.Helper.*;

public class LoginPage {
    public WebDriver driver;

    @FindBy(xpath = "//input[@name='username']")
    WebElement usernametextfield;

    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordtextfield;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginbutton;

    @FindBy(xpath = "//h1[@class='title']")
    WebElement  dashboardtitle;



    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterUsernName(){
        usernametextfield.sendKeys(prop.getProperty("username"));
    }

   public void enterPassword(){
        passwordtextfield.sendKeys(prop.getProperty("password"));
   }
   public void clickLoginButton(){
        loginbutton.click();
   }
   public  void vaidateDashboardTitle(){
       Assert.assertEquals(dashboardtitle.getText(),prop.getProperty("dashboardtitle"));
   }

   public void validateUrl(String url){
        if(!driver.getCurrentUrl().contains(url)){

            Assert.fail("login not suceessful,url does not contain:"+url);
        }



   }


}
