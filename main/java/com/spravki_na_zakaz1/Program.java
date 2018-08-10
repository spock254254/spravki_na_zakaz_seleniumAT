package com.spravki_na_zakaz1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mo\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://spravki-na-zakaz.com/");
        WebElement li = driver.findElement(By.id("menu-item-26"));
        WebElement a = li.findElement(By.xpath("//a[@title='FAQ']")); // +

        System.out.println(a);
        if(a == null)System.out.println("NULL");
        else a.click();
        //driver.quit();

    }
}
