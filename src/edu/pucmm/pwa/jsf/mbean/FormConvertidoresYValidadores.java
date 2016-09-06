package edu.pucmm.pwa.jsf.mbean;

import edu.pucmm.pwa.jsf.objetos.Estudiante;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;

/**
 * Created by vacax on 05/09/16.
 */
@Named("formConvertidoresyValidadores")
@RequestScoped
public class FormConvertidoresYValidadores {

    private Integer entero;
    private Double valorDouble;
    private Boolean valorBoolean;
    private Date fecha;
    private Estudiante estudiante;

    public String procesarConvertidoresImplicitos(){
        System.out.println("Los dato:");
        System.out.println("Entero: "+entero);
        System.out.println("ValorDouble: "+valorDouble);
        System.out.println("ValorBoolean: "+valorBoolean);
        return null;
    }

    public String procesarConvertidoresExplicitos(){
        System.out.println("Fecha: "+fecha);
        System.out.println("Estudiante: "+estudiante.getNombre());
        return null;
    }

    /**
     * @return the entero
     */
    public Integer getEntero() {
        return entero;
    }

    /**
     * @param entero the entero to set
     */
    public void setEntero(Integer entero) {
        this.entero = entero;
    }

    /**
     * @return the valorDouble
     */
    public Double getValorDouble() {
        return valorDouble;
    }

    /**
     * @param valorDouble the valorDouble to set
     */
    public void setValorDouble(Double valorDouble) {
        this.valorDouble = valorDouble;
    }

    /**
     * @return the valorBoolean
     */
    public Boolean getValorBoolean() {
        return valorBoolean;
    }

    /**
     * @param valorBoolean the valorBoolean to set
     */
    public void setValorBoolean(Boolean valorBoolean) {
        this.valorBoolean = valorBoolean;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

}
