package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// rodar  o codigo pelo junit 
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", glue = "steps")

public class RunnerTricentisJunit {

}
