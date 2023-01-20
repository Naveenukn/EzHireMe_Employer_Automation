Feature: Reset password
@DataDriven
    Scenario Outline: verify user ResetPassword
    Given user starts ResetPassword page
    When user inserts reset credentials "<newPassword>" and "<confirmPassword>"
   	Then user click Save button
   	
   	
   	Examples:
   	|newPassword|  |confirmPassword|
   	||  ||
   	|sdfsdf|  ||
   	||  |sdfds|
   	|sfds|  |sfds|
   	|sadf|  |dsfasdf|
   	|Kiran@001|  |sfsdfs|
   	|sadfd|  |Kiran@001|
   	|Jagan@1010|  |Jagan@1010|
   	
   