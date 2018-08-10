package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LiderPage extends BasePage {

    @FindBy(id = "content")
    private WebElement article_lid;

    public LiderPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle(){
        return super.getArticleTitle(article_lid,"h1");
    }
}
