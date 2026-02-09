package pages;

import org.openqa.selenium.By;

public class LogoutPage extends BasePage{
     private By logoutclick = By.xpath("//a[normalize-space(text())='Log out']");

     public void Logout() {
          driver.findElement(logoutclick).click();
     }
}

