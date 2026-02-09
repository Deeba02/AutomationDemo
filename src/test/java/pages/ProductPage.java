package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage {

    private By addToCartButton = By.cssSelector("input[value='Add to cart']");

    public void addProductToCart() {
        driver.findElement(addToCartButton).click();
        System.out.println("The product was add");
    }
}
