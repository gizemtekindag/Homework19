Feature: Add Record Test

  Scenario: Add and Edit a Record
    Given I am on the Web Tables page
    When I add a new record with details "John", "Doe", "john.doe@example.com", "30", "5000", "IT"
    And I edit the added record
    Then the record should be updated
