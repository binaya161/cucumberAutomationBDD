package Page_Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
    @FindBy(id = "logout")
    WebElement btn_logout;

    WebDriver driver;

    public HomePage_PF(WebDriver driver){
        this.driver = driver;
        //PageFactory.initElements(Driver,HomePage_PF.class);
        PageFactory.initElements (driver,this);
    }
    public boolean checkLogoutIsDispalyed(){
        return btn_logout.isDisplayed ();}
}

