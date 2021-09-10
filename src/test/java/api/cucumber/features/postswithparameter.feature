Feature: Post feature of facebook
  This will test the functionality at the user wall


  Background: This is for common steps
    Given user should be loged in and should be present at its own wall

  Scenario: Post a message on user wal
    When I type the message as "My Post"in the text box
    And click on Post button
    Then the message should be get posted


  Scenario: Post a video on user wall

    When User supply the youtube link as "https://www.google.com" in the text box
    And Click on post button1
    Then Video should get posted on the user wall
    And the video should have proper thumbnail.
