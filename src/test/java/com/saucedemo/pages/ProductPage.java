package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(css = ".shopping_cart_link")
    public WebElement cartIcon;

    @FindBy(css = ".shopping_cart_badge")
    public WebElement cartBadge;

    public void addProduct(String productName) {
        WebElement addToCartBtn = Driver.get().findElement(By.xpath("//div[text()='"+productName+"']/../../..//button"));
        addToCartBtn.click();
    }

}
