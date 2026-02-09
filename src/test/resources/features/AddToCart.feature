Feature: Add product to cart

  Scenario: User adds a product to cart successfully
    Given user is on Demo Web Shop login page
    When user logs in with valid email and password
    And user searches for product
    And user adds the product to cart
    Then product should be visible in the shopping cart
    And user logout
