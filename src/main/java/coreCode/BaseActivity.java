package coreCode;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActivity {


    private static final int TIMEOUT = 6;
    private static final int POLLING = 100;
    protected AndroidDriver<AndroidElement> driver = null;
    private WebDriverWait wait;

    // Page factory for all PageObjects
    public BaseActivity(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, TIMEOUT, POLLING);
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


   //Core methods - for internal use only.
    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }

    protected void waitForTextToAppear(By locator, String text) {
        wait.until(ExpectedConditions.textToBe(locator, text));
    }


    ///Public methods - for create and modify
   public  void searchWall(){driver.executeScript("mobile:performEditorAction", ImmutableMap.of("action", "search"));
   };

    public  void  waitForTextToShow(By locator, String text){
        waitForTextToAppear(locator,text);
    }

    public  void  waitForTextToChange(By locator, String text){
        waitForTextToDisappear(locator,text);
    }

    public void waitForScreenToLoad(AndroidElement element) { waitForElementToAppear(By.id(element.getAttribute("resource-id")));
    }

    public void waitForScreenToLoadByXpath(AndroidElement element) { waitForElementToAppear(By.xpath(element.getAttribute("xpath")));
    }

    public void waitForScreenToLoad(By locator) {
        waitForElementToAppear(locator);
    }
}
