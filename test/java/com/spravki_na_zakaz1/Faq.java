package com.spravki_na_zakaz1;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Faq {
    private static WebDriver driver;
    private MainPage mainPage;
    @BeforeClass
    public static void setUpBefore(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mo\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");


    }
    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        driver.get("http://spravki-na-zakaz.com/faq/");
    }

    @Test
    public void mainClick(){
        mainPage.imgRespClick();
        String result = driver.getCurrentUrl();
        driver.quit();
        Assert.assertEquals(result,"http://spravki-na-zakaz.com/");
    }

    @Test
    public void TestFaqPage(){
        mainPage.faqClick();
        Assert.assertEquals(driver.getCurrentUrl(),"http://spravki-na-zakaz.com/faq/");
        driver.close();
    }

    @Test
    public void faqClick(){
        String expected = "http://spravki-na-zakaz.com/faq/";
       // driver.get("http://spravki-na-zakaz.com/");
        WebElement li = driver.findElement(By.id("menu-item-26"));
        //WebElement a = li.findElement(By.xpath("//a[@title='FAQ']"));
        WebElement a = li.findElement(By.cssSelector("a[title=FAQ]"));
        a.click();
        String result = driver.getCurrentUrl();
        driver.quit();
        Assert.assertEquals(expected, result);
    }
    @Test
    public void faqClick2(){
        String expected = "http://spravki-na-zakaz.com/faq/";
       // driver.get("http://spravki-na-zakaz.com/");
        WebElement li = driver.findElement(By.id("menu-item-26"));
        //WebElement a = li.findElement(By.xpath("//a[@title='FAQ']"));
        WebElement a = li.findElement(By.cssSelector("a[title=FAQ]"));
        a.click();
        String result = driver.getCurrentUrl();
        driver.quit();
        Assert.assertEquals(expected, result);
    }
    @After
    public void tearDown(){
        driver = null;
    }
}
