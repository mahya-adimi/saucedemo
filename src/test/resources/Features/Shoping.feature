@regression
Feature: Add products to cart and Remove them


  Scenario: The user should be able to add the products to cart and finish the shopping

    Given The user is on the login page
    When The user logs in as standard_user
    Then The user should be able to see "Products" title
    And The user adds the follow products to cart
      |Sauce Labs Onesie|
      |Sauce Labs Bike Light|
      |Sauce Labs Backpack|
    Then The shopping cart badge should be updated to "3"
    Then The user click on cart icon and navigates to cart page
    And The user should be able to see "Your Cart" title
    And Verify The following Products are added to cart
      |Sauce Labs Onesie|
      |Sauce Labs Bike Light|
      |Sauce Labs Backpack|
    Then The user removes "Sauce Labs Onesie" product
    And Verify the "Sauce Labs Onesie" is removed
    Then The user click on checkout button and navigates to checkout page
    And The user should be able to see "Checkout: Your Information" title
    And The user enters information "Sarah" "Braun" "12489" and finish purchase
    Then Verify that price is "Total: $43.18"
    And The user click on Finish button
    And The user should be able to see "Checkout: Complete!" title