/**
 * Created by shmodwalker on 11/11/2015.
 ====================================================================================================
 ====  =====       ===  ====  ==        ==       ===        ===      ===        =====  =====       ==
 ===    ====  ====  ==  ====  ==  ========  ====  =====  =====  ====  =====  =======    ====  ====  =
 ==  ==  ===  ====  ==  ====  ==  ========  ====  =====  =====  ====  =====  ======  ==  ===  ====  =
 =  ====  ==  ====  ==  ====  ==  ========  ===   =====  ======  ==========  =====  ====  ==  ===   =
 =  ====  ==  ====  ==   ==   ==      ====      =======  ========  ========  =====  ====  ==      ===
 =        ==  ====  ===  ==  ===  ========  ====  =====  ==========  ======  =====        ==  ====  =
 =  ====  ==  ====  ===  ==  ===  ========  ====  =====  =====  ====  =====  =====  ====  ==  ====  =
 =  ====  ==  ====  ====    ====  ========  ====  =====  =====  ====  =====  =====  ====  ==  ====  =
 =  ====  ==       ======  =====        ==  ====  =====  ======      ======  =====  ====  ==  ====  =
 ====================================================================================================
 */

package com.advertstar.net;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class WebmasterCreate {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/workspace/advertstar1.0Junit/reports/WebmasterCreate.html";

    private static ExtentReports extent;
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private ExtentTest test;

    @BeforeClass
    public static void beforeClass() {
        extent = new ExtentReports(REPORT_FILE_LOCATION, true);
    }

    @AfterClass
    public static void afterClass() {
        extent.flush();
    }


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        baseUrl = "https://advertstar.net/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testWebmasterCreate() throws Exception {
        test = extent.startTest("webmaster Account", "Webmaster Account Creation");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Become a publisher")).click();
        driver.findElement(By.linkText("Become a publisher")).click();
        driver.findElement(By.id("user_name")).clear();
        driver.findElement(By.id("user_name")).sendKeys("Niresh Ruhee");
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("test1@advertstar.net");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.id("user_password_confirmation")).clear();
        driver.findElement(By.id("user_password_confirmation")).sendKeys("plismocok123");
        driver.findElement(By.name("accept")).click();
        driver.findElement(By.linkText("Become a Publisher")).click();


        //LOGS

        test.log(LogStatus.PASS, "By.linkTextBecome a publisher.click" );
        test.log(LogStatus.PASS, "By.linkTextBecome a publisher.click" );
        test.log(LogStatus.PASS, "By.iduser_name.clear" );
        test.log(LogStatus.PASS, "By.iduser_name.sendKeys Niresh Ruhee" );
        test.log(LogStatus.PASS, "By.iduser_email.clear" );
        test.log(LogStatus.PASS, "By.iduser_email.sendKeystest1@advertstar.net" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ************" );
        test.log(LogStatus.PASS, "By.iduser_password_confirmation.clear" );
        test.log(LogStatus.PASS, "By.iduser_password_confirmation.send Keys ************" );
        test.log(LogStatus.PASS, "By.nameaccept.click" );
        test.log(LogStatus.PASS, "By.linkTextBecome a Publisher.click" );

        //LOGS\\


        extent.endTest(test);


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}