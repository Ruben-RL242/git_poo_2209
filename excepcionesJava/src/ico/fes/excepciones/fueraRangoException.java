/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.excepciones;

/**
 *
 * @author crist
 */
public class fueraRangoException extends Exception {
    @Override
    public String getMessage() {
        return "Operador fuera de Rango: 1 para suma, 2 para resta, 3 es para multiplicacion y 4 es para division";
        
    }
    
}
