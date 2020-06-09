package coreCode;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
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
    private String androidVersion = "9";
    private String androidVersion2 = "8.1";
    private String tool = "UiAutomator2";
    private String testName = "Untitled";
    private String deviceName = "R1 HD";
    private String deviceName3 = "P30";
    private String deviceName2 = "HUAWEI Y7";

    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();

    @BeforeClass
    public void setUp() throws MalformedURLException {
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName3);
        dc.setCapability("automationName", tool);
        dc.setCapability("platformName", platname);
        dc.setCapability("platformVersion", androidVersion);
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.eqnesto.wallpaxer");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.eqnesto.wallpaxer.activities.MainActivity");
        dc.setCapability("noReset", true);

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
