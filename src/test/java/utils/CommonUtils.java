package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CommonUtils {
    private static Properties prop = new Properties();
    public static int EXPLICIT_WAIT_TIME;
    public static int IMPLICIT_WAIT_TIME;
    public static int DEFAULT_WAIT_TIME;
    public static String APPLICATION_NAME;
    public static String BASE_PKG;
    public static String APP_ACTIVITY;
    public static String APP_PASSWORD;
    private static String APPIUM_PORT;
    public static String AUTOMATION_INSTRUMENTATION;
    public static String BROWSER_NAME;
    public static String PLATFORM_NAME;
    public static String NEW_COMMAND_TIMEOUT;
    public static String PLATFORM_VERSION;
    public static String DEVICE_READY_TIMEOUT;
    public static String DEVICE_NAME;
    public static String APP;
    public static String NO_RESET;
    private static DesiredCapabilities capabilities = new DesiredCapabilities();
    private static URL serverUrl;
    //public static AppiumDriver<MobileElement> driver;
    //private static AndroidDriver mDriver;

    public static void loadMobileAppConfigProp(String propertyFileName) throws IOException {
        FileInputStream fis = new FileInputStream(
                System.getProperty("user.dir") + "/src/test/resources/properties/" + propertyFileName);
        prop.load(fis);

        EXPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("explicit.wait"));
        IMPLICIT_WAIT_TIME = Integer.parseInt(prop.getProperty("implicit.wait"));
        DEFAULT_WAIT_TIME = Integer.parseInt(prop.getProperty("default.wait"));
        // APPLICATION_NAME = prop.getProperty("application.path");
        BASE_PKG = prop.getProperty("base.pkg");
        APP_ACTIVITY = prop.getProperty("application.activity");
        APPIUM_PORT = prop.getProperty("appium.server.port");
        AUTOMATION_INSTRUMENTATION = prop.getProperty("automation.instrumentation");
        DEVICE_NAME = prop.getProperty("device.name");
        BROWSER_NAME = prop.getProperty("browser.name");
        PLATFORM_NAME = prop.getProperty("platform.name");
        PLATFORM_VERSION = prop.getProperty("platform.version");
        NEW_COMMAND_TIMEOUT = prop.getProperty("new.command.timeout");
        DEVICE_READY_TIMEOUT = prop.getProperty("device.ready.timeout");
        NO_RESET = prop.getProperty("no.reset");
    }
    public static void setMobileAppCapabilities() {
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, CommonUtils.BROWSER_NAME);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, CommonUtils.PLATFORM_VERSION);
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, CommonUtils.PLATFORM_NAME);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, CommonUtils.DEVICE_NAME);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, CommonUtils.AUTOMATION_INSTRUMENTATION);
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, CommonUtils.NEW_COMMAND_TIMEOUT);
        capabilities.setCapability(MobileCapabilityType.PAGE_LOAD_STRATEGY, CommonUtils.DEVICE_READY_TIMEOUT);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, CommonUtils.APP_ACTIVITY);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, CommonUtils.BASE_PKG);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, CommonUtils.NO_RESET);
    }
    public static AppiumDriver getAppiumDriver() throws MalformedURLException {
        serverUrl = new URL("http://localhost:" + APPIUM_PORT + "/wd/hub");
        AppiumDriver driver = new AppiumDriver(serverUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

    public static String convertAmountintoGm(int amount,double goldliveprice){
        Double gmquantityfourdecimal= ((long)((amount/goldliveprice)*10000)) / 10000.0;
        String gm_qunatitySTR = String.valueOf(gmquantityfourdecimal);
        return gm_qunatitySTR;
    }
    public static String convertGmintoRupees(double gm, double exclusiveGoldRate){
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println();
        Double amount = Double.valueOf(df.format((gm * exclusiveGoldRate)+((gm* exclusiveGoldRate)*3)/100));
        DecimalFormat priceFormat = new DecimalFormat("##,##,##,##0.##");
        String amountSTR  = priceFormat.format(amount);;
        System.out.println(amount);
        System.out.println(amountSTR);
        return amountSTR;
    }

}
