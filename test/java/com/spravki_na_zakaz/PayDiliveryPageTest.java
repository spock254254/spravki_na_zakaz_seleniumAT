package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.PayDiliveryPage;
import org.junit.Before;

public class PayDiliveryPageTest extends BaseTest {
    private PayDiliveryPage payDiliveryPage;

    @Before
    public void setUp(){
        payDiliveryPage = new PayDiliveryPage(driver);
        super.initPage(payDiliveryPage);
        driver.get("http://spravki-na-zakaz.com/oplata-i-dostavka/");
    }
}
