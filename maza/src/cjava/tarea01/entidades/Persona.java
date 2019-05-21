package cjava.tarea01.entidades;

/**
 *
 * @author Luisin Maza
 */
public class Persona {
    
    private int codigo;
    private String nombre;
    private String apellidos;
    private String correo;

    public Persona() {
    }

    public Persona(int codigo, String nombre, String apellidos, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", apellidos=" + apellidos + ", correo=" + correo + '}';
    }
    
}
