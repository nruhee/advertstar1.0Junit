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

public class AdminStaffs {

    public static final String REPORT_FILE_LOCATION = "/var/lib/jenkins/workspace/advertstar1.0Junit/reports/AdminStaffs.html";

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
        driver= new FirefoxDriver();
        String URL="https://www.advertstar.net";
        driver.navigate().to(URL);
        driver.manage().deleteAllCookies();
        driver = new FirefoxDriver();
        driver.manage().window().setSize(new Dimension(1920,1080));
        driver.manage().window().maximize();
        baseUrl = "https://advertstar.net/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testStaffs() throws Exception {

        test = extent.startTest("Administrator Staff", "Testing of Admin staff Panel");
        driver.get(baseUrl + "/admins/sign_in?god_mode=1");
        driver.findElement(By.id("admin_email")).clear();
        driver.findElement(By.id("admin_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("admin_password")).clear();
        driver.findElement(By.id("admin_password")).sendKeys("rssmd69890");
        driver.findElement(By.cssSelector("a.custom-green-btn.submit-btn")).click();
        driver.findElement(By.xpath("//li[3]/a/span")).click();
        driver.findElement(By.linkText("Вебмастера")).click();
        driver.findElement(By.linkText("График регистраций")).click();
        driver.findElement(By.linkText("Результаты поиска")).click();
        driver.findElement(By.linkText("2")).click();
        driver.findElement(By.linkText("3")).click();
        driver.findElement(By.linkText("← Предыдущая")).click();
        driver.findElement(By.linkText("Следующая →")).click();
        driver.findElement(By.id("name_email")).click();
        driver.findElement(By.id("name_email")).clear();
        driver.findElement(By.id("name_email")).sendKeys("test1@advertstar.net");
        driver.findElement(By.id("advanced-search-webmaster")).click();
        driver.findElement(By.id("name_email")).click();
        driver.findElement(By.id("name_email")).clear();
        driver.findElement(By.id("name_email")).sendKeys("");
        driver.findElement(By.id("advanced-search-webmaster")).click();
        driver.findElement(By.id("category")).click();
        new Select(driver.findElement(By.id("category"))).selectByVisibleText("Игровая витрина");
        driver.findElement(By.id("advanced-search-webmaster")).click();
        driver.findElement(By.id("category")).click();
        new Select(driver.findElement(By.id("category"))).selectByVisibleText("Выберите категорию");
        new Select(driver.findElement(By.id("app_promo_code_id"))).selectByVisibleText("ForVip");
        driver.findElement(By.id("advanced-search-webmaster")).click();
        driver.findElement(By.id("app_promo_code_id")).click();
        new Select(driver.findElement(By.id("app_promo_code_id"))).selectByVisibleText("Выберите промо код");
        new Select(driver.findElement(By.id("user_priority_id"))).selectByVisibleText("Обычный");
        driver.findElement(By.id("advanced-search-webmaster")).click();
        driver.findElement(By.id("user_priority_id")).click();
        new Select(driver.findElement(By.id("user_priority_id"))).selectByVisibleText("Любой");
        new Select(driver.findElement(By.id("site_category"))).selectByVisibleText("18+");
        driver.findElement(By.id("advanced-search-webmaster")).click();
        driver.findElement(By.id("site_category")).click();
        new Select(driver.findElement(By.id("site_category"))).selectByVisibleText("Любая категория");
        new Select(driver.findElement(By.id("moderator"))).selectByVisibleText("Ilya Ljapin");
        driver.findElement(By.id("advanced-search-webmaster")).click();





        //ADVERTISER

        driver.get(baseUrl + "/staff/webmasters");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Рекламодатели")).click();
        driver.findElement(By.id("name_email")).click();
        driver.findElement(By.id("name_email")).clear();
        driver.findElement(By.id("name_email")).sendKeys("n.ruhee@advertstar.net");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("name_email")).click();


        driver.findElement(By.id("name_email")).clear();
        driver.findElement(By.id("name_email")).sendKeys("");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("currency")).click();
        new Select(driver.findElement(By.id("currency"))).selectByVisibleText("Руб");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("currency")).click();
        new Select(driver.findElement(By.id("currency"))).selectByVisibleText("USD");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("currency")).click();
        new Select(driver.findElement(By.id("currency"))).selectByVisibleText("EUR");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("currency")).click();
        new Select(driver.findElement(By.id("currency"))).selectByVisibleText("Все валюты");
        new Select(driver.findElement(By.id("user_priority_id"))).selectByVisibleText("Обычный");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("user_priority_id")).click();
        new Select(driver.findElement(By.id("user_priority_id"))).selectByVisibleText("Крупный");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("user_priority_id")).click();
        new Select(driver.findElement(By.id("user_priority_id"))).selectByVisibleText("Ключевой");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("user_priority_id")).click();
        new Select(driver.findElement(By.id("user_priority_id"))).selectByVisibleText("Любой");
        new Select(driver.findElement(By.id("contract"))).selectByVisibleText("Да");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("contract")).click();
        new Select(driver.findElement(By.id("contract"))).selectByVisibleText("Нет");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("contract")).click();
        new Select(driver.findElement(By.id("contract"))).selectByVisibleText("Все");
        new Select(driver.findElement(By.id("signed"))).selectByVisibleText("Договор подписан");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("signed")).click();
        new Select(driver.findElement(By.id("signed"))).selectByVisibleText("Договор не подписан");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("signed")).click();
        new Select(driver.findElement(By.id("signed"))).selectByVisibleText("Все");
        new Select(driver.findElement(By.id("source"))).selectByVisibleText("google_search");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("source")).click();
        new Select(driver.findElement(By.id("source"))).selectByVisibleText("race14");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("source")).click();
        new Select(driver.findElement(By.id("source"))).selectByVisibleText("CPA conf");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("source")).click();
        new Select(driver.findElement(By.id("source"))).selectByVisibleText("Gamescom15");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("source")).click();
        new Select(driver.findElement(By.id("source"))).selectByVisibleText("cpaclub_thai15");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("source")).click();
        new Select(driver.findElement(By.id("source"))).selectByVisibleText("Все источники");
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Екатерина Краснюк");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Вероника Звездай");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Пётр Агапов");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Тэо Флэйм Тидо");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Алексей Кудинкин");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Артём Мазурин");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Дарья Попова");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Ольга Иванова");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Ольга Сидорук");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Сергей Кузьмичев");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Анастасия Сидорова");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("А. Кудинкин (босс)");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Никита Шигов");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("manager")).click();
        new Select(driver.findElement(By.id("manager"))).selectByVisibleText("Все менеджеры");
        new Select(driver.findElement(By.id("archived"))).selectByVisibleText("Заархивированный");
        driver.findElement(By.id("advanced-search-advertiser")).click();
        driver.findElement(By.id("archived")).click();
        new Select(driver.findElement(By.id("archived"))).selectByVisibleText("Активный");
        driver.findElement(By.id("advanced-search-advertiser")).click();





        //MANAGER



        driver.get(baseUrl + "/staff/webmasters");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > span")).click();
        driver.findElement(By.linkText("Менеджеры")).click();
        driver.findElement(By.linkText("Пётр Агапов")).click();
        driver.findElement(By.linkText("А. Кудинкин (босс)")).click();
        driver.findElement(By.linkText("Все")).click();
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("дарья");
        driver.findElement(By.xpath("//input[@value='Искать']")).click();
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("");
        driver.findElement(By.xpath("//input[@value='Искать']")).click();
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/table/tbody/tr/td[9]/a")).click();
        driver.findElement(By.name("commit")).click();
        driver.findElement(By.linkText("Вероника Звездай")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Менеджеры")).click();
        driver.findElement(By.cssSelector("a.help-popover.pull-left > i.icon-question-sign")).click();
        driver.findElement(By.cssSelector("a.help-popover.pull-left > i.icon-question-sign")).click();



        //MODERATOR


        driver.get(baseUrl + "/staff/moderators");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Модераторы")).click();
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("dmitriy");
        driver.findElement(By.xpath("//input[@value='Искать']")).click();
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("");
        driver.findElement(By.xpath("//input[@value='Искать']")).click();
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/table/tbody/tr[5]/td[2]/a[2]/i")).click();
        driver.findElement(By.linkText("Boris Mihailenko")).click();
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.linkText("Модераторы")).click();



        //FINANCIER



        driver.get(baseUrl + "/staff/moderators");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Финансисты")).click();
        driver.findElement(By.id("search")).click();
        driver.findElement(By.id("search")).clear();
        driver.findElement(By.id("search")).sendKeys("financier");
        driver.findElement(By.xpath("//input[@value='Искать']")).click();
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/table/tbody/tr/td[2]")).click();
        driver.findElement(By.cssSelector("i.icon-key")).click();
        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из аккаунта")).click();
        driver.findElement(By.linkText("Редактировать")).click();
        driver.findElement(By.name("commit")).click();




        //OFFER APPLICATION



        driver.get(baseUrl + "/staff/requests/offer");
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.linkText("Заявки на офферы")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.cssSelector("button.btn")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.xpath("//a[contains(@href, '#processed-offers')]")).click();
        driver.findElement(By.xpath("//a[contains(@href, '#special-offers')]")).click();




        //OFFICE MANAGERS



        driver.get(baseUrl + "/staff/webmasters");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Управление менеджерами")).click();
        driver.findElement(By.xpath("//div[@id='main_div']/div/div/div[2]/div/div/div/ul/li[2]")).click();
        driver.findElement(By.linkText("Топ менеджеров")).click();
        driver.findElement(By.xpath("//div[@id='top-managers']/table/thead/tr/th[2]")).click();
        driver.findElement(By.cssSelector("th.sorting-asc")).click();
        driver.findElement(By.xpath("//div[@id='top-managers']/table/thead/tr/th[3]")).click();
        driver.findElement(By.xpath("//div[@id='top-managers']/table/thead/tr/th[4]")).click();
        driver.findElement(By.cssSelector("th.sorting-asc")).click();
        driver.findElement(By.xpath("//div[@id='top-managers']/table/thead/tr/th[5]")).click();
        driver.findElement(By.cssSelector("th.sorting-asc")).click();
        driver.findElement(By.linkText("Управление рекламодателями менеджеров")).click();
        driver.findElement(By.xpath("//div[@id='manager-control']/div[2]/div/table/thead/tr/th[4]")).click();
        driver.findElement(By.cssSelector("th.sorting-asc")).click();
        driver.findElement(By.xpath("//div[@id='manager-control']/div[2]/div/table/thead/tr/th[5]")).click();
        driver.findElement(By.cssSelector("th.sorting-asc")).click();
        driver.findElement(By.xpath("//div[@id='manager-control']/div[2]/div/table/thead/tr/th[6]")).click();
        driver.findElement(By.cssSelector("th.sorting-asc")).click();


        //WEBMASTER TYPE



        driver.get(baseUrl + "/staff/managercp");
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.linkText("Пользователи")).click();
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Рекомендации на доверенных и VIP")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Рекомендации для VIP")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Рекомендации для снятия доверенных")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//tbody[@id='not_trusted_webmasters_content']/tr/td[2]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Рекомендации для снятия VIP")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Рекомендации для доверенных")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.cssSelector("div.widget-content"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }


        //WEBMASTER SEARCH BY TRAFFIC



        driver.get(baseUrl + "/staff/traffic");
        driver.findElement(By.cssSelector("button.ms-choice")).click();
        driver.findElement(By.name("selectItem")).click();
        driver.findElement(By.cssSelector("div.span11.well")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.cssSelector("button.ms-choice")).click();
        driver.findElement(By.name("selectItem")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='selectItem'])[26]")).click();
        driver.findElement(By.xpath("(//input[@name='selectItem'])[26]")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        driver.findElement(By.xpath("(//input[@name='selectItem'])[26]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("webmaster_privacy")).click();
        new Select(driver.findElement(By.id("webmaster_privacy"))).selectByVisibleText("Только приватные");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("webmaster_privacy")).click();
        new Select(driver.findElement(By.id("webmaster_privacy"))).selectByVisibleText("Все вебматера");
        new Select(driver.findElement(By.id("webmaster_status"))).selectByVisibleText("Базовый");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("webmaster_status")).click();
        new Select(driver.findElement(By.id("webmaster_status"))).selectByVisibleText("Доверенный");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("webmaster_status")).click();
        new Select(driver.findElement(By.id("webmaster_status"))).selectByVisibleText("VIP");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("webmaster_status")).click();
        new Select(driver.findElement(By.id("webmaster_status"))).selectByVisibleText("Все статусы");
        driver.findElement(By.id("traffic_estimation_from")).clear();
        driver.findElement(By.id("traffic_estimation_from")).sendKeys("1");
        driver.findElement(By.id("traffic_estimation_to")).clear();
        driver.findElement(By.id("traffic_estimation_to")).sendKeys("1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("traffic_estimation_to")).click();
        driver.findElement(By.id("traffic_estimation_from")).clear();
        driver.findElement(By.id("traffic_estimation_from")).sendKeys("2");
        driver.findElement(By.id("traffic_estimation_to")).clear();
        driver.findElement(By.id("traffic_estimation_to")).sendKeys("2");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("traffic_estimation_from")).click();
        driver.findElement(By.id("traffic_estimation_from")).clear();
        driver.findElement(By.id("traffic_estimation_from")).sendKeys("3");
        driver.findElement(By.id("traffic_estimation_to")).clear();
        driver.findElement(By.id("traffic_estimation_to")).sendKeys("3");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("traffic_estimation_from")).click();
        driver.findElement(By.id("traffic_estimation_from")).clear();
        driver.findElement(By.id("traffic_estimation_from")).sendKeys("4");
        driver.findElement(By.id("traffic_estimation_to")).clear();
        driver.findElement(By.id("traffic_estimation_to")).sendKeys("4");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("traffic_estimation_from")).click();
        driver.findElement(By.id("traffic_estimation_from")).clear();
        driver.findElement(By.id("traffic_estimation_from")).sendKeys("5");
        driver.findElement(By.id("traffic_estimation_to")).clear();
        driver.findElement(By.id("traffic_estimation_to")).sendKeys("5");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.id("traffic_estimation_from")).click();
        driver.findElement(By.id("traffic_estimation_from")).clear();
        driver.findElement(By.id("traffic_estimation_from")).sendKeys("6");
        driver.findElement(By.id("traffic_estimation_to")).clear();
        driver.findElement(By.id("traffic_estimation_to")).sendKeys("6");
        driver.findElement(By.xpath("//button[@type='submit']")).click();




        //ALERTS


        driver.get(baseUrl + "/staff/webmasters");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Предупреждения")).click();
        driver.findElement(By.linkText("Заблокированные офферы [15]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//div[@id='blocked-offers']/div/div/table/tbody/tr[2]/td[2]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Проверка трафика [122]")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//div[@id='quality_hold']/table/tbody[2]/tr/td[3]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Проверенные")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//div[@id='quality_hold']/table/tbody[2]/tr/td[3]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Просроченные")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//div[@id='quality_hold']/table/tbody[2]/tr/td[3]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        driver.findElement(By.linkText("Все")).click();
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (isElementPresent(By.xpath("//div[@id='quality_hold']/table/tbody[2]/tr/td[3]"))) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }


        //PROMO CODE

        driver.get(baseUrl + "/staff/promo");
        driver.findElement(By.cssSelector("li.dropdown.active > a.dropdown-toggle > i.icon-user")).click();
        driver.findElement(By.linkText("Промо коды")).click();
        driver.findElement(By.cssSelector("a.btn.user-details")).click();
        driver.findElement(By.cssSelector("button.btn")).click();
        driver.findElement(By.linkText("Редактировать")).click();
        driver.findElement(By.name("commit")).click();


        //LOGOUT

        driver.findElement(By.cssSelector("a.dropdown-toggle")).click();
        driver.findElement(By.linkText("Выйти из системы")).click();





        //LOGS


        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.xpath//li[3]/a/span.click");
        test.log(LogStatus.PASS,"By.linkTextВебмастера.click");
        test.log(LogStatus.PASS,"By.linkTextГрафик регистраций.click");
        test.log(LogStatus.PASS,"By.linkTextРезультаты поиска.click");
        test.log(LogStatus.PASS,"By.linkText2.click");
        test.log(LogStatus.PASS,"By.linkText3.click");
        test.log(LogStatus.PASS,"By.linkText← Предыдущая.click");
        test.log(LogStatus.PASS,"By.linkTextСледующая →.click");
        test.log(LogStatus.PASS,"By.idname_email.click");
        test.log(LogStatus.PASS,"By.idname_email.clear");
        test.log(LogStatus.PASS,"By.idname_email.sendKeystest1@advertstar.net");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.idname_email.click");
        test.log(LogStatus.PASS,"By.idname_email.clear");
        test.log(LogStatus.PASS,"By.idname_email.sendKeys");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.idcategory.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.idcategory.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.idapp_promo_code_id.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.iduser_priority_id.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.idsite_category.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-webmaster.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextРекламодатели.click");
        test.log(LogStatus.PASS,"By.idname_email.click");
        test.log(LogStatus.PASS,"By.idname_email.clear");
        test.log(LogStatus.PASS,"By.idname_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idname_email.click");
        test.log(LogStatus.PASS,"By.idname_email.clear");
        test.log(LogStatus.PASS,"By.idname_email.sendKeys");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idcurrency.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idcurrency.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idcurrency.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idcurrency.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.iduser_priority_id.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.iduser_priority_id.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.iduser_priority_id.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idcontract.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idcontract.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idsigned.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idsigned.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idsource.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idsource.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idsource.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idmanager.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idmanager.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.idarchived.click");
        test.log(LogStatus.PASS,"By.idadvanced-search-advertiser.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > span.click");
        test.log(LogStatus.PASS,"By.linkTextМенеджеры.click");
        test.log(LogStatus.PASS,"By.linkTextПётр Агапов.click");
        test.log(LogStatus.PASS,"By.linkTextА. Кудинкин босс.click");
        test.log(LogStatus.PASS,"By.linkTextВсе.click");
        test.log(LogStatus.PASS,"By.idsearch.click");
        test.log(LogStatus.PASS,"By.idsearch.clear");
        test.log(LogStatus.PASS,"By.idsearch.sendKeysдарья");
        test.log(LogStatus.PASS,"By.xpath//input[@value='Искать'].click");
        test.log(LogStatus.PASS,"By.idsearch.click");
        test.log(LogStatus.PASS,"By.idsearch.clear");
        test.log(LogStatus.PASS,"By.idsearch.sendKeys");
        test.log(LogStatus.PASS,"By.xpath//input[@value='Искать'].click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/table/tbody/tr/td[9]/a.click");
        test.log(LogStatus.PASS,"By.namecommit.click");
        test.log(LogStatus.PASS,"By.linkTextВероника Звездай.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextМенеджеры.click");
        test.log(LogStatus.PASS,"By.cssSelectora.help-popover.pull-left > i.icon-question-sign.click");
        test.log(LogStatus.PASS,"By.cssSelectora.help-popover.pull-left > i.icon-question-sign.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextМодераторы.click");
        test.log(LogStatus.PASS,"By.idsearch.click");
        test.log(LogStatus.PASS,"By.idsearch.clear");
        test.log(LogStatus.PASS,"By.idsearch.sendKeysdmitriy");
        test.log(LogStatus.PASS,"By.xpath//input[@value='Искать'].click");
        test.log(LogStatus.PASS,"By.idsearch.click");
        test.log(LogStatus.PASS,"By.idsearch.clear");
        test.log(LogStatus.PASS,"By.idsearch.sendKeys");
        test.log(LogStatus.PASS,"By.xpath//input[@value='Искать'].click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/table/tbody/tr[5]/td[2]/a[2]/i.click");
        test.log(LogStatus.PASS,"By.linkTextBoris Mihailenko.click");
        test.log(LogStatus.PASS,"By.linkTextПользователи.click");
        test.log(LogStatus.PASS,"By.linkTextМодераторы.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextФинансисты.click");
        test.log(LogStatus.PASS,"By.idsearch.click");
        test.log(LogStatus.PASS,"By.idsearch.clear");
        test.log(LogStatus.PASS,"By.idsearch.sendKeysfinancier");
        test.log(LogStatus.PASS,"By.xpath//input[@value='Искать'].click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/table/tbody/tr/td[2].click");
        test.log(LogStatus.PASS,"By.cssSelectori.icon-key.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из аккаунта.click");
        test.log(LogStatus.PASS,"By.linkTextРедактировать.click");
        test.log(LogStatus.PASS,"By.namecommit.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.linkTextПользователи.click");
        test.log(LogStatus.PASS,"By.linkTextЗаявки на офферы.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][2].click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][3].click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][4].click");
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][2].click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][4].click");
        test.log(LogStatus.PASS,"By.xpath//a[contains@href, '#processed-offers'].click");
        test.log(LogStatus.PASS,"By.xpath//a[contains@href, '#special-offers'].click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextУправление менеджерами.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='main_div']/div/div/div[2]/div/div/div/ul/li[2].click");
        test.log(LogStatus.PASS,"By.linkTextТоп менеджеров.click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='top-managers']/table/thead/tr/th[2].click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='top-managers']/table/thead/tr/th[3].click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='top-managers']/table/thead/tr/th[4].click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='top-managers']/table/thead/tr/th[5].click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.linkTextУправление рекламодателями менеджеров.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='manager-control']/div[2]/div/table/thead/tr/th[4].click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='manager-control']/div[2]/div/table/thead/tr/th[5].click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.xpath//div[@id='manager-control']/div[2]/div/table/thead/tr/th[6].click");
        test.log(LogStatus.PASS,"By.cssSelectorth.sorting-asc.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys *********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.linkTextПользователи.click");
        test.log(LogStatus.PASS,"By.linkTextПользователи.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextРекомендации на доверенных и VIP.click");
        test.log(LogStatus.PASS,"By.linkTextРекомендации для VIP.click");
        test.log(LogStatus.PASS,"By.linkTextРекомендации для снятия доверенных.click");
        test.log(LogStatus.PASS,"By.linkTextРекомендации для снятия VIP.click");
        test.log(LogStatus.PASS,"By.linkTextРекомендации для доверенных.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorul.mainnav > li.dropdown. > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextПоиск вебмастера под трафик.click");
        test.log(LogStatus.PASS,"By.cssSelectorbutton.ms-choice.click");
        test.log(LogStatus.PASS,"By.nameselectItem.click");
        test.log(LogStatus.PASS,"By.cssSelectordiv.span11.well.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.cssSelectorbutton.ms-choice.click");
        test.log(LogStatus.PASS,"By.nameselectItem.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][2].click");
        test.log(LogStatus.PASS,"By.xpath//input[@name='selectItem'][26].click");
        test.log(LogStatus.PASS,"By.cssSelector#sizcache07514414220826756 > ul > li > label.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='button'][2].click");
        test.log(LogStatus.PASS,"By.xpath//input[@name='selectItem'][26].click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idwebmaster_privacy.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idwebmaster_privacy.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idwebmaster_status.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idwebmaster_status.click");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idwebmaster_status.click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.sendKeys1");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.sendKeys1");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.sendKeys2");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.sendKeys2");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.sendKeys3");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.sendKeys3");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.sendKeys4");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.sendKeys4");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.sendKeys5");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.sendKeys5");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.click");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_from.sendKeys6");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.clear");
        test.log(LogStatus.PASS,"By.idtraffic_estimation_to.sendKeys6");
        test.log(LogStatus.PASS,"By.xpath//button[@type='submit'].click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys **********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextПредупреждения.click");
        test.log(LogStatus.PASS,"By.linkTextЗаблокированные офферы [15].click");
        test.log(LogStatus.PASS,"By.linkTextСовпадения по ip-адресам [775].click");
        test.log(LogStatus.PASS,"By.linkTextСовпадения по WMID [673].click");
        test.log(LogStatus.PASS,"By.linkTextСовпадения по куки [199].click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");
        test.log(LogStatus.PASS,"By.idadmin_email.clear");
        test.log(LogStatus.PASS,"By.idadmin_email.sendKeysn.ruhee@advertstar.net");
        test.log(LogStatus.PASS,"By.idadmin_password.clear");
        test.log(LogStatus.PASS,"By.idadmin_password.sendKeys *********");
        test.log(LogStatus.PASS,"By.cssSelectora.custom-green-btn.submit-btn.click");
        test.log(LogStatus.PASS,"By.cssSelectorli.dropdown.active > a.dropdown-toggle > i.icon-user.click");
        test.log(LogStatus.PASS,"By.linkTextПромо коды.click");
        test.log(LogStatus.PASS,"By.cssSelectora.btn.user-details.click");
        test.log(LogStatus.PASS,"By.cssSelectorbutton.btn.click");
        test.log(LogStatus.PASS,"By.linkTextРедактировать.click");
        test.log(LogStatus.PASS,"By.namecommit.click");
        test.log(LogStatus.PASS,"By.cssSelectora.dropdown-toggle.click");
        test.log(LogStatus.PASS,"By.linkTextВыйти из системы.click");


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