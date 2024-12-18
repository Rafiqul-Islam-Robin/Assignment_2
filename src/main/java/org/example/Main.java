package org.example;

import assignment.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class Main {
    static WebDriver browserDriver(String browserName)
    {
        WebDriver driver = null;
        browserName = browserName.toLowerCase();
        switch (browserName) {

            case "chrome":
                WebDriverManager.chromedriver().arch64().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().arch64().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().arch64().setup();
                driver = new EdgeDriver();
                break;

            default:
                driver = new ChromeDriver();
                break;
        }
        return driver;
    }

    public static void main(String[] args) throws InterruptedException {

                WebDriverManager.chromedriver().arch64().setup();
                WebDriver driver = browserDriver("chrome");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("http://tutorialsninja.com/demo");


                YourStore ySt = new YourStore(driver);
                ySt.clickRegister();

                RegisterAccount regAcc = new RegisterAccount(driver);
                System.out.println(regAcc.verifyText());
                regAcc.regForm("Rafiqul","Islam","049@gmail.com","01712345678","12345678","12345678");
                regAcc.subReg(false);
                regAcc.register();
                System.out.println(regAcc.capAlertMsg());
                regAcc.agreePolicy();
                regAcc.register();


                ConfirmRegister cReg = new ConfirmRegister(driver);
                String chq = cReg.confirm();
                if(chq.equals("Your Account Has Been Created!"))
                    cReg.cont();


                MyAccount mAccount = new MyAccount(driver);
                boolean arg = mAccount.headerChq("My Account", "My Orders","My Affiliate Account", "Newsletter");
                System.out.println(arg);
                mAccount.goDesktop();
                mAccount.showAllDesktop();


                Desktops desktop = new Desktops(driver);
                desktop.sortBy("Price (High > Low)");
                desktop.clickFirstItem();


                Item item =new Item(driver);
                item.totalQuantity("5");
                item.addToCart();
                String msg = item.confirmMsg();
                System.out.println(msg);
                mAccount.clickCart();


                ShoppingCart shop = new ShoppingCart(driver);
                shop.verifyQuantity("5");
                shop.verifyTotal("$6,010.00");

                mAccount.clickOnMyAccount();
                mAccount.clickOnLogout();


                AccountLogout logout =new AccountLogout(driver);
                logout.verifyLogoutMsg("Account Logout");
                driver.quit();



    }
}