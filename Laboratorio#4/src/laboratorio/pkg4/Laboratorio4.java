
package laboratorio.pkg4;

import java.util.*;

public class Laboratorio4 {

    static Scanner sc = new Scanner(System.in);
    static String palabra, nombre, lugar;
    static int edad;
    static ArrayList<Jugador> jugadores = new ArrayList();
    
    
    public static void main(String[] args) {
        String [][] matriz = new String [10][10];
        matriz = llenar(matriz, 0,0);
        print(matriz);
        int opcion;
        System.out.println(" === Lab#4 ===");
        
        do {
            System.out.print("1. Ingrese Jugador\n"
                    + "2. Eliminar Jugador\n"
                    + "3. Listar Jugador\n"
                    + "4. Salir\n"
                    + "Ingrese opcion: ");
            opcion = sc.nextInt();
        } while (true); 
    }
    
    public static void menu(int opcion){
        switch(opcion){
            case 1:
                if (jugadores.size()>=2) {
                    System.out.println("... Limite de jugadores alcanzado!!");
                }else{
                    System.out.print("Ingrese nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese nombre de usuario: ");
                    palabra = sc.next();
                    System.out.print("Ingrese lugar de nacimiento: ");
                    lugar = sc.next();
                    System.out.print("Ingrese edad: ");
                    edad = sc.nextInt();
                }
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("... Gracias por su uso!");
        }
    }
    
    //Imprimir matriz
    public static void print(String[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("|"+matriz[i][j]+"|");
            }
        }
    }
    
    //Llenar la matriz y asignar posicion de todas las piezas al array de piezas
    //De cada jugador
    public static String[][] llenar (String[][]matriz, int f, int c){
        if (f == matriz.length-1 && c == matriz[0].length-1) {
            //Jugador2
            matriz[f][c]="C";
            return matriz;
        }else{
            if (c==matriz[0].length-1&&f==0) {
                //jugador 1
                matriz[f][c] = "C";
                return llenar(matriz, f+1,0);
            }else if (c==matriz[0].length-1){
                matriz[f][c] = " ";
                return llenar(matriz, f+1,0);
            }else if (c==0 && f ==0){
                //Jugador 1
                matriz[f][c] = "C";
                return llenar(matriz, f,c+1);
            }else if (c==4&&f==1){
                //Jugador 1
                matriz[f][c] = "C";
                return llenar(matriz, f,c+1);
            }else{
                matriz[f][c] = " ";
                return llenar(matriz, f, c+1);
            }
        }
    }
}
