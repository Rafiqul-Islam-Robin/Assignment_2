package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccount {
    WebDriver driver;
    public MyAccount(WebDriver driver)
    {
        this.driver = driver;
    }
    By desktop = By.xpath("//a[normalize-space()='Desktops']");
    By mAccount = By.xpath("//h2[normalize-space()='My Account']");
    By mOrder = By.xpath("//h2[normalize-space()='My Orders']");
    By mAffAcc = By.xpath("//h2[normalize-space()='My Affiliate Account']");
    By newsLetter = By.xpath("//h2[normalize-space()='Newsletter']");
    By showDesktop = By.xpath("//a[normalize-space()='Show All Desktops']");
    By myAccount = By.xpath("//a[@title='My Account']");
    By logOut = By.xpath("//a[contains(text(),'Logout')]");
    By goCart = By.xpath("//a[@title='Shopping Cart']");

    public void goDesktop()
    {
        Actions action = new Actions(driver);
        WebElement elem = driver.findElement(desktop);
        action.moveToElement(elem);
        action.perform();
    }
    public void showAllDesktop()
    {
        driver.findElement(showDesktop).click();
    }
    public boolean headerChq(String head1, String head2, String head3, String head4)
    {
        int count =0;
        if(head1.equals(driver.findElement(mAccount).getText()))
            count++;
        if(head2.equals(driver.findElement(mOrder).getText()))
            count++;
        if(head3.equals(driver.findElement(mAffAcc).getText()))
            count++;
        if(head4.equals(driver.findElement(newsLetter).getText()))
            count++;
        return count == 4;
    }
    public void clickOnMyAccount() {
        driver.findElement(myAccount).click();
        System.out.println("My account has been clicked");
    }

    public void clickOnLogout() {
        driver.findElement(logOut).click();
        System.out.println("Account Logout");
    }
    public void clickCart()
    {
        driver.findElement(goCart).click();
    }
}
