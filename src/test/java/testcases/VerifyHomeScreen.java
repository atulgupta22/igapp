package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pageobject.HomeScreenPO;
import pageobject.LanguageScreenPO;
import utils.ApiResonseUtils;
import utils.AssertUtils;
import utils.WaitUtils;

import java.io.IOException;

public class VerifyHomeScreen extends BaseClass {

    public String GOLD_LIVE_PRICE_IN_GRAM_FROM_HOME_SCREEN;
    public Double GOLD_LIVE_PRICE_FROM_API;
    public Double EXCLUSIVE_GOLD_RATE;
    WaitUtils WU_Obj = new WaitUtils();
    AssertUtils AU_Obj = new AssertUtils();

    @Test(priority = 0)
    public void verify_live_gold_rate() throws IOException {
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);
        HomeScreenPO HS_Obj = new HomeScreenPO(driver);
        LS_Obj.tapOn_continueBtn();
        WU_Obj.waitForElementToBeVisible((HS_Obj.goldPriceChange),driver);
        ApiResonseUtils.MyGETRequest();
        GOLD_LIVE_PRICE_IN_GRAM_FROM_HOME_SCREEN = HS_Obj.livePrice.getText();
        GOLD_LIVE_PRICE_FROM_API = ApiResonseUtils.goldRate1;
        EXCLUSIVE_GOLD_RATE = ApiResonseUtils.exclusiveGoldRate;
        AU_Obj.assertText(HS_Obj.livePrice, ApiResonseUtils.goldRateInGram);
        AU_Obj.assertText(HS_Obj.goldPriceChange, ApiResonseUtils.yesterdayRateChange+" since yesterday");
    }

    @Test(priority = 1)
    public void verify_home_screen_element(){
        HomeScreenPO HS_Obj = new HomeScreenPO(driver);
        AU_Obj.isElementDisplayed(HS_Obj.liveGoldPriceLabel);
        AU_Obj.isElementDisplayed(HS_Obj.notificationIcon);
        AU_Obj.isElementDisplayed(HS_Obj.logInSignUpBtn);
        AU_Obj.isElementDisplayed(HS_Obj.buy24KGoldLabel);
        AU_Obj.isElementDisplayed(HS_Obj.startSavingsFrom₹1Label);
        AU_Obj.isElementDisplayed(HS_Obj.K24goldCoinLabel);
        AU_Obj.isElementDisplayed(HS_Obj.atABookingPriceOf₹610Label);
        AU_Obj.isElementDisplayed(HS_Obj.giftGoldLabel);
        AU_Obj.isElementDisplayed(HS_Obj.toFriendsFamilyAnytimeLabel);
        AU_Obj.isElementDisplayed(HS_Obj.Home);
        AU_Obj.isElementDisplayed(HS_Obj.digiGold);
        AU_Obj.isElementDisplayed(HS_Obj.easyGold);
        AU_Obj.isElementDisplayed(HS_Obj.goldLoan);
        AU_Obj.isElementDisplayed(HS_Obj.myProfile);
    }


}
