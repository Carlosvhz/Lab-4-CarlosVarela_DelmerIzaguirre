/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg4;

import java.awt.Color;
import static laboratorio.pkg4.Laboratorio4.print;
import static laboratorio.pkg4.Laboratorio4.tablero;

/**
 *
 * @author Owner
 */
public class Jugar {
    /*
      public static void jugar(){
        int x, y;
        int cont = 0;
        while (true) {     
            System.out.println("====================================================");
            print(tablero);
            System.out.println("====================================================");
            
            if (cont%2==0) {
                System.out.print("--- Turno jugador: "+jugadores.get(0).getNombre()+" ---\n"
                        + "... Posicion de la pieza\n"
                        + "Ingrese x: ");
                x = sc.nextInt();
                System.out.print("Ingrese y: ");
                y = sc.nextInt();
                char simbolo = tablero[y][x].charAt(1);
                char simbolo2; 
                if (jugadores.get(0).getColor().equals(Color.black)) {
                    simbolo2 = '•'; 
                }else{
                    simbolo2 = 'O'; 
                }
                if (simbolo==simbolo2) {
                    for (Pieza pz : jugadores.get(0).getPiezas()) {
                        if(pz.x==x&&pz.y==y){
                            System.out.print("- Ingrese nueva posicion x: ");
                            x = sc.nextInt();
                            System.out.print("- Ingrese nueva posicion y: ");
                            y = sc.nextInt();
                            pz.Movimiento(x, y, (byte)0, tablero);
                            break;
                        }
                    }
                }
            }else{
                System.out.print("--- Turno jugador: "+jugadores.get(1).getNombre()+" ---\n"
                        + "... Posicion de la pieza\n"
                        + "Ingrese x: ");
                x = sc.nextInt();
                System.out.print("Ingrese y: ");
                y = sc.nextInt();
                char simbolo = tablero[y][x].charAt(1);
                char simbolo2; 
                if (jugadores.get(1).getColor().equals(Color.black)) {
                    simbolo2 = '•'; 
                }else{
                    simbolo2 = 'O'; 
                }
                if (simbolo==simbolo2) {
                    for (Pieza pz : jugadores.get(1).getPiezas()) {
                        if(pz.x==x&&pz.y==y){
                            System.out.print("- Ingrese nueva posicion x: ");
                            x = sc.nextInt();
                            System.out.print("- Ingrese nueva posicion y: ");
                            y = sc.nextInt();
                            pz.Movimiento(x, y, (byte)1, tablero);
                            break;
                        }
                    }
                }
            }
            cont++;
        }
    }
    */
}
