package testcases;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import utils.PropertyUtils;
import utils.WaitUtils;;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

//Responsible for setting up the Appium test Driver
abstract class BaseClass {
    public static AppiumDriver driver;
    public final static String APPIUM_SERVER_URL = PropertyUtils.getProperty("appium.server.url", "http://127.0.0.1:4723/wd/hub");
    public final static int IMPLICIT_WAIT = PropertyUtils.getIntegerProperty("implicitWait", 30);
    public static WaitUtils waitUtils = new WaitUtils();

    @BeforeClass
    public void setUpAppium() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        setDesiredCapabilitiesForAndroid(capabilities);
        driver = new AppiumDriver(new URL(APPIUM_SERVER_URL), capabilities);
    }

//    @BeforeSuite
//    public void reportSetup(){
//        //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("report.html");
//
//
//    }

    /**
     * This method will be called everytime before your test runs
     */
//    @BeforeTest
//    public abstract void setUpPage();
//

//    @AfterMethod(alwaysRun = true)
//    public void afterMethod(final ITestResult result) throws IOException {
//        String fileName = result.getTestClass().getName() + "_" + result.getName();
//        System.out.println("Test Case: [" + fileName + "] executed..!");
//    }

//    @AfterClass
//    public void afterClass() {
//    }

    @AfterClass
    public void tearDownAppium() {
        quitDriver();
    }

    //It will set the DesiredCapabilities for the local execution

    private void setDesiredCapabilitiesForAndroid(DesiredCapabilities desiredCapabilities) {
        String PLATFORM_NAME = PropertyUtils.getProperty("android.platform");
        String PLATFORM_VERSION = PropertyUtils.getProperty("android.platform.version");
        String APP_NAME = PropertyUtils.getProperty("android.app.name");
        String APP_RELATIVE_PATH = PropertyUtils.getProperty("android.app.location") + APP_NAME;
        //String APP_PATH = getAbsolutePath(APP_RELATIVE_PATH);
        String DEVICE_NAME = PropertyUtils.getProperty("android.device.name");
        String APP_PACKAGE_NAME = PropertyUtils.getProperty("android.app.packageName");
        String APP_ACTIVITY_NAME = PropertyUtils.getProperty("android.app.activityName");
        String APP_FULL_RESET = PropertyUtils.getProperty("android.app.full.reset");
        String APP_NO_RESET = PropertyUtils.getProperty("android.app.no.reset");
        String BROWSER_STACK_USER = PropertyUtils.getProperty("browserstack.user");
        String BROWSER_STACK_KEY = PropertyUtils.getProperty("browserstack.key");
        String BROWSER_STACK_APP = PropertyUtils.getProperty("browserstack.app");
        String BROWSER_STACK_DEVICE = PropertyUtils.getProperty("browserstack.device");

        desiredCapabilities.setCapability("browserstack.user", BROWSER_STACK_USER);
        desiredCapabilities.setCapability("browserstack.key", BROWSER_STACK_KEY);
        desiredCapabilities.setCapability("app", BROWSER_STACK_APP);
        desiredCapabilities.setCapability("device", BROWSER_STACK_DEVICE);

        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, DEVICE_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, PLATFORM_VERSION);
        //desiredCapabilities.setCapability(MobileCapabilityType.APP, APP_PATH);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
        desiredCapabilities.setCapability(MobileCapabilityType.FULL_RESET, APP_FULL_RESET);
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET, APP_NO_RESET);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
    }

//    public static WebDriver getScreenshotableWebDriver() {
//        final WebDriver augmentedDriver = new Augmenter().augment(driver);
//        return augmentedDriver;
//    }

    private static void setTimeOuts(AppiumDriver driver) {
        //Use a higher value if your mobile elements take time to show up
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

//    private static String getAbsolutePath(String appRelativePath) {
//        File file = new File(appRelativePath);
//        return file.getAbsolutePath();
//    }

    //This will quite the android driver instance

    private void quitDriver() {
        try {
            this.driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}