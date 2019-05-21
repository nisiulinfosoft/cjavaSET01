package cjava.tarea01.entidades;

import static cjava.tarea01.util.MisConstantes.PLATINUM;
import static cjava.tarea01.util.MisConstantes.GOLD;
import static cjava.tarea01.util.MisConstantes.VIP;

/**
 *
 * @author PC04
 */
public class CostoFactory {
    
    public static float getCosto(String tipo){
        switch(tipo){
            case PLATINUM: return 250.50F;
            case GOLD: return 150.50F;
            case VIP: return 95.00F; 
            default: return 0F;
        }
    }
    
}
