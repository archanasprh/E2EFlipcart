Feature: Login functionality

@smoke
Scenario: Valid Login with valid credentials
Given user should be on login page
When user enters valid "admin" and "admin"
#Here we are passing data directly(in place of userid and password) that is Parameterization without Example keyword 
#This is data table concept where is passed but one perticular step is only repeated number of times data is given
#|admin|admin|								
And clicks on Login button
Then user should be on home page
And verify logout link



#Data-Driven Testing Using Examples Keyword
#Examples:
#          | username  | password  |				==>This is Header Line
#          | testuser_1 | Test@153 |
#          | testuser_2 | Test@153 |
#Note: The table must have a header row corresponding to the variables in the Scenario Outline steps.
#Each line below the header represents an individual run of the test case with the respective data. As a result, 
#if there are 3 lines below the header in the Examples table, the script will run 3 times with its respective data.

#Here Cucumber automatically run the complete test the number of times equal to the number of data in the Test Set

@sanity
Scenario Outline: Login with invalid credentials
Given user should be on login page
When user enters valid "<userid>" and "<password>"
#Here we are passing data directly(in place of userid and password) that is Parameterization without Example keyword 
#This is data table concept where is passed but one perticular step is only repeated number of times data is given
#|admin|admin|								
Examples:
    | userid   | password |
    | admin | Test@153 |
    | testuser_2 | Test@153 |


#Data Driven Testing using DATATABLE
#DataTables are used to handle large amounts of data for this you either need to deal with a list of maps or a map of lists.
#This works only for the single step, below which it is defined
#A separate code needs to understand the test data and 
#then it can be run single or multiple times but again just for the single step, not for the complete test
#pass the test data using the data table and handle it using Raw() method
#Here we are not passing parameters in the step line and 
#even we are not using Examples test data. We declared the data under the step only. 
#So we are using Tables as arguments to Steps.
@per
Scenario: Login with invald credentials
Given user should be on login page
When user enters credentials to login
 |testuser_1|Test@153|
 