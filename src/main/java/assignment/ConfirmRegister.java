package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmRegister {
    WebDriver driver;
    public ConfirmRegister(WebDriver driver)
    {
        this.driver = driver;
    }

    By confirmMsg = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By continueButton = By.xpath("//a[@class='btn btn-primary']");
    public String confirm()
    {
        String msg = driver.findElement(confirmMsg).getText();
        return msg;
    }
    public void cont ()
    {
        driver.findElement(continueButton).click();
    }
}
