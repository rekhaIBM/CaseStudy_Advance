package stepdefs;

import io.cucumber.java.*;
import utilities.*;

public class Hooks {
    @Before(order = 0)
    public void beforeSuite() {
        // Initialize WebDriver only once at suite start
        DriverFactory.initDriver();
    }

    @AfterStep
    public void attachScreenshot(Scenario scenario) {
        if (scenario.isFailed())
            ScreenshotUtil.attachScreenshot(scenario);
    }

    @After(order = 0)
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}