package com.saucedemo.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }
    private By productLabel=By.className("title");
    private By backPack=By.id("item_4_title_link");
    private By addToCardButton=By.className("btn_inventory");

    public  boolean isProductLabelDisplayed(){
        return isDisplayed(productLabel);
}
    public void addBackPack(){
        find(backPack).click();
        click(addToCardButton);
    }
    public String getButtonName(){
        return find(addToCardButton).getText();
    }

}
