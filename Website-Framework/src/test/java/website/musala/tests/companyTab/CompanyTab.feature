Feature: Company Tab

  Scenario: Verify that Company tab contains leadership section and validate the redirection of the facebook page
    Given website is opened
    When click on company tab
    Then assert the url is opened
    And assert leadership section is displayed
    When Click the Facebook link from the footer
    Then Verify that the correct URL loads
    And verify if the Musala Soft profile picture appears on the new page

