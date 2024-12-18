package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Item {
    WebDriver driver;
    public Item(WebDriver driver)
    {
        this.driver = driver;
    }

    By quantity = By.xpath("//input[@id='input-quantity']");
    By addCart = By.xpath("//button[@id='button-cart']");
    By chqMsg = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    public void totalQuantity(String num)
    {
        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys(num);
    }
    public void addToCart()
    {
        driver.findElement(addCart).click();
        System.out.println("Product added to cart");
    }
    public String confirmMsg()
    {
        return driver.findElement(chqMsg).getText();

    }
}

