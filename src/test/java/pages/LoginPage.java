package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginButton = By.cssSelector("input.login-button");
    private By useraccount = By.xpath("(//a[@class='account'])[1]");

    public void openLoginPage() {
        driver.get("https://demowebshop.tricentis.com/login");
    }

    public void login(String email, String password) throws InterruptedException {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        String userAcc = driver.findElement(useraccount).getText();
        Assert.assertTrue(userAcc.contains(email));
        Thread.sleep(1000);

    }
}
