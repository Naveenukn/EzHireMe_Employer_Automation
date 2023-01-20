Feature: Company Details

@tag
    Scenario Outline: Check the Company details   (Positive Scenario)
    Given user starts with the login page 
    When  user enters email as "naveensam444@gmail.com" and password as "Naveen@001"
    When  user directs Company details page 
    When  user inserts Company details "<profileImage>""<companyName>""<phoneNumber>""<email>""<website>""<description>"
    Then  user click the Company details Save button
    When  user inserts Contact information "<location>""<completeaddress>"
    Then  user click the Contact information Save button
    When  user inserts Social network information "<facebook>""<twitter>""<linkedIn>""<instagram>"
    Then  user click the Social network Save button
   
   Examples: 
   	|profileImage|  |companyName|  |phoneNumber| |website|  |description|  |location|  |completeaddress|  |facebook|  |twitter|  |linkedIn|  |instagram|
   	|C:\Users\NAVEEN KUMAR\Downloads\Tesla.jpg|  |Tesla|  |8056330079|  |http://tesla.com|  |Tesla is an American automotive manufacturer based in Palo Alto, California. The company, founded in 2003, has its main factory located at Fremont, California. The factories, termed as Gigafactories, are also located in Nevada, New York and China, the latter being the first of its kind outside the U.S.|  |Texas|  |11, 2nd Street, Texas|  |https://tesla.facebook.com|  |https://tesla.twitter.com|  |https://tesla.linkedin.com|  |https://tesla.instagram.com|
  
  
     					
@tag1
    Scenario Outline: Check the Company details    (1. Negative Scenario-Adding only Profile image)
    Given user starts the login page 
    When  user enters the email as "naveensam444@gmail.com" and password as "Naveen@001"
    When  user directs to the Company details page 
    When  user inserts the "<profileImage>" 
    Then  check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    
        					
@tag2
    Scenario Outline: Check the Company details    (2. Negative Scenario-Adding Company Name)
    Then user inserts the companyname  as "Capgemini"
    Then check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    
               					
@tag3
    Scenario Outline: Check the Company details    (3. Negative Scenario-Adding Industry Type)
      When user selects industry type
    Then check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    	
    	  	
@tag4
    Scenario Outline: Check the Company details    (4. Negative Scenario-Adding Country Code)
     When user selects country code
    Then check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 


@tag5
    Scenario Outline: Check the Company details    (5. Negative Scenario-Adding Phone Number)
      When user inserts the phonenumber as "8056330089"
    Then check the Company details Save button is Enabled or Disabled
   
    Examples: 
    |profileImage|             
    |C:\Users\ADMIN\Downloads\company.jpg| 
    
    
@tag6
    Scenario Outline: Check the Company details    (6. Negative Scenario-Adding Email Address)
    When user inserts the emailaddress as "capgemini99@gmail.com"
    Then check the Company details Save button is Enabled or Disabled
   
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    

@tag7
    Scenario Outline: Check the Company details    (7. Negative Scenario-Adding Website)
		When user inserts the website as "http://capgemini99.com"
    Then check the Company details Save button is Enabled or Disabled
   
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    

@tag8
    Scenario Outline: Check the Company details    (8. Negative Scenario-Adding Company Info)
    When user inserts the companyinfo as "Test company info"
    Then check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    
    
@tag9
    Scenario Outline: Check the Company details    (9. Negative Scenario-Invalid email)
  When user inserts the invalidemail as "gdshd"
    Then check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg| 
    	
    						
@tag10
    Scenario Outline: Check the Company details    (10. Negative Scenario-Uploading max size image)
  
    When user inserts the "<profileImage>" 
    Then check the Company details Save button is Enabled or Disabled
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\CompanyMax.jpg| 
    
    
 @tag11
    Scenario Outline: Check the Company details    (11. Negative Scenario-Uploading pdf as profile picture)
    
    
    Then check the Company details Save button is Enabled or Disabled
    Then user logout the page
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\SCANDOCUMENTS.pdf| 
   
 @tag12
    Scenario Outline: Check the Company details    (12. Negative Scenario-Editing only profile picture)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Profile image "<profileImage>" 
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |profileImage|
    |C:\Users\ADMIN\Downloads\company.jpg|
    

