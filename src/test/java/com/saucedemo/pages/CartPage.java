package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".inventory_item_name")
    public List<WebElement> productList;

    @FindBy(id = "checkout")
    public WebElement checkoutBtn;

    public void removeProduct(String productName) {
        WebElement removeBtn = Driver.get().findElement(By.xpath("//div[text()='"+productName+"']/../../..//button"));
        removeBtn.click();
    }

    public WebElement findProduct(String productName) {
        WebElement product = Driver.get().findElement(By.xpath("//div[text()='"+productName+"']"));
        return product;
    }
}
