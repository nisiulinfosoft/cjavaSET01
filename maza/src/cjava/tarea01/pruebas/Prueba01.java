package cjava.tarea01.pruebas;

import cjava.tarea01.entidades.Asistente;
import cjava.tarea01.entidades.Evento;
import cjava.tarea01.entidades.Expositor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Luisin Maza
 */
public class Prueba01 {

    public static void main(String[] args) throws ParseException {
        
        /*====================================================================*/
        //Expositores: Declarar, instanciar y asignar valores
        Expositor expositor = new Expositor();
        
        expositor.setNombre("Luisin Enrique");
        expositor.setApellidos("Maza Alcalde");
        expositor.setCorreo("lmazaa1208@gmail.com");
        
        //Imprimir datos del expositor:
        /*
        System.out.println("Datos del expositor: " + expositor.getCodigo() + 
                " - Nombre: " + expositor.getNombre() +
                " - Correo: " + expositor.getCorreo());
        */
        
        System.out.println("");
        
        /*====================================================================*/
        //Asistentes: Declarar, instanciar y asignar valores
        Asistente asistente1 = new Asistente();
        
        asistente1.setNombre("Juan");
        asistente1.setApellidos("Perez");
        asistente1.setCorreo("jperez@gmail.com");
        asistente1.setTelefono("12345678");
        asistente1.setDireccion("Perú-Lima");
        
        Asistente asistente2 = new Asistente();
        
        asistente2.setNombre("Victor");
        asistente2.setApellidos("Palomino");
        asistente2.setCorreo("vpalomino@gmail.com");
        asistente2.setTelefono("87654321");
        asistente2.setDireccion("Perú-Lima-Callao");
        
        List<Asistente> asistentes = new ArrayList();
        asistentes.add(asistente1);
        asistentes.add(asistente2);
        
        //Imprimir datos de los asistentes: 
        /*
        for (Asistente asistente : asistentes) {
            
            System.out.println("Datos de los asistentes: " + asistente.getCodigo() + 
                " - Nombre: " + asistente.getNombre() +
                " - Correo: " + asistente.getCorreo() +
                " - Teléfono: " + asistente.getTelefono()+
                " - Dirección: " + asistente.getDireccion());
            
        }
        */
        
        System.out.println("");

        /*====================================================================*/
        //Evento: Declarar, instanciar y asignar valores
        Evento evento = new Evento();
        
        SimpleDateFormat parseador = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        SimpleDateFormat formateador = new SimpleDateFormat("hh:mm");
        
        evento.setTitulo("Java Programmer 11 Conferencia");
        evento.setDuracion(3.5F);
        evento.setHoraIngreso(parseador.parse("21-05-2019 09:30"));
        evento.setHoraSalida(parseador.parse("21-05-2019 11:30"));
        evento.setTemporadaAlta(false);
        evento.setCodigoUbicacion("P");
        evento.setExpositor(expositor);
        evento.setAsistentes(asistentes);
        
        //Imprimir datos del evento: toString()
        System.out.println("Datos del evento: " + evento);
        
        System.out.println("");
        System.out.println("DATOS DEL EVENTO:");
        
        System.out.println("EVENTO: Id: " + evento.getId()+ 
                " - Título: " + evento.getTitulo() +
                " - Duración: " + evento.getDuracion() +
                " - Hora ingreso: " + formateador.format(evento.getHoraIngreso()) +
                " - Hora salida: " + formateador.format(evento.getHoraSalida()) +
                " - Es temporada alta: " + evento.isTemporadaAlta() +
                " - Código ubicación: " + evento.getCodigoUbicacion()
        );
        
        System.out.println(" - Costo entrada: " + evento.getCostoEntrada() + 
                " - Monto descuento: " + evento.getMontoDescuento() +
                " - Monto subtotal: " + evento.getMontoSubTotal()+
                " - Monto IGV: " + evento.getMontoIgv()+
                " - Monto total: " + evento.getMontoTotal()
        );
        
        System.out.println("EXPOSITORES: Código: " + evento.getExpositor().getCodigo() + 
                " - Nombre: " + evento.getExpositor().getNombre() +
                " - Correo: " + evento.getExpositor().getCorreo());
        
        for (Asistente asistente : evento.getAsistentes()) {
            
            System.out.println("ASISTENTES: Código: " + asistente.getCodigo() + 
                " - Nombre: " + asistente.getNombre() +
                " - Correo: " + asistente.getCorreo() +
                " - Teléfono: " + asistente.getTelefono()+
                " - Dirección: " + asistente.getDireccion());
            
        }

    }
    
}
