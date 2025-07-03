package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

public class InventoryPage {
	private WebDriver driver = DriverFactory.getDriver();

	public void addItemToCart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
	}

	public CartPage goToCart() {
		driver.findElement(By.className("shopping_cart_link")).click();
		return new CartPage();
	}
}