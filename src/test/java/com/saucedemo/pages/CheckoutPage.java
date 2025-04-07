package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(id = "first-name")
    public WebElement firstnameInput;

    @FindBy(id = "last-name")
    public WebElement lastnameInput;

    @FindBy(id = "postal-code")
    public WebElement zipInput;

    @FindBy(id = "continue")
    public WebElement continueBtn;

    @FindBy(css = ".summary_total_label")
    public WebElement totalPrice;

    @FindBy(id = "finish")
    public WebElement finishBtn;
}
