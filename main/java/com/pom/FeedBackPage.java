package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedBackPage extends BasePage {

    @FindBy(id = "post-21")
    private WebElement article;

    public FeedBackPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle(){
        return super.getArticleTitle(article,"header h1");
    }

}
