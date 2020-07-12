package testModule;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableMap;
import coreCode.BaseTest;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.imagePage;
import pageObjects.toolBarPage;

public class Pruebas extends BaseTest {


    @Test //TC-01 - Search a cat and set wallpaper.
    public void Sample(){
        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        toolBarPage toolbar = new toolBarPage(driver);
        imagePage imagepage = new imagePage(driver);

        try {
            System.out.println("Im inside the test");
            Thread.sleep(2000);
            toolbar.searchBtn.click();
            toolbar.searchTxt.setValue("cat");
            toolbar.searchWall();
            Thread.sleep(1000);
            imagepage.wallpaper.click();
            Thread.sleep(2000);
            imagepage.setBtn.click();
            Thread.sleep(2000);
            imagepage.applyBtn.click();
            Thread.sleep(2000);
            imagepage.homescreenBtn.click();

        }catch (Exception e) {
            Assert.fail("Test Failure");
            e.printStackTrace();
        }
    }

}
