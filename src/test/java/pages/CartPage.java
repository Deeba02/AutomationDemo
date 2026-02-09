package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends BasePage {

    private By shoppingCartLink = By.linkText("Shopping cart");
    private By productName = By.className("product-name");

    public void getProductNameFromCart() throws InterruptedException {
        driver.findElement(shoppingCartLink).click();
        String productname = driver.findElement(productName).getText();
        Assert.assertTrue(productname.contains("Laptop"));
        Thread.sleep(1000);
    }
}
