package com.indra.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/cerrarSesion.feature",
        glue = "com.indra.steps_definitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = ""
)
public class CerraSesion {
}
