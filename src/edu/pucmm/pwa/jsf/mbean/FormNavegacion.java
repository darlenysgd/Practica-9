package edu.pucmm.pwa.jsf.mbean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by vacax on 06/09/16.
 */
@Named
@RequestScoped
public class FormNavegacion {

    private String param1;
    private String param2;
    private Integer param3;

    /**
     *  Navegación.
     * @return
     */
    public String irPagina(){
        return "multiIdioma";
    }

    /**
     *
     */
    public void ejecutarMetodo(){
        System.out.println("Ejecutando el metodo.....");
    }

    /**
     * @return the param1
     */
    public String getParam1() {
        return param1;
    }

    /**
     * @param param1 the param1 to set
     */
    public void setParam1(String param1) {
        this.param1 = param1;
    }

    /**
     * @return the param2
     */
    public String getParam2() {
        return param2;
    }

    /**
     * @param param2 the param2 to set
     */
    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public Integer getParam3() {
        return param3;
    }

    public void setParam3(Integer param3) {
        this.param3 = param3;
    }

}
