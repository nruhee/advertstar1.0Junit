package com.advertstar.net;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminSources {
    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/report/var/lib/jenkins/jobs/Advertstar1.0Test/workspace/reports/AdminSources.html";

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
    public void testAdminsources() throws Exception {
        test = extent.startTest("admin-sources", "Testing of sources on admin panel");
        driver.get(baseUrl + "/admins/sign_in?god_mode=1");
        driver.findElement(By.id("admin_email")).clear();
        driver.findElement(By.id("admin_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("admin_password")).clear();
        driver.findElement(By.id("admin_password")).sendKeys("rssmd69890");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.findElement(By.xpath("(//a[contains(@href, 'javascript:;')])[3]")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.linkText("Все сайты")).click();
        assertEquals("Advertstar | Сеть партнерских программ с оплатой за действие (CPA)", driver.getTitle());
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]")));
        driver.findElement(By.linkText("Включенный")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]")));
        driver.findElement(By.linkText("Выключенные")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]")));
        driver.findElement(By.linkText("Заблокированные")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[3]/td[4]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[3]/td[4]")));
        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.cssSelector("a > li")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[2]/li")).click();
        driver.findElement(By.cssSelector("i.icon-list-alt")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[3]/li")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[5]/li")).click();
        driver.findElement(By.cssSelector("i.icon-list-alt")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.id("new_source")).click();
        driver.findElement(By.xpath("//div[@id='add_source_block']/ul/a[6]/li")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("vk.com");
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/div[2]/div[2]/form/div/button")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("");
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/div[2]/div[2]/form/div/button")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("vk.com");
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/div[2]/div[2]/form/div/button")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='webmaster_sites']/table/tbody/tr[2]/td[4]")));
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.cssSelector("h2"))) break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("h2")));
        driver.findElement(By.linkText("Изменить")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Управление сайтами")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Управление сетями")).click();
        driver.findElement(By.id("name_network")).click();
        driver.findElement(By.id("name_network")).clear();
        driver.findElement(By.id("name_network")).sendKeys("ginads");
        driver.findElement(By.id("name_network")).clear();
        driver.findElement(By.id("name_network")).sendKeys("nireshruhee");
        driver.findElement(By.id("url_network")).clear();
        driver.findElement(By.id("url_network")).sendKeys("http://www.nireshruhee.com");
        driver.findElement(By.name("is_teaser")).click();
        driver.findElement(By.name("is_banner")).click();
        driver.findElement(By.name("is_mobile")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Удалить")).click();
        driver.findElement(By.id("name_network")).click();
        driver.findElement(By.id("name_network")).clear();
        driver.findElement(By.id("name_network")).sendKeys("niresh");
        driver.findElement(By.id("url_network")).clear();
        driver.findElement(By.id("url_network")).sendKeys("http://www.nireshruhee.com");
        driver.findElement(By.name("is_teaser")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Удалить")).click();
        driver.findElement(By.id("name_network")).click();
        driver.findElement(By.id("name_network")).clear();
        driver.findElement(By.id("name_network")).sendKeys("niresh");
        driver.findElement(By.id("url_network")).clear();
        driver.findElement(By.id("url_network")).sendKeys("http://nireshruhee.com");
        driver.findElement(By.name("is_banner")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Удалить")).click();
        driver.findElement(By.id("name_network")).click();
        driver.findElement(By.id("name_network")).clear();
        driver.findElement(By.id("name_network")).sendKeys("niresh");
        driver.findElement(By.id("url_network")).clear();
        driver.findElement(By.id("url_network")).sendKeys("http://www.nireshruhee.com");
        driver.findElement(By.name("is_mobile")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.linkText("Удалить")).click();
        for (int second = 0; ; second++) {
            if (second >= 60) fail("timeout");
            try {
                if (isElementPresent(By.xpath("//div[@id='main_div']/div/div/div[3]/div/div/div/table/tbody/tr/td[2]")))
                    break;
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='main_div']/div/div/div[3]/div/div/div/table/tbody/tr/td[2]")));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        assertTrue(isElementPresent(By.cssSelector("h4.alert-heading")));
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();


        //LOGS


        test.log(LogStatus.PASS, "By.idadmin_email.clear");
        test.log(LogStatus.PASS, "By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS, "By.idadmin_password.clear");
        test.log(LogStatus.PASS, "By.idadmin_password.sendKeysrssmd69890");
        test.log(LogStatus.PASS, "By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS, "By.xpath//a[contains@href, 'javascript:");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.linkTextВсе сайты.click");
        test.log(LogStatus.PASS, "Сеть партнерских программ с оплатой за действие CPA, driver.getTitle");
        test.log(LogStatus.PASS, "By.xpath//div[@id='webmaster_sites']/table/tbody/tr[3]/td[4]");
        test.log(LogStatus.PASS, "By.idnew_source.click");
        test.log(LogStatus.PASS, "By.cssSelectora > li.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.idnew_source.click");
        test.log(LogStatus.PASS, "By.xpath//div[@id='add_source_block']/ul/a[2]/li.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-list-alt.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.idnew_source.click");
        test.log(LogStatus.PASS, "By.xpath//div[@id='add_source_block']/ul/a[3]/li.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.idnew_source.click");
        test.log(LogStatus.PASS, "By.xpath//div[@id='add_source_block']/ul/a[5]/li.click");
        test.log(LogStatus.PASS, "By.cssSelectori.icon-list-alt.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.idnew_source.click");
        test.log(LogStatus.PASS, "By.xpath//div[@id='add_source_block']/ul/a[6]/li.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.idsearch.clear");
        test.log(LogStatus.PASS, "By.idsearch.sendKeysvk.com");
        test.log(LogStatus.PASS, "By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/div[2]/div[2]/form/div/button.click");
        test.log(LogStatus.PASS, "By.idsearch.clear");
        test.log(LogStatus.PASS, "By.idsearch.sendKeys");
        test.log(LogStatus.PASS, "By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/div[2]/div[2]/form/div/button.click");
        test.log(LogStatus.PASS, "By.idsearch.clear");
        test.log(LogStatus.PASS, "By.idsearch.sendKeysvk.com");
        test.log(LogStatus.PASS, "By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/div[2]/div[2]/form/div/button.click");
        test.log(LogStatus.PASS, "By.cssSelectorh2");
        test.log(LogStatus.PASS, "By.linkTextИзменить.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сайтами.click");
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS, "By.linkTextУправление сетями.click");
        test.log(LogStatus.PASS, "By.idname_network.click");
        test.log(LogStatus.PASS, "By.idname_network.clear");
        test.log(LogStatus.PASS, "By.idname_network.sendKeysginads");
        test.log(LogStatus.PASS, "By.idname_network.clear");
        test.log(LogStatus.PASS, "By.idname_network.sendKeysnireshruhee");
        test.log(LogStatus.PASS, "By.idurl_network.clear");
        test.log(LogStatus.PASS, "By.idurl_network.sendKeyshttp://www.nireshruhee.com");
        test.log(LogStatus.PASS, "By.nameis_teaser.click");
        test.log(LogStatus.PASS, "By.nameis_banner.click");
        test.log(LogStatus.PASS, "By.nameis_mobile.click");
        test.log(LogStatus.PASS, "By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS, "By.linkTextУдалить.click");
        test.log(LogStatus.PASS, "By.idname_network.click");
        test.log(LogStatus.PASS, "By.idname_network.clear");
        test.log(LogStatus.PASS, "By.idname_network.sendKeysniresh");
        test.log(LogStatus.PASS, "By.idurl_network.clear");
        test.log(LogStatus.PASS, "By.idurl_network.sendKeyshttp://www.nireshruhee.com");
        test.log(LogStatus.PASS, "By.nameis_teaser.click");
        test.log(LogStatus.PASS, "By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS, "By.linkTextУдалить.click");
        test.log(LogStatus.PASS, "By.idname_network.click");
        test.log(LogStatus.PASS, "By.idname_network.clear");
        test.log(LogStatus.PASS, "By.idname_network.sendKeysniresh");
        test.log(LogStatus.PASS, "By.idurl_network.clear");
        test.log(LogStatus.PASS, "By.idurl_network.sendKeyshttp://nireshruhee.com");
        test.log(LogStatus.PASS, "By.nameis_banner.click");
        test.log(LogStatus.PASS, "By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS, "By.linkTextУдалить.click");
        test.log(LogStatus.PASS, "By.idname_network.click");
        test.log(LogStatus.PASS, "By.idname_network.clear");
        test.log(LogStatus.PASS, "By.idname_network.sendKeysniresh");
        test.log(LogStatus.PASS, "By.idurl_network.clear");
        test.log(LogStatus.PASS, "By.idurl_network.sendKeyshttp://www.nireshruhee.com");
        test.log(LogStatus.PASS, "By.nameis_mobile.click");
        test.log(LogStatus.PASS, "By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS, "By.linkTextУдалить.click");
        test.log(LogStatus.PASS, "By.xpath//div[@id='main_div']/div/div/div[3]/div/div/div/table/tbody/tr/td[2]");
        test.log(LogStatus.PASS, "By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS, "By.cssSelectorh4.alert-heading");
        test.log(LogStatus.PASS, "By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS, "By.linkTextВыйти из системы.click");

        extent.endTest(test);

    }


    //LOGS\\

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
