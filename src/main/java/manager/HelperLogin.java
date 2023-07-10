package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperLogin extends HelperBase{

    //smpaf4d528@kzccv.com

    public HelperLogin(WebDriver driver) {
        super(driver);
    }

    By OPEN_LOGIN_PAGE_BTN = By.xpath("//a[contains(text(), 'Log in')]");
    By INPUT_EMAIL = By.xpath("//input[@id='user']");
    By BTN_LOGIN = By.xpath("//input[@id='login']");
    By TEXT_WORKSPACE_AFTER_LOGIN = By.xpath("//span[@data-testid='home-team-tab-name']");





    /*

    1.openSignUpPage

     */

}
