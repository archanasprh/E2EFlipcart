package com.vTiger.runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/test/java/com/vTiger/features/ScinarioOutlineWithExmple.feature"
 ,glue={"com.vTiger.stepDefination.ScenarioOutlineWithExampleSteps.java"}
 )
 

public class ScenarioOutlineRunner 
{
	 @Before
	    public void beforeScenario(){
	        System.out.println("This will run before the Scenario");
	    } 
	 
	 @After
	    public void afterScenario(){
	        System.out.println("This will run after the Scenario");
	    }
}
