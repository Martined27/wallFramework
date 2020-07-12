package pageObjects;

import coreCode.BaseActivity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class toolBarPage extends BaseActivity {


    public toolBarPage(AndroidDriver<AndroidElement> driver) { super(driver); }

    @AndroidFindBy(id = "toolbar")
    public AndroidElement toolbar;

    @AndroidFindBy(id = "search")
    public AndroidElement searchBtn;

    @AndroidFindBy(id = "com.eqnesto.wallpaxer:id/et_search")
    public AndroidElement searchTxt;

    @AndroidFindBy(xpath = "//*[@contentDescription='Navigate up']")
    public AndroidElement backBtn;






}
