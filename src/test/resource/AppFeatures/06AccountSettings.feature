Feature: Account settings

@tag
    Scenario Outline: Check the Account settings    (Positive Scenario)
    Given  user starts with the login page for Account settings page
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    user click on next button
    Then    user enters valid newPassword and confirmPassword
    When  user click on save button 
        
    Examples:  
   |currentPassword|
   |Jagan@1097|
   
@tag1
    Scenario Outline: Check the Account settings    (Negative Scenario 1)
    
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user logout
    
    Examples: 
   |currentPassword|
   |dygh|
   
@tag2
    Scenario Outline: Check the Account settings    (Negative Scenario 2)

    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    check the account settings page redirection
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag3
    Scenario Outline: Check the Account settings    (Negative Scenario 3)

    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button and goback button
    Then    check the current password settings page redirection
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag4
    Scenario Outline: Check the Account settings    (Negative Scenario 4)
  
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters the valid newPassword and confirmPassword
    Then    check the Save button enable
    Then    user logout
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag5
    Scenario Outline: Check the Account settings    (Negative Scenario 5)

    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters the invalid newPassword and confirmPassword
    Then    check the Save button enable
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag6
    Scenario Outline: Check the Account settings    (Negative Scenario 6)
    
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters only newPassword 
    Then    check the Save button enable
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
  
@tag7
    Scenario Outline: Check the Account settings    (Negative Scenario 7)
    
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters only confirmPassword 
    Then    check the Save button enable
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag8
    Scenario Outline: Check the Account settings    (Negative Scenario 8)
    
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters valid newPassword and invalid confirmPassword
    Then    check the Save button enable
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag9
    Scenario Outline: Check the Account settings    (Negative Scenario 9)

    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters invalid newPassword and valid confirmPassword
    Then    check the Save button enable
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
  
@tag10
    Scenario Outline: Check the Account settings    (Negative Scenario 10)
  
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters the valid newPassword and valid confirmPassword
    Then    check the reset button working
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
@tag11
    Scenario Outline: Check the Account settings    (Negative Scenario 11)
 
    When  user enters email as "Jagan192@fulltanker.com" and password as "Jagan@1097"for Account settings page
    When  user directs Account settings page 
    Then    users enter the account settings password with correct current password "<currentPassword>"
    Then    click on the next button
    Then    user enters the valid newPassword and valid confirmPassword
    Then    check the reset button working
    Then    user logout
    
    Examples: 
   |currentPassword|
   |Jagan@1097|
   
  
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   