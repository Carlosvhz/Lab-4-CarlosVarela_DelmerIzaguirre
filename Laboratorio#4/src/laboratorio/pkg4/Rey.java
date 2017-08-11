/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.awt.Color;

/**
 *
 * @author Owner
 */
public class Rey extends Pieza {

    public Rey() {
        super();
    }

    public Rey(int x, int y, Color color) {
        super(x, y, color);
    }
    

    @Override
    public void Movimiento(int x, int y, byte jugador, String[][] tablero) {
        
        System.out.println("El rey no se puede mover");

    }

    @Override
    public void Captura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "R⚫";
        } else {
            return "RO";
        }
    }
    
}

