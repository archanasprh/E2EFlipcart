Feature: Login Action

Scenario: Login with Valid Credentials
	Given User is on Login Page
	And User enters Credentials to LogIn
    |adddmin|admin|
    |hello|Hello|
	Then User clicks on LoginButton

Scenario: Successful LogOut
	When User LogOut from the Application
	Then user is back to LoginPage
	
#Data Driven Testing using DATATABLE
#DataTables are used to handle large amounts of data for this you either need to deal with a list of maps or a map of lists.
#This works only for the single step, below which it is defined
#A separate code needs to understand the test data and 
#then it can be run single or multiple times but again just for the single step, not for the complete test

#pass the test data using the data table and handle it using Raw() method
#Here we are not passing parameters in the step line and 
#even we are not using Examples test data. We declared the data under the step only. 
#So we are using Tables as arguments to Steps.

#This tagging is needed to define in RunnerClass with "tags" option setting
#Datadriven Testing is done by passing data for that we use Scenario Outline with Examples:
#So that Each step from scenario will be executed everytime as per the number of times data 
#is passed in Examples: