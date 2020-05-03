package coreCode;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

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

    @BeforeClass
    public void setUp() throws MalformedURLException {
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName2);
        //dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("automationName", tool);
        dc.setCapability("platformName", platname);
        dc.setCapability("platformVersion", androidVersion2);
        // dc.setCapability(MobileCapabilityType.UDID, "JND5T19313003519");
        //dc.setCapability("unlockType", "pattern");
        //dc.setCapability("unlockKey", "4257");
        dc.setCapability("newCommandTimeout", 60);
        dc.setCapability("adbExecTimeout ", 2000);
        dc.setCapability("appPackage", "com.simpler.dialer");
        dc.setCapability("appActivity", "com.simpler.ui.activities.ContactsAppActivity");
        dc.setCapability("noReset", true);
        //dc.setCapability(MobileCapabilityType.UDID, "T8NVSCSSLJCIZSBE");

        service.start();
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }

    @BeforeMethod
    public void Katapulta(){
        driver.launchApp();
    }

    @AfterMethod
    public void terminator() {
//        UssdActivity ussdActivity = new UssdActivity(driver);
//       // driver.closeApp();
//        List<AndroidElement> list = driver.findElements(By.xpath("//*[@text='Aceptar']"));
//        if (!list.isEmpty()) {
//            ussdActivity.aceptarBtn.click();
//        }I
        //driver.terminateApp("com.simpler.dialer");
        driver.closeApp();
    }


    @AfterClass
    public void tearDown() {
        driver.quit();
        service.stop();
    }


}
