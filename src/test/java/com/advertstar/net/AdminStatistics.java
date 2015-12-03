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

/**
 * Created by shmodwalker on 11/11/2015.
 */


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class AdminStatistics {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/report/var/lib/jenkins/jobs/Advertstar1.0Test/workspace/reports/AdminStatistics.html";


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
    public void adminstatisticstest() throws Exception {
        test = extent.startTest("Administrator Statistics", "Testing of Admin Statistics panel");
        driver.get(baseUrl + "/admins/sign_in?god_mode=1");
        driver.findElement(By.id("admin_email")).clear();
        driver.findElement(By.id("admin_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("admin_password")).clear();
        driver.findElement(By.id("admin_password")).sendKeys("rssmd69890");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.get(baseUrl + "/staff/stats");
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Общая статистика")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("div.ranges > ul > li")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[2]")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[3]")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[4]")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[5]")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[6]")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.linkText("По офферам")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.linkText("По субаккаунтам")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.linkText("По источникам трафика")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.findElement(By.linkText("По странам")).click();
        driver.findElement(By.id("get_stats")).click();
        driver.get(baseUrl + "/admin");
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Статистика по действиям")).click();
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li")).click();
        driver.findElement(By.xpath("//button[@type='button']")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[2]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[3]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[4]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[5]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Статистика по действиям")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='actionsContent']/tr/td[4]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        new Select(driver.findElement(By.id("actions_type"))).selectByVisibleText("Cтатистика по лидам");
        new Select(driver.findElement(By.id("actions_type"))).selectByVisibleText("Cтатистика по заказам");
        driver.get(baseUrl + "/admin");
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Статистика по кликам")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.cssSelector("div.ranges > ul > li")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[2]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[9]/div[3]/ul/li[3]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[4]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[5]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[6]")).click();
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Статистика по кликам")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }



        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='clicks_table_body']/tr/td[5]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        new Select(driver.findElement(By.id("clicks_status"))).selectByVisibleText("Хиты");
        new Select(driver.findElement(By.id("clicks_status"))).selectByVisibleText("Уники");
        driver.findElement(By.cssSelector("button.btn.btn-large")).click();
        new Select(driver.findElement(By.id("clicks_type"))).selectByVisibleText("Зафильтрованые переходы");
        new Select(driver.findElement(By.id("clicks_type"))).selectByVisibleText("Зачтённые переходы");
        new Select(driver.findElement(By.id("clicks_type"))).selectByVisibleText("Все переходы");


        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Отчёт по трафику")).click();
        driver.findElement(By.cssSelector("a.chosen-single.chosen-default > span")).click();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).clear();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("25248");
        driver.findElement(By.xpath("//input")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[4]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Показать статистику')]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.id("local-error"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.xpath("//div[3]/div/a")).click();

        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();

        driver.get(baseUrl + "/admins/sign_in?god_mode=1");
        driver.findElement(By.id("admin_email")).clear();
        driver.findElement(By.id("admin_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("admin_password")).clear();
        driver.findElement(By.id("admin_password")).sendKeys("rssmd69890");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.findElement(By.cssSelector("i.icon-bar-chart")).click();
        driver.findElement(By.linkText("Отчёт по офферу")).click();
        driver.findElement(By.cssSelector("a.chosen-single > span")).click();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).clear();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("1245");
        driver.findElement(By.xpath("//input")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input.daterange")).click();
        driver.findElement(By.xpath("//div[3]/ul/li[4]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Показать статистику')]")).click();

        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();

        // LOGS


        test.log(LogStatus.PASS,"By.idadmin_email.clear" );
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net" );
        test.log(LogStatus.PASS,"By.idadmin_password.clear" );
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********" );
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click" );
        test.log(LogStatus.PASS,"By.cssSelectori.icon-bar-chart.click" );
        test.log(LogStatus.PASS,"By.linkTextОбщая статистика.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.cssSelectordiv.ranges > ul > li.click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[2].click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[3].click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[4].click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[5].click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[6].click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.linkTextПо офферам.click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.linkTextПо субаккаунтам.click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.linkTextПо источникам трафика.click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.linkTextПо странам.click" );
        test.log(LogStatus.PASS,"By.idget_stats.click" );
        test.log(LogStatus.PASS,"By.cssSelectori.icon-bar-chart.click" );
        test.log(LogStatus.PASS,"By.linkTextСтатистика по действиям.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li.click" );
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'].click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[2].click" );
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.btn-large.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[9]/div[3]/ul/li[3].click" );
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.btn-large.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[3]/ul/li[4].click" );
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.btn-large.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[3]/ul/li[5].click" );
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.btn-large.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.cssSelectordiv.ranges > ul > li.click" );
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.btn-large.click" );
        test.log(LogStatus.PASS, "By.xpath//button[@type='button'][2].click" );
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][3].click" );
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][3].click" );
        test.log(LogStatus.PASS,"By.cssSelectori.icon-bar-chart.click" );
        test.log(LogStatus.PASS,"By.linkTextОтчёт по трафику.click" );
        test.log(LogStatus.PASS,"By.cssSelectora.chosen-single.chosen-default > span.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput type=text.clear" );
        test.log(LogStatus.PASS,"By.cssSelectorinput type=text.sendKeys25248" );
        test.log(LogStatus.PASS,"By.xpath//input.sendKeysKeys.ENTER" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[3]/ul/li[4].click" );
        test.log(LogStatus.PASS,"By.xpath//a[containstext,'Показать статистику'].click" );
        test.log(LogStatus.PASS,"By.xpath//div[3]/div/a.click" );
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click" );
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click" );
        test.log(LogStatus.PASS,"By.idadmin_email.clear" );
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net" );
        test.log(LogStatus.PASS,"By.idadmin_password.clear" );
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********" );
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click" );
        test.log(LogStatus.PASS,"By.cssSelectori.icon-bar-chart.click" );
        test.log(LogStatus.PASS,"By.linkTextОтчёт по офферу.click" );
        test.log(LogStatus.PASS,"By.cssSelectora.chosen-single > span.click" );
        test.log(LogStatus.PASS,"By.cssSelectorinput type=text.clear" );
        test.log(LogStatus.PASS,"By.cssSelectorinput type= text.sendKeys1245" );
        test.log(LogStatus.PASS,"By.xpath//input.sendKeysKeys.ENTER" );
        test.log(LogStatus.PASS,"By.cssSelectorinput.daterange.click" );
        test.log(LogStatus.PASS,"By.xpath//div[3]/ul/li[4].click" );
        test.log(LogStatus.PASS,"By.xpath//a[containstext,'Показать статистику'].click" );
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click" );
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click" );


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