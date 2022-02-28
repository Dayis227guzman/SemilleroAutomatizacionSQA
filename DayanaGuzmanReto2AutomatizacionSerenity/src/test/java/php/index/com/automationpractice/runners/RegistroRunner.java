package php.index.com.automationpractice.runners;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\php.index.com.automationpractice.features\\registro.feature",
        glue = "php.index.com.automationpractice.stepdefinition",
        snippets = SnippetType.CAMELCASE
)
public class RegistroRunner {
    // se corre el proyecto
}
