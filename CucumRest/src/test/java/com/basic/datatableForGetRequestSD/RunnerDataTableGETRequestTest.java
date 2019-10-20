package com.basic.datatableForGetRequestSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/test/resources/com/basic/datatableForGetRequestFF/"},
		glue={"com/basic/datatableForGetRequestSD/"},
		monochrome = true,///use for format report no question
		plugin={"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1141.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
		}

		
		)

public class RunnerDataTableGETRequestTest {

}
