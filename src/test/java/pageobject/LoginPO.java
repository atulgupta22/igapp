package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class LoginPO extends BasePO {

    //A base constructor that sets the page's driver
    public LoginPO(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English']")
    AndroidElement englishLangRadioBtn;
    @AndroidFindBy(id = "btn_next")
    AndroidElement continueBtn;

    public void tapOn_englishLangRadioBtn(){
        englishLangRadioBtn.click();
    }
    public void tapOn_continueBtn(){
        continueBtn.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

}
