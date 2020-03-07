package com.vTiger.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/com/vTiger/features/Log.feature",	//This is package name 
		glue= {"com.vTiger.stepDefination"},			//This is folder name of stepdefination file	
		tags= {"@per"},								//This will run scenarios only for tags defined here
		format= {"pretty","html:target/Destination"},	//This will generate report in HTML format
		//as format is deprecated instead of that we use "plugin" as below
		//plugin={"pretty", "json:target/cucumber.jason"}
		monochrome = true							//As its true so it shows/prints result in console in formatted/readable format
		)



public class testRunner 
{

}
