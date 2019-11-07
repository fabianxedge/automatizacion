package com.asegcalidad.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.asegcalidad.page.ConsultaProcesoPage.TXT_BARRA;

public class Texto implements Question<String> {


    @Override
    public String answeredBy(Actor actor) {return TXT_BARRA.resolveFor(actor).getText();}

    public static Texto barra(){
        return new Texto();
    }
}
