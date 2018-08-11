package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    @FindBy(id = "post-23")
    private WebElement article;

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle(){
        return super.getArticleTitle(article,"header h1");
    }


}
