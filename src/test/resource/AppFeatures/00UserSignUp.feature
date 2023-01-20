Feature: Sign Up 
 @tag1
  Scenario Outline: verify user Signup (Negative Scenarios)
  
  	Given user start register page 
  	And   user enters credentials "<companyName>""<companyWebsite>""<legalFirstName>""<legalLastName>""<contactNumber>""<email>""<password>" and "<confirmPassword>"
  	Then  user click on the Signup button
  	Then  user checking the verify email page
  	
  	
Examples:
|companyName|  |companyWebsite|  |legalFirstName|  |legalLastName|  |contactNumber|  |email|  |password|  |confirmPassword|
||  ||  ||  ||  ||  ||  ||  || 
|JKTech Solutions|  ||  ||  ||  ||  ||  ||  || 
|JKTech Solutions|  |http://techsolutions.com|  ||  ||  ||  ||  ||  || 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  ||  ||  ||  ||  || 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  ||  ||  ||  || 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  ||  ||  || 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  ||  || 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  || 
|JKTech Solutions|  |httptechSosutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |99653021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthiquanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran001| 
||  |http://techSolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  ||  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  ||  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  ||  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  ||  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  ||  |Kiran@001|  |Kiran001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  ||  |Kiran@001| 
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |kkiran.palaparthi@quanbytech.onmicrosoft.com|  |Kiran@001|  ||


@tag2
  Scenario Outline: verify user Signup (Positive Scenario) 
  
  	Given user start register page 
  	And   user enters credentials "<companyName>""<companyWebsite>""<legalFirstName>""<legalLastName>""<contactNumber>""<email>""<password>" and "<confirmPassword>"
  	Then  user click on the Signup button
  	Then  user checking the verify email page for positive scenario
  	
  Examples:
|companyName|  |companyWebsite|  |legalFirstName|  |legalLastName|  |contactNumber|  |email|  |password|  |confirmPassword|
|JKTech Solutions|  |http://techsolutions.com|  |Tech|  |Solutions|  |9965388021|  |naveen000000000001@quanbytech.onmicrosoft.com|  |Naveen@001|  |Naveen@001| 






















