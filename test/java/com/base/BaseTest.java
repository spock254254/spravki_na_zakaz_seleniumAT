package com.base;

import com.pom.*;
import org.junit.Assert;
import org.junit.Test;

public class BaseTest extends FunctionalTest {

    private BasePage page;

    public void initPage(BasePage page){
        this.page = page;
    }

    @Test
    public void moveToFaqPage(){

        String expectedTitle = "FAQ";
        int expectedContentSize = 17;
        String expectedURL = "http://spravki-na-zakaz.com/faq/";

        FaqPage faqPage = page.moveToFaq();

        Assert.assertEquals(expectedTitle,faqPage.getArticleTitle());
        Assert.assertEquals(expectedContentSize,faqPage.getArticlePartsSize());
        Assert.assertEquals(expectedURL,faqPage.getCurrentURL());
    }
    @Test
    public void moveToGuaranteesPage(){

        String expectedTitle = "ГАРАНТИИ";
        String expectedURL = "http://spravki-na-zakaz.com/garantii/";

        GuaranteesPage guaranteesPage = page.moveToGuarantees();

        Assert.assertEquals(expectedTitle,guaranteesPage.getArticleTitle());
        Assert.assertEquals(expectedURL,guaranteesPage.getCurrentURL());
    }
    @Test
    public void moveToLiderPage(){

        String expectedTitle = "ЛИДЕРЫ ПРОДАЖ";
        String expectedURL = "http://spravki-na-zakaz.com/lideri-prodazh/";

        LiderPage liderPage = page.moveToLider();

        Assert.assertEquals(expectedTitle,liderPage.getArticleTitle());
        Assert.assertEquals(expectedURL,liderPage.getCurrentURL());
    }
    @Test
    public void moveToPayDilivPage(){

        String expectedTitle = "ОПЛАТА И ДОСТАВКА";
        String expectedURL = "http://spravki-na-zakaz.com/oplata-i-dostavka/";

        PayDiliveryPage payDiliveryPage = page.moveToPayDiliv();

        Assert.assertEquals(expectedTitle,payDiliveryPage.getArticleTitle());
        Assert.assertEquals(expectedURL,payDiliveryPage.getCurrentURL());
    }
    @Test
    public void moveToFeedBackPage(){

        String expectedTitle = "ОТЗЫВЫ";
        String expectedURL = "http://spravki-na-zakaz.com/otzyvy/";

        FeedBackPage payDiliveryPage = page.moveToFeedBackPage();

        Assert.assertEquals(expectedTitle,payDiliveryPage.getArticleTitle());
        Assert.assertEquals(expectedURL,payDiliveryPage.getCurrentURL());
    }
    @Test
    public void moveToContactPage(){

        String expectedTitle = "КОНТАКТЫ";
        String expectedURL = "http://spravki-na-zakaz.com/kontakty/";

        ContactPage contactPage = page.moveToContactPage();

        Assert.assertEquals(expectedTitle,contactPage.getArticleTitle());
        Assert.assertEquals(expectedURL,contactPage.getCurrentURL());
    }

    @Test
    public void moveToMainPage(){
        String expectedTitle = "МЕДИЦИНСКИЕ СПРАВКИ С ДОСТАВКОЙ ПО МОСКВЕ";
        String expectedURL = "http://spravki-na-zakaz.com/";

        MainPage mainPage = page.moveToMainPage();
        Assert.assertEquals(expectedTitle,mainPage.getArticleTitle());
        Assert.assertEquals(expectedURL,mainPage.getCurrentURL());
    }

}
