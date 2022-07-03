Feature: Login
  In order to maintain health records 
  as an admin
  I want to access the openemr portal

	@low @invalid
  Scenario: Invalid Credential
    Given I have browser with openemr application
    When I enter username as 'peter'
    And I enter password as 'peter123'
    And I click on login
    Then I should not get access to the portal with error as 'Invalid username or password'

  @high @valid
  Scenario Outline: Valid Credential
    Given I have browser with openemr application
    When I enter username as '<username>'
    And I enter password as '<password>'
    And I click on login
    Then I should get access to portal with title as '<title>'

    Examples: 
      | username   | password   | title   |
      | admin      | pass       | OpenEMR |
      | accountant | accountant | OpenEMR |

   