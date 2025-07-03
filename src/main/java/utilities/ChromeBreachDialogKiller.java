package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

/** Clicks Chrome’s password‑breach “OK” button if it exists. */
public class ChromeBreachDialogKiller {

    public static void dismissIfVisible() {
        try {
            WebDriver driver = DriverFactory.getDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;

            String script =
                "const dlg = document.querySelector('div[role=\"dialog\"]');" +
                "if (dlg) {" +
                "  const btn = dlg.querySelector('button');" +
                "  if (btn) btn.click();" +
                "}";
            js.executeScript(script);
        } catch (Exception ignored) {}
    }
}
