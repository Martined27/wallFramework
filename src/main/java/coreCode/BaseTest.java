package coreCode;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    private String platname = "Android";
    private String androidVersion = "6.0";
    private String androidVersion2 = "8.1";
    private String tool = "UiAutomator2";
    private String testName = "Untitled";
    private String deviceName = "R1 HD";
    private String deviceName3 = "Victor Galaxy A50";
    private String deviceName2 = "HUAWEI Y7";

    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

}
