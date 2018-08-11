package com.spravki_na_zakaz;

import com.base.BaseTest;
import com.pom.FeedBackPage;
import org.junit.Before;

public class FeedBeckPageTest extends BaseTest {
    private FeedBackPage feedBackPage;

    @Before
    public void setUp(){
        feedBackPage = new FeedBackPage(driver);
        super.initPage(feedBackPage);
        driver.get("http://spravki-na-zakaz.com/otzyvy/");
    }
}
