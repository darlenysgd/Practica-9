package edu.pucmm.pwa.jsf.convertidores;

import edu.pucmm.pwa.jsf.objetos.Estudiante;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * Validar que el dato enviado corresponda a una matricula
 * yyyy-9999
 * @author vacax
 */
@FacesConverter(value = "miConvertidorEstudiante") //indicando el identificador del convertidor.
public class EstudianteConvertidor implements Converter {

    /**
     * JSF estará obteniendo está informacion para realizar la conversión de tipo
     * @param context
     * @param component
     * @param value
     * @return
     */
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("Valor Recibido Conversion: "+value);
        if(value == null || value.length() == 0){
            //error. sin datos.
            System.out.println("Error si datos..");
            return null;
        }

        //validando la cantidad caracteres.
        if(value.length()!=9 || !value.contains("-")){ //trabajar mejor
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR,"Valor no corresponde con el valor esperado",
                    "La matricula debe tener 9 caracteres con un - entre el año..");
            //enviando la excepcion.
            throw new ConverterException(facesMessage);
        }

        //Llamada a una base de datos... o interfaz...
        Estudiante estudiante=new Estudiante(value, "Estudiante -> "+value);

        return estudiante;
    }

    /**
     * Para presentar en la vista.
     * @param context
     * @param component
     * @param value
     * @return
     */
    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        Estudiante estudiante = (Estudiante) value;
        return estudiante.getMatricula();
    }

}
