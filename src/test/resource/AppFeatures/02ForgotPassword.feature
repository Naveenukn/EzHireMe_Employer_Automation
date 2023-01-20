Feature: ForgotPassword

@tag1

	Scenario: check the Login page redirection
	Given user starts ForgotPassword page
	Then user click on the Login button for Forgot password page
	Then user checks the Login page redirection from Forgot password page
	








@tag
    Scenario Outline: verify user ForgotPassword
    Given user starts ForgotPassword page
    When user enter "<username>" 
   	Then user click Reset button
   	
   	
   	Examples:
   	|username|
   	||
   	|sdfkjkfjsdkfks@|
   	|jagan192@fulltanker.com|
   	|naveensam444@gmail.com|
