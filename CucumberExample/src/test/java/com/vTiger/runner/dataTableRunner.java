package com.vTiger.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/com/vTiger/features/DataTableForLogin.feature"
 ,glue={"com.vTiger.stepDefination"}
 )
 

public class dataTableRunner 
{
/* Hooks concept applied here as in Runner we can not define any methods 
  but Cucumber hooks allows us to mention Beforeclass
  and afterClass methods/annotations here in the Runner class
  Scenario Hooks execute before and after every scenario.
  Again, in cucumber, every example is considered as a separate scenario. 
  
 */
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
    } 
 
 @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }
}
