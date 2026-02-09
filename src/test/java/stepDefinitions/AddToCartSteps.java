package stepDefinitions;

import io.cucumber.java.en.*;
import pages.*;


public class AddToCartSteps {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    LogoutPage close = new LogoutPage();

    @Given("user is on Demo Web Shop login page")
    public void user_is_on_login_page() throws InterruptedException {
        loginPage.openLoginPage();
        Thread.sleep(1000);
    }

    @When("user logs in with valid email and password")
    public void user_logs_in_with_valid_email_and_password() throws InterruptedException {
        loginPage.login("pusapa@yopmail.com","fA9qHUuAfVS#j@");
        Thread.sleep(1000);
    }

    @And("user searches for product")
    public void user_searches_product() throws InterruptedException {
        homePage.searchProduct("Laptop");
        Thread.sleep(1000);
    }

    @And("user adds the product to cart")
    public void user_adds_product_to_cart() throws InterruptedException {
        productPage.addProductToCart();
        Thread.sleep(1000);
    }

    @Then("product should be visible in the shopping cart")
    public void product_should_be_visible() throws InterruptedException {
        cartPage.getProductNameFromCart();
        Thread.sleep(1000);
    }

    @And("user logout")
    public void user_logout() throws InterruptedException {
        close.Logout();
        Thread.sleep(1000);
    }
}
