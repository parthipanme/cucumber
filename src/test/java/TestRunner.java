import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features/features.feature",
        glue= {"Steps"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
        monochrome = true
)
public class TestRunner {

}
