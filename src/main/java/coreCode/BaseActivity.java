package coreCode;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActivity {


    protected AndroidDriver<AndroidElement> driver = null;
    private WebDriverWait wait;

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
