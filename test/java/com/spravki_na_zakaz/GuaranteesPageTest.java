package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.GuaranteesPage;
import org.junit.Before;

public class GuaranteesPageTest extends BaseTest {
    private GuaranteesPage guaranteesPage;

    @Before
    public void setUp(){
        guaranteesPage = new GuaranteesPage(driver);
        super.initPage(guaranteesPage);
        driver.get("http://spravki-na-zakaz.com/garantii/");
    }
}
