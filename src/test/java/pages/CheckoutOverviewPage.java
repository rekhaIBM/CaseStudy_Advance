package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.DriverFactory;

/**
 * Represents the overview step in the Sauce Demo checkout flow.
 * Here the user reviews item/tax totals and clicks **Finish** to place the order.
 */
public class CheckoutOverviewPage {
    private WebDriver driver = DriverFactory.getDriver();

    private By finishBtn   = By.id("finish");
    private By itemTotal   = By.className("summary_subtotal_label");
    private By taxTotal    = By.className("summary_tax_label");
    private By grandTotal  = By.className("summary_total_label");

    /**
     * @return text like "Item total: $39.98"
     */
    public String getItemTotal() {
        return driver.findElement(itemTotal).getText();
    }

    /**
     * @return text like "Tax: $3.20"
     */
    public String getTax() {
        return driver.findElement(taxTotal).getText();
    }

    /**
     * @return text like "Total: $43.18"
     */
    public String getGrandTotal() {
        return driver.findElement(grandTotal).getText();
    }

    /**
     * Clicks Finish and navigates to the confirmation page.
     */
    public CheckoutCompletePage finish() {
        driver.findElement(finishBtn).click();
        return new CheckoutCompletePage();
    }
}