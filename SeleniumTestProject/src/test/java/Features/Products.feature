@Products
Feature: Add Product Hepsiburada

  Scenario: Add to card more products
    Given users is on main screen
    When user selects product on main screen
    When user add selected product to card
    Then product added to card
    When user add second product to card
    Then user have more than product on card

  Scenario:Add product to wishlist
    Given user is on main screen
    When user select product to add wishlist
    When user add product to wishlist
    Then product is on wishlist

  Scenario: user buy products
    Given user is on main screen
    When user is on card screen
    When user buy products
