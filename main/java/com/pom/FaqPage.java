package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FaqPage extends BasePage {

    @FindBy(id = "post-11")
    private WebElement article;

    public FaqPage(WebDriver driver) {
        super(driver);
    }

    public String getArticleTitle(){
        return super.getArticleTitle(article,"header h1");
    }
    public String getArticleContent(){
        WebElement content = article.findElement(By.cssSelector("div[class='entry-content']"));
        List<WebElement> contentParts = content.findElements(By.tagName("p"));
        StringBuilder allData = new StringBuilder();
        for (WebElement element : contentParts) {
            allData.append(element.getText());
        }
        return allData.toString();
    }
    public int getArticlePartsSize(){
        WebElement content = article.findElement(By.cssSelector("div[class='entry-content']"));
        List<WebElement> contentParts = content.findElements(By.tagName("p"));
        return contentParts.size();
    }

    public MainPage moveToMain(){
        btn_main.click();
        return new MainPage(driver);
    }
}
