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

public class AdvertiserNews {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/workspace/advertstar1.0Junit/reports/AdvertiserNews.html";

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
    public void testAdvertiserNews() throws Exception {
        // creates a toggle for the given test, adds all log events under it
        test = extent.startTest("Advertser News", "Testing Advertizer new panel");

        driver.get(baseUrl + "/en");
        driver.findElement(By.linkText("Affiliate login")).click();
        driver.findElement(By.id("user_email")).clear();
        driver.findElement(By.id("user_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("user_password")).clear();
        driver.findElement(By.id("user_password")).sendKeys("plismocok123");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.linkText("Информация")).click();
        driver.findElement(By.linkText("Документация")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Вопросы и ответы")).click();
        driver.findElement(By.linkText("Зачем нужен \"Trafficback оффер\"?")).click();
        driver.findElement(By.linkText("Что такое deeplink?")).click();
        driver.findElement(By.linkText("Что такое landing page (посадочная страница)?")).click();
        driver.findElement(By.linkText("Как я могу изменить пароль для входа?")).click();
        driver.findElement(By.linkText("Время работы службы поддержки.")).click();
        driver.findElement(By.linkText("Что такое фрод?")).click();
        driver.findElement(By.linkText("Если у меня есть предложения по улучшению AdvertStar, как их изложить?")).click();
        driver.findElement(By.linkText("За что вы платите?")).click();
        driver.findElement(By.linkText("Как создать оффер в системе? (Рекламодателю)")).click();
        driver.findElement(By.linkText("Почему заявку на сотрудничество могут отклонить? (Рекламодателю)")).click();
        driver.findElement(By.linkText("Интеграция и её сложности (Рекламодателю)")).click();
        driver.findElement(By.cssSelector("i.icon-bullhorn")).click();
        driver.findElement(By.linkText("Новости")).click();
        driver.findElement(By.linkText("Читать далее")).click();
        driver.findElement(By.linkText("Информация")).click();
        driver.findElement(By.linkText("Новости")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Читать далее')])[2]")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Новости")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Читать далее')])[3]")).click();
        driver.findElement(By.linkText("Информация")).click();
        driver.findElement(By.linkText("Новости")).click();
        driver.findElement(By.linkText("Следующая →")).click();
        driver.findElement(By.linkText("← Предыдущая")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();

        // LOGS
        test.log(LogStatus.PASS, "By.linkTextAffiliate login.click" );
        test.log(LogStatus.PASS, "By.iduser_email.clear" );
        test.log(LogStatus.PASS, "By.iduser_email.sendKeysn.ruhee@advertstar.net" );
        test.log(LogStatus.PASS, "By.iduser_password.clear" );
        test.log(LogStatus.PASS, "By.iduser_password.sendKeys *********" );
        test.log(LogStatus.PASS, "By.linkTextLog in.click" );
        test.log(LogStatus.PASS, "By.linkTextИнформация.click" );
        test.log(LogStatus.PASS, "By.linkTextДокументация.click" );
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click" );
        test.log(LogStatus.PASS, "By.linkTextВопросы и ответы.click" );
        test.log(LogStatus.PASS, "By.linkTextЗачем нужен Trafficback оффер.click" );
        test.log(LogStatus.PASS, "By.linkTextЧто такое deeplink?.click" );
        test.log(LogStatus.PASS, "By.linkTextЧто такое landing page посадочная страница?.click" );
        test.log(LogStatus.PASS, "By.linkTextКак я могу изменить пароль для входа?.click" );
        test.log(LogStatus.PASS, "By.linkTextВремя работы службы поддержки..click" );
        test.log(LogStatus.PASS, "By.linkTextЧто такое фрод?.click" );
        test.log(LogStatus.PASS, "By.linkTextЕсли у меня есть предложения по улучшению AdvertStar, как их изложить?.click" );
        test.log(LogStatus.PASS, "By.linkTextЗа что вы платите?.click" );
        test.log(LogStatus.PASS, "By.linkTextКак создать оффер в системе? Рекламодателю.click" );
        test.log(LogStatus.PASS, "By.linkTextПочему заявку на сотрудничество могут отклонить? Рекламодателю.click" );
        test.log(LogStatus.PASS, "By.linkTextИнтеграция и её сложности Рекламодателю.click" );
        test.log(LogStatus.PASS, "By.cssSelectori.icon-bullhorn.click" );
        test.log(LogStatus.PASS, "By.linkTextНовости.click" );
        test.log(LogStatus.PASS, "By.linkTextЧитать далее.click" );
        test.log(LogStatus.PASS, "By.linkTextИнформация.click" );
        test.log(LogStatus.PASS, "By.linkTextНовости.click" );
        test.log(LogStatus.PASS, "By.xpath//a[containstext,'Читать далее'][2].click" );
        test.log(LogStatus.PASS, "By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click" );
        test.log(LogStatus.PASS, "By.linkTextНовости.click" );
        test.log(LogStatus.PASS, "By.xpath//a[containstext,'Читать далее'][3].click" );
        test.log(LogStatus.PASS, "By.linkTextИнформация.click" );
        test.log(LogStatus.PASS, "By.linkTextНовости.click" );
        test.log(LogStatus.PASS, "By.linkTextСледующая →.click" );
        test.log(LogStatus.PASS, "By.linkText← Предыдущая.click" );
        test.log(LogStatus.PASS, "By.cssSelectora.dropdown-toggle.click" );
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

