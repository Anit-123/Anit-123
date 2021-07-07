@tag @Anitha
Feature: Title of your feature
  I want to use this template for my feature file

   @tag1
  Scenario: Adding contracts details
    Given I want to launch the browser and open the url
    And adding the "Anita.Karthesan" and "WelcomeHub2020"
    When I complete submit
    And click the Add contracts option
    Then It will navigate to Add contracts page
    And I validate the heading of the page as "Add Contract"
    When I complete the details of the page
    And Add values to "Growthpoint Properties Australia Limited","Commercial","Greenfield", "33124093901" and "VIC"
    And Empty field shows red marker
    And It should allows to next page of filling.
    And close the browser.

   @july4
  Scenario: Filling a form of Utilities
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "Electricity"
    Then It will shows the details of electricity form to add the information
    And The details fields are blank and ready to fill information
    And logout from the page

  @july4
  Scenario: Filling a tab of Hot water
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "Hot Water"
    Then It will shows the details of Hot water form to add the information
    And The details fields are blank and ready to fill information
    And logout from the page

   @july4
  Scenario: Filling a tab of Metered Gas
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "Metered Gas"
    Then It will shows the details of Metered Gas to add the information
    And The details fields are blank and ready to fill information
     And logout from the page
     
   @july4
  Scenario: Filling a tab of Value Ads
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "Value Ads"
    Then It will shows the details of Value Ads to add the information
    And The details fields are blank and ready to fill information
    And logout from the page

   @july4
  Scenario: Filling a tab of EV charging
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "EV charging"
    Then It will shows the details of EV charging to add the information
    And The details fields are blank and ready to fill information
    And logout from the page

  @july4
  Scenario: Filling a tab of Solar PV
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "Solar PV"
    Then It will shows the details of Solar PV to add the information
    And The details fields are blank and ready to fill information
    And logout from the page

   @july4
  Scenario: Filling a tab of Internet
    Given I want to fill Utilities form on Add contracts page
    And I am completing the contracts Details
    When I complete the contract details and press Next button
    Then It will land on "Utilities" tab
    When I place tick the "Internet"
    Then It will shows the details of Internet to add the information
    And The details fields are blank and ready to fill information
    And logout from the page
