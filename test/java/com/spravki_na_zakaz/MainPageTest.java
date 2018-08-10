package com.spravki_na_zakaz;

import com.pom.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainPageTest extends FunctionalTest {

    private MainPage mainPage;

    @Before
    public void setUp(){
        mainPage = new MainPage(driver);
        driver.get("http://spravki-na-zakaz.com/");
    }

    @Test
    public void moveToFaqPage(){

        String expectedTitle = "FAQ";
        int expectedContentSize = 17;
        String expectedURL = "http://spravki-na-zakaz.com/faq/";

        FaqPage faqPage = mainPage.moveToFaq();

        Assert.assertEquals(expectedTitle,faqPage.getArticleTitle());
        Assert.assertEquals(expectedContentSize,faqPage.getArticlePartsSize());
        Assert.assertEquals(expectedURL,faqPage.getCurrentURL());
    }
    @Test
    public void moveToGuaranteesPage(){

        String expectedTitle = "ГАРАНТИИ";
        String expectedURL = "http://spravki-na-zakaz.com/garantii/";

        GuaranteesPage guaranteesPage = mainPage.moveToGuarantees();

        Assert.assertEquals(expectedTitle,guaranteesPage.getArticleTitle());
        Assert.assertEquals(expectedURL,guaranteesPage.getCurrentURL());
    }
    @Test
    public void moveToLiderPage(){

        String expectedTitle = "ЛИДЕРЫ ПРОДАЖ";
        String expectedURL = "http://spravki-na-zakaz.com/lideri-prodazh/";

        LiderPage liderPage = mainPage.moveToLider();

        Assert.assertEquals(expectedTitle,liderPage.getArticleTitle());
        Assert.assertEquals(expectedURL,liderPage.getCurrentURL());
    }
    @Test
    public void moveToPayDilivPage(){

        String expectedTitle = "ОПЛАТА И ДОСТАВКА";
        String expectedURL = "http://spravki-na-zakaz.com/oplata-i-dostavka/";

        PayDiliveryPage payDiliveryPage = mainPage.moveToPayDiliv();

        Assert.assertEquals(expectedTitle,payDiliveryPage.getArticleTitle());
        Assert.assertEquals(expectedURL,payDiliveryPage.getCurrentURL());
    }
    @Test
    public void moveToFeedBackPage(){

        String expectedTitle = "ОТЗЫВЫ";
        String expectedURL = "http://spravki-na-zakaz.com/otzyvy/";

        FeedBackPage payDiliveryPage = mainPage.moveToFeedBackPage();

        Assert.assertEquals(expectedTitle,payDiliveryPage.getArticleTitle());
        Assert.assertEquals(expectedURL,payDiliveryPage.getCurrentURL());
    }
    @Test
    public void moveToContactPage(){

        String expectedTitle = "КОНТАКТЫ";
        String expectedURL = "http://spravki-na-zakaz.com/kontakty/";

        ContactPage contactPage = mainPage.moveToContactPage();

        Assert.assertEquals(expectedTitle,contactPage.getArticleTitle());
        Assert.assertEquals(expectedURL,contactPage.getCurrentURL());
    }

}
