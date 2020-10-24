package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.DigiGoldScreenPO;
import pageobject.HomeScreenPO;
import pageobject.LanguageScreenPO;
import utils.ApiResonseUtils;
import utils.AssertUtils;
import utils.CommonUtils;
import utils.WaitUtils;

import java.io.IOException;

public class VerifyDigiGoldScreen extends BaseClass {

    public String GOLD_LIVE_PRICE_IN_GRAM_FROM_HOME_SCREEN;
    public Double EXCLUSIVE_GOLD_RATE;
    public Double GOLD_LIVE_PRICE_FROM_API;
    WaitUtils WU_Obj = new WaitUtils();
    AssertUtils AU_Obj = new AssertUtils();

    @Test(priority = 0)
    public void verify_digigold_screen_functionality() throws IOException {
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);
        DigiGoldScreenPO DGS_Obj = new DigiGoldScreenPO(driver);
        HomeScreenPO HS_Obj = new HomeScreenPO(driver);
        LS_Obj.tapOn_continueBtn();
        WU_Obj.waitForElementToBeVisible((HS_Obj.goldPriceChange),driver);
        GOLD_LIVE_PRICE_IN_GRAM_FROM_HOME_SCREEN = HS_Obj.livePrice.getText();
        ApiResonseUtils.MyGETRequest();
        EXCLUSIVE_GOLD_RATE = ApiResonseUtils.exclusiveGoldRate;
        GOLD_LIVE_PRICE_FROM_API = ApiResonseUtils.goldRate1;

        HS_Obj.tapOn_digiGold();
        AU_Obj.isElementDisplayed(DGS_Obj.digiGoldGoldSavingsLabel);
        AU_Obj.isElementDisplayed(DGS_Obj.savingLabel);
        AU_Obj.isElementDisplayed(DGS_Obj.lockerLabel);
        AU_Obj.isElementDisplayed(DGS_Obj.giftLabel);
        AU_Obj.assertText(DGS_Obj.liveBuyingPriceLabel, "LIVE BUYING PRICE");
        //ApiResonseUtils.MyGETRequest();
        //AU_Obj.assertText(DGS_Obj.livePriceOnDGScreen, ApiResonseUtils.goldRateInGram);
        AU_Obj.assertText(DGS_Obj.livePriceOnDGScreen, GOLD_LIVE_PRICE_IN_GRAM_FROM_HOME_SCREEN);
        AU_Obj.assertText(DGS_Obj.priceTextLabel, "This price includes 3% GST, locker charges and insurance");
        Assert.assertEquals(DGS_Obj.buyInRupeesRadioBtn.getAttribute("checked"),"true");
        Assert.assertEquals(DGS_Obj.buyInQuantityRadioBtn.getAttribute("checked"),"false");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "Amount");
        AU_Obj.assertText(DGS_Obj.buyOption1, "+ ₹500");
        AU_Obj.assertText(DGS_Obj.buyOption2, "+ ₹1000");
        AU_Obj.assertText(DGS_Obj.buyOption3, "+ ₹2500");
        AU_Obj.assertText(DGS_Obj.buyOption4, "+ ₹5000");

        DGS_Obj.tapOn_BuyInQuantityRadioBtn();
        Assert.assertEquals(DGS_Obj.buyInRupeesRadioBtn.getAttribute("checked"),"false");
        Assert.assertEquals(DGS_Obj.buyInQuantityRadioBtn.getAttribute("checked"),"true");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "Weight");
        AU_Obj.assertText(DGS_Obj.buyOption1, "+ 0.1 gms");
        AU_Obj.assertText(DGS_Obj.buyOption2, "+ 0.5 gms");
        AU_Obj.assertText(DGS_Obj.buyOption3, "+ 1 gms");
        AU_Obj.assertText(DGS_Obj.buyOption4, "+ 2 gms");

        DGS_Obj.tapOn_BuyInRupeesRadioBtn();
        DGS_Obj.tapOn_BuyOption1();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "500");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= "+ CommonUtils.convertAmountintoGm(500,GOLD_LIVE_PRICE_FROM_API)+" gms");

        DGS_Obj.tapOn_BuyOption2();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "1500");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= "+CommonUtils.convertAmountintoGm(1500,GOLD_LIVE_PRICE_FROM_API)+" gms");

        DGS_Obj.tapOn_BuyOption3();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "4000");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= "+CommonUtils.convertAmountintoGm(4000,GOLD_LIVE_PRICE_FROM_API)+" gms");

        DGS_Obj.tapOn_BuyOption4();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "9000");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= "+CommonUtils.convertAmountintoGm(9000,GOLD_LIVE_PRICE_FROM_API)+" gms");

        DGS_Obj.tapOn_BuyInQuantityRadioBtn();
        DGS_Obj.tapOn_BuyOption1();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "0.1");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= ₹"+CommonUtils.convertGmintoRupees(0.1,EXCLUSIVE_GOLD_RATE));

        DGS_Obj.tapOn_BuyOption2();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "0.6");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= ₹"+CommonUtils.convertGmintoRupees(0.6,EXCLUSIVE_GOLD_RATE));

        DGS_Obj.tapOn_BuyOption3();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "1.6");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= ₹"+CommonUtils.convertGmintoRupees(1.6,EXCLUSIVE_GOLD_RATE));

        DGS_Obj.tapOn_BuyOption4();
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantityTextBox, "3.6");
        AU_Obj.assertText(DGS_Obj.inputRupeesQuantitySuffixTextBox, "= ₹"+CommonUtils.convertGmintoRupees(3.6,EXCLUSIVE_GOLD_RATE));
        AU_Obj.assertText(DGS_Obj.saveGoldToYourLockerBtn, "SAVE GOLD TO YOUR LOCKER");

    }
}
