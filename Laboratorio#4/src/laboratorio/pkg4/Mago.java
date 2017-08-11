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
public class Mago extends Pieza {

    public Mago() {
        super();
    }

    public Mago(int x, int y) {
        super(x, y);
    }
    
    

    @Override
    public void Movimiento(int x, int y, byte jugador) {
        
        boolean valido = false;
        
        try {
            validar(x,y);
            if (super.x == x) {
                super.y = y; 
                valido = true;
            }
            if (super.y == y ) {
                super.x = x;
                valido = true;
            }
            int w = super.x - x;
            int z = super.y - y;
            w = (int) Math.abs(w);
            z = (int) Math.abs(z);
            
            if(z == w){
                super.x = x;
                super.y = y;
                valido = true;
            }
            
            if(!valido){
                System.out.println("Movimiento no valido");
            }
            

        } catch (MiExcepcion e) {
        }

    }

    @Override
    public void Captura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "M";
    }

    @Override
    public String getFigura() {
        if (getColor().equals(Color.black)) {
            return "M⚫";
        } else {
            return "MO";
        }
    }

}
