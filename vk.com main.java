package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VkComMain {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://vk.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testVkComMain() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("quick_email")).clear();
    driver.findElement(By.id("quick_email")).sendKeys("");
    driver.findElement(By.id("quick_pass")).clear();
    driver.findElement(By.id("quick_pass")).sendKeys("");
    driver.findElement(By.id("index_email")).clear();
    driver.findElement(By.id("index_email")).sendKeys("");
    driver.findElement(By.linkText("Русский")).click();
    driver.findElement(By.id("quick_email")).clear();
    driver.findElement(By.id("quick_email")).sendKeys("");
    driver.findElement(By.id("quick_pass")).clear();
    driver.findElement(By.id("quick_pass")).sendKeys("");
    driver.findElement(By.id("index_pass")).clear();
    driver.findElement(By.id("index_pass")).sendKeys("");
    driver.findElement(By.id("index_email")).clear();
    driver.findElement(By.id("index_email")).sendKeys("");
    assertEquals("ВКонтакте для мобильных устройств", driver.findElement(By.cssSelector("div.login_mobile_header")).getText());
    assertEquals("VK для Android", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div[3]/a/div[2]/button")).getText());
    assertEquals("VK для iPhone", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div[3]/a[3]/div[2]/button")).getText());
    assertEquals("VK для WP", driver.findElement(By.xpath("//div[@id='content']/div[2]/div/div[3]/a[2]/div[2]/button")).getText());
    assertEquals("Все продукты", driver.findElement(By.linkText("Все продукты")).getText());
    assertEquals("", driver.findElement(By.id("index_email")).getText());
    assertEquals("", driver.findElement(By.id("index_pass")).getText());
    assertEquals("Войти", driver.findElement(By.id("index_login_button")).getText());
    assertTrue(driver.findElement(By.id("index_forgot")).getText().matches("^exact:Забыли пароль[\\s\\S]$"));
    assertEquals("ВКонтакте", driver.findElement(By.linkText("ВКонтакте")).getText());
    assertEquals("о компании", driver.findElement(By.linkText("о компании")).getText());
    assertEquals("правила", driver.findElement(By.linkText("правила")).getText());
    assertEquals("реклама", driver.findElement(By.linkText("реклама")).getText());
    assertEquals("разработчикам", driver.findElement(By.linkText("разработчикам")).getText());
    assertEquals("English", driver.findElement(By.linkText("English")).getText());
    assertEquals("Русский", driver.findElement(By.linkText("Русский")).getText());
    assertEquals("Українська", driver.findElement(By.linkText("Українська")).getText());
    assertEquals("все языки »", driver.findElement(By.linkText("все языки »")).getText());
    driver.findElement(By.linkText("о компании")).click();
    assertEquals("О компании", driver.findElement(By.linkText("О компании")).getText());
    assertEquals("Продукты", driver.findElement(By.linkText("Продукты")).getText());
    assertEquals("Работа ВКонтакте", driver.findElement(By.linkText("Работа ВКонтакте")).getText());
    assertEquals("ВКонтакте — это социальная сеть для быстрой и удобной\nкоммуникации между людьми по всему миру.", driver.findElement(By.cssSelector("div.blog_about_company_descr_line1")).getText());
    assertEquals("Перейти в блог", driver.findElement(By.linkText("Перейти в блог")).getText());
    driver.findElement(By.cssSelector("div.top_home_logo")).click();
    driver.findElement(By.id("index_pass")).clear();
    driver.findElement(By.id("index_pass")).sendKeys("");
    driver.findElement(By.id("index_email")).clear();
    driver.findElement(By.id("index_email")).sendKeys("");
    driver.findElement(By.linkText("правила")).click();
    assertEquals("Правила пользования Сайтом ВКонтакте", driver.findElement(By.cssSelector("div.wikiSubHeader")).getText());
    driver.findElement(By.cssSelector("a.top_home_link.fl_l")).click();
    driver.findElement(By.id("index_pass")).clear();
    driver.findElement(By.id("index_pass")).sendKeys("");
    driver.findElement(By.id("index_email")).clear();
    driver.findElement(By.id("index_email")).sendKeys("");
    driver.findElement(By.linkText("реклама")).click();
    assertEquals("Рекламный кабинет", driver.findElement(By.linkText("Рекламный кабинет")).getText());
    assertEquals("", driver.findElement(By.cssSelector("div.landing_ads_product_icon.company_page")).getText());
    assertEquals("", driver.findElement(By.cssSelector("div.landing_ads_product_icon.target_ads")).getText());
    assertEquals("", driver.findElement(By.cssSelector("div.landing_ads_product_icon.special_projects")).getText());
    driver.findElement(By.id("quick_email")).clear();
    driver.findElement(By.id("quick_email")).sendKeys("");
    driver.findElement(By.id("quick_pass")).clear();
    driver.findElement(By.id("quick_pass")).sendKeys("");
    driver.findElement(By.linkText("Русский")).click();
    driver.findElement(By.id("quick_email")).clear();
    driver.findElement(By.id("quick_email")).sendKeys("");
    driver.findElement(By.linkText("разработчикам")).click();
    assertEquals("Продукты", driver.findElement(By.id("dev_top_products")).getText());
    assertEquals("Документация", driver.findElement(By.id("dev_top_manuals")).getText());
    assertEquals("Мои приложения", driver.findElement(By.id("dev_top_apps")).getText());
    assertEquals("Поддержка", driver.findElement(By.id("dev_top_help")).getText());
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
