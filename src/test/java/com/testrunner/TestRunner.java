package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hi\\eclipse-workspace old\\oops\\MavenNewPjct\\src\\test\\java\\com\\featurefile\\orangeHRM.feature",
glue = "com.stepdef")

public class TestRunner {

}
