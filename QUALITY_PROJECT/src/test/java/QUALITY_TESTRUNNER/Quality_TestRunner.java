package QUALITY_TESTRUNNER;


	import org.testng.annotations.AfterTest;

@CucumberOptions(features = ("src/test/resources/Quality_Features"),
plugin = ("json:target/cucumber.json"), //HTML report/test result 
glue = "Quality_STEPDEFF")//tages = ("@Next"))







public class Quality_TestRunner extends AbstractTestNGCucumberTests{


@BeforeTest
public void QualityStartURL() {
	Quality_Base startURL = new Quality_Base();
	startURL.Quality_Browser(); 
}
