package com.demo.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/demo/framework/features/"}, glue = {"com/demo/framework/steps"}, format = {"pretty"})
public class JUnitTestRunner {

}
