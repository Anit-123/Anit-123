

@api
Feature: Sample Api tests to demonstrate CRUD operation
 
  Scenario: Signin to account
    When I perform POST request for "http://10.30.40.17:5550/api/auth/signin" endpoint
    Then I get a 200 http satus code
