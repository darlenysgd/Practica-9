package edu.pucmm.pwa.jsf.validadores;

/**
 * Created by vacax on 05/09/16.
 */

import edu.pucmm.pwa.jsf.objetos.Estudiante;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator(value = "miValidadorEstudiante")
public class EstudianteValidador implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        //validando que la matricula no sea menor al 2000
        Estudiante estudiante = (Estudiante) value;
        if(estudiante.getMatricula().startsWith("19")){
            System.out.println("Matricula no valida....");
            FacesMessage facesMessage=new FacesMessage(FacesMessage.SEVERITY_ERROR, "Matricula debe ser mayor a 2000",
                    "Debe ser una matricual mayor a 2000");
            throw new ValidatorException(facesMessage);
        }
    }
}
