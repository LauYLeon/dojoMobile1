package com.indra.tasks;

import com.indra.user_interfaces.CerrarSesionUI;
import com.indra.user_interfaces.ComprarArticulosUI;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class Seleccionar {

    public static Performable seleccionarArticulo() {
        return Task.where("{0} selecciona articulo para añadir al carrito de compras",
                Click.on(ComprarArticulosUI.ARTICULO_DOS.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(ComprarArticulosUI.ARTICULO_UNO.waitingForNoMoreThan(Duration.ofSeconds(15)))
        );
    }

    public static Performable seleccionarCerrarSesion() {
        return Task.where("{0} selecciona articulo para añadir al carrito de compras",
                Click.on(CerrarSesionUI.MENU.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Click.on(CerrarSesionUI.BOTON_CERRAR_SESION.waitingForNoMoreThan(Duration.ofSeconds(5)))
        );

    }

}
