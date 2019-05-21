package cjava.tarea01.util;

/**
 *
 * @author Luisin Maza
 */
public class MisConstantes {
    
    //Constante para autoincrementar id y códigos
    public static int idEvento =1;
    public static int codigoExpositor =1;
    public static int codigoAsistente =1;
    
    //Constante para ubicación
    public static final String PLATINUM = "P";
    public static final String GOLD = "G";
    public static final String VIP = "V";
    
    //Constanten de IGV
    public static final float IGV = 0.18F;
    
    public static String opc = "V";
    
    //Metodos para obtener correlativo de id y códigos
    public static int generarIdEvento(){
        return idEvento++;
    }
    
    public static int generarCodigoExpositor(){
        return codigoExpositor++;
    }
    
    public static int generarCodigoAsistente(){
        return codigoAsistente++;
    }
    
}
