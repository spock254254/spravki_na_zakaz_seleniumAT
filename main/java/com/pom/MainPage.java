package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public FaqPage moveToFaq(){
        btn_faq.click();
        return new FaqPage(driver);
    }
    public GuaranteesPage moveToGuarantees(){
        btn_guarantees.click();
        return new GuaranteesPage(driver);
    }
    public LiderPage moveToLider(){
        btn_lid.click();
        return new LiderPage(driver);
    }
    public PayDiliveryPage moveToPayDiliv(){
        btn_payDiliv.click();
        return new PayDiliveryPage(driver);
    }
    public FeedBackPage moveToFeedBackPage(){
        btn_feedback.click();
        return new FeedBackPage(driver);
    }
    public ContactPage moveToContactPage(){
        btn_cont.click();
        return new ContactPage(driver);
    }

}
