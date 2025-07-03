package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class CartPage {
    private WebDriver driver = DriverFactory.getDriver();

    public CheckoutInfoPage checkout() throws Throwable {
        driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
        Thread.sleep(10000);
        return new CheckoutInfoPage();
    }
}