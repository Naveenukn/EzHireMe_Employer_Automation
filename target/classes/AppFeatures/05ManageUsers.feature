Feature: Manage users

@tag
    Scenario Outline: Check the Manage users   (Positive Scenario)
    Given  user starts with the login page for Manage users page
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Manage users page
    When  user directs Manage users page 
    When  user inserts User details "<email>""<password>""<fullname>""<phoneNumber>""<confirmpassword>"
    Then   user click on the Create button
    
      Examples: email
  	|password|  |fullname|  |email|  |phoneNumber| |confirmpassword| 			
		|naveenSAM@9876||selenium3088||selenium30888@gmail.com||5846341653| |naveenSAM@9876|
	   	
@tag1
     Scenario Outline: Check the Manage users   (Negative Scenario 1)
    When  user directs Manage users page 
    When  user inserts email address "<email>"
    Then    check the Create button is Enabled or Disabled
    	 Examples: 
   	|email| 
   	|naveensam9876@gmail.com|
   	
@tag2
     Scenario Outline: Check the Manage users   (Negative Scenario 2)
     When  user inserts password "<password>"
    Then    check the Create button is Enabled or Disabled
  	 Examples: 
   	|password| 
   	|naveen@SAM@9876|
   	
@tag3
     Scenario Outline: Check the Manage users   (Negative Scenario 3)
    When  user inserts fullname "<fullname>"
    Then    check the Create button is Enabled or Disabled
   	 Examples: 
   	|fullname| 
   	|Naveen sam|
   	   	
@tag4
     Scenario Outline: Check the Manage users   (Negative Scenario 4)
    When  user inserts country code and phoneNumber "<phoneNumber>"
    Then    check the Create button is Enabled or Disabled
   	 Examples: 
   	|phoneNumber| 
   	|8056330079|

@tag5
     Scenario Outline: Check the Manage users   (Negative Scenario 5)
     When  user directs to the Manage users page 
    When  click on the go back button 
    Then    check the page is redirected to Manage users or not
     Examples: 
   	|phoneNumber| 
   	|8056330079|
   	
@tag6
     Scenario Outline: Check the Manage users   (Negative Scenario 6)
    When  user directs to the Manage users page 
    When  click on the add user button
    Then   check the page is redirected to Add user or not
     Examples: 
   	|phoneNumber| 
   	|8056330079|
   	
@tag7
     Scenario Outline: Check the Manage users   (Negative Scenario 7)
    When  user directs to the Manage users page 
    Then  click on the order by name
    
     Examples: 
   	|phoneNumber| 
   	|8056330079|
   	
@tag8
     Scenario Outline: Check the Manage users   (Negative Scenario 8)
    When  user directs to the Manage users page 
    Then  click on the order by status
    
     Examples: 
   	|phoneNumber| 
   	|8056330079|
   	
@tag9
     Scenario Outline: Check the Manage users   (Negative Scenario 9)
    When  user directs to the Manage users page 
    Then  check the search tab by entering "<search>"
    
     Examples: 
   	|search| 
   	|selenium3088|
   	
@tag10
     Scenario Outline: Check the Manage users   (Negative Scenario 10)
    Then  check the search tab by entering invalid data "<search>"
    
     Examples: 
   	|search| 
   	|85962436|
   	
@tag11
     Scenario: Check the Manage users   (Negative Scenario 11)
    Then   check the sorting tab with limit of 80
    
   		
@tag12
     Scenario: Check the Manage users   (Negative Scenario 12)
    When  user directs to the Manage users page
    Then   check the sorting tab of limit 320
   	 
@tag13
     Scenario: Check the Manage users   (Negative Scenario 13)
     When  user directs to the Manage users page
    Then   check the edit button
    
    
@tag14
     Scenario: Check the Manage users   (Negative Scenario 14)
    When  user directs to the Manage users page 
    Then   click on the edit button
    Then   check the disabled tabs
    
@tag15
     Scenario: Check the Manage users   (Negative Scenario 15)
    Then   change the status
    Then   check the update button
   	
@tag16
     Scenario: Check the Manage users   (Negative Scenario 16)
    Then   change the status and update
    
@tag17
     Scenario: Check the Manage users   (Negative Scenario 17)
     When  user directs Manage users page 
    Then   check the goback button redirection
    
@tag18
     Scenario: Check the Manage users   (Negative Scenario 18)
    Then   click on the delete button and click cancel
    
@tag19
     Scenario: Check the Manage users   (Negative Scenario 19)
     Then   click on the delete button and click yes delete
     
@tag20
     Scenario: Check the Manage users   (Negative Scenario 20)
    When  user directs to the Manage users page 
     Then   check the pagination
     
@tag21
     Scenario: Check the Manage users   (Negative Scenario 21)
     Then   check the next button
     
@tag22
     Scenario: Check the Manage users   (Negative Scenario 22)
    When  user directs to the Manage users page 
     Then   check the previous button
     
@tag23
     Scenario: Check the Manage users   (Negative Scenario 23)
    When  user directs to the Manage users page 
     Then   check the orderby name button in ascending
   	
@tag24
     Scenario: Check the Manage users   (Negative Scenario 24)
      Then   check the orderby name button in descending
   	
@tag25
     Scenario: Check the Manage users   (Negative Scenario 25)
    When  user directs to the Manage users page 
     Then   check the orderby status button in ascending
     
@tag26
     Scenario: Check the Manage users   (Negative Scenario 26)
    When  user directs to the Manage users page 
     Then   check the orderby status button in descending
   	
   	
    	
 
 
 
 
     


  
   	
   	
   	
   	
   	
   	
   	
   	