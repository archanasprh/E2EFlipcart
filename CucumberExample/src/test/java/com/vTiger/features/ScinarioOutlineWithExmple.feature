Feature: ScenarioOutline Login Action
 
Scenario Outline: InValid vTigerLogin
Given user should be landing on login page
When user enters valid credential "<userid>" and "<password>"
Then user should be login successfully
And page should be navigate on login page
Examples:
|userid | password |
|admin  | sdsddsd  |
|ad234  | sdsddsd  |
|xxxxx  | *******  |

#Data-Driven Testing Using Examples Keyword
#Examples:
#          | username  | password  |				==>This is Header Line
#          | testuser_1 | Test@153 |
#          | testuser_2 | Test@153 |
#Note: The table must have a header row corresponding to the variables in the Scenario Outline steps.
#Each line below the header represents an individual run of the test case with the respective data. As a result, 
#if there are 3 lines below the header in the Examples table, the script will run 3 times with its respective data.

#Here Cucumber automatically run the complete test the number of times equal to the number of data in the Test Set