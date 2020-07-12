package pageObjects;

import coreCode.BaseActivity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class imagePage extends BaseActivity {


    public imagePage(AndroidDriver<AndroidElement> driver) { super(driver); }

    @AndroidFindBy(id = "category_name")
    public AndroidElement categoryTxt;

    @AndroidFindBy(id = "btn_favorite")
    public AndroidElement faveBtn;

    @AndroidFindBy(id = "btn_set")
    public AndroidElement setBtn;

    @AndroidFindBy(id = "btn_download")
    public AndroidElement downloadBtn;

    @AndroidFindBy(id = "btn_share")
    public AndroidElement shareBtn;

    @AndroidFindBy(xpath = "//*[@text='Quick Apply']")
    public AndroidElement applyBtn;

    @AndroidFindBy(xpath = "//*[@text='Crop Wallpaper']")
    public AndroidElement cropBtn;

    @AndroidFindBy(id = "com.eqnesto.wallpaxer:id/content")
    public AndroidElement contextMenu;

    @AndroidFindBy(id = "custom_dialog_layout_design_user_input")
    public AndroidElement customDialog;

    @AndroidFindBy(xpath = "//*[@text='Home Screen']")
    public AndroidElement homescreenBtn;

    @AndroidFindBy(xpath = "//*[@text='Lock Screen']")
    public AndroidElement lockscreenBtn;

    @AndroidFindBy(xpath = "//*[@text='Both']")
    public AndroidElement bothBtn;

    @AndroidFindBy(id = "img_wallpaper")
    public AndroidElement wallpaper;
}
