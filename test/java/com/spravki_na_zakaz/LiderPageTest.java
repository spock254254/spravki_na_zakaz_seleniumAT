package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.LiderPage;
import org.junit.Before;

public class LiderPageTest extends BaseTest {
    private LiderPage liderPage;

    @Before
    public void setUp(){
        liderPage = new LiderPage(driver);
        super.initPage(liderPage);
        driver.get("http://spravki-na-zakaz.com/lideri-prodazh/");
    }

}
