Feature: Manage Jobs

     @tag
    Scenario: Check the Manage Jobs (Positive Scenario 1)
    Given  user starts with the login page for Manage Jobs page
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Manage jobs page
    When  user directs Manage Jobs page 
    Then    user click on Post a new job page
    Then    user enter job title
    Then    user click on Specialisms and Job type
    Then    user enters Search location
    Then    user enters complete address and job description
    Then    user enters key responsibility
    Then    user select skills and tags and salary type and carreer level
    Then    user fixes offered salary and experience
    Then    user enters no of positions
    Then    user select qualification
    Then    user enters application deadline date
    Then    user select the job post button
     

      @tag1
    Scenario: Check the Manage Jobs (Negaive Scenario 1)
     
    Then    user click on Post a new job page
    Then    user enter job title
     Then   user checks the job post button
     
@tag2
    Scenario: Check the Manage Jobs (Negaive Scenario 2)
    Then    user click on Specialisms and Job type
     Then   user checks the job post button
     
@tag3
    Scenario: Check the Manage Jobs (Negaive Scenario 3)  
     Then    user enters Search location
     Then   user checks the job post button
     
     @tag4
    Scenario: Check the Manage Jobs (Negaive Scenario 4)   
     Then    user enters complete address and job description
     Then   user checks the job post button
     
      @tag5
    Scenario: Check the Manage Jobs (Negaive Scenario 5)
     Then    user enters key responsibility
     Then   user checks the job post button
     
      @tag6
    Scenario: Check the Manage Jobs (Negaive Scenario 6)
      Then    user select skills and tags and salary type and carreer level
     Then   user checks the job post button
 
    @tag7
    Scenario: Check the Manage Jobs (Negaive Scenario 7)
      Then    user fixes offered salary and experience
     Then   user checks the job post button
     
     @tag8
    Scenario: Check the Manage Jobs (Negaive Scenario 8)
       Then    user enters no of positions
     Then   user checks the job post button
 
    @tag9
    Scenario: Check the Manage Jobs (Negaive Scenario 9)
      Then    user select qualification
     Then   user checks the job post button
     
   @tag10
    Scenario: Check the Manage Jobs (Negaive Scenario 10     
    Then    user enters application deadline date
     Then   user checks the job post button
  
     @tag12
    Scenario: Check the Manage Jobs (Positive Scenario 2)
    
    When  user directs Manage Jobs page 
    Then    user select the latest job
    Then   user click on the edit job option
     Then   user enters additional key responsibility
     Then   user click on the update button
    


	@tag13
    Scenario: Check the Manage Jobs (Positive Scenario 3)
    When  user directs Manage Jobs page
    Then    user select the latest job
    Then   user click on the edit job option
    Then   user enters third additional key responsibility and check the close button
      Then    user click on the goback button
    


@tag14
    Scenario: Check the Manage Jobs (Positive Scenario 4)    

     Then   user click on the edit job option
    Then   user edits the jobtitle
    Then   user check the update button
    Then   user refresh the page


    
@tag15
    Scenario: Check the Manage Jobs (Positive Scenario 5)
    
  	Then   user edits the Specialisms and Job type
    Then   user check the update button
     Then   user refresh the page

    
@tag16
    Scenario: Check the Manage Jobs (Positive Scenario 6)
     
    Then  	user edits Search location
    Then   user check the update button
    Then   user refresh the page
    
@tag17
    Scenario: Check the Manage Jobs (Positive Scenario 7)
   
    Then  	user edits complete address
    Then   user check the update button
    Then   user refresh the page
    
@tag18
    Scenario: Check the Manage Jobs (Positive Scenario 8)

    Then  	user edits job description
    Then   user check the update button
    Then   user refresh the page
     
@tag19
    Scenario: Check the Manage Jobs (Positive Scenario 9)
 
    Then   user edits additional key responsibility
    Then   user check the update button
     Then   user refresh the page
     
     
@tag20
    Scenario: Check the Manage Jobs (Positive Scenario 10)

    Then   user edits skills
    Then   user check the update button
    Then  user refresh the page
     
@tag21
    Scenario: Check the Manage Jobs (Positive Scenario 11)

    Then   user edits tags
    Then   user check the update button
     Then   user refresh the page
     
     
 @tag22
    Scenario: Check the Manage Jobs (Positive Scenario 12)
    Then   user edits salary type 
    Then   user check the update button
     Then user refresh the page
     
 @tag23
    Scenario: Check the Manage Jobs (Positive Scenario 13)

    Then   user edits career level
    Then   user check the update button
     Then  user refresh the page
     
     @tag24
    Scenario: Check the Manage Jobs (Positive Scenario 14)

    Then   user edits no of positions
    Then   user check the update button
     Then  user refresh the page


 @tag25
    Scenario: Check the Manage Jobs (Positive Scenario 15)
   Then    user edits qualification
    Then   user check the update button
     Then  user refresh the page


     @tag26
    Scenario: Check the Manage Jobs (Positive Scenario 16)
   
    When  user directs Manage Jobs page
    Then    user select the latest job
    Then   user click on the edit job option
    Then    user edits application deadline
    Then   user check the update button
     Then   user click on the goback button
     Then   user click on the goback button 
     
     
      @tag27
    Scenario: Check the Manage Jobs (Positive Scenario 17)
    Then   user click on the view job option
     Then   user checks the view job page redirection
     Then   user click on the goback button
     
          
     @tag28
    Scenario: Check the Manage Jobs (Positive Scenario 18)
    Then   user click on the assign assessment option
     Then   user checks the assign assessment page redirection
     Then   user click on the goback button
     
     @tag29
    Scenario: Check the Manage Jobs (Positive Scenario 19)
    Then   user click on the assign assessment option
    Then   user click on the goback button
     Then   user checks the Manage jobs page redirection
     
     
 @tag30
    Scenario: Check the Manage Jobs (Positive Scenario 20)
    Then   user click on the assign assessment option
    Then   user click on the add button
     Then   user select the skill 
      Then   user enter the question
    Then   user select the question type      
    Then   user select the experience level
     Then   user enter the first option
     Then   user enter the second option
    Then   user click the correct option
    Then   user checks the add question button
     
@tag31
    Scenario: Check the Manage Jobs (Positive Scenario 21)
     When  user directs Manage Jobs page
    Then   user click on the assign assessment option
    Then   user click on the add button
    Then   user check the popup tab
    
@tag32
    Scenario: Check the Manage Jobs (Positive Scenario 22)
    Then   user select the skill 
    Then   user checks the add question button
    

@tag33
    Scenario: Check the Manage Jobs (Positive Scenario 23)
    Then   user enter the question
    Then   user checks the add question button

@tag34
    Scenario: Check the Manage Jobs (Positive Scenario 24)
    Then   user select the question type
    Then   user checks the add question button
    
    @tag35
    Scenario: Check the Manage Jobs (Positive Scenario 25)
    Then   user select the experience level
    Then   user checks the add question button

@tag36
    Scenario: Check the Manage Jobs (Positive Scenario 26)
    Then   user enter the first option
    Then   user checks the add question button
    
@tag37
    Scenario: Check the Manage Jobs (Positive Scenario 27)
    Then   user enter the second option
    Then   user checks the add question button
    
@tag38
    Scenario: Check the Manage Jobs (Positive Scenario 28)
    Then   user click the correct option
    Then   user checks the add question button
    
@tag39
    Scenario: Check the Manage Jobs (Positive Scenario 29)
     
    When  user directs Manage Jobs page
    Then   user click on the assign assessment option 
    Then   user click on the add button
    Then   user click the cancel option


     
  

     
     
    
      
     
     
     
     
     
     
     
     
     
     
      
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     