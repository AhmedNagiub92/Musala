Feature: Contact Us Form

  Scenario Outline: Verify that error handled when sending a contact us form with an invalid Mail
    Given website is opened
    When Scroll down and go to ‘Contact Us’
    And Fill all required fields except email
    And Under email field enter string with wrong email format "<Wrong_email>"
    And Click ‘Send’ button
    Then error message ‘The e-mail address entered is invalid.’ appears
    Examples:
      |Wrong_email      |
      | WrongMail |
