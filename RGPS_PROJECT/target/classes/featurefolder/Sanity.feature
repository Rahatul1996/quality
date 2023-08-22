

  @tag1
  Scenario: Verify Sign up link displayed in Login Page
    Given Open URL
    And Go To home page
    When Verify Sign Up link displayed in Login Page is clickable
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Verify sign-Up page should appear when click Sign-Up.
    Given Open URL
    When Click the Home Page   
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
