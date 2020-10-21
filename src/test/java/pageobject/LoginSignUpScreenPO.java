package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import utils.PropertyUtils;

public class LoginSignUpScreenPO extends BasePO{

    public LoginSignUpScreenPO(AppiumDriver driver) {
        super(driver);
    }
    // Enter Mobile Number Screen Element
    @AndroidFindBy(id = "tv_login")
    public AndroidElement loginSignUpLabel;

    @AndroidFindBy(id="tv_enter_mobile")
    public AndroidElement enterMobileNumberLabel;

    @AndroidFindBy(id = "input_mobile")
    public AndroidElement mobileNumberTextBox;

    @AndroidFindBy(id = "btn_send_otp")
    public AndroidElement continueBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Please enter the same mobile number which you are using on this phone']")
    public AndroidElement enterSameNumberLabel;

    // OTP Screen Element
    @AndroidFindBy(id = "tv_otp_verification")
    public AndroidElement otpAutoVerificationLabel;

    @AndroidFindBy(id = "tv_mobile_number")
    public AndroidElement otpHasBeenSendToLabel;

    @AndroidFindBy(id = "btn_edit_mobile")
    public AndroidElement editMobileNumberBtn;

    @AndroidFindBy(id = "input_otp")
    public AndroidElement inptOTPTextBox;

    @AndroidFindBy(id = "tv_verifying_otp")
    public AndroidElement verifyingOTPLabel;

    @AndroidFindBy(id = "tv_otp_verification_text")
    public AndroidElement OTPVerificationText;



    public void enterMobileNumer(String mob){
        mobileNumberTextBox.sendKeys(mob);
    }
    public void tapOn_ContinueBtn(){
        continueBtn.click();
    }
    public void enterOTP(String otp){
        inptOTPTextBox.sendKeys(otp);
    }



}
