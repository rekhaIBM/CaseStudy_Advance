package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class CheckoutCompletePage {
    private WebDriver driver = DriverFactory.getDriver();

    public String getCompleteHeader() {
        return driver.findElement(By.className("complete-header")).getText();
    }
}