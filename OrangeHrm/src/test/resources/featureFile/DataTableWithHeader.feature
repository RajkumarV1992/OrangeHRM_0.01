@notSimple
Feature: Login Function

  Scenario Outline: Successful validation with valid credentials
    Given User access the valid Orange Hrm url
    When User pass the valid "<Username>" and "<Password>"
    And USer click login button
    Then User sees OrangeHRM portal Home pages

    Examples:
      | Username | Password |
      | Admin    | admin123 |
      | Raj		 | sri		|

  
  