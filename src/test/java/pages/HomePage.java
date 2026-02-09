package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By searchBox = By.id("small-searchterms");
    private By searchButton = By.cssSelector("input.search-box-button");

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }
}