@tag13
    Scenario Outline: Check the Company details    (13. Negative Scenario-Editing only Company name)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Company Name "<companyName>" 
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |companyName|
    |Accenture|


@tag14
    Scenario Outline: Check the Company details    (14. Negative Scenario-Editing only Industry type)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Industry type 
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |companyName|
    |Accenture|
    
    
@tag15
    Scenario Outline: Check the Company details    (15. Negative Scenario-Editing only Country code)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Country code 
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |companyName|
    |Accenture|
    
    
@tag16
    Scenario Outline: Check the Company details    (16. Negative Scenario-Editing only Phone number)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Phone number "<phoneNumber>"
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |phoneNumber|
    |8574693214|
     

@tag17
    Scenario Outline: Check the Company details    (17. Negative Scenario-Editing only Email)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Email "<email>"
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |email|
    |accenture01@gmail.com|


@tag18
    Scenario Outline: Check the Company details    (18. Negative Scenario-Editing only Website)
    Given  user starts with the login page 
    When user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When user directs Company details page 
    When user changes the Website "<website>"
    Then check the Company details Save button is Enabled or Disabled
    Then user logout the page
    
    Examples: 
    |website|
    |https://accenture.com|

     
@tag19
    Scenario Outline: Check the Company details    (19. Negative Scenario-Editing only Company info)
    Given user starts with the login page 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs Company details page 
    When  user changes the Company info "<description>"
    Then  check the Company details Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |description|
    |Accenture plc is an Irish-American professional services company based in Dublin, specializing in information technology (IT) services and consulting. A Fortune Global 500 company, it reported revenues of $50.53 billion in 2021.Accenture's current clients include 91 of the Fortune Global 100 and more than three-quarters of the Fortune Global 500.|



@tag20
    Scenario Outline: Check the Company details    (20. Negative Scenario-Adding only Location)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user changes the Location "<location>"
    Then  check the Contact information Save button is Enabled or Disabled
    Then  user logout the page
    
    Examples: 
    |location|
    |Hyder| 



@tag21
    Scenario Outline: Check the Company details    (21. Negative Scenario-Adding only Facebook tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user adds the Facebook info "<facebook>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |facebook|
    |https:capgemini/facebook.com| 
    
    
    
@tag22
    Scenario Outline: Check the Company details    (22. Negative Scenario-Adding only Twitter tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user adds the Twitter info "<twitter>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |twitter|
    |https:capgemini/twitter.com| 
    
    
@tag23
    Scenario Outline: Check the Company details    (23. Negative Scenario-Adding only LinkedIn tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user adds the LinkedIn info "<linkedIn>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |linkedIn|
    |https:capgemini/linkedin.com| 
    
    
    
@tag24
    Scenario Outline: Check the Company details    (24. Negative Scenario-Adding only Instagram tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user adds the Instagram info "<instagram>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |instagram|
    |https:capgemini/instagram.com| 



  
@tag25
    Scenario Outline: Check the Company details    (25. Negative Scenario-Resetting and Adding only Facebook tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user resets and adds the Facebook info "<facebook>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |facebook|
    |https:capgeminiadditional/facebook.com|


@tag26
    Scenario Outline: Check the Company details    (26. Negative Scenario-Resetting and Adding only Twitter tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user resets and adds the Twitter info "<twitter>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |twitter|
    |https:capgeminiadditional/twitter.com| 
 

@tag27
    Scenario Outline: Check the Company details    (27. Negative Scenario-Resetting and Adding only LinkedIn tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user resets and adds the LinkedIn info "<linkedin>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |linkedin|
    |https:capgeminiadditional/linkedin.com| 
 

@tag28
    Scenario Outline: Check the Company details    (28. Negative Scenario-Resetting and Adding only Instagram tab)
    Given user starts the login page 
    When  user enters the email as "Jagan192@fulltanker.com" and password as "Jagan@1097"
    When  user directs to the Company details page 
    When  user resets and adds the Instagram info "<instagram>"
    Then  check the Social network Save button is Enabled or Disabled
    Then  user logout the page
    Examples: 
    |instagram|
    |https:capgeminiadditional/instagram.com| 
 
    


    
    
    