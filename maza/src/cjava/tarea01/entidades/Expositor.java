package cjava.tarea01.entidades;

import cjava.tarea01.util.MisConstantes;
import java.util.List;

/**
 *
 * @author Luisin Maza
 */
public class Expositor extends Persona {
    
    private List<Evento> eventos;
    
    public Expositor() {
        this.setCodigo(MisConstantes.generarCodigoExpositor());
    }
    
    public Expositor(String nombre, String apellidos, String correo) {
        super(MisConstantes.generarCodigoExpositor(), nombre, apellidos, correo);
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    @Override
    public String toString() {
        return "Expositor{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", apellidos=" + getApellidos() + ", correo=" + getCorreo() + 
                ", eventos=" + eventos + '}';
    }
    
}
