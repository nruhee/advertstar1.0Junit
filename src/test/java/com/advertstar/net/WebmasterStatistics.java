
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

public class WebmasterStatistics {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/report/WebmasterStatistics.html";

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
    public void test() throws Exception {
        test = extent.startTest("webmaster Statistics ", "Testing of webmaster statistics");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("nireshruhee@live.co.uk");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.findElement(By.linkText("Statistics")).click();
        driver.findElement(By.linkText("Summary statistics")).click();
        driver.findElement(By.linkText("By offer")).click();
        driver.findElement(By.linkText("By offer")).click();
        driver.findElement(By.linkText("By subaccount")).click();
        driver.findElement(By.linkText("By traffic source")).click();
        driver.findElement(By.linkText("By country")).click();
        driver.findElement(By.id("toggle-settings")).click();
        driver.findElement(By.linkText("By traffic source")).click();
        driver.findElement(By.linkText("By subaccount")).click();
        driver.findElement(By.linkText("By offer")).click();
        driver.findElement(By.linkText("By date")).click();
        driver.findElement(By.id("toggle-settings")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Detailed actions statistics")).click();
        driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Detailed statistics on clicks")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//button[2]")).click();
        driver.findElement(By.xpath("//button[3]")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Exit the system")).click();

        //LOGS

        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click" );
        test.log(LogStatus.PASS, "By.iduser_email.clear" );
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysnireshruhee@live.co.uk" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ************" );
        test.log(LogStatus.PASS, "By.cssSelectora.custom-green-btn.submit-btn.click" );
        test.log(LogStatus.PASS, "By.linkTextStatistics.click" );
        test.log(LogStatus.PASS, "By.linkTextSummary statistics.click" );
        test.log(LogStatus.PASS, "By.linkTextBy offer.click" );
        test.log(LogStatus.PASS, "By.linkTextBy offer.click" );
        test.log(LogStatus.PASS, "By.linkTextBy subaccount.click" );
        test.log(LogStatus.PASS, "By.linkTextBy traffic source.click" );
        test.log(LogStatus.PASS, "By.linkTextBy country.click" );
        test.log(LogStatus.PASS, "By.idtoggle-settings.click" );
        test.log(LogStatus.PASS, "By.linkTextBy traffic source.click" );
        test.log(LogStatus.PASS, "By.linkTextBy subaccount.click" );
        test.log(LogStatus.PASS, "By.linkTextBy offer.click" );
        test.log(LogStatus.PASS, "By.linkTextBy date.click" );
        test.log(LogStatus.PASS, "By.idtoggle-settings.click" );
        test.log(LogStatus.PASS, "By.idget_stats.click" );
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click" );
        test.log(LogStatus.PASS, "By.linkTextDetailed actions statistics.click" );
        test.log(LogStatus.PASS, "By.cssSelectorbutton.btn.btn-primary.click" );
        test.log(LogStatus.PASS, "By.xpath//button[@type='button'][3].click" );
        test.log(LogStatus.PASS, "By.xpath//button[@type='button'][4].click" );
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click" );
        test.log(LogStatus.PASS, "By.linkTextDetailed statistics on clicks.click" );
        test.log(LogStatus.PASS, "By.xpath//button[@type='button'].click" );
        test.log(LogStatus.PASS, "By.xpath//button[2].click" );
        test.log(LogStatus.PASS, "By.xpath//button[3].click" );
        test.log(LogStatus.PASS, "By.cssSelectora.dropdown-toggle.click" );
        test.log(LogStatus.PASS, "By.linkTextExit the system.click" );

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
