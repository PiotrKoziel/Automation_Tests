Feature: Log in, add new address, verify the data in address form

  Scenario Outline: adds address to user account

    Given user is logged in to CodersLab shop
    When  user goes to Your Address page
    And   user adds new address
    And   user sets the following alias <alias>
    And   user sets the following address <address>
    And   user sets the following city <city>
    And   user sets the following postal code <postal code>
    And   user selects the following country <country>
    And   user sets the following phone <phone>
    And   user submits form
    Then  filled information in address form is correct <alias>, <address>, <city>, <postal code>, <country>, <phone>
    When  user deletes the address
    Then  user sees the following message Address successfully deleted!
    And   user closes the browser

    Examples:
      | alias | address | city   | postal code | country        | phone      |
      | Sting | Forest  | London | 11-111      | United Kingdom | 0044444444 |

