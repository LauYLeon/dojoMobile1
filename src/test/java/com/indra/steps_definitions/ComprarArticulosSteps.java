package com.indra.steps_definitions;

import com.indra.tasks.Seleccionar;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import static com.indra.user_interfaces.ComprarArticulosUI.CARRITO_CANTIDAD;

public class ComprarArticulosSteps {
    @Managed(driver = "appium")
    private AppiumDriver driver;
    private static Actor laura = Actor.named("Laura");

    @Before
    public void inicializarEscenario() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        laura.can(BrowseTheWeb.with(driver));
    }


    @When("Selecciona dos articulos")
    public static void seleccionaDosArticulos() {
        laura.attemptsTo(Seleccionar.seleccionarArticulo());
    }

    @Then("deberia poder ver la cantidad de articulos en el carrito")
    public static void deberiaPoderVerLaCantidadDeArticulosEnElCarrito() {
        laura.attemptsTo(Ensure.that(CARRITO_CANTIDAD).text().isEqualTo("2"));
    }


}
