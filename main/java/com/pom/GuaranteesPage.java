package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GuaranteesPage extends BasePage {

    @FindBy(id = "post-15")
    private WebElement article_guarantees;

    public GuaranteesPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle(){
        return super.getArticleTitle(article_guarantees,"header h1");
    }

}
