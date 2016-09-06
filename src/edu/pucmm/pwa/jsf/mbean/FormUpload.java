package edu.pucmm.pwa.jsf.mbean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.servlet.http.Part;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by vacax on 06/09/16.
 */
@Named
@RequestScoped
public class FormUpload {

    Part archivo;

    public String upload() throws FileNotFoundException, IOException{
        //obteniendo el archivo.
        //TODO: cambiar la ruta independiente al sistema operativo
        FileOutputStream fout=new FileOutputStream("/tmp/mi_archivo");
        int read=0;
        byte[] data=new byte[1024];
        InputStream in  = archivo.getInputStream();

        while((read = in.read(data)) != -1){
            fout.write(data, 0, read);
        }

        return "";
    }

    public Part getArchivo() {
        return archivo;
    }

    public void setArchivo(Part archivo) {
        this.archivo = archivo;
    }
}
