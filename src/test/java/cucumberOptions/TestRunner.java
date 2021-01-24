package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					monochrome=true,
					strict = true,
					features="classpath:features/",
					glue= "classpath:stepDefinitions")
public class TestRunner {

}
