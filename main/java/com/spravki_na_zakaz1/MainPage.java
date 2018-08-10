package com.spravki_na_zakaz1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(css = "div[class='logo col-sm-4 col-md-4'] a")
    private WebElement btn_imgResp;

    @FindBy(css = "li a[title=Главная]")
    private WebElement btn_main;

    @FindBy(css = "li a[title=FAQ]")
    private WebElement btn_faq;

    @FindBy(css = "li a[title=Гарантии]")
    private WebElement btn_guarantees;

    @FindBy(css = "li a[title='Лидеры продаж']")
    private WebElement btn_sellid;

    @FindBy(css = "li a[title='Оплата и доставка']")
    private WebElement btn_payDiliv;

    @FindBy(css = "li a[title='Отзывы']")
    private WebElement btn_feedback;

    @FindBy(css = "li a[title='Контакты']")
    private WebElement btn_cont;

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,30);
        PageFactory.initElements(driver,this);
    }


    public void imgRespClick(){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", btn_imgResp);
    }

    public void faqClick(){
        btn_faq.click();
    }
    public void mainClick(){
        btn_main.click();
    }
    public void guaranteesClick(){
        btn_guarantees.click();
    }
    public void sellidClick(){
        btn_sellid.click();
    }
    public void payDilivClick(){
        btn_payDiliv.click();
    }
    public void feedbackClick(){
        btn_feedback.click();
    }
    public void contClick(){
        btn_cont.click();
    }
}
