package com.staragile.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/Feature"}
		,glue = {"com.staragile.steps","com.staragile.hooks"}
		,publish = true
		,monochrome = true
		,plugin = {"html:target/cucumber-report.html"}
		//,dryRun = true
		,tags = "not @low"
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
