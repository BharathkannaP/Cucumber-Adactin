package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
				 glue="org.stepdefinition",
				 dryRun=true,
				 plugin= {"html:target/Report","junit:target\\junit.xml","json:JsonReport\\json.rep.json"})

public class TestRunner {

}
