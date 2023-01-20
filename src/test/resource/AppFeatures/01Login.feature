Feature: Login

@tag1
	Scenario: Verify the SignUp button
	Given user start login page 
	Then user click on the Signup button for login page
	And user check the Signup page redirection
	
@tag2
	Scenario: Verify the Login button
	Then user click on the login button for login page
	And  user check the Login page redirection
	
@tag3
	Scenario: Verify the ForgotPassword button
	Then user click on the ForgotPassword button from login page
	And  user check the ForgotPassword page redirection
	
@tag4
	Scenario: Verify the Login button from Forgot Password page
	Then user click on the login button from Forgot Password page
	And  user check the Login page redirection
	
 @tag5
  Scenario Outline: verify user Login  
 	 Given user start login page 
  	And user enters credentials "<username>" and "<password>"
  	Then user click on Log in button
  	Then user checking the Login page
  	
		Examples:
		|username|  |password| 
		||  ||  
		|naveensam444@gmail.com|  ||
		||  |192@Jagan|
		|hasgudfjhasf|  ||
		|| |dkds|
		|naveensam444@gmail.com|  |5569|
		|dsjfidjs|  |192@Jagan|
		|dsgds|  |fsdfd|

 
 @tag6
  Scenario Outline: verify user Login  for Positive scenario
  	Given user start login page 
  	And user enters credentials "<username>" and "<password>"
  	Then user click on Log in button
  	Then user checking the Login page for Positive scenario
  	
		Examples:
		|username|  |password| 
		|naveensam444@gmail.com|  |Naveen@001|











