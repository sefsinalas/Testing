package utils;

import helpers.BrowserDriver;
import helpers.LoggerHelper;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class BeforeAndAfterTestListener implements ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        LoggerHelper.logInfo("[BeforeAndAfterTestLister/onStart] Loading driver and properties before Suite");

        // Selenium Configuration
        BrowserDriver.loadDriver();
    }

    @Override
    public void onFinish(ISuite suite) {
        LoggerHelper.logInfo("[BeforeAndAfterTestLister/onFinish] Checking driver and properties after Suite");
        BrowserDriver.closeBrowser();
    }
}
