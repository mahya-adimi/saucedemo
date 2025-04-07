package com.saucedemo.step_definitions;

import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ShoppingStepDefs {

    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Then("The user adds the follow products to cart")
    public void the_user_adds_the_follow_products_to_cart(List<String> productList) {
        for (String product : productList) {
            productPage.addProduct(product);
        }
    }

    @Then("The shopping cart badge should be updated to {string}")
    public void the_shopping_cart_badge_should_be_updated_to(String numOfProducts) {
        String actualResult = productPage.cartBadge.getText();
        assertEquals("The number of product is not match",numOfProducts, actualResult);
    }

    @Then("The user click on cart icon and navigates to cart page")
    public void the_user_click_on_cart_icon_and_navigates_to_cart_page() {
        productPage.cartIcon.click();
    }

    @Then("Verify The following Products are added to cart")
    public void verify_the_following_products_are_added_to_cart(List<String> expectedProductList) {
        List<String> actualProductList = BrowserUtils.getElementsText(cartPage.productList);
        assertEquals(expectedProductList, actualProductList);
    }

    @Then("The user removes {string} product")
    public void the_user_removes_product(String productName) {
        cartPage.removeProduct(productName);
    }

    @Then("Verify the {string} is removed")
    public void verify_the_is_removed(String productName) {
        List<String> productList = BrowserUtils.getElementsText(cartPage.productList);
        assertFalse(productList.contains(productName));

    }

    @Then("The user click on checkout button and navigates to checkout page")
    public void the_user_click_on_checkout_button_and_navigates_to_checkout_page() {
        cartPage.checkoutBtn.click();
    }

    @Then("The user enters information {string} {string} {string} and finish purchase")
    public void the_user_enters_information_and_finish_purchase(String firstname, String lastname, String zipCod) {
        checkoutPage.firstnameInput.sendKeys(firstname);
        checkoutPage.lastnameInput.sendKeys(lastname);
        checkoutPage.zipInput.sendKeys(zipCod);
        checkoutPage.continueBtn.click();
    }

    @Then("Verify that price is {string}")
    public void verify_that_price_is(String expectedTotalPrice) {
        String actualTotalPrice = checkoutPage.totalPrice.getText();
        assertEquals(expectedTotalPrice, actualTotalPrice);
    }

    @Then("The user click on Finish button")
    public void the_user_click_on_finish_button() {
        checkoutPage.finishBtn.click();
    }

}
