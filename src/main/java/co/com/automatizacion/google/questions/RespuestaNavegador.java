package co.com.automatizacion.google.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.automatizacion.google.userinterface.PaginaInicial.RESULTADO_BUSQUEDA;

public class RespuestaNavegador implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        RESULTADO_BUSQUEDA.resolveFor(actor).waitUntilVisible();
        String resultado = RESULTADO_BUSQUEDA.resolveFor(actor).getText();

        return RESULTADO_BUSQUEDA.resolveFor(actor).isCurrentlyVisible();
    }

    public static RespuestaNavegador mayorAUno(){
        return new RespuestaNavegador();
    }
}
