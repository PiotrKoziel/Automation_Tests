
Feature: Log in, buy the product, verify the order status

  Scenario Outline: user orders the product in CodersLab page
    Given user logs in to CodersLab shop
    Given user goes to Clothes category
    When  user goes to Hummingbird printed sweater page
    Then  user verifies discount rate
    When  user selects the size <setSize>
    And   user sets the quantity <setQuantity>
    And   user adds the product to cart
    Then  user goes to order page
    When  user fills in the address Forest, London, 11-111
    And   user selects the shipping method
    And   user selects the payment method
    And   user orders the product with obligation to pay
    And   user generates screenshot with order confirmation
    Then  user goes to orders history and details page
    And   user sees the following order status message Awaiting check payment
    And   user compares total prices from status page and order confirmation
    And   closes the browser

    Examples:
    | setSize | setQuantity  |
    |    L    |     3        |