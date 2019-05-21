package cjava.tarea01.entidades;

import cjava.tarea01.util.MisConstantes;

/**
 *
 * @author Luisin Maza
 */
public class Asistente extends Persona {
    
    private String telefono;
    private String direccion;
    
    private Evento evento;

    public Asistente() {
        this.setCodigo(MisConstantes.generarCodigoAsistente());
    }
    
    public Asistente(String nombre, String apellidos, String correo,
            String telefono, String direccion) {
        super(MisConstantes.generarCodigoAsistente(), nombre, apellidos, correo);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Asistente{" + "codigo=" + getCodigo() + ", nombre=" + getNombre() + 
                ", apellidos=" + getApellidos() + ", correo=" + getCorreo() + 
                ", telefono=" + telefono + ", direccion=" + direccion + 
                ", evento=" + evento + '}';
    }
    
}
