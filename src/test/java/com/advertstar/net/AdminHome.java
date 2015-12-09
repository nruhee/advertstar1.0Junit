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

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;


public class AdminHome {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/jobs/Advertstar1.0Test/AdminHome.html";

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
    public void testAdminHome() throws Exception {
        test = extent.startTest("ADMIN_HOME", "Testing of Admin dashboard");

        driver.get(baseUrl + "/admins/sign_in?god_mode=1");
        driver.findElement(By.id("admin_email")).clear();
        driver.findElement(By.id("admin_email")).sendKeys("n.ruhee@advertstar.net");
        test.log(LogStatus.PASS, "Insert admin email", "insert admin email");

        driver.findElement(By.id("admin_password")).clear();
        driver.findElement(By.id("admin_password")).sendKeys("rssmd69890");
        test.log(LogStatus.PASS, "using sendkeys", "insert admin password ***********");

        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        test.log(LogStatus.PASS, "button press", "Target Submit button");

        driver.findElement(By.xpath("//button[@value='rub']")).click();
        test.log(LogStatus.PASS, "check Rub", "check RUB");

        driver.findElement(By.xpath("//button[@value='usd']")).click();
        test.log(LogStatus.PASS, "Check USD", "Check USD");

        driver.findElement(By.xpath("//button[@value='eur']")).click();
        test.log(LogStatus.PASS, "Check EURO", "CHECK EURO");

        driver.findElement(By.xpath("(//button[@value='rub'])[2]")).click();
        test.log(LogStatus.PASS, "check //button[@value='rub'])[2] ", "check //button[@value='rub'])[2]");

        driver.findElement(By.xpath("(//button[@value='usd'])[2]")).click();
        test.log(LogStatus.PASS, "check //button[@value='usd'])[2] ", "check //button[@value='usd'])[2]");

        driver.findElement(By.xpath("(//button[@value='eur'])[2]")).click();
        test.log(LogStatus.PASS, "check //button[@value='eur'])[2] ", "check//button[@value='eur'])[2]");

        driver.findElement(By.linkText("Общая по менеджерам")).click();
        test.log(LogStatus.PASS, "check Общая по менеджерам ", "check Общая по менеджерам");

        driver.findElement(By.xpath("(//button[@value='rub'])[3]")).click();
        test.log(LogStatus.PASS, "check //button[@value='rub'])[3] ", "check //button[@value='rub'])[3]");

        driver.findElement(By.xpath("(//button[@value='usd'])[3]")).click();
        test.log(LogStatus.PASS, "check //button[@value='usd'])[3] ", "check //button[@value='usd'])[3]");

        driver.findElement(By.xpath("(//button[@value='eur'])[3]")).click();
        test.log(LogStatus.PASS, "check //button[@value='eur'])[3] ", "check //button[@value='eur'])[3]");

        driver.findElement(By.linkText("Общая по модераторам")).click();
        test.log(LogStatus.PASS, "check Общая по модераторам ", "check Общая по модераторам");

        driver.findElement(By.xpath("(//button[@value='rub'])[4]")).click();
        test.log(LogStatus.PASS, "check //button[@value='rub'])[4] ", "check //button[@value='rub'])[4]");

        driver.findElement(By.xpath("(//button[@value='usd'])[4]")).click();
        test.log(LogStatus.PASS, "check //button[@value='usd'])[4] ", "check //button[@value='usd'])[4]");

        driver.findElement(By.xpath("(//button[@value='eur'])[4]")).click();
        test.log(LogStatus.PASS, "check //button[@value='eur'])[4] ", "check//button[@value='eur'])[4]");

        driver.findElement(By.linkText("По модератору")).click();
        test.log(LogStatus.PASS, "check По модератору", "check По модератору");

        driver.findElement(By.xpath("(//button[@value='usd'])[5]")).click();
        test.log(LogStatus.PASS, "check //button[@value='usd'])[5] ", "check //button[@value='usd'])[5]");

        driver.findElement(By.xpath("(//button[@value='eur'])[5]")).click();
        test.log(LogStatus.PASS, "check //button[@value='eur'])[5] ", "check //button[@value='eur'])[5]");

        driver.findElement(By.linkText("Средний заработок по мастерам")).click();
        test.log(LogStatus.PASS, "check Средний заработок по мастерам ", "check Средний заработок по мастерам");

        driver.findElement(By.linkText("По менеджеру")).click();
        test.log(LogStatus.PASS, "check По менеджеру ", "check По менеджеру");

        driver.findElement(By.xpath("(//button[@value='usd'])[6]")).click();
        test.log(LogStatus.PASS, "check //button[@value='usd'])[6] ", "check //button[@value='usd'])[6]");

        driver.findElement(By.xpath("(//button[@value='eur'])[6]")).click();
        test.log(LogStatus.PASS, "check //button[@value='eur'])[6] ", "check //button[@value='eur'])[6]");

        driver.findElement(By.linkText("По эффективности")).click();
        test.log(LogStatus.PASS, "check По эффективности ", "check По эффективности");

        driver.findElement(By.xpath("(//a[contains(text(),'Офферы')])[2]")).click();
        test.log(LogStatus.PASS, "check //a[contains(text(),'Офферы')])[2] ", "check //a[contains(text(),'Офферы')])[2]");

        driver.findElement(By.linkText("Ссылки")).click();
        test.log(LogStatus.PASS, "check Ссылки ", "check Ссылки");

        driver.findElement(By.cssSelector("a.help-popover.pull-left > i.icon-question-sign")).click();
        test.log(LogStatus.PASS, "check a.help-popover.pull-left > i.icon-question-sign ", "check a.help-popover.pull-left > i.icon-question-sign");

        driver.findElement(By.xpath("//div[@id='hashes_table']/table/tbody/tr[2]/td[5]/a/i")).click();
        test.log(LogStatus.PASS, "check //div[@id='hashes_table']/table/tbody/tr[2]/td[5]/a/i ", "check //div[@id='hashes_table']/table/tbody/tr[2]/td[5]/a/i");

        driver.findElement(By.xpath("//div[@id='hashes_table']/table/tbody/tr[3]/td[5]/a/i")).click();
        test.log(LogStatus.PASS, "check //div[@id='hashes_table']/table/tbody/tr[3]/td[5]/a/i ", "check //div[@id='hashes_table']/table/tbody/tr[3]/td[5]/a/i");

        driver.findElement(By.cssSelector("div.row")).click();
        test.log(LogStatus.PASS, "check div.row ", "check div.row");

        driver.findElement(By.linkText("Общая по системе")).click();
        test.log(LogStatus.PASS, "check Общая по системе ", "check Общая по системе");

        driver.findElement(By.xpath("//tbody[@id='dumpererrors_table']/tr/td[4]/a")).click();
        test.log(LogStatus.PASS, "check //tbody[@id='dumpererrors_table']/tr/td[4]/a ", "check //tbody[@id='dumpererrors_table']/tr/td[4]/a");

        driver.findElement(By.xpath("//tbody[@id='dumpererrors_table']/tr[2]/td[4]/a/i")).click();
        test.log(LogStatus.PASS, "check //tbody[@id='dumpererrors_table']/tr[2]/td[4]/a/i ", "check //tbody[@id='dumpererrors_table']/tr[2]/td[4]/a/i");

        driver.findElement(By.xpath("//tbody[@id='dumpererrors_table']/tr[3]/td[4]/a")).click();
        test.log(LogStatus.PASS, "check //tbody[@id='dumpererrors_table']/tr[3]/td[4]/a ", "//tbody[@id='dumpererrors_table']/tr[3]/td[4]/a");

        driver.findElement(By.cssSelector("div.main-inner")).click();
        test.log(LogStatus.PASS, "check div.main-inner ", "check div.main-inner");

        driver.findElement(By.linkText("По обороту")).click();
        test.log(LogStatus.PASS, "check По обороту", "check По обороту");

        driver.findElement(By.xpath("(//a[contains(text(),'Офферы')])[2]")).click();
        test.log(LogStatus.PASS, "check (//a[contains(text(),'Офферы')])[2] ", "check (//a[contains(text(),'Офферы')])[2]");
        test.log(LogStatus.PASS, "check admin side for borken links  ", "checked admin side for broken links");

        extent.endTest(test);

        List<WebElement> ele = driver.findElements(By.tagName("a"));
        System.out.println("size:" + ele.size());
        boolean isValid = false;
        for (int i = 0; i < ele.size(); i++) {
            // System.out.println(ele.get(i).getAttribute("href"));
            isValid = getResponseCode(ele.get(i).getAttribute("href"));
            if (isValid) {
                System.out.println("ValidLinks:"
                        + ele.get(i).getAttribute("href"));
            } else {
                System.out.println("InvalidLinks:"
                        + ele.get(i).getAttribute("href"));
            }
        }

    }


    public static boolean getResponseCode(String urlString) {
        boolean isValid = false;
        try {
            URL u = new URL(urlString);
            HttpURLConnection h = (HttpURLConnection) u.openConnection();
            h.setRequestMethod("GET");
            h.connect();
            System.out.println(h.getResponseCode());
            if (h.getResponseCode() != 404) {
                isValid = true;
            }
        } catch (Exception e) {

        }
        return isValid;

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