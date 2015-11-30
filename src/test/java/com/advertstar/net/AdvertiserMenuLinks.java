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

public class AdvertiserMenuLinks {

    public static final String REPORT_FILE_LOCATION = "target\\Reports\\AdvertiserMenuLinks.html";

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
    public void testAdvertiserMenulinks() throws Exception {
        test = extent.startTest("Advertiser MenuLinks", "Testing of Advertiser Menulinks");
        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Сводная статистика")).click();
        driver.findElement(By.linkText("Статистика")).click();
        driver.findElement(By.linkText("Подробная статистика по действиям")).click();
        driver.findElement(By.xpath("//li[3]/a/span")).click();
        driver.findElement(By.linkText("Финансы")).click();
        driver.findElement(By.linkText("Пополнение баланса")).click();
        driver.findElement(By.linkText("Финансы")).click();
        driver.findElement(By.linkText("Мой баланс")).click();
        driver.findElement(By.cssSelector("i.icon-book")).click();
        driver.findElement(By.linkText("Информация")).click();
        driver.findElement(By.linkText("Документация")).click();
        driver.findElement(By.linkText("Информация")).click();
        driver.findElement(By.linkText("Вопросы и ответы")).click();
        driver.findElement(By.cssSelector("i.icon-bullhorn")).click();
        driver.findElement(By.linkText("Новости")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Мой профиль")).click();
        driver.findElement(By.id("user_role")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();

        //LOGS

        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click" );
        test.log(LogStatus.PASS, "By.iduser_email.clear" );
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysn.ruhee@advertstar.net" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys ********" );
        test.log(LogStatus.PASS, "By.linkTextLog in.click" );
        test.log(LogStatus.PASS, "By.cssSelectori.icon-bar-chart.click" );
        test.log(LogStatus.PASS, "By.linkTextСводная статистика.click" );
        test.log(LogStatus.PASS, "By.linkTextСтатистика.click" );
        test.log(LogStatus.PASS, "By.linkTextПодробная статистика по действиям.click" );
        test.log(LogStatus.PASS, "By.xpath//li[3]/a/span.click" );
        test.log(LogStatus.PASS, "By.linkTextФинансы.click" );
        test.log(LogStatus.PASS, "By.linkTextПополнение баланса.click" );
        test.log(LogStatus.PASS, "By.linkTextФинансы.click" );
        test.log(LogStatus.PASS, "By.linkTextМой баланс.click" );
        test.log(LogStatus.PASS, "By.cssSelectori.icon-book.click" );
        test.log(LogStatus.PASS, "By.linkTextИнформация.click" );
        test.log(LogStatus.PASS, "By.linkTextДокументация.click" );
        test.log(LogStatus.PASS, "By.linkTextИнформация.click" );
        test.log(LogStatus.PASS, "By.linkTextВопросы и ответы.click" );
        test.log(LogStatus.PASS, "By.cssSelectori.icon-bullhorn.click" );
        test.log(LogStatus.PASS, "By.linkTextНовости.click" );
        test.log(LogStatus.PASS, "By.cssSelectora.dropdown-toggle.click" );
        test.log(LogStatus.PASS, "By.linkTextМой профиль.click" );
        test.log(LogStatus.PASS, "By.iduser_role.click" );
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