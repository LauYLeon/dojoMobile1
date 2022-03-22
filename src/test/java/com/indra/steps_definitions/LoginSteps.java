package com.indra.steps_definitions;

import com.indra.tasks.Iniciar;
import com.indra.tasks.Llenar;
import com.indra.user_interfaces.LoginUI;
import com.indra.user_interfaces.ProductosUI;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;

import java.time.Duration;

public class LoginSteps {

    @Managed(driver = "appium")
    private AppiumDriver driver;
    private static Actor laura = Actor.named("Laura");

    @Before
    public void inicializarEscenario() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
        laura.can(BrowseTheWeb.with(driver));
    }

    @Given("el esta en la pantalla de inicio de sesion")
    public static void elEstaEnLaPantallaDeInicioDeSesion() {
        laura.attemptsTo();
    }

    @When("el ingresa el usuario (.*) y el password (.*)$")
    public static void elIngresaElUsuarioYElPassword(String usuario, String password) {
        laura.attemptsTo(Iniciar.sesionConLasCredenciales(usuario, password));
    }

    @Then("el deberia poder ingresar a la aplicacion")
    public static void elDeberiaPoderIngresarALaAplicacion() {
        laura.attemptsTo(Ensure.that(ProductosUI.TITULO_SECCION.waitingForNoMoreThan(Duration.ofSeconds(20))).isDisplayed());
    }

    @Given("el esta en la pantalla de inicio de sesion y se loguea")
    public static void elEstaEnLaPantallaDeInicioDeSesionYSeLoguea() {
        elEstaEnLaPantallaDeInicioDeSesion();
        elIngresaElUsuarioYElPassword("standard_user", "secret_sauce");
        elDeberiaPoderIngresarALaAplicacion();
    }
}
