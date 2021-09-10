package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login_PF {
    public class LoginPage_PF{
        @FindBy(id= "name")
        @CacheLookup
        WebElement txt_username;

        @FindBy(id = "password")
        WebElement txt_password;

        @FindBy(id = "login")
        WebElement btn_login;

        @FindBy(how = How.ID, using = "name")
        WebElement abc;

        WebDriver driver;

        public LoginPage_PF(WebDriver driver){
            this.driver = driver;
            //PageFactory.initElements(driver, this);

            AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory (driver,300);
            PageFactory.initElements(factory,this);
            PageFactory.initElements(new AjaxElementLocatorFactory (driver,30),this);
        }
        public void enterUsername(String username) {txt_username.sendKeys (  );}
        public void enterPassword(String password) {txt_password.sendKeys (  );}
        public void clickOnLogin(){btn_login.click ();}

    }
}

