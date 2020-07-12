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
import org.testng.asserts.SoftAssert;
import pageObjects.imagePage;
import pageObjects.toolBarPage;

public class Pruebas extends BaseTest {


    @Test //TC-01 - Search a cat and set wallpaper.
    public void Sample(){
        AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        toolBarPage toolbar = new toolBarPage(driver);
        imagePage imagepage = new imagePage(driver);
        SoftAssert sAssert = new SoftAssert();

        try {
            System.out.println("Im inside the test");
            toolbar.waitForScreenToLoad(toolbar.toolbar);
            toolbar.searchBtn.click();
            imagepage.waitForScreenToLoad(imagepage.searchLyt);
            toolbar.searchTxt.setValue("cat");
            toolbar.searchWall();
            imagepage.waitForScreenToLoad(imagepage.wallpaper);
            imagepage.wallpaper.click();
            imagepage.waitForScreenToLoad(imagepage.categoryTxt);
            imagepage.setBtn.click();
            imagepage.waitForScreenToLoad(imagepage.contextMenu);
            imagepage.applyBtn.click();
            imagepage.waitForScreenToLoad(imagepage.customDialog);
            imagepage.homescreenBtn.click();
            imagepage.waitForScreenToLoad(imagepage.progressLyt);
            sAssert.assertEquals("Setting wallpaper…",imagepage.settingTxt.getText());
            imagepage.waitForElementToChange(imagepage.progressLyt);
            sAssert.assertAll();

        }catch (Exception e) {
            Assert.fail("Test Failure");
            e.printStackTrace();
        }
    }

}
