Feature: Career Tab

  Scenario Outline: Verify Job Application Functionality
    Given website is opened
    When click on career tab
    And Click ‘Check our open positions’ button
    Then Verify that ‘Join Us’ page is opened
    When Select location From the dropdown
    And Choose open position by name
    Then Verify that General Description sections is shown
    And Verify that Requirements sections is shown
    And Verify that Responsibilities sections is shown
    And Verify that What we offer sections is
    And Verify that ‘Apply’ button is present at the bottom
    When Click ‘Apply’ button
    And Fill with "<FormName>" with "<FormEmail>" with "<FormMobile>"
    And Upload a file
    And check the agreement and recaptcha
    Then Verify error are handeled

    Examples:
      | FormName | FormEmail | FormMobile |
      | EmptyName | WrongMail | WrongMobile |


