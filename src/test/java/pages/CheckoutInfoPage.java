package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ChromeBreachDialogKiller; // ⬅️ import helper
import utilities.DriverFactory;

public class CheckoutInfoPage {
	private WebDriver driver = DriverFactory.getDriver();

	public void fillInformation(String firstName, String lastName, String postalCode) {

		ChromeBreachDialogKiller.dismissIfVisible();

		driver.findElement(By.id("first-name")).sendKeys(firstName);
		driver.findElement(By.id("last-name")).sendKeys(lastName);
		driver.findElement(By.id("postal-code")).sendKeys(postalCode);
		driver.findElement(By.id("continue")).click();
	}

	public CheckoutCompletePage finish() {
		driver.findElement(By.id("finish")).click();
		return new CheckoutCompletePage();
	}
}