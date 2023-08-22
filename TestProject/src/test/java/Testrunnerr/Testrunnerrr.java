package Testrunnerr;

import cucumber.api.CucumberOptions; 

@CucumberOptions(features=("src/test/resources/features/FeatureaFlofer"),
plugin = {"json:target/cucumber.json"),
glue= "StepDep")//tags = ("@Next"))
}




public class Testrunnerrr extends AbstractTestNGCucumberTests{
	
	

	
	
}
