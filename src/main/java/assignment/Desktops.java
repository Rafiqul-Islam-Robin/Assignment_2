package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Desktops {
    WebDriver driver;
    public Desktops(WebDriver driver)
    {
        this.driver = driver;
    }
    By srtBy = By.xpath("//select[@id='input-sort']");
    By firstProduct = By.xpath("//body/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@class='row']/div[1]/div[1]/div[1]");

    public void sortBy(String name)
    {

            WebElement dropdown = driver.findElement(srtBy);
            Select select = new Select(dropdown);
            select.selectByVisibleText(name);
    }
    public void clickFirstItem()
    {
//        Actions action = new Actions(driver);
//        WebElement elem = driver.findElement(firstProduct);
//        action.moveToElement(elem);
//        action.perform();
        driver.findElement(firstProduct).click();


    }

}
