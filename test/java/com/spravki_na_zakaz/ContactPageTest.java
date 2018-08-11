package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.ContactPage;
import org.junit.Before;

public class ContactPageTest extends BaseTest {

    private ContactPage contactPage;

    @Before
    public void setUp(){
        contactPage = new ContactPage(driver);
        super.initPage(contactPage);
        driver.get("http://spravki-na-zakaz.com/kontakty/");
    }
}
