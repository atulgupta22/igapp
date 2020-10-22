package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DigiGoldScreenPO extends BasePO {
    public DigiGoldScreenPO(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='DigiGold – Gold Savings']")
    public AndroidElement digiGoldGoldSavingsLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='SAVINGS']")
    public AndroidElement savingLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LOCKER']")
    public AndroidElement lockerLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='GIFT']")
    public AndroidElement giftLabel;

    @AndroidFindBy(id = "tv_gold_buying_price_text")
    public AndroidElement liveBuyingPriceLabel;

    @AndroidFindBy(id = "tv_price_text")
    public AndroidElement priceTextLabel;

    @AndroidFindBy(id = "tv_price")
    public AndroidElement livePriceOnDGScreen;

    @AndroidFindBy(id = "radio_buy_rupees")
    public AndroidElement buyInRupeesRadioBtn;

    @AndroidFindBy(id = "radio_buy_grams")
    public AndroidElement buyInQuantityRadioBtn;

    @AndroidFindBy(id = "input_value")
    public AndroidElement inputRupeesQuantityTextBox;

    @AndroidFindBy(id = "tv_buy_option_1")
    public AndroidElement buyOption1;

    @AndroidFindBy(id = "tv_buy_option_2")
    public AndroidElement buyOption2;

    @AndroidFindBy(id = "tv_buy_option_3")
    public AndroidElement buyOption3;

    @AndroidFindBy(id = "tv_buy_option_4")
    public AndroidElement buyOption4;

    @AndroidFindBy(id = "btn_buy_now")
    public AndroidElement saveGoldToYourLockerBtn;

    @AndroidFindBy(id = "tv_purity")
    public AndroidElement purityMsgLabel;

    public void tapOn_BuyInQuantityRadioBtn(){
        buyInQuantityRadioBtn.click();
    }


}
