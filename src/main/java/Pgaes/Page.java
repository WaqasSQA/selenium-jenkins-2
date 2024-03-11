package Pgaes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page {
    private WebDriver driver;

    private By userNameF = By.id("user-name");
    private By passwordF = By.id("password");

    private By lgnBtn = By.id("login-button");

    public Page(WebDriver d){
        driver =d;
    }

    public void actions(String uname,String pass){
        driver.get("https://www.saucedemo.com/v1/");

        WebElement username = driver.findElement(userNameF);
        username.sendKeys(uname);

        WebElement password = driver.findElement(passwordF);
        password.sendKeys(pass);

        WebElement logn = driver.findElement(lgnBtn);
        logn.click();

    }
}
