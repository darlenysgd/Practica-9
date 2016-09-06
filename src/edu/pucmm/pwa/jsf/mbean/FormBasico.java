package edu.pucmm.pwa.jsf.mbean;

import com.sun.faces.context.flash.ELFlash;
import org.hibernate.validator.constraints.NotBlank;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Named;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by vacax on 05/09/16.
 */
@Named("miFormulario")
//@ManagedBean("miFormulario") //Si no tenemos CDI debemos utiliar la clase javax.faces.bean.ManagedBean
@SessionScoped
public class FormBasico implements Serializable {

    //Utilizando api de validación: https://docs.oracle.com/javaee/7/tutorial/bean-validation001.htm
    @Size(min = 5, max = 10)
    private String nombre;
    @NotBlank
    private String apellido;

    //Una vez inicializado el bean se ejecuta el metodo
    @PostConstruct
    private void inicializando(){
        System.out.println("Subiendo el Beans de formulario....");
    }

    //Antes de destruir el ManagedBean es ejecutado este metodo.
    @PreDestroy
    private void destruyendo(){
        System.out.println("Destruyendo el Beans de formulario....");
    }

    /**
     * Procesar formulario hola mundo. Forzando a la llamada por el metodo GET
     *
     * @return
     */
    public String procesarFormularioMetodoGet() {
        System.out.printf("El nombre procesado es %s %s", nombre, apellido);
        //Ver el parametro faces-redirect=true
        return "resultado?faces-redirect=true&param1=valor&param2=valor2"; //regla de navegacion....
    }

    /**
     * Por defecto la llamada se ejecuta vía POST
     * @return
     */
    public String procesarFormularioMetodoPost() {
        System.out.printf("El nombre procesado es %s %s", nombre, apellido);

        return "resultado?param1=valor&param2=valor2"; //regla de navegacion....
    }

    /**
     * Limpiando las variables.
     * @return
     */
    public String limpiarDatos() {
        nombre = "";
        apellido = "";
        return ""; //Si es llamada desde un action, se queda en la misma pagina
    }

    /**
     * Cambiando la
     * @return
     */
    public String cambiarMayusculas() {
        nombre = nombre.toUpperCase();
        apellido = apellido.toUpperCase();
        return null; //Si es llamada desde un action, se queda en la misma pagina
    }

    /**
     * Metodo para demostrar el uso del ambiente transitorio Flash
     * para mantener información entra peticiones.
     * @return
     */
    public String pruebaAmbienteFlash(){
        //Obtenemos el contexto JSF y la referencia al objeto Flash.
        Flash flash = FacesContext.getCurrentInstance().getExternalContext().getFlash();
        //Funciona como un mapa.
        flash.putNow("mensaje", "Información en el ambiente Transitorio");
        flash.putNow("fecha", new Date());
        flash.putNow("valorBooleano", true);
        //Otra forma directa.
        ELFlash.getFlash().put("otroForma", "Funciona");
        //
        return "vistaAmbienteFlash?faces-redirect=true";
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
