Feature: Register to Website

  @SmokeTest
  Scenario: Registration with valid Email
    Given Navigate to Presta Shop
    And Click On signIn
    Then Enter "<email>" into the email text box
    | email |
    | omar0922@gmail.com |
    And Click on create Account Button
    And Click On gender male button
    And Enter Data in Text Box
    | firstName  | Omar     |
    | lastName    |  Tarek   |
    | email       | omar0922@gmail.com  |
    | password    | 0922    |
     | date of birth | 09/22/2002 |
    When Click On  Register
    Then Success message of success should be displayed

