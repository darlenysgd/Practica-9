package edu.pucmm.pwa.jsf.mbean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by vacax on 05/09/16.
 */
@Named("formularioRequest")
@RequestScoped
public class FormRequest {

    /**
     * Metodo para demostrar que puedo llamar una función directamente desde EL JSF.
     * @param numero1
     * @param numero2
     * @return
     */
    public Double sumar(Double numero1, Double numero2){
        return numero1 + numero2;
    }

}
