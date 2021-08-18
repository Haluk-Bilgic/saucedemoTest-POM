package com.saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    public WebElement find(By locator){
        return driver.findElement(locator);
    }
    public void type(String text,By locator){
        find(locator).clear();
        find(locator).sendKeys(text);
    }
    public void click(By locator){
        find(locator).click();
    }

    public  boolean isDisplayed(By locator){
        try{
            return find(locator).isDisplayed();
        }catch (NoSuchElementException e){
            return  false;
        }

    }


}
