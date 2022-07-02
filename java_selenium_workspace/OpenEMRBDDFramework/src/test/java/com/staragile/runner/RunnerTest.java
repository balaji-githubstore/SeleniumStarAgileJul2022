package com.staragile.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/Feature/Login.feature"}
		,glue = {"com.staragile.steps"}
		,publish = true
		,monochrome = true
		)

public class RunnerTest extends AbstractTestNGCucumberTests {

}
