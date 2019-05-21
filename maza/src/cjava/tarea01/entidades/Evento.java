package cjava.tarea01.entidades;

import cjava.tarea01.util.MisConstantes;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luisin Maza
 */
public class Evento {
    
    private int id;
    private String titulo;
    private float duracion;
    private Date horaIngreso;
    private Date horaSalida;
    private boolean temporadaAlta;
    private String codigoUbicacion;
    private float costoEntrada;
    private float montoDescuento;
    private float montoSubTotal;
    private float montoIgv;
    private float montoTotal;
    
    private Expositor expositor;
    private List<Asistente> asistentes;

    public Evento() {
        this.id =  MisConstantes.generarIdEvento();
    }

    public Evento(String titulo, float duracion, Date horaIngreso, 
            Date horaSalida, boolean temporadaAlta, 
            String codigoUbicacion) {
        this.id = MisConstantes.generarIdEvento();
        this.titulo = titulo;
        this.duracion = duracion;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
        this.temporadaAlta = temporadaAlta;
        this.codigoUbicacion = codigoUbicacion.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isTemporadaAlta() {
        return temporadaAlta;
    }

    public void setTemporadaAlta(boolean temporadaAlta) {
        this.temporadaAlta = temporadaAlta;
    }

    public String getCodigoUbicacion() {
        return codigoUbicacion;
    }

    public void setCodigoUbicacion(String codigoUbicacion) {
        this.codigoUbicacion = codigoUbicacion.toUpperCase();
    }

    public float getCostoEntrada() {
        this.costoEntrada = CostoFactory.getCosto(this.getCodigoUbicacion());
        return costoEntrada;
    }

    public Expositor getExpositor() {
        return expositor;
    }

    public void setExpositor(Expositor expositor) {
        this.expositor = expositor;
    }

    public List<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public float getMontoDescuento() {
        this.montoDescuento();
        return montoDescuento;
    }

    public float getMontoSubTotal() {
        this.montoSubTotal();
        return montoSubTotal;
    }

    public float getMontoIgv() {
        this.montoIGV();
        return montoIgv;
    }

    public float getMontoTotal() {
        this.montoTotal();
        return montoTotal;
    }
  
    public void montoDescuento(){
        this.montoDescuento = (this.getCostoEntrada() * ((this.isTemporadaAlta() == true) ? 0.05F : 0.10F));
    }
    
    public void montoSubTotal(){
        this.montoSubTotal = this.getCostoEntrada() - this.getMontoDescuento();
    }
    
    public void montoIGV(){
        this.montoIgv = this.getMontoSubTotal() * MisConstantes.IGV;
    }
    
    public void montoTotal(){
        this.montoTotal = this.getMontoSubTotal() + this.getMontoIgv();
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", titulo=" + titulo + ", duracion=" + duracion + 
                ", horaIngreso=" + horaIngreso + ", horaSalida=" + horaSalida + 
                ", temporadaAlta=" + temporadaAlta + ", codigoUbicacion=" + codigoUbicacion + 
                ", costoEntrada=" + getCostoEntrada() + 
                ", montoDescuento=" + getMontoDescuento() + 
                ", montoSubTotal=" + getMontoSubTotal() + 
                ", montoIgv=" + getMontoIgv() + 
                ", montoTotal=" + getMontoTotal() + 
                ", expositor=" + expositor + ", asistentes=" + asistentes + '}';
    }
    
    
    
}
