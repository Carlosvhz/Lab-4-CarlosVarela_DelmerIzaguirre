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
    public void Movimiento(int x, int y, byte jugador, String[][] tablero, Jugador rival) {
        
        System.out.println("El rey no se puede mover");

    }

   @Override
    public void Captura(int x, int y , Jugador rival) {
        for (Pieza pz : rival.getPiezas()) {
            if(pz.x == x && pz.y == y){
                rival.getPiezas().remove(pz);
            }
        }
       
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "R•";
        } else {
            return "RO";
        }
    }
    
}

