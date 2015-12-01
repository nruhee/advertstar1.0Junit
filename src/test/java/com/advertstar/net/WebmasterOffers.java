
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
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class WebmasterOffers {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/report/WebmasterOffers.html";

    private static ExtentReports extent;
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private ExtentTest test;

    @BeforeClass
    public static void beforeClass() {
        extent = new ExtentReports(REPORT_FILE_LOCATION, true);
        ExtentTest test = extent
                .startTest("Categories")
                .assignCategory("Regression", "ExtentAPI");
        test.log(LogStatus.PASS, "HTML", "Usage: <span style='font-weight:bold;'>BOLD TEXT</span>");
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
    public void offerstest() throws Exception {
        test = extent.startTest("webmaster offers", "Testing of offers of Webmaster Panel");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("nireshruhee@live.co.uk");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//li[4]/a/span")).click();
        driver.findElement(By.linkText("Offers catalogue")).click();
        driver.findElement(By.id("exclusive")).click();
        driver.findElement(By.id("exclusive_terms")).click();
        driver.findElement(By.id("first_active_at")).click();
        driver.findElement(By.id("feed")).click();
        driver.findElement(By.id("feed")).click();
        driver.findElement(By.id("first_active_at")).click();
        driver.findElement(By.id("exclusive_terms")).click();
        driver.findElement(By.id("exclusive")).click();
        driver.findElement(By.linkText("Request an offer")).click();
        driver.findElement(By.cssSelector("div.span4 > input[name=\"ticket[name]\"]")).clear();
        driver.findElement(By.cssSelector("div.span4 > input[name=\"ticket[name]\"]")).sendKeys("Test");
        driver.findElement(By.name("ticket[link]")).clear();
        driver.findElement(By.name("ticket[link]")).sendKeys("http://offertest.com");
        driver.findElement(By.name("ticket[lid]")).clear();
        driver.findElement(By.name("ticket[lid]")).sendKeys("500");
        driver.findElement(By.name("ticket[src]")).clear();
        driver.findElement(By.name("ticket[src]")).sendKeys("500 - this is a test - no reply please");
        driver.findElement(By.cssSelector("#new_offer_form > input[name=\"commit\"]")).click();
        driver.findElement(By.id("message")).click();
        driver.findElement(By.id("message")).clear();
        driver.findElement(By.id("message")).sendKeys("this is a test please do not reply");
        driver.findElement(By.name("commit")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Отправить сообщение[\\s\\S]$"));
        driver.findElement(By.linkText("Offers")).click();
        driver.findElement(By.linkText("Offers catalogue")).click();
        driver.findElement(By.linkText("Offers")).click();
        driver.findElement(By.linkText("My offers and requests")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Coupons catalogue")).click();
        driver.findElement(By.linkText("By date created")).click();
        driver.findElement(By.linkText("In ascending order")).click();
        driver.findElement(By.linkText("By date created")).click();
        driver.findElement(By.linkText("In descending order")).click();
        driver.findElement(By.linkText("By date expired")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'In descending order')])[2]")).click();
        driver.findElement(By.linkText("By date expired")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'In ascending order')])[2]")).click();
        driver.findElement(By.xpath("//li[4]/a/span")).click();
        driver.findElement(By.linkText("Offers catalogue")).click();
        driver.findElement(By.id("offer_name")).click();
        driver.findElement(By.id("offer_name")).clear();
        driver.findElement(By.id("offer_name")).sendKeys("fei");
        driver.findElement(By.id("offer_name")).sendKeys(Keys.ENTER);
        driver.get("https://advertstar.net/webmaster/offers/1193-feifan-watch?locale=en");
        driver.findElement(By.id("connect-offer")).click();
        driver.findElement(By.cssSelector("#first-get-hash")).click();
        driver.findElement(By.cssSelector("button.close")).click();
        driver.findElement(By.linkText("Description")).click();
        driver.findElement(By.linkText("Conditionsimportant!")).click();
        driver.findElement(By.linkText("Accepted traffic")).click();
        driver.findElement(By.linkText("Latest news")).click();
        driver.findElement(By.linkText("Advertising links")).click();
        driver.findElement(By.linkText("Promo-materials")).click();
        driver.findElement(By.linkText("Conditionsimportant!")).click();
        driver.findElement(By.linkText("Description")).click();
        driver.findElement(By.linkText("Advertising links")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Offers catalogue")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("My offers and requests")).click();
        driver.findElement(By.linkText("Offers")).click();
        driver.findElement(By.linkText("My offers and requests")).click();
        driver.findElement(By.id("model_attribute")).click();
        driver.findElement(By.linkText("Delete all taken links")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Are you sure[\\s\\S]$"));
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Exit the system")).click();



        //LOGS

        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click");
        test.log(LogStatus.PASS, "By.iduser_email.clear");
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysnireshruhee@live.co.uk");
        test.log(LogStatus.PASS, "By.iduser_password.clear");
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ************");
        test.log(LogStatus.PASS, "By.linkTextLog in.click");
        test.log(LogStatus.PASS, "By.xpath//li[4]/a/span.click");
        test.log(LogStatus.PASS, "By.linkTextOffers catalogue.click");
        test.log(LogStatus.PASS, "By.idexclusive.click");
        test.log(LogStatus.PASS, "By.idexclusive_terms.click");
        test.log(LogStatus.PASS, "By.idfirst_active_at.click");
        test.log(LogStatus.PASS, "By.idfeed.click");
        test.log(LogStatus.PASS, "By.idfeed.click");
        test.log(LogStatus.PASS, "By.idfirst_active_at.click");
        test.log(LogStatus.PASS, "By.idexclusive_terms.click");
        test.log(LogStatus.PASS, "By.idexclusive.click");
        test.log(LogStatus.PASS, "By.linkTextRequest an offer.click");
        test.log(LogStatus.PASS, "By.cssSelectordiv.span4 > input name=ticket name.clear");
        test.log(LogStatus.PASS, "By.cssSelectordiv.span4 > inputname=ticketname.sendKeysTest");
        test.log(LogStatus.PASS, "By.nameticket[link].clear");
        test.log(LogStatus.PASS, "By.nameticket[link].sendKeyshttp://offertest.com");
        test.log(LogStatus.PASS, "By.nameticket[lid].clear");
        test.log(LogStatus.PASS, "By.nameticket[lid].sendKeys500");
        test.log(LogStatus.PASS, "By.nameticket[src].clear");
        test.log(LogStatus.PASS, "By.nameticket[src].sendKeys500 - this is a test - no reply please");
        test.log(LogStatus.PASS, "By.cssSelector#new_offer_form > inputname=commit.click");
        test.log(LogStatus.PASS, "By.idmessage.click");
        test.log(LogStatus.PASS, "By.idmessage.clear");
        test.log(LogStatus.PASS, "By.idmessage.sendKeysthis is a test please do not reply");
        test.log(LogStatus.PASS, "By.namecommit.click");
        test.log(LogStatus.PASS, "By.linkTextOffers.click");
        test.log(LogStatus.PASS, "By.linkTextOffers catalogue.click");
        test.log(LogStatus.PASS, "By.linkTextOffers.click");
        test.log(LogStatus.PASS, "By.linkTextMy offers and requests.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextCoupons catalogue.click");
        test.log(LogStatus.PASS, "By.linkTextBy date created.click");
        test.log(LogStatus.PASS, "By.linkTextIn ascending order.click");
        test.log(LogStatus.PASS, "By.linkTextBy date created.click");
        test.log(LogStatus.PASS, "By.linkTextIn descending order.click");
        test.log(LogStatus.PASS, "By.linkTextBy date expired.click");
        test.log(LogStatus.PASS, "By.xpath//a[containstext,'In descending order'][2].click");
        test.log(LogStatus.PASS, "By.linkTextBy date expired.click");
        test.log(LogStatus.PASS, "By.xpath//a[containstext,'In ascending order'][2].click");
        test.log(LogStatus.PASS, "By.xpath//li[4]/a/span.click");
        test.log(LogStatus.PASS, "By.linkTextOffers catalogue.click");
        test.log(LogStatus.PASS, "By.idoffer_name.click");
        test.log(LogStatus.PASS, "By.idoffer_name.clear");
        test.log(LogStatus.PASS, "By.idoffer_name.sendKeysfei");
        test.log(LogStatus.PASS, "By.idoffer_name.sendKeysKeys.ENTER");
        test.log(LogStatus.PASS, "By.idconnect-offer.click");
        test.log(LogStatus.PASS, "By.cssSelector#first-get-hash.click");
        test.log(LogStatus.PASS, "By.cssSelectorbutton.close.click");
        test.log(LogStatus.PASS, "By.linkTextDescription.click");
        test.log(LogStatus.PASS, "By.linkTextConditionsimportant!.click");
        test.log(LogStatus.PASS, "By.linkTextAccepted traffic.click");
        test.log(LogStatus.PASS, "By.linkTextLatest news.click");
        test.log(LogStatus.PASS, "By.linkTextAdvertising links.click");
        test.log(LogStatus.PASS, "By.linkTextPromo-materials.click");
        test.log(LogStatus.PASS, "By.linkTextConditionsimportant!.click");
        test.log(LogStatus.PASS, "By.linkTextDescription.click");
        test.log(LogStatus.PASS, "By.linkTextAdvertising links.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextOffers catalogue.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextMy offers and requests.click");
        test.log(LogStatus.PASS, "By.linkTextOffers.click");
        test.log(LogStatus.PASS, "By.linkTextMy offers and requests.click");
        test.log(LogStatus.PASS, "By.idmodel_attribute.click");
        test.log(LogStatus.PASS, "By.linkTextDelete all taken links.click");
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