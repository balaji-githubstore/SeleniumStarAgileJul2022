Feature: Patient
  In order to maintain health records 
  as an admin
  I want to add,edit,delete patient records

  @low
  Scenario: Add Patient
    Given I have browser with openemr application
    When I enter username as 'peter'
    And I enter password as 'peter123'
    And I click on login
