
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
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class WebmasterTools {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/report/var/lib/jenkins/jobs/Advertstar1.0Test/workspace/reports/WebmasterTools.html";

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
    public void test234() throws Exception {
        test = extent.startTest("Webmaster tools", "Testing of webmaster tools");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("nireshruhee@live.co.uk");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.linkText("Tools")).click();
        driver.findElement(By.linkText("Advertising block")).click();
        driver.findElement(By.linkText("Create an advertising block")).click();
        driver.findElement(By.id("rotator_name")).click();
        driver.findElement(By.id("rotator_name")).clear();
        driver.findElement(By.id("rotator_name")).sendKeys("Test Block");
        new Select(driver.findElement(By.id("site"))).selectByVisibleText("http://www.nireshtest.ru");
        new Select(driver.findElement(By.id("type"))).selectByVisibleText("200x100");
        driver.findElement(By.cssSelector("option[value=\"2\"]")).click();
        driver.findElement(By.linkText("Categories")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.id("category"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        new Select(driver.findElement(By.id("category"))).selectByVisibleText("Engmatrix");
        driver.findElement(By.cssSelector("option[value=\"16\"]")).click();
        driver.findElement(By.linkText("Add")).click();
        driver.findElement(By.cssSelector("i.icon-cogs")).click();
        driver.findElement(By.linkText("Domain parking")).click();
        driver.findElement(By.id("parked_domain_domain")).clear();
        driver.findElement(By.id("parked_domain_domain")).sendKeys("www.google.com");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Check the correctness")).click();
        driver.findElement(By.linkText("Check the correctness")).click();
        driver.findElement(By.linkText("Delete")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Are you sure you want to remove this domain[\\s\\S]$"));
        driver.findElement(By.xpath("//li[4]/a/span")).click();
        driver.findElement(By.linkText("Coupons catalogue")).click();
        driver.findElement(By.linkText("By date created")).click();
        driver.findElement(By.linkText("In descending order")).click();
        driver.findElement(By.linkText("By date created")).click();
        driver.findElement(By.linkText("In ascending order")).click();
        driver.findElement(By.linkText("By date expired")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'In descending order')])[2]")).click();
        driver.findElement(By.linkText("By date expired")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'In ascending order')])[2]")).click();
        driver.findElement(By.id("user_role")).click();
        driver.findElement(By.id("user_role")).click();
        driver.findElement(By.linkText("Offers")).click();
        driver.findElement(By.linkText("My offers and requests")).click();
        driver.findElement(By.xpath("//li[5]/a/span")).click();
        driver.findElement(By.linkText("Domain parking")).click();
        driver.findElement(By.cssSelector("i.icon-cogs")).click();
        driver.findElement(By.linkText("Landings split-testing")).click();
        driver.findElement(By.id("user_role")).click();
        driver.findElement(By.linkText("Exit the system")).click();


        //LOGS


        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click");
        test.log(LogStatus.PASS, "By.iduser_password.clear");
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ************");
        test.log(LogStatus.PASS, "By.iduser_email.clear");
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysnireshruhee@live.co.uk");
        test.log(LogStatus.PASS, "By.linkTextLog in.click");
        test.log(LogStatus.PASS, "By.linkTextTools.click");
        test.log(LogStatus.PASS, "By.linkTextAdvertising block.click");
        test.log(LogStatus.PASS, "By.linkTextCreate an advertising block.click");
        test.log(LogStatus.PASS, "By.idrotator_name.click");
        test.log(LogStatus.PASS, "By.idrotator_name.clear");
        test.log(LogStatus.PASS, "By.idrotator_name.sendKeysTest Block");
        test.log(LogStatus.PASS, "By.cssSelectoroption value=2.click");
        test.log(LogStatus.PASS, "By.linkTextCategories.click");
        test.log(LogStatus.PASS, "By.cssSelectoroptionvalue=16.click");
        test.log(LogStatus.PASS, "By.linkTextAdd.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-cogs.click");
        test.log(LogStatus.PASS, "By.linkTextDomain parking.click");
        test.log(LogStatus.PASS, "By.idparked_domain_domain.clear");
        test.log(LogStatus.PASS, "By.idparked_domain_domain.sendKeys www.google.com");
        test.log(LogStatus.PASS, "By.namecommit.click");
        test.log(LogStatus.PASS, "By.linkTextCheck the correctness.click");
        test.log(LogStatus.PASS, "By.linkTextCheck the correctness.click");
        test.log(LogStatus.PASS, "By.linkTextDelete.click");
        test.log(LogStatus.PASS, "By.xpath//li[4]/a/span.click");
        test.log(LogStatus.PASS, "By.linkTextCoupons catalogue.click");
        test.log(LogStatus.PASS, "By.linkTextBy date created.click");
        test.log(LogStatus.PASS, "By.linkTextIn descending order.click");
        test.log(LogStatus.PASS, "By.linkTextBy date created.click");
        test.log(LogStatus.PASS, "By.linkTextIn ascending order.click");
        test.log(LogStatus.PASS, "By.linkTextBy date expired.click");
        test.log(LogStatus.PASS, "By.xpath//a[containstext,'In descending order'][2].click");
        test.log(LogStatus.PASS, "By.linkTextBy date expired.click");
        test.log(LogStatus.PASS, "By.xpath//a[containstext,'In ascending order'][2].click");
        test.log(LogStatus.PASS, "By.iduser_role.click");
        test.log(LogStatus.PASS, "By.iduser_role.click");
        test.log(LogStatus.PASS, "By.linkTextOffers.click");
        test.log(LogStatus.PASS, "By.linkTextMy offers and requests.click");
        test.log(LogStatus.PASS, "By.xpath//li[5]/a/span.click");
        test.log(LogStatus.PASS, "By.linkTextDomain parking.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-cogs.click");
        test.log(LogStatus.PASS, "By.linkTextLandings split-testing.click");
        test.log(LogStatus.PASS, "By.iduser_role.click");
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