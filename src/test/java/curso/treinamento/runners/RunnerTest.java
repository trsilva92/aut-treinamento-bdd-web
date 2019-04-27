package curso.treinamento.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"curso.treinamento.steps", "curso.treinamento.setup"},
        snippets = SnippetType.CAMELCASE,
        tags = {""})

public class RunnerTest {

}
