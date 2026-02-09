package pages;

import Hooks.Hooks;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = Hooks.driver;
    }
}
