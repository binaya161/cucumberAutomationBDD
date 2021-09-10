Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home page
    Given I want to go home
    When I open orange hrm homepage
    Then I verify that the logo present on page
    And  close browser