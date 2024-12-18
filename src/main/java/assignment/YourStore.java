package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourStore {
    WebDriver driver;
    public YourStore(WebDriver driver) {
        this.driver = driver;
    }
    By myAccount = By.xpath("//a[@title='My Account']");
    By register = By.xpath("//a[contains(text(),'Register')]");
    public void clickmyAccount()
    {
        driver.findElement(myAccount).click();
    }
    public void clickRegister() {
        clickmyAccount();
        driver.findElement(register).click();
    }



}
