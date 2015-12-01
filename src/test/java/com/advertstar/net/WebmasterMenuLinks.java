
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

public class WebmasterMenuLinks {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/report/WebmasterMenuLinks.html";

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
    public void testMenulinks() throws Exception {
        test = extent.startTest("Webmaster Menulinks", "Menulinks of webmaster checks");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("nireshruhee@live.co.uk");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.findElement(By.cssSelector("i.icon-reorder")).click();
        driver.findElement(By.linkText("Offers catalogue")).click();
        driver.findElement(By.linkText("Offers")).click();
        driver.findElement(By.linkText("My offers and requests")).click();
        driver.findElement(By.linkText("Offers")).click();
        driver.findElement(By.linkText("Coupons catalogue")).click();
        driver.findElement(By.cssSelector("i.icon-cogs")).click();
        driver.findElement(By.linkText("Advertising block")).click();
        driver.findElement(By.cssSelector("i.icon-cogs")).click();
        driver.findElement(By.linkText("Domain parking")).click();
        driver.findElement(By.cssSelector("i.icon-cogs")).click();
        driver.findElement(By.linkText("Landings split-testing")).click();
        driver.findElement(By.cssSelector("i.icon-money")).click();
        driver.findElement(By.linkText("Balance history")).click();
        driver.findElement(By.cssSelector("i.icon-money")).click();
        driver.findElement(By.linkText("Payments history")).click();
        driver.findElement(By.linkText("Finance")).click();
        driver.findElement(By.linkText("Referral system")).click();
        driver.findElement(By.xpath("//li[6]/a/span")).click();
        driver.findElement(By.linkText("Funs an agent account")).click();
        driver.findElement(By.cssSelector("i.icon-question-sign")).click();
        driver.findElement(By.linkText("Tickets")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Timetable")).click();
        driver.findElement(By.xpath("//li[8]/a/i")).click();
        driver.findElement(By.cssSelector("i.icon-info-sign")).click();
        driver.findElement(By.cssSelector("i.icon-globe")).click();
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Summary statistics")).click();
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Detailed actions statistics")).click();
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Detailed statistics on clicks")).click();
        driver.findElement(By.cssSelector("i.icon-home")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Exit the system")).click();

        //LOGS

        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click");
        test.log(LogStatus.PASS, "By.iduser_email.clear");
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysnireshruhee@live.co.uk");
        test.log(LogStatus.PASS, "By.iduser_password.clear");
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ************");
        test.log(LogStatus.PASS, "By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-reorder.click");
        test.log(LogStatus.PASS, "By.linkTextOffers catalogue.click");
        test.log(LogStatus.PASS, "By.linkTextOffers.click");
        test.log(LogStatus.PASS, "By.linkTextMy offers and requests.click");
        test.log(LogStatus.PASS, "By.linkTextOffers.click");
        test.log(LogStatus.PASS, "By.linkTextCoupons catalogue.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-cogs.click");
        test.log(LogStatus.PASS, "By.linkTextAdvertising block.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-cogs.click");
        test.log(LogStatus.PASS, "By.linkTextDomain parking.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-cogs.click");
        test.log(LogStatus.PASS, "By.linkTextLandings split-testing.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-money.click");
        test.log(LogStatus.PASS, "By.linkTextBalance history.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-money.click");
        test.log(LogStatus.PASS, "By.linkTextPayments history.click");
        test.log(LogStatus.PASS, "By.linkTextFinance.click");
        test.log(LogStatus.PASS, "By.linkTextReferral system.click");
        test.log(LogStatus.PASS, "By.xpath//li[6]/a/span.click");
        test.log(LogStatus.PASS, "By.linkTextFuns an agent account.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-question-sign.click");
        test.log(LogStatus.PASS, "By.linkTextTickets.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextTimetable.click");
        test.log(LogStatus.PASS, "By.xpath//li[8]/a/i.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-PASS-sign.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-globe.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-bar-chart.click");
        test.log(LogStatus.PASS, "By.linkTextSummary statistics.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-bar-chart.click");
        test.log(LogStatus.PASS, "By.linkTextDetailed actions statistics.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-bar-chart.click");
        test.log(LogStatus.PASS, "By.linkTextDetailed statistics on clicks.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-home.click");
        test.log(LogStatus.PASS, "By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS, "By.linkTextExit the system.click");


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