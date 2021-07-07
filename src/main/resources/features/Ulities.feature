
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Add site details information
    Given I want to open site contracts details page
   # And 
    And After completing the Utilities page information
    When I click the next button of the page
    Then I should lands on Site Detail
    And It show the heading as Add Contract 
    And yet it shows the site details form to fill the information.
    When I add "site Name" "Street Name" "Street Number" "Street Type" "Suburb" 
    Then All details are filled and no fields are blank
    And Press the Next button.
  
  @June
  Scenario: Add suburb and receive the postcode
  Given I want to add the site details of contract
  When I enters "Site Name" "Street Name" "Street Number" "Street Type" "Suburb"
  And Finally add "Postcode"
  
  | Suburb         | Postcode    | 
  | Hadfield       | 3046        |
  | Hawthron       | 3122        | 
  | Hawthron North | 3122        | 
  | Hawthron West  | 3122        | 
  | Hawthron East  | 3123        |   
  | Hartwell       | 3124        | 
  | Hawksburn      | 3142        | 
  | Hampton        | 3188        | 