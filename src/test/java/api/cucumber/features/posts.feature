Feature: Post feature of facebook
  This will test the functionality at the user wall


  Scenario: Post a message on user wall
    Given user should be loged in and should be present at its own wall
    When I type the message in the text box
    And click on Post buttons
    Then the message should get posted


  Scenario: Post a video on user wall
    Given user should be logged in and should be present at its own wall
    When User supply the youtube link in the text box
    And Click on post button
    Then Video should get posted the user wall
    And the video should have proper thumbnail