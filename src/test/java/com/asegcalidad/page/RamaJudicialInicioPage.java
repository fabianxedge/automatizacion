package com.asegcalidad.page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://ramajudicial.gov.co/")
public class RamaJudicialInicioPage extends PageObject {


    public static final Target CONSULTAR_PROCESO=Target.the("Consulta de procesos").locatedBy("//*[text()=' Consulta de Procesos ']");

}
