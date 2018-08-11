package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.*;
import org.junit.Before;

public class MainPageTest extends BaseTest {

    private MainPage mainPage;

    @Before
    public void setUp(){
        mainPage = new MainPage(driver);
        super.initPage(mainPage);
        driver.get("http://spravki-na-zakaz.com/");
    }


}
