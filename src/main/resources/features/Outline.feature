@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Login
  Scenario: Verify the login functionality
    Given I want to launch the browser
    And open the URL
    When I enters username and password
    And press the submit button
    Then I validate the outcomes

  @regression1
  Scenario: application main page
    Given I want to launch the browser and open the url
    When i enters username and password
    And press the submit button
    Then I check the main application page open
    And check all available opion on page.

  @regress2
  Scenario: Verify Contracts icon
    Given I want to veify contracts menu
    When i enters Contracts option
    Then it should open Contracts page.

  @regression
  Scenario: Verify contracts page displays
    Given I want to veify contracts menu
    When i press the Contracts icon
    Then it will navigates to the Contracts display page
    And the heading of the page should be "Pending Contracts"
    And sub menu bar is highlighted "Pending Contracts"

  @tag3
  Scenario: Verify Contracts page displays
    Given I want to veify contracts menu
    When i press the Contracts icon
    Then it will navigates to the Contracts display page
    And the heading of the page should be "Pending Contracts"
    And sub menu bar is highlighted "Pending Contracts"
    And the row state should shows the default no.of rows "10"

  @tagSani
  Scenario: Verify Contracts page content
    Given I want to veify contracts menu
    When i press the Contracts icon
    Then it will navigates to the Contracts display page
    And it should show Webtable with 10 rows with column tile.
    And column titles are "Site Id", "Site Name", "Site Address", "Contracts Type", "Actions"

  @Sanity1
  Scenario: Verify Columns actions in descending
    Given I open contracts page
    When it will display pending contracts details
    Then I press the "Site Id"
    And it should show all records in "descending order"
    Then I press the "Site Name"
    And it should show all records in "descending order"
    Then I press the "Site Address"
    And it should show all records in "descending order"
    Then I press the "Contracts Type"
    And it should show all records in "descending order"
    Then I press the "Actions"
    And it should show all records in "descending order"

  @Sanity2
  Scenario: Verify Columns actions in ascending
    Given I open contracts page
    When it will display pending contracts details in descending order
    Then I press the "Site Id"
    And it should show all records in "Ascending order"
    Then I press the "Site Name"
    And it should show all records in "Ascending order"
    Then I press the "Site Address"
    And it should show all records in "Ascending order"
    Then I press the "Contracts Type"
    And it should show all records in "Ascending order"
    Then I press the "Actions"
    And it should show all records in "Ascending order"

  @tag5
  Scenario: Verify Row counts
    Given I open Contracts page
    When it will load the pending contracts records
    Then I select the row count as <Row>
    And its outcome will be <RowData> rows with data incluing all columns 
    
      | Row     | RowData       | 
      | 5       | 5             |
      | 20      | 20            | 
      | 25      | 25            | 
      | 50      | 50            | 
      | 100     | 100           |   