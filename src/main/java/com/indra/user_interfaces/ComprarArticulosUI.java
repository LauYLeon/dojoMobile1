package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprarArticulosUI {

    public static final Target ARTICULO_UNO = Target.the("campo usuario")
            .locatedForAndroid(By.xpath("(//android.view.ViewGroup[@content-desc='test-A\u00D1ADIR A CARRITO'])[1]"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target ARTICULO_DOS = Target.the("campo usuario")
            .locatedForAndroid(By.xpath("(//android.view.ViewGroup[@content-desc='test-A\u00D1ADIR A CARRITO'])[2]"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target CARRITO_CANTIDAD = Target.the("campo usuario")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Carrito']/android.view.ViewGroup/android.widget.TextView"))
            .locatedForIOS(By.xpath("//foo[]"));
}
