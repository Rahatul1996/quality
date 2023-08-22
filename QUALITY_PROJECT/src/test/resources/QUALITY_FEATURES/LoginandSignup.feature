Feature: Login and Signup






Scenario: Verify user can signin
Given Open "<URL>" Application 
Then Mousehover Signin Link
Then Click Signin Button
Then Enter email password click signin button2 
Then click signin button2 
Then Verify User can signin successfully

