package stepdefs;

import io.cucumber.java.en.*;
import org.testng.Assert;
import pages.*;
import utilities.*;

public class PurchaseSteps {
	private LoginPage loginPage;
	private InventoryPage inventoryPage;
	private CartPage cartPage;
	private CheckoutInfoPage checkoutInfoPage;
	private CheckoutCompletePage completePage;

	@Given("I launch Sauce Demo and verify the title is {string}")
	public void launchAndVerifyTitle(String expectedTitle) {
		DriverFactory.getDriver().get(ConfigReader.get("url"));
		Assert.assertEquals(DriverFactory.getDriver().getTitle(), expectedTitle, "Application title mismatch");
	}

	@When("I log in with username {word} and password {word}")
	public void login(String user, String pass) {
		loginPage = new LoginPage();
		inventoryPage = loginPage.login(user, pass);
	}

	@When("I add the following items to the cart")
	public void i_add_the_following_items_to_the_cart() {
		inventoryPage.addItemToCart();
		cartPage = inventoryPage.goToCart();
	}

	@When("I proceed to checkout with first name {string}, last name {string}, postal code {string}")
	public void checkout(String fn, String ln, String zip) throws Throwable {
		checkoutInfoPage = cartPage.checkout();
		checkoutInfoPage.fillInformation(fn, ln, zip);
		completePage = checkoutInfoPage.finish();
	}

	@Then("I should see the message {string} on the confirmation page")
	public void verifyMessage(String expectedMsg) {
		Assert.assertEquals(completePage.getCompleteHeader(), expectedMsg);
	}
}