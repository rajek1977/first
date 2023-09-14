package com.example.cucumberdemo5.cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"},
		features="src/test/java/com/example/cucumberdemo5/features",
		glue={"com.example.cucumberdemo5.stepdefinitions"},
		stepNotifications=true,
		monochrome=true		
		
		)



public class TestRunner {
	
	

}
