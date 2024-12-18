package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCart {
    WebDriver driver;
    public ShoppingCart(WebDriver driver)
    {
        this.driver=driver;
    }
    By quantity = By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/input");
    By total = By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[6]");



    public void verifyQuantity(String quan)
    {
        if(quan.equals(driver.findElement(quantity).getAttribute("value")))
            System.out.println("Right Quantity");
        else
            System.out.println("Wrong Quantity");
    }
    public void verifyTotal(String tot)
    {
        if(tot.equals(driver.findElement(total).getText()))
            System.out.println("Right Ammount");
        else
            System.out.println(driver.findElement(total).getText());
    }

}
