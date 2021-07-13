@tag
Feature: Title of your feature
  I want to use this template for my feature file

  # @Login1
  # Scenario: Verify the login functionality
  #  Given I want to launch the browser
  #And open the URL
  #  When I enters username and password
  #And press the submit button
  # Then I validate the outcomes
  #And check more outcomes
  @tag2
  Scenario Outline: Verify the login Credential
    Given I want to open application
    When I check for a Username with "<name>" the "<passcode>" in step
    Then I verify the "<status>" in step

    Examples: 
      |name             |passcode         | status  |
      | Anita.Karthesan | WelcomeHub2020 | success |
      | Kalvin.Fernads  | ABC.gyt        | Fail    |
      | Nicholas.Crotty | ABCDE12        | Fail    |
      
   @June4
    Scenario: Filling a Load & Meter
     Given I want to open Load &Meter tab
     When I Check for load & Meter page
     Then it will shows the Tab "HotWater" & "MeteredGas"
     And It should display of HotWater form
     And It should dispaly of MeteredGas form
     
    @June4
     Scenario: Filling a Hot Water tab
     Given I want to open Load & Meter tab
     When I check for load & Meter page
     Then it will shows the Water Authority
     And it shows the meters of hot water.
     
     @June4
     Scenario: Filling a Metered Gas tab
     Given I want to open Load & Meter tab
     When I check for load & Meter page 
     And I press the button Metered Gas
     Then it will shows the GasMetered tab
     And it shows the meters of hot water.
     
     @June4
     Scenario: Filling a Budget page
     Given I want to open Budget tab
     Then it will display all its own "MSB modification", "MSB Modification","Elec Submeters","Gate Meters","Inspections","Project Management","Hot Water Plant","Hot Water Meters","Solar PV","EV Charging","Others"
     And all tab should display the $ Amount
     And all tab applicable to nagative and positive amount.
     
     @June4 
     Scenario: Filling the tab of prices,fees and charges
     Given I want to open Prices,Fees And Charges
     Then it should shows "Shared Price Plans" and "Fees and Charges" 
     And all tab should display details of Shared Price Plans & Fees and Charges.
     
     
     