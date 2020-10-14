//package testcases;
//
//import org.openqa.selenium.By;
//import utils.CommonUtils;
//
//import java.util.concurrent.TimeUnit;
//
//
//
//public class LoginTest  {
//
//    CommonUtils cu = new CommonUtils();
//     driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//
//    //WebDriverWait wait = new WebDriverWait(driver, 20);
//        driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
//        mDriver.findElement(By.id("btn_next")).click();
//
//}
package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LanguageScreenPO;
import utils.AssertUtils;
import utils.WaitUtils;

import java.util.concurrent.TimeUnit;

public class VerifyLanguageScreen extends BaseClass{
    WaitUtils WU_Obj = new WaitUtils();
    AssertUtils AU_Obj = new AssertUtils();


    @Test(priority = 0)
    public void verify_all_languages() {
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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






    @BeforeTest
    //@Override
    public void setUpPage() {

    }
}


