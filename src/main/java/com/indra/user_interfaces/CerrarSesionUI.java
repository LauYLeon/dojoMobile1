package com.indra.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CerrarSesionUI {

    public static final Target MENU = Target.the("MENU")
            .locatedForAndroid(By.xpath("//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target BOTON_CERRAR_SESION = Target.the("MENU")
            .locatedForAndroid(By.xpath("//*[@text='CERRAR SESION']"))
            .locatedForIOS(By.xpath("//foo[]"));
    public static final Target TITULO_INICIO = Target.the("MENU")
            .locatedForAndroid(By.xpath("//android.widget.ScrollView[@content-desc='test-Login']/android.view.ViewGroup/android.widget.ImageView[1]"))
            .locatedForIOS(By.xpath("//foo[]"));


}
