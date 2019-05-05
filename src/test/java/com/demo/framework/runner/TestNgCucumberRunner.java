package com.demo.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberTagStatement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;


@CucumberOptions(features = {"src/test/java/com/demo/framework/features/"}
, glue = {"com/demo/framework/steps"}
,format = {"json:target/cucumber-json-report.json", "html:target/cucumber-report-html"})
public class TestNgCucumberRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    //Initialising TestNG runner (1)
    @BeforeClass(alwaysRun = true)
    public void setUpClass()
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());

    }

    //returns all featurs available (2)
    @DataProvider
    public Object[][] features()
    {
        return testNGCucumberRunner.provideFeatures();
    }

    //runs all features (3)
    @Test(dataProvider = "features")
    public void runTests(CucumberFeatureWrapper cucumberFeatureWrapper) {

        List<CucumberTagStatement> elements = cucumberFeatureWrapper.getCucumberFeature().getFeatureElements();

        //ToDO: The for loop will return back specific scenario specified, however if nothing specified it should return back all the scenarios
        /*for(Iterator<CucumberTagStatement> element = elements.iterator(); element.hasNext();)
        {
            //ToDo: Bring the scenario name from Excel sheet or from the properties file
            //Pass the hardcoded scenario name
            CucumberTagStatement scenarioName = element.next();
            if(!scenarioName.getVisualName().equals("Scenario: Verify user is able to register on wowcher site"))
            {
                element.remove();
            }
        }*/

        testNGCucumberRunner.runCucumber(cucumberFeatureWrapper.getCucumberFeature());

    }

    //Closses the test session
    @AfterClass(alwaysRun = true)
    public void afterClass()
    {
       testNGCucumberRunner.finish();
    }


}
