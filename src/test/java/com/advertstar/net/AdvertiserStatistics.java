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

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class AdvertiserStatistics {

    public static final String REPORT_FILE_LOCATION = "target\\Reports\\AdvertiserStatistics.html";

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
    public void testAdvertiserStatistics() throws Exception {
        test = extent.startTest("Advertiser statistics", "Testing of advertiser statistics panel");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.linkText("Статистика")).click();
        driver.findElement(By.linkText("Сводная статистика")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("div.widget-content")).click();
        driver.findElement(By.id("toggle-settings")).click();
        driver.findElement(By.linkText("По офферам")).click();
        driver.findElement(By.linkText("По источникам трафика")).click();
        driver.findElement(By.linkText("По странам")).click();
        driver.findElement(By.linkText("Мои пресеты")).click();
        driver.findElement(By.linkText("Сохранить пресет")).click();
        driver.findElement(By.id("preset-name")).clear();
        driver.findElement(By.id("preset-name")).sendKeys(UUID.randomUUID().toString());
        driver.findElement(By.id("create-preset")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.linkText("Статистика")).click();
        driver.findElement(By.linkText("Подробная статистика по действиям")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("h4")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.id("user_role")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();

        //LOGS

        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click" );
        test.log(LogStatus.PASS, "By.iduser_email.clear" );
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysn.ruhee@advertstar.net" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ************" );
        test.log(LogStatus.PASS, "By.linkTextLog in.click" );
        test.log(LogStatus.PASS, "By.linkTextСтатистика.click" );
        test.log(LogStatus.PASS, "By.linkTextСводная статистика.click" );
        test.log(LogStatus.PASS, "By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS, "By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS, "By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS, "By.cssSelectordiv.widget-content.click" );
        test.log(LogStatus.PASS, "By.idtoggle-settings.click" );
        test.log(LogStatus.PASS, "By.linkTextПо офферам.click" );
        test.log(LogStatus.PASS, "By.linkTextПо источникам трафика.click" );
        test.log(LogStatus.PASS, "By.linkTextПо странам.click" );
        test.log(LogStatus.PASS, "By.linkTextМои пресеты.click" );
        test.log(LogStatus.PASS, "By.linkTextСохранить пресет.click" );
        test.log(LogStatus.PASS, "By.idpreset-name.clear" );
        test.log(LogStatus.PASS, "By.idpreset-name.sendKeysUUID.randomUUID.toString" );
        test.log(LogStatus.PASS, "By.idcreate-preset.click" );
        test.log(LogStatus.PASS, "By.idget_stats.click" );
        test.log(LogStatus.PASS, "By.linkTextСтатистика.click" );
        test.log(LogStatus.PASS, "By.linkTextПодробная статистика по действиям.click" );
        test.log(LogStatus.PASS, "By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS, "By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS, "By.cssSelectorh4.click" );
        test.log(LogStatus.PASS, "By.cssSelectorbutton.btn.btn-large.click" );
        test.log(LogStatus.PASS, "By.xpath//button[@type='button'][2].click");
        test.log(LogStatus.PASS, "By.xpath//button[@type='button'][3].click");
        test.log(LogStatus.PASS, "By.iduser_role.click");
        test.log(LogStatus.PASS, "By.linkTextВыйти из системы.click");

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