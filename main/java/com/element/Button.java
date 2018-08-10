package com.element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Button {

    private WebElement button;
    private WebDriver driver;

    public Button(By locator, WebDriver driver){
        this.driver = driver;
        button = driver.findElement(locator);

    }
    public void click(){
        button.click();
    }
    public String getText(){
        return button.getText();
    }

}
