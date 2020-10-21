package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class LanguageScreenPO extends BasePO {

    //A base constructor that sets the page's driver
    public LanguageScreenPO(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "splashRootLayout")
    public AndroidElement SplashScreen;

    @AndroidFindBy(id="tv_select_language_text")
    public AndroidElement selectYourPreferredLanguage;

    @AndroidFindBy(id="tv_change_language_text")
    public AndroidElement toChangeItLateGoToMyProfileChangeLanguage;


    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='English']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"English\").instance(0))")
    public AndroidElement englishLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Hindi']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Hindi\").instance(0))")
    public AndroidElement hindiLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Kannada']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Kannada\").instance(0))")
    public AndroidElement kannadaLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Malayalam']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Malayalam\").instance(0))")
    public AndroidElement malayalamLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Tamil']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Tamil\").instance(0))")
    public AndroidElement tamilLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Telugu']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Telugu\").instance(0))")
    public AndroidElement teluguLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Marathi']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Marathi\").instance(0))")
    public AndroidElement marathiLangRadioBtn;

    //@AndroidFindBy(xpath = "//android.widget.TextView[@text='Gujrati']")
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Gujrati\").instance(0))")
    public AndroidElement gujratiLangRadioBtn;

    @AndroidFindBy(id = "btn_next")
    AndroidElement continueBtn;

    public void tapOn_englishLangRadioBtn(){
        englishLangRadioBtn.click();
    }
    public void tapOn_hindiLangRadioBtn(){
        hindiLangRadioBtn.click();
    }
    public void tapOn_kannadaLangRadioBtn(){
        kannadaLangRadioBtn.click();
    }
    public void tapOn_malayalamLangRadioBtn(){
        malayalamLangRadioBtn.click();
    }
    public void tapOn_tamilLangRadioBtn(){
        tamilLangRadioBtn.click();
    }
    public void tapOn_teluguLangRadioBtn(){
        teluguLangRadioBtn.click();
    }
    public void tapOn_marathiLangRadioBtn(){ marathiLangRadioBtn.click(); }
    public void tapOn_gujratiLangRadioBtn(){ gujratiLangRadioBtn.click(); }

    public void tapOn_continueBtn(){
        continueBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

}
