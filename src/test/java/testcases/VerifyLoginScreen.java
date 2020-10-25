package testcases;

import org.testng.annotations.Test;
import pageobject.HomeScreenPO;
import pageobject.LanguageScreenPO;
import pageobject.LoginSignUpScreenPO;
import utils.AssertUtils;
import utils.PropertyUtils;
import utils.WaitUtils;

public class VerifyLoginScreen extends BaseClass {
    WaitUtils WU_Obj = new WaitUtils();
    AssertUtils AU_Obj = new AssertUtils();
    public final static String LOGIN_MOBILE_NUMBER = PropertyUtils.getProperty("mobilenumber");

    @Test(priority = 0)
    public void verify_login_signup_functionality(){
        HomeScreenPO HS_Obj = new HomeScreenPO(driver);
        LoginSignUpScreenPO LSS_Obj = new LoginSignUpScreenPO(driver);
        LanguageScreenPO LS_Obj = new LanguageScreenPO(driver);

        LS_Obj.tapOn_continueBtn();
        WU_Obj.waitForElementToBeVisible((HS_Obj.logInSignUpBtn),driver);
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
        AU_Obj.assertText(LSS_Obj.editMobileNumberBtn, "EDIT");
        LSS_Obj.enterOTP("999999");
        AU_Obj.assertText(LSS_Obj.verifyingOTPLabel, "Verifying OTP automatically");

    }
}
