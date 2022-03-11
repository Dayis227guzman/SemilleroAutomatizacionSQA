package com.automationpractice.testing.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\com.automationpractice.testing.features\\registrarUsuario.feature",
        glue = "com.automationpractice.testing.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RegistroUsuarioRunner {
}
