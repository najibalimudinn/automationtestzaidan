package com.b2.TestNGSeleniumCucumber.runner;
/*Cucumber needs a TestRunner class to run the feature files.
 * It is suggested to create a folder with the name of the runner in the src/test/java directory and
 * create the Cucumber TestRunner class in this folder
 */

import com.b2.TestNGSeleniumCucumber.utils.HelperClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = "src/test/resources/features",
        glue = "com.b2.TestNGSeleniumCucumber.stepdefinitions",
        plugin = {"pretty", "html:target/report/cucumber-reports.html"},
        monochrome = true
)

public class CucumberRunnerTests extends AbstractTestNGCucumberTests {

}
