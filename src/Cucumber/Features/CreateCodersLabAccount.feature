Feature: create account on CodersLab web page

#  Scenario: Creating new user account
#    Given open browser with coders lab page
#    When  I go to sign in page
#    And   I type the following email address @op.pl and create account
#    And   I choose title
#    And   I type first name Jan and last name Janowski
#    And   I confirm email address
#    And   I type following password Janek
#    And   I select day of birth
#    And   I select month of birth
#    And   I select year of birth
#    And   I have created new account
#    Then  New user is registered and I see the following "Your account has been created"
#    And   close the browser
##
##
  Scenario Outline:   Creating new user account - parameters
    Given an open browser with coderslab web site
    When  I go to sign in page
    And   I type the following email address <Email> and create account
    And   I choose title
    And   I type first name <FirstName> and last name <LastName>
    And   I confirm email address
    And   I type following password <Password>
    And   I select day of birth
    And   I select month of birth
    And   I select year of birth
    And   I have created new account
    Then  New user is registered and I see the following "Your account has been created"
    And   close the browser
    Examples:
      | FirstName | LastName | Email    | Password |
      | Tytus     | Nowak    | @wp.pl   | tytusnow |
      | Jan       | Kowalski | @onet.pl | kowal    |
