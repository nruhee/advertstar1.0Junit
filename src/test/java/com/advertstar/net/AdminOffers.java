package com.advertstar.net;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AdminOffers {
    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/workspace/advertstar1.0Junit/reports/AdminOffers.html";

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
    public void test() throws Exception {

        //CREATE OFFER
        driver.get(baseUrl + "/admins/sign_in?god_mode=1");
        driver.findElement(By.id("admin_email")).clear();
        driver.findElement(By.id("admin_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("admin_password")).clear();
        driver.findElement(By.id("admin_password")).sendKeys("rssmd69890");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.findElement(By.cssSelector("i.icon-reorder")).click();
        driver.findElement(By.linkText("Каталог офферов")).click();
        driver.findElement(By.xpath("//div[@id='filters']/div/div/div[2]/a")).click();
        driver.findElement(By.cssSelector("a.chosen-single.chosen-default > span")).click();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).click();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).clear();
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys("n.ruhee");
        driver.findElement(By.cssSelector("input[type=\"text\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#advertiser_offer_category_id_chosen > a.chosen-single > span")).click();
        driver.findElement(By.cssSelector("#advertiser_offer_category_id_chosen > div.chosen-drop > div.chosen-search > input[type=\"text\"]")).click();
        driver.findElement(By.cssSelector("#advertiser_offer_category_id_chosen > div.chosen-drop > div.chosen-search > input[type=\"text\"]")).clear();
        driver.findElement(By.cssSelector("#advertiser_offer_category_id_chosen > div.chosen-drop > div.chosen-search > input[type=\"text\"]")).sendKeys("18");
        driver.findElement(By.cssSelector("#advertiser_offer_category_id_chosen > div.chosen-drop > div.chosen-search > input[type=\"text\"]")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("advertiser_offer_name")).clear();
        driver.findElement(By.id("advertiser_offer_name")).sendKeys("Niresh-test");
        driver.findElement(By.id("advertiser_offer_name_en")).clear();
        driver.findElement(By.id("advertiser_offer_name_en")).sendKeys("niresh-test");
        new Select(driver.findElement(By.id("advertiser_offer_fallback_id"))).selectByVisibleText("audance");
        driver.findElement(By.id("advertiser_offer_target")).clear();
        driver.findElement(By.id("advertiser_offer_target")).sendKeys("http://advertstar.net");
        driver.findElement(By.id("cisGroup")).click();
        driver.findElement(By.name("advertiser_offer[steps][step_0][step_name]")).clear();
        driver.findElement(By.name("advertiser_offer[steps][step_0][step_name]")).sendKeys("niresh-test");
        driver.findElement(By.name("advertiser_offer[steps][step_0][step_name_en]")).clear();
        driver.findElement(By.name("advertiser_offer[steps][step_0][step_name_en]")).sendKeys("niresh-test");
        new Select(driver.findElement(By.name("advertiser_offer[steps][step_0][pixel_type]"))).selectByVisibleText("Image");
        new Select(driver.findElement(By.id("advertiser_offer_steps_step___id__step_category_id"))).selectByVisibleText("Активный игрок");
        driver.findElement(By.cssSelector("button.btn.dropdown-toggle")).click();
        driver.findElement(By.cssSelector("button.btn.dropdown-toggle")).click();
        driver.findElement(By.xpath("//div[3]/div/ul/li[3]/a")).click();
        driver.findElement(By.name("advertiser_offer[steps][step_0][geotargetings][geotargeting_0][hold]")).clear();
        driver.findElement(By.name("advertiser_offer[steps][step_0][geotargetings][geotargeting_0][hold]")).sendKeys("10");

        driver.findElement(By.name("advertiser_offer[steps][step_0][geotargetings][geotargeting_0][bid]")).clear();
        driver.findElement(By.name("advertiser_offer[steps][step_0][geotargetings][geotargeting_0][bid]")).sendKeys("1");



        driver.findElement(By.id("advertiser_offer_terms")).clear();
        driver.findElement(By.id("advertiser_offer_terms")).sendKeys("test test test test test test test test test test");
        driver.findElement(By.id("advertiser_offer_terms_en")).clear();
        driver.findElement(By.id("advertiser_offer_terms_en")).sendKeys("test test test test test test test");
        driver.findElement(By.id("advertiser_offer_in_test")).click();
        driver.findElement(By.id("advertiser_offer_active")).click();
        driver.findElement(By.id("advertiser_offer_private")).click();
        driver.findElement(By.linkText("Полное описание")).click();
        driver.findElement(By.linkText("Доп. инфо для сотрудников")).click();
        driver.findElement(By.id("traffict")).click();
        driver.findElement(By.id("advertiser_offer_sources_methods_")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[2]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[3]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[4]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[5]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[6]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[7]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[8]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[9]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[10]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[11]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[12]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[13]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[14]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[15]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[16]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[17]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[18]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[19]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[20]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[21]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[22]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[23]")).click();
        driver.findElement(By.xpath("(//input[@id='advertiser_offer_sources_methods_'])[24]")).click();
        driver.findElement(By.id("toolst")).click();
        driver.findElement(By.linkText("Инструменты")).click();
        driver.findElement(By.id("advertiser_offer_deeplink")).click();
        driver.findElement(By.id("advertiser_offer_exclusive")).click();
        driver.findElement(By.id("advertiser_offer_exclusive_terms")).click();
        driver.findElement(By.id("advertiser_offer_visible_link")).clear();
        driver.findElement(By.id("advertiser_offer_visible_link")).sendKeys("http://advertstar.net");

        driver.findElement(By.linkText("Полное описание")).click();
        driver.findElement(By.id("cke_23_label")).click();
        driver.findElement(By.xpath("//div[@id='cke_1_contents']/textarea")).clear();
        driver.findElement(By.xpath("//div[@id='cke_1_contents']/textarea")).sendKeys("test test");
        driver.findElement(By.linkText("Доп. инфо для сотрудников")).click();
        driver.findElement(By.id("cke_132_label")).click();
        driver.findElement(By.xpath("//div[@id='cke_3_contents']/textarea")).clear();
        driver.findElement(By.xpath("//div[@id='cke_3_contents']/textarea")).sendKeys("test test");
        driver.findElement(By.linkText("Полное описание")).click();
        driver.findElement(By.id("cke_78_label")).click();
        driver.findElement(By.xpath("//div[@id='cke_2_contents']/textarea")).clear();
        driver.findElement(By.xpath("//div[@id='cke_2_contents']/textarea")).sendKeys("test test");
        driver.findElement(By.linkText("Доп. инфо для сотрудников")).click();




        driver.findElement(By.id("create-offer")).click();
        driver.findElement(By.cssSelector("i.icon-reorder")).click();
        driver.findElement(By.linkText("Каталог офферов")).click();
        driver.findElement(By.id("offer_name")).click();
        driver.findElement(By.id("offer_name")).clear();
        driver.findElement(By.id("offer_name")).sendKeys("test");
        driver.findElement(By.id("in_test")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.linkText("Niresh-test"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.linkText("Niresh-test")));
        driver.findElement(By.cssSelector("i.icon-pencil")).click();
        assertTrue(isElementPresent(By.cssSelector("h1 > span")));
        driver.findElement(By.linkText("Удалить оффер")).click();
        assertEquals("Удаление оффера может быть чревато, хорошо подумаете прежде чем делать такой шаг.", closeAlertAndGetItsText());
        driver.findElement(By.id("in_test")).click();
        driver.findElement(By.id("offer_name")).clear();
        driver.findElement(By.id("offer_name")).sendKeys("test");
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content")));


        //ASSERT CLICKS
        driver.get(baseUrl + "/staff/offers/new");
        driver.findElement(By.linkText("Офферы")).click();
        driver.findElement(By.linkText("Каталог офферов")).click();
        driver.findElement(By.id("exclusive")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("exclusive")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("exclusive_terms")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("exclusive_terms")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content")));
        driver.findElement(By.id("active")).click();
        driver.findElement(By.id("retargeting")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='offer-catalogue']/div/div[2]/div/div[2]/table/thead/tr/th[2]")));
        driver.findElement(By.id("retargeting")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("deeplink")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("deeplink")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("security_key")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("not_in_test")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content")));
        driver.findElement(By.id("feed")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("feed")).click();
        driver.findElement(By.xpath("//div[@id='filters']/div[3]/div[2]/div[2]/label[3]")).click();
        driver.findElement(By.id("private")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("#offer-catalogue > div.widget > div.widget-content")));
        driver.findElement(By.id("private")).click();
        driver.findElement(By.id("not_private")).click();
        driver.findElement(By.xpath("//div[@id='filters']/div[3]/div[3]/label[2]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("div.span7 > table.table > thead > tr > th")));
        driver.findElement(By.id("not_private")).click();
        driver.findElement(By.id("with_coupons")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//div[@id='offer-catalogue']/div/div[2]/div/div[2]/table/thead/tr/th[2]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.xpath("//div[@id='offer-catalogue']/div/div[2]/div/div[2]/table/thead/tr/th[2]")));
        driver.findElement(By.id("with_coupons")).click();
        driver.findElement(By.linkText("Сортировка по цене")).click();
        driver.findElement(By.linkText("По убывающей")).click();
        driver.findElement(By.linkText("Сортировка по цене")).click();
        driver.findElement(By.linkText("По возрастающей")).click();
        driver.findElement(By.linkText("Сортировка по eCPC")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'По убывающей')])[2]")).click();
        driver.findElement(By.linkText("Сортировка по eCPC")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'По возрастающей')])[2]")).click();
        driver.findElement(By.linkText("Сортировка по CR")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'По убывающей')])[3]")).click();
        driver.findElement(By.linkText("Сортировка по CR")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'По возрастающей')])[3]")).click();
        driver.findElement(By.linkText("Сортировка по дате")).click();
        driver.findElement(By.linkText("Сначала новые")).click();
        driver.findElement(By.linkText("Сортировка по дате")).click();
        driver.findElement(By.linkText("Сначала старые")).click();
        assertTrue(isElementPresent(By.linkText("Следующая →")));
        driver.findElement(By.linkText("Следующая →")).click();
        assertTrue(isElementPresent(By.linkText("← Предыдущая")));


        //Проверка пикселей//

        driver.get(baseUrl + "/staff/containers");
        driver.findElement(By.linkText("Офферы")).click();
        driver.findElement(By.linkText("Контейнеры")).click();
        driver.findElement(By.linkText("Создать")).click();
        driver.findElement(By.cssSelector("a.chosen-single > span")).click();
        driver.findElement(By.xpath("//div[@id='container_offer_id_chosen']/div/ul/li[6]")).click();


        driver.findElement(By.xpath("//div[4]/div/input")).sendKeys("niresh-test");
        new Select(driver.findElement(By.xpath("//div/select"))).selectByVisibleText("Страница товара");
        new Select(driver.findElement(By.xpath("//select[2]"))).selectByVisibleText("Image");
        driver.findElement(By.xpath("//form[@id='new_container']/div[4]/div/textarea")).sendKeys("test.com/2345");



        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Получить код")).click();
        driver.findElement(By.linkText("Уровень 2")).click();
        driver.findElement(By.linkText("Уровень 3")).click();
        driver.findElement(By.linkText("Уровень 4")).click();
        driver.findElement(By.linkText("Уровень 5")).click();
        driver.findElement(By.cssSelector("button.close")).click();


        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.linkText("Редактировать"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.linkText("Редактировать")));
        driver.findElement(By.linkText("Редактировать")).click();




        driver.findElement(By.linkText("Добавить код")).click();


        driver.findElement(By.xpath("//div[2]/input")).sendKeys("niresh-test2");
        new Select(driver.findElement(By.xpath("//div[2]/select"))).selectByVisibleText("Страница товара");
        new Select(driver.findElement(By.xpath("//div[2]/select[2]"))).selectByVisibleText("Image");
        driver.findElement(By.xpath("//div[2]/textarea")).sendKeys("test.com/2345345");


        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Удалить")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Вы уверены что хотите удалить контейнер[\\s\\S]$"));

        //PRODUCT FEEDS

        driver.get(baseUrl + "/staff/offers");
        driver.findElement(By.linkText("Офферы")).click();
        driver.findElement(By.linkText("Товарные выгрузки")).click();
        driver.findElement(By.linkText("Добавить новую выгрузку")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/a/span")).click();
        driver.findElement(By.xpath("//div/div/div/div/ul/li[7]")).click();
        driver.findElement(By.id("product_feed_xml_feed_link")).clear();
        driver.findElement(By.id("product_feed_xml_feed_link")).sendKeys("http://www.advertstar.net/234.xml");
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.cssSelector("div.main-inner")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Удалить')])[13]")).click();
        assertTrue(closeAlertAndGetItsText().matches("^Хорошо подумал[\\s\\S] Больше спрашивать не буду\\.$"));
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("h4.alert-heading"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertTrue(isElementPresent(By.cssSelector("h4.alert-heading")));
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
