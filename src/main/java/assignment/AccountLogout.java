package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountLogout {
    private WebDriver driver;
    private By logoutMsg = By.xpath("//h1[contains(text(),'Account Logout')]");

    public AccountLogout(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyLogoutMsg(String msg) {

        if (msg.equals(driver.findElement(logoutMsg).getText())) {
            System.out.println("Logout message is Correct");
        }
        else {
            System.out.println("Logout message is not correct");
        }
    }
}
