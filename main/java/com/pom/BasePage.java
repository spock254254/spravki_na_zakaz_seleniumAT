package com.pom;

import com.element.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class BasePage extends PageObject{


    @FindBy(css = "div[class='logo col-sm-4 col-md-4'] a")
    protected WebElement btn_imgResp;

    @FindBy(css = "li a[title=Главная]")
    protected WebElement btn_main;

    @FindBy(css = "li a[title=FAQ]")
    protected WebElement btn_faq;

    @FindBy(css = "li a[title=Гарантии]")
    protected WebElement btn_guarantees;

    @FindBy(css = "li a[title='Лидеры продаж']")
    protected WebElement btn_lid;

    @FindBy(css = "li a[title='Оплата и доставка']")
    protected WebElement btn_payDiliv;

    @FindBy(css = "li a[title='Отзывы']")
    protected WebElement btn_feedback;

    @FindBy(css = "li a[title='Контакты']")
    protected WebElement btn_cont;
    //TODO check--------------------------
    @FindBy(css = "li[id='menu-item-33'] a")
    protected WebElement btn_left_student;

    @FindBy(css = "li[id='menu-item-34'] a")
    protected WebElement btn_left_workers;

    @FindBy(css = "li[id='menu-item-35'] a")
    protected WebElement btn_left_children;

    @FindBy(css = "li[id='menu-item-36'] a")
    protected WebElement btn_left_weekend;

    @FindBy(css = "li[id='menu-item-37'] a")
    protected WebElement btn_left_dispensary;

    @FindBy(css = "li[id='menu-item-38'] a")
    protected WebElement btn_left_analyzes;

    @FindBy(css = "li[id='menu-item-332'] a")
    protected WebElement btn_left_specialists;

    @FindBy(css = "li[id='menu-item-392'] a")
    protected WebElement btn_left_another;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }

    protected String getArticleTitle(WebElement article, final String cssSelector){
        return article.findElement(By.cssSelector(cssSelector)).getText();
    }
}
