package testcases;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.HomeScreenPO;
import pageobject.LanguageScreenPO;
import pageobject.LoginSignUpScreenPO;
import utils.ApiResonseUtils;
import utils.AssertUtils;
import utils.PropertyUtils;
import utils.WaitUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class VerifyLanguageScreen extends BaseClass{
    WaitUtils WU_Obj = new WaitUtils();
    AssertUtils AU_Obj = new AssertUtils();
    public final static String LOGIN_MOBILE_NUMBER = PropertyUtils.getProperty("mobilenumber");


    @Test(priority = 0)
    public void to_verify_all_languages_displayed() throws IOException {
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //ApiResonseUtils.MyGETRequest();
        AU_Obj.isElementDisplayed(LS_Obj.selectYourPreferredLanguage);
        AU_Obj.isElementDisplayed(LS_Obj.englishLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.hindiLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.kannadaLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.malayalamLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.tamilLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.teluguLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.marathiLangRadioBtn);
        AU_Obj.isElementDisplayed(LS_Obj.gujratiLangRadioBtn);
    }

    @Test(priority = 1)
    public void verify_languages_radiobtn_clikabale() {
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);

        LS_Obj.tapOn_hindiLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"अपनी पसंदीदा भाषा चुनें");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"इसे बाद में बदलने के लिए, मेरी प्रोफाइल पर जाएं → भाषा बदलें");

        LS_Obj.tapOn_kannadaLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"ನಿಮ್ಮ ಆದ್ಯತೆಯ ಭಾಷೆಯನ್ನು ಆಯ್ಕೆಮಾಡಿ");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"ಅದನ್ನು ನಂತರ ಬದಲಾಯಿಸಲು, ನನ್ನ ಪ್ರೊಫೈಲಿಗೆ ಹೋಗಿ → ಭಾಷೆಯನ್ನು ಬದಲಾಯಿಸಿ");

        LS_Obj.tapOn_malayalamLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"നിങ്ങൾക്ക് ഇഷ്ടമുള്ള ഭാഷ തിരഞ്ഞെടുക്കുക");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"അത് പിന്നീട് മാറ്റുന്നതിന്, എന്\u200Dറെ പ്രൊഫൈലിലേക്ക് പോകുക - ഭാഷ മാറ്റുക");

        LS_Obj.tapOn_tamilLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"உங்களுக்கு விருப்பமான மொழியை தேர்ந்தெடுக்கவும்");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"பின்னர் மாற்ற, எனது சுயவிவரம் - மொழியை மாற்றவும் என்ற விருப்பத்திற்கு செல்லவும்");

        LS_Obj.tapOn_teluguLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"మీకు ఇష్టమైన భాషను ఎంచుకోండి");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"దానిని తర్వాత మార్చడానికి, నా ప్రొఫైల్\u200C → భాషను మార్చండికు వెళ్ళండి");

        LS_Obj.tapOn_marathiLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"तुमची प्राधान्य भाषा निवडा");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"नंतर बदलण्यासाठी, माझे प्रोफाईलवर जा - भाषा बदला");

        LS_Obj.tapOn_gujratiLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"તમારી અનૂકુળ ભાષા પસંદ કરો");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"તેને પછીથી બદલવા માટે, મારી પ્રોફાઇલ → ભાષા બદલો પર જાઓ");

        LS_Obj.tapOn_englishLangRadioBtn();
        WU_Obj.waitForElementToBeVisible(LS_Obj.selectYourPreferredLanguage,driver);
        AU_Obj.assertText(LS_Obj.selectYourPreferredLanguage,"Select your preferred language");
        AU_Obj.assertText(LS_Obj.toChangeItLateGoToMyProfileChangeLanguage,"To change it later, go to My Profile → Change Language");
    }

    @Test(priority = 2)
    public void verify_continuebtn_clickable(){
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);
        LS_Obj.tapOn_continueBtn();
        WU_Obj.waitForElementToBeVisible((By.id("logo_img")),driver);
    }

    @Test(priority = 3)
    public void verify_live_gold_rate() throws IOException {
        HomeScreenPO HS_Obj = new HomeScreenPO(driver);
        ApiResonseUtils.MyGETRequest();
        AU_Obj.assertText(HS_Obj.livePrice, ApiResonseUtils.goldRateInGram);
        AU_Obj.assertText(HS_Obj.goldPriceChange, ApiResonseUtils.yesterdayRateChange + " since yesterday");
    }
    @Test(priority = 4)
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

    @Test(priority = 5)
    public void verify_login_signup_functionality(){
        HomeScreenPO HS_Obj = new HomeScreenPO(driver);
        LoginSignUpScreenPO LSS_Obj = new LoginSignUpScreenPO(driver);
        HS_Obj.tapOn_logInSignUpBtn();
        WU_Obj.waitForElementToBeVisible(LSS_Obj.loginSignUpLabel,driver);
        AU_Obj.assertText(LSS_Obj.loginSignUpLabel, "Log in or Sign up");
        AU_Obj.assertText(LSS_Obj.enterMobileNumberLabel, "Please enter your mobile number to continue");
        AU_Obj.assertText(LSS_Obj.continueBtn, "CONTINUE");
        AU_Obj.isElementDisplayed(LSS_Obj.enterSameNumberLabel);
        LSS_Obj.enterMobileNumer(LOGIN_MOBILE_NUMBER);
        LSS_Obj.tapOn_ContinueBtn();
        AU_Obj.assertText(LSS_Obj.otpAutoVerificationLabel, "OTP auto-verification");
        AU_Obj.assertText(LSS_Obj.otpHasBeenSendToLabel, "OTP has been sent to "+LOGIN_MOBILE_NUMBER+"  ");
        System.out.println(LOGIN_MOBILE_NUMBER+"abcd");
        AU_Obj.assertText(LSS_Obj.OTPVerificationText, "OTP verification usually takes less than a minute. Please ensure you are using the same mobile number on this phone as mentioned above. In case there’s a mismatch, tap EDIT and enter the correct number");
        AU_Obj.assertText(LSS_Obj.editMobileNumberBtn, "EDIT");
        LSS_Obj.enterOTP("999999");
        AU_Obj.assertText(LSS_Obj.verifyingOTPLabel, "Verifying OTP automatically");






    }








    @BeforeTest
    //@Override
    public void setUpPage() {

    }
}


