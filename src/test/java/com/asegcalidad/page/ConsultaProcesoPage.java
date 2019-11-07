package com.asegcalidad.page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ConsultaProcesoPage extends PageObject {

    public static final Target SELEC_CIUDAD=Target.the("ciudad").located(By.id("ddlCiudad"));



    public static final Target SELEC_ENTIDAD=Target.the("entidad").located(By.id("ddlEntidadEspecialidad"));



    public static final Target TXT_RADICADO=Target.the("radicado").located(By.xpath("//input[@onkeypress=\" return num(event)\"]"));


    public static final Target TXT_BARRA = Target.the("barra").located(By.id("ConsultarNum"));

}
