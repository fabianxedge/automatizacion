package com.asegcalidad.stepdefinitions;


import com.asegcalidad.page.RamaJudicialInicioPage;
import com.asegcalidad.question.Texto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static com.asegcalidad.page.ConsultaProcesoPage.*;
import static com.asegcalidad.page.RamaJudicialInicioPage.CONSULTAR_PROCESO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static org.hamcrest.CoreMatchers.containsString;

public class ConsultaProcesosSteps {

    @Before
    public void setTheStage() {OnStage.setTheStage(new OnlineCast());}

    @Dado("que \"(.*)\" esta consultando el proceso judicial")
    public void consultarProcesoJudicial(String actor) {
        theActorCalled(actor).attemptsTo(
                Open.browserOn().the(RamaJudicialInicioPage.class),
                Scroll.to(CONSULTAR_PROCESO).andAlignToBottom(),
                Click.on(CONSULTAR_PROCESO)
        );
    }

    @Cuando("selecciona Ciudad \"(.*)\" , entidad \"(.*)\" y numero radicado \"(.*)\"")
    public void seleccionaCiudadEntidadYNumeroRadicado(String ciudad, String entidad, String nroRadicado) {
        theActorInTheSpotlight().attemptsTo(
                SelectFromOptions.byVisibleText(ciudad).from(SELEC_CIUDAD),
                WaitUntil.the(SELEC_CIUDAD,isClickable()),
                SelectFromOptions.byVisibleText(entidad).from(SELEC_ENTIDAD),
                Enter.theValue(nroRadicado).into(TXT_RADICADO)
        );
    }

    @Entonces("deberia poder seleccionar la consulta")
    public void verificarActivacionConsulta() {
       theActorInTheSpotlight().should(seeThat(
               "deslizar barra",
               Texto.barra(),containsString("Deslice la barra a la derecha para iniciar la consulta."))
       );
    }
}
