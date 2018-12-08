package com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Program {

    private static WebDriver driver;

    private static WebElement goToEventListButton;
    private  static WebElement loginButton;
    private static WebElement createAccountButton;

    public static void main(String[] args){
        setUp();

        // go to event list BUTTON
        //by class name
        goToEventListButton = tryElementFound(By.className("mat-stroked-button"));
        //by xpath
        goToEventListButton = null;
        goToEventListButton = tryElementFound(By.xpath("/html/body/app-root/app-layout/mat-sidenav-container/mat-sidenav-content/app-wellcome-page/html/body/div/div/div[1]/div[3]/button"));

        //login BUTTON
        // by xpath
        goToEventListButton = tryElementFound(By.xpath("/html/body/app-root/app-layout/app-header/html/body/div/div/mat-toolbar/mat-toolbar-row/a[1]"));

        //create account BUTTON
        //by xpath
        goToEventListButton = tryElementFound(By.xpath("/html/body/app-root/app-layout/app-header/html/body/div/div/mat-toolbar/mat-toolbar-row/a[2]"));

    }

    private static void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mo\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mish.sheygam.com/#/wellcome");
    }
    //метод проверяет если елемент был найден
    private static WebElement tryElementFound(By by){
        WebElement element;
        try{
            element = driver.findElement(by);
        }catch (org.openqa.selenium.NoSuchElementException ex){
            System.out.println("Element has not been found");
            return null;
        }
        System.out.println("Element has been found");
        return element;
    }
}
