
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

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class WebmasterTraffic {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/workspace/advertstar1.0Junit/reports/WebmasterTraffic.html";

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
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().maximize();
        baseUrl = "https://advertstar.net/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTsources() throws Exception {
        test = extent.startTest("Webmaster traffic", "Testing of webmaster traffics");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("nireshruhee@live.co.uk");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.cssSelector("i.icon-globe")).click();
        //WEBSITE//

        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.cssSelector("a > li")).click();
        driver.findElement(By.id("webmaster_site_stats_login")).clear();
        driver.findElement(By.id("webmaster_site_stats_login")).sendKeys("nireshruhee@live.co.uk");
        driver.findElement(By.id("webmaster_site_stats_password")).clear();
        driver.findElement(By.id("webmaster_site_stats_password")).sendKeys("plismocok123");
        driver.findElement(By.id("webmaster_site_slug")).click();
        driver.findElement(By.id("webmaster_site_slug")).clear();
        driver.findElement(By.id("webmaster_site_slug")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("webmaster_site_url")).clear();
        driver.findElement(By.cssSelector("ul.chosen-choices")).click();
        driver.findElement(By.id("webmaster_site_url")).sendKeys("http://" + UUID.randomUUID().toString() + ".com");
        driver.findElement(By.id("webmaster_site_overview")).click();
        driver.findElement(By.id("webmaster_site_overview")).clear();
        driver.findElement(By.id("webmaster_site_overview")).sendKeys("Test test Test test");
        driver.findElement(By.id("webmaster_site_admin_comment")).clear();
        driver.findElement(By.id("webmaster_site_admin_comment")).sendKeys("Test test test");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.id("confirm_website")).click();
        driver.findElement(By.linkText("Confirm later")).click();

        //2//

        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[2]/li")).click();
        driver.findElement(By.id("webmaster_site_slug")).click();
        driver.findElement(By.id("webmaster_site_slug")).clear();
        driver.findElement(By.id("webmaster_site_slug")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("webmaster_site_overview")).click();
        driver.findElement(By.id("webmaster_site_overview")).clear();
        driver.findElement(By.id("webmaster_site_overview")).sendKeys("Test test test test");
        driver.findElement(By.xpath("//div[@id='webmaster_site_category_ids_chosen']/ul")).click();
        driver.findElement(By.cssSelector("input.default")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("commit")).click();

        //3//

        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[3]/li")).click();
        driver.findElement(By.id("webmaster_site_slug")).click();
        driver.findElement(By.id("webmaster_site_slug")).clear();
        driver.findElement(By.id("webmaster_site_slug")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("webmaster_site_type_ad")).click();
        driver.findElement(By.id("webmaster_site_overview")).click();
        driver.findElement(By.id("webmaster_site_overview")).clear();
        driver.findElement(By.id("webmaster_site_overview")).sendKeys("test test test");
        driver.findElement(By.xpath("//div[@id='webmaster_site_category_ids_chosen']/ul")).click();
        driver.findElement(By.cssSelector("input.default")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("accept")).click();
        driver.findElement(By.id("submit-agent")).click();

        //4//

        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[4]/li")).click();
        driver.findElement(By.xpath("//div[5]/div/div/div")).click();
        driver.findElement(By.id("webmaster_site_slug")).click();
        driver.findElement(By.id("webmaster_site_slug")).clear();
        driver.findElement(By.id("webmaster_site_slug")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("webmaster_site_overview")).clear();
        driver.findElement(By.id("webmaster_site_overview")).sendKeys("test test Test");
        driver.findElement(By.xpath("//div[@id='webmaster_site_category_ids_chosen']/ul")).click();
        driver.findElement(By.cssSelector("input.default")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("commit")).click();

        //5//

        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[5]/li")).click();
        driver.findElement(By.cssSelector("ul.chosen-choices")).click();
        driver.findElement(By.id("webmaster_site_slug")).click();
        driver.findElement(By.id("webmaster_site_slug")).clear();
        driver.findElement(By.id("webmaster_site_slug")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("webmaster_site_url")).clear();
        driver.findElement(By.id("webmaster_site_url")).sendKeys("http://" + UUID.randomUUID().toString() + ".com");
        driver.findElement(By.id("webmaster_site_overview")).click();
        driver.findElement(By.id("webmaster_site_overview")).clear();
        driver.findElement(By.id("webmaster_site_overview")).sendKeys("Test Test Test");
        driver.findElement(By.xpath("//div[@id='webmaster_site_category_ids_chosen']/ul")).click();
        driver.findElement(By.cssSelector("input.default")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("commit")).click();

        //6//

        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[6]/li")).click();
        driver.findElement(By.id("webmaster_site_slug")).click();
        driver.findElement(By.id("webmaster_site_slug")).clear();
        driver.findElement(By.id("webmaster_site_slug")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("webmaster_site_overview")).clear();
        driver.findElement(By.cssSelector("ul.chosen-choices")).click();
        driver.findElement(By.id("webmaster_site_overview")).sendKeys("Test Test Test");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.xpath("//div[@id='webmaster_site_category_ids_chosen']/ul")).click();
        driver.findElement(By.cssSelector("input.default")).sendKeys(Keys.ENTER);
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Exit the system")).click();



        //LOGS

        test.log(LogStatus.INFO, "By.linkTextAffiliate login.click" );
        test.log(LogStatus.INFO, "By.iduser_password.clear" );
        test.log(LogStatus.INFO, "By.iduser_password.sendKeys **********" );
        test.log(LogStatus.INFO, "By.iduser_email.clear" );
        test.log(LogStatus.INFO, "By.iduser_email.sendKeysnireshruhee@live.co.uk" );
        test.log(LogStatus.INFO, "By.linkTextLog in.click" );
        test.log(LogStatus.INFO, "By.cssSelectori.icon-globe.click" );

        //WEBSITE//

        test.log(LogStatus.INFO, "By.idnew_source.click" );
        test.log(LogStatus.INFO, "By.cssSelectora > li.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_stats_login.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_stats_login.sendKeysnireshruhee@live.co.uk" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_stats_password.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_stats_password.sendKeys **********" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_url.clear" );
        test.log(LogStatus.INFO, "By.cssSelectorul.chosen-choices.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_url.sendKeyshttp: + UUID.randomUUID.toString + .com" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.sendKeysTest test Test test" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_admin_comment.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_admin_comment.sendKeysTest test test" );
        test.log(LogStatus.INFO, "By.namecommit.click" );
        test.log(LogStatus.INFO, "By.idconfirm_website.click" );
        test.log(LogStatus.INFO, "By.linkTextConfirm later.click" );

        //2//

        test.log(LogStatus.INFO, "By.idnew_source.click" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='add_source_block'ula2li.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.sendKeysTest test test test" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='webmaster_site_category_ids_chosen'ul.click" );
        test.log(LogStatus.INFO, "By.cssSelectorinput.default.sendKeysKeys.ENTER" );
        test.log(LogStatus.INFO, "By.namecommit.click" );

        //3//

        test.log(LogStatus.INFO, "By.idnew_source.click" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='add_source_block'ula3li.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_type_ad.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.sendKeystest test test" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='webmaster_site_category_ids_chosen'ul.click" );
        test.log(LogStatus.INFO, "By.cssSelectorinput.default.sendKeysKeys.ENTER" );
        test.log(LogStatus.INFO, "By.idaccept.click" );
        test.log(LogStatus.INFO, "By.idsubmit-agent.click" );

        //4//

        test.log(LogStatus.INFO, "By.idnew_source.click" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='add_source_block'ula4li.click" );
        test.log(LogStatus.INFO, "By.xpathdiv5divdivdiv.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.sendKeystest test Test" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='webmaster_site_category_ids_chosen'ul.click" );
        test.log(LogStatus.INFO, "By.cssSelectorinput.default.sendKeysKeys.ENTER" );
        test.log(LogStatus.INFO, "By.namecommit.click" );

        //5//

        test.log(LogStatus.INFO, "By.idnew_source.click" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='add_source_block'ula5li.click" );
        test.log(LogStatus.INFO, "By.cssSelectorul.chosen-choices.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_slug.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_url.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_url.sendKeyshttp: + UUID.randomUUID.toString + .com" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.click" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.clear" );
        test.log(LogStatus.INFO, "By.idwebmaster_site_overview.sendKeysTest Test Test" );
        test.log(LogStatus.INFO, "By.xpathdiv@id='webmaster_site_category_ids_chosen'ul.click" );
        test.log(LogStatus.INFO, "By.cssSelectorinput.default.sendKeysKeys.ENTER" );
        test.log(LogStatus.INFO, "By.namecommit.click" );

        //6//

        test.log(LogStatus.PASS, "By.idnew_source.click" );
        test.log(LogStatus.PASS, "By.xpathdiv@id='add_source_block'ula6li.click" );
        test.log(LogStatus.PASS, "By.idwebmaster_site_slug.click" );
        test.log(LogStatus.PASS, "By.idwebmaster_site_slug.clear" );
        test.log(LogStatus.PASS, "By.idwebmaster_site_slug.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.PASS, "By.idwebmaster_site_overview.clear" );
        test.log(LogStatus.PASS, "By.cssSelectorul.chosen-choices.click" );
        test.log(LogStatus.PASS, "By.idwebmaster_site_overview.sendKeysTest Test Test" );
        test.log(LogStatus.PASS, "By.namecommit.click" );
        test.log(LogStatus.PASS, "By.xpathdiv@id='webmaster_site_category_ids_chosen'ul.click" );
        test.log(LogStatus.PASS, "By.cssSelectorinput.default.sendKeysKeys.ENTER" );
        test.log(LogStatus.PASS, "By.namecommit.click" );
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