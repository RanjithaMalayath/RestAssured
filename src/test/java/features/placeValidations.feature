
@VerifyPlaceAPI's
Feature: Validating place API's
  I want to use this template to validate all place API's

  @AddPlace
  Scenario Outline: Verify if place is being added  successfully using AddPlaceAPI
    Given Add Place Payload with "<name>" "<language>" "<address>"
    When user calls "AddPlaceAPI" with "Post" http request
    Then the API call is success with status code 200
    And "status" in response body is "OK"
    And verify place_id created maps to "<name>" using "getPlaceAPI"

 Examples:
 		| name     | language | address             |
 		| Ranjitha | English  | World Cross Center  |
 		| Nidhish  | Hindi    | Street Cross Center |
 		
 @DeletePlace 		
 Scenario: Verify if delete place functionality is working
 		Given Delete Place payload 
 		When user calls "deletePlaceAPI" with "Post" http request
 		Then the API call is success with status code 200
 		And "status" in response body is "OK"