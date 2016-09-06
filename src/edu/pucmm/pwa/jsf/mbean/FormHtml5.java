package edu.pucmm.pwa.jsf.mbean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * Created by vacax on 06/09/16.
 */
@Named
@RequestScoped
public class FormHtml5 {

    private int matricula;
    private String correo;
    private String telefono;

    public String procesar(){
        System.out.println("matricula: "+matricula);
        System.out.println("correo: "+correo);
        System.out.println("telefono: "+telefono);
        return "";
    }

    public String procesarMatricula(){
        System.out.println("matricula: "+matricula);
        return "";
    }

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
