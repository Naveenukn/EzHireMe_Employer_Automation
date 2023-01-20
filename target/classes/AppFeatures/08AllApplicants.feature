Feature: All Applicants

@tag
    Scenario: Check the AllApplicants(Positive Scenario)
    Given  user starts with the login page for All applicants page
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for All applicants page
    When  user directs All applicants page 
    Then    user check the all applicants page
   
   
@tag1
    Scenario: Check the AllApplicants(Positive Scenario 1)
    When   user refreshes the page
    Then    user check the default table view
   
   
@tag2
    Scenario: Check the AllApplicants(Positive Scenario 2)
    When   user click on the card view
    Then    user check the card view
    
       
@tag3
    Scenario: Check the AllApplicants(Positive Scenario 3 - Actions)
    When   user click on the table view
    Then    user click on the actions button
    Then    user click on the view employee
    Then    user check the redirection of view employee
  
       
@tag4
    Scenario: Check the AllApplicants(Positive Scenario 4 - Actions)
    Then    user click on the go back button
    Then    user check the go back button
    
    
@tag5
    Scenario: Check the AllApplicants(Positive Scenario 5 - Actions)
     Then    user click on the actions button
     Then   user click on the schedule interview
     Then    user check the redirection of schedule interview

     
@tag6
    Scenario: Check the AllApplicants(Positive Scenario 6 - Actions)
      Then    user click on the go back button
      Then    user check the go back button
      
@tag7
    Scenario: Check the AllApplicants(Positive Scenario 7)
    Then    user click on the actions button
     Then   user click on the schedule interview
     Then   user enter the title
     Then   user selects the date
     Then   user selects start time
     Then   user selects end time
     Then   user click on add attendees
     Then   user enter attendee email
     Then   user click the add button
     Then   user enters description
     Then   user click on the schedule appointment
     Then   user directs All applicants page 
      
@tag8
    Scenario: Check the AllApplicants(Positive Scenario 8)
    Then    user click on the actions button
     Then   user click on the schedule interview
      Then   user enter the title
      Then   user checks the schedule appointment button
      
      
@tag9
    Scenario: Check the AllApplicants(Positive Scenario 9)
      Then   user selects the date
      Then   user checks the schedule appointment button
      
      
@tag10
    Scenario: Check the AllApplicants(Positive Scenario 10)
      Then   user selects start time
      Then   user checks the schedule appointment button
      
@tag11
    Scenario: Check the AllApplicants(Positive Scenario 11)
      Then   user selects end time
      Then   user checks the schedule appointment button
      
      
@tag12
    Scenario: Check the AllApplicants(Positive Scenario 12)
      Then   user enters description
      Then   user checks the schedule appointment button
      Then   user click on the go back button
      
      
@tag13
    Scenario: Check the AllApplicants(Positive Scenario 13 - Actions)
			Then    user click on the actions button for approve application
 			Then    user click on the approve button
 			Then    user checks the apporve tab pop up
      
      
@tag14
    Scenario: Check the AllApplicants(Positive Scenario 14 - Actions)
     Then    user check the cancel button working
     
     
     
@tag15
    Scenario: Check the AllApplicants(Positive Scenario 15 - Actions)
     Then    user click on the actions button for approve application
     Then    user check the cancel button working on the click on cross button
      
       
   
   
   
   
   
   
   
   
   