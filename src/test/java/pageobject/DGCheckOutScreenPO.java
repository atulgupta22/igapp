package pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DGCheckOutScreenPO extends BasePO {

    public DGCheckOutScreenPO(AppiumDriver driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Checkout']")
    public AndroidElement checkOutLabel;

    @AndroidFindBy(id = "tv_price")
    public AndroidElement livePriceinCheckoutScreen;

    @AndroidFindBy(id = "tv_gold_qty_string")
    public AndroidElement goldQuantityLabel;

    @AndroidFindBy(id = "tv_gold_qty")
    public AndroidElement goldQuantity;

    @AndroidFindBy(id = "tv_gold_value_string")
    public AndroidElement goldValueLabel;

    @AndroidFindBy(id = "tv_gold_value")
    public AndroidElement goldValue;

    @AndroidFindBy(id = "tv_gst_amount_string")
    public AndroidElement GSTLabel;

    @AndroidFindBy(id = "tv_gst_amount")
    public AndroidElement GSTAmount;

    @AndroidFindBy(id = "tv_amount_payable_string")
    public AndroidElement totalAmountPayblelabel;

    @AndroidFindBy(id = "textinput_placeholder")
    public AndroidElement stateDropdown;

    @AndroidFindBy(id = "btn_checkout")
    public AndroidElement continueToPaymentBtn;


    public void tapOn_StateDropdown(){ stateDropdown.click(); }

    public void tapOn_ContinueToPaymentBtn(){ continueToPaymentBtn.click(); }

    public void tapOn_TotalAmountPayblelabel(){ totalAmountPayblelabel.click(); }





}
