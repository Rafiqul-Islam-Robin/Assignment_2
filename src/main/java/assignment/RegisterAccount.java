package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterAccount {

    WebDriver driver;
    public RegisterAccount(WebDriver driver) {
        this.driver = driver;
    }

    By regText = By.xpath("//h1[normalize-space()='Register Account']");
    By firstName = By.xpath("//input[@id='input-firstname']");
    By lastName = By.xpath("//input[@id='input-lastname']");
    By email = By.xpath("//input[@id='input-email']");
    By telePhone = By.xpath("//input[@id='input-telephone']");
    By pass = By.xpath("//input[@id='input-password']");
    By conPass = By.xpath("//input[@id='input-confirm']");
    By subYes = By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']");
    By subNo = By.xpath("//input[@value='0']");
    By agreePolicy = By.xpath("//input[@name='agree']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By alertMsg = By.xpath("//div[@class='alert alert-danger alert-dismissible']");

    public String verifyText()
    {
        String msg = driver.findElement(regText).getText();

        return msg;
    }

    public void regForm(String fName, String lName, String eMail, String telephone, String pas, String conPas)
    {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(email).sendKeys(eMail);
        driver.findElement(telePhone).sendKeys(telephone);
        driver.findElement(pass).sendKeys(pas);
        driver.findElement(conPass).sendKeys(conPas);
    }
    public void subReg(boolean arg)
    {
        if(!arg)
        {
            driver.findElement(subNo).click();
        }
        else
            driver.findElement(subYes).click();
    }

    public void agreePolicy()
    {
        boolean isSelected = driver.findElement(agreePolicy).isSelected();
        if(!isSelected)
            driver.findElement(agreePolicy).click();
    }

    public String capAlertMsg()
    {
        String msg = driver.findElement(alertMsg).getText();
        return msg;
    }

    public void register()
    {
       driver.findElement(continueButton).click();

    }

}
