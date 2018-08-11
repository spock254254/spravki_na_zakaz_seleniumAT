package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.FaqPage;
import org.junit.Before;

public class FaqPageTest extends BaseTest {

    private FaqPage faqPage;

    @Before
    public void setUp(){
        faqPage = new FaqPage(driver);
        super.initPage(faqPage);
        driver.get("http://spravki-na-zakaz.com/faq");
    }


}
