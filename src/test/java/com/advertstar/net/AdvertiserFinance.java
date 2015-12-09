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
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class AdvertiserFinance {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/workspace/advertstar1.0Junit/reports/AdvertiserFinance.html";

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
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().maximize();
        baseUrl = "https://advertstar.net/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Test
    public void testAdvertiserFinance() throws Exception {
        test = extent.startTest("Advertiser Finance", "Testing of advertiser finance panel");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.linkText("Финансы")).click();
        driver.findElement(By.linkText("Пополнение баланса")).click();
        driver.findElement(By.id("amount")).click();
        driver.findElement(By.id("amount")).clear();
        driver.findElement(By.id("amount")).sendKeys("500");
        driver.findElement(By.id("webmoney")).click();
        driver.get("https://advertstar.net/advertiser");
        driver.findElement(By.cssSelector("i.icon-money")).click();
        driver.findElement(By.linkText("Мой баланс")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();

        //LOGS

        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click" );
        test.log(LogStatus.PASS, "By.iduser_email.clear" );
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysn.ruhee@advertstar.net" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKey *********" );
        test.log(LogStatus.PASS, "By.linkTextLog in.click" );
        test.log(LogStatus.PASS, "By.linkTextФинансы.click" );
        test.log(LogStatus.PASS, "By.linkTextПополнение баланса.click" );
        test.log(LogStatus.PASS, "By.idamount.click" );
        test.log(LogStatus.PASS, "By.idamount.clear" );
        test.log(LogStatus.PASS, "By.idamount.sendKeys500" );
        test.log(LogStatus.PASS, "By.idwebmoney.click" );
        test.log(LogStatus.PASS, "By.cssSelectori.icon-money.click" );
        test.log(LogStatus.PASS, "By.linkTextМой баланс.click" );
        test.log(LogStatus.PASS, "By.cssSelectora.dropdown-toggle.click" );
        test.log(LogStatus.PASS, "By.linkTextВыйти из системы.click" );


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