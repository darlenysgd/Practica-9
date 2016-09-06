package edu.pucmm.pwa.jsf.mbean;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by vacax on 06/09/16.
 */
@Named
@SessionScoped
public class FormAjax implements Serializable {

    String usuario;

    /* Validación del usuario digtado....
     * @param fc
     * @param c
     * @param valor
     */
    public void validarUsuariDigitado(FacesContext fc, UIComponent c, Object valor) {
        String usuarioDigitado = (String) valor;
        if (usuarioDigitado.equalsIgnoreCase("vacax")) {
            throw new ValidatorException(new FacesMessage("Usuario digitado existe en el sistema"));
        }
    }

    public String getMensajeBienvenida(){
        //check if null?
        if("".equals(usuario) || usuario ==null){
            return "";
        }else{
            return "Mensaje AJAX : Bienveninido " + usuario;
        }
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
