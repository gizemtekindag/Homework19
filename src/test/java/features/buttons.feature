Feature: Click Button Test

  Scenario: Verify "Click Me" button functionality
    Given I am on the Elements page
    When I navigate to the Buttons section
    And I click the "Click Me" button
    Then I should see a success message "You have done a dynamic click"
