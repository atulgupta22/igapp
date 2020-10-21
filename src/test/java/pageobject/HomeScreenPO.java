package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreenPO extends BasePO {

    public HomeScreenPO(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(id = "notifications")
    public AndroidElement notificationIcon;

    @AndroidFindBy(id = "tv_live_price")
    public AndroidElement livePrice;

    @AndroidFindBy(id = "tv_price_yesterday")
    public AndroidElement goldPriceChange;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='LIVE GOLD PRICE']")
    public AndroidElement liveGoldPriceLabel;

    @AndroidFindBy(id = "tv_btn_your_account")
    public AndroidElement logInSignUp;

    @AndroidFindBy(id= "indiagoldHomeFragment")
    public AndroidElement Home ;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Buy 24K gold']")
    public AndroidElement buy24KGoldLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='start savings from ₹1']")
    public AndroidElement startSavingsFrom₹1Label;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='24K gold coin']")
    public AndroidElement K24goldCoinLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='at a booking price of ₹610']")
    public AndroidElement atABookingPriceOf₹610Label;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gift Gold']")
    public AndroidElement giftGoldLabel;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='to friends & family anytime']")
    public AndroidElement toFriendsFamilyAnytimeLabel;

    @AndroidFindBy(id = "buySellFragment")
    public AndroidElement digiGold;

    @AndroidFindBy(id = "goldOnEmiFragment")
    public AndroidElement easyGold ;

    @AndroidFindBy(id = "goldLoanFragment")
    public AndroidElement goldLoan ;

    @AndroidFindBy(id = "profileFragment")
    public AndroidElement myProfile;


}
