package com.winConnect.test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features = "target/test-classes", monochrome = true, tags = "@july4", plugin = {
        "pretty", "html:target/cucumber-report/single",
        "json:target/cucumber-report/single/cucumber.json",
        "rerun:target/cucumber-report/single/rerun.txt"},
        glue = "com.winConnect.steps")
public class RunSingleSuite extends AbstractTestNGCucumberTests {
}


//{"@Login","@regression","@regress2","@tagSani"}

//@regress2,@Login

//@regress2

//@Login,@regression

//@tag3

//@tagSani

//{"@tag31","@tag22",@tag23,@tag24,@tag25,@tag26" }