package com.indra.steps_definitions;

import com.indra.tasks.Seleccionar;
import com.indra.user_interfaces.CerrarSesionUI;
import com.indra.user_interfaces.ProductosUI;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import java.time.Duration;

public class CerrarSeionSteps {
    @Managed(driver = "appium")
    private AppiumDriver driver;
    private Actor laura = Actor.named("Laura");

    @Before
    public void inicializarEscenario() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        laura.can(BrowseTheWeb.with(driver));
    }
    @Given("el esta en cualquier pantalla de la app")
    public void elEstaEnCualquierPantallaDeLaApp() {
        LoginSteps.elEstaEnLaPantallaDeInicioDeSesionYSeLoguea();
        ComprarArticulosSteps.seleccionaDosArticulos();
        ComprarArticulosSteps.deberiaPoderVerLaCantidadDeArticulosEnElCarrito();
    }

    @When("el se dirige a la opcion cerrar sesion")
    public void elSeDirigeALaOpcionCerrarSesion() {
        laura.attemptsTo(Seleccionar.seleccionarCerrarSesion());

    }

    @Then("el deberia poder ver la pantalla inicial de la app")
    public void elDeberiaPoderVerLaPantallaInicialDeLaApp() {
        laura.attemptsTo(Ensure.that(CerrarSesionUI.TITULO_INICIO.waitingForNoMoreThan(Duration.ofSeconds(20))).isDisplayed());
    }

}
