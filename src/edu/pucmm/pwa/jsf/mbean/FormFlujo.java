package edu.pucmm.pwa.jsf.mbean;

import javax.faces.context.FacesContext;
import javax.faces.flow.Flow;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Map;

/**
 * Created by vacax on 13/09/16.
 */
@Named
@FlowScoped(value = "flujoA")
public class FormFlujo implements Serializable {

    public String getName() {
        return "FlowBasico";
    }

    public String getReturnValue() {
        return "/retornoFlujo";
    }

    public String procesandoInformacionFlujo(){
        Map<Object, Object> mapaFlow = FacesContext.getCurrentInstance().getApplication().getFlowHandler().getCurrentFlowScope();
        System.out.println("miEntrada = "+mapaFlow.get("miEntrada"));
        return "flujoA3";
    }

}
