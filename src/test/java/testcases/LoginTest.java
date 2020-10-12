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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.LoginPO;
import utils.WaitUtils;

import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseClass{
    WaitUtils wu = new WaitUtils();

    @Test
    public void test() {
        LoginPO loginpo = new LoginPO(driver);
        loginpo.tapOn_englishLangRadioBtn();
        loginpo.tapOn_continueBtn();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,20);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("about_me")));
        wu.waitForElementToBeVisible((By.id("about_me")),driver);
    }



    @BeforeTest
    //@Override
    public void setUpPage() {

    }
}


