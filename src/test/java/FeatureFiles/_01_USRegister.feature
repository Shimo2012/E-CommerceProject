Feature: Register to Website

  @SmokeTest
  Scenario: US01 Registration
    Given Navigate to Presta Shop4
    When Click On The Element
    | signInClick |
    Then Enter Data in Text Box
    | email |
    And Click On The Element
    | createAccountButtonClick |
    | genderMale  |
    And Enter Data in Text Box
    | firstName  | Omar     |
    | lastName    |  Tarek   |
    | email       | omar0922@gmail.com  |
    | password    | 0922    |
    And Click On The Element
    | submitAccount  |
    And Verification Is In Progress
    | accountSuccess | Your account has been created |
    And Click On The Element
    | myAccount  |
    And Verification Is In Progress
    | myAccountSuccess | Welcome to your account
