package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayDiliveryPage extends BasePage {

    @FindBy(id = "post-19")
    private WebElement article_dilivAndPay;

    public PayDiliveryPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle(){
        return super.getArticleTitle(article_dilivAndPay,"header h1");
    }

}
