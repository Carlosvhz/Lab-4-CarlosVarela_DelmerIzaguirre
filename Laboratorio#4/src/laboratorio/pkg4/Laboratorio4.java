package laboratorio.pkg4;

import java.awt.Color;
import java.util.*;

public class Laboratorio4 {

    static Scanner sc = new Scanner(System.in);
    static String palabra, nombre, lugar, sexo;
    static int edad, op, c;
    static String [][] tablero = new String [10][10];
    static ArrayList<Jugador> jugadores = new ArrayList();
    static Color color;
    
    public static void main(String[] args) {
        int opcion;
        tablero = llenar_asignar(tablero);
        print(tablero);
        System.out.println(" === Lab#4 ===");
        do {
            System.out.print("1. Ingrese Jugador\n"
                    + "2. Eliminar Jugador\n"
                    + "3. Listar Jugadores\n"
                    + "4. Jugar\n"
                    + "5. Salir\n"
                    + "Ingrese opcion: ");
            opcion = sc.nextInt();
            menu(opcion);
        } while (opcion>0&&opcion<5); 
    }
    
    public static void menu(int opcion){
        switch(opcion){
            //Añadir jugadores
            case 1:
                System.out.println("_____ Ingresar nuevo Jugador ____");
                if (jugadores.size()>=2) {
                    System.out.println("... Limite de jugadores alcanzado!!\n");
                }else{
                    System.out.print("Ingrese nombre: ");
                    nombre = sc.next();
                    System.out.print("Ingrese nombre de usuario: ");
                    palabra = sc.next();
                    System.out.print("Ingrese lugar de nacimiento: ");
                    lugar = sc.next();
                    System.out.print("Ingrese edad: ");
                    edad = sc.nextInt();
                    System.out.print("Ingrese sexo: ");
                    sexo = sc.next();
                    jugadores.add(new Jugador(nombre, palabra, sexo, lugar, 0, edad));
                }
                System.out.println("... Jugador añadido!!\n");
                break;
            case 2:
                System.out.println("_____  Eliminar jugador ____");
                if (jugadores.size()==0) {
                    System.out.println("... No hay jugadores para eliminar!!\n");
                }else{
                    System.out.print("Ingrese posicion del jugador para eliminar: ");
                    op = sc.nextInt();
                    jugadores.remove(op);
                }
                System.out.println("... Jugador eliminado!!\n");
                break;
            case 3:
                System.out.println("_____  Listar jugadores ____");
                if (jugadores.size()==0) {
                    System.out.println("... No hay jugadores para listar!!\n");
                }else{
                    for (Jugador n : jugadores) {
                        System.out.println(n);
                    }
                }
                System.out.println();
                break;
            case 4:
                break;
            default:
                System.out.println("... Gracias por su uso!");
                break;
        }
    }
    
    public static void modificar(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
        }
    }
    
    //Imprimir matriz
    public static void print(String[][] matriz){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("| "+matriz[i][j]+" |");
            }
            System.out.println();
        }
    }
    
    public static String [][] llenar_asignar(String[][]matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Player 1
                if (i==1) {
                    if (j==0||j==matriz.length-1) {
                        jugadores.get(0).setPiezas(new Duende(j, i));
                        matriz[i][j] = "D";
                    }else if (j==2||j==7) {
                        jugadores.get(0).setPiezas(new Arquero(j, i));
                        matriz[i][j] = "A";
                    }else if (j==3||j==6) {
                        jugadores.get(0).setPiezas(new Duende(j,i));
                        matriz[i][j] = "D";
                    }else if (j==4) {
                        jugadores.get(0).setPiezas(new Caballero(j, i));
                        matriz[i][j] = "C";
                    }else if(j==5){
                        jugadores.get(0).setPiezas(new Dragon(j, i));
                        matriz[i][j] = "F";
                    }else{
                        matriz[i][j] = "  ";
                    }
                }else if(i==0){
                    if (j==0||j==matriz.length-1) {
                        jugadores.get(0).setPiezas(new Caballero(j, i));
                        matriz[i][j] = "C";
                    }else if (j==2||j==7) {
                        jugadores.get(0).setPiezas(new Dragon(j, i));
                        matriz[i][j] = "F";
                    }else if (j==3||j==6) {
                        jugadores.get(0).setPiezas(new Arquero(j, i));
                        matriz[i][j] = "A";
                    }else if (j==4) {
                        jugadores.get(0).setPiezas(new Rey(j, i));
                        matriz[i][j] = "R";
                    }else if(j==5){
                        jugadores.get(0).setPiezas(new Mago(j, i));
                        matriz[i][j] = "M";
                    }else{
                        matriz[i][j] = "  ";
                    }
                    //Segundo jugador
                }else if (i==8){
                    if (j==0||j==matriz.length-1) {
                        jugadores.get(1).setPiezas(new Duende(j,i));
                        matriz[i][j] = "D";
                    }else if (j==2||j==7) {
                        jugadores.get(1).setPiezas(new Arquero(j, i));
                        matriz[i][j] = "A";
                    }else if (j==3||j==6) {
                        jugadores.get(1).setPiezas(new Duende(j,i));
                        matriz[i][j] = "D";
                    }else if (j==4) {
                        jugadores.get(1).setPiezas(new Dragon(j, i));
                        matriz[i][j] = "F";
                    }else if(j==5){
                        jugadores.get(1).setPiezas(new Caballero(j, i));
                        matriz[i][j] = "C";
                    }else{
                        matriz[i][j] = "  ";
                    }
                }else if(i==9){
                    if (j==0||j==matriz.length-1) {
                        jugadores.get(1).setPiezas(new Caballero(j, i));
                        matriz[i][j] = "C";
                    }else if (j==2||j==7) {
                        jugadores.get(1).setPiezas(new Dragon(j, i));
                        matriz[i][j] = "F";
                    }else if (j==3||j==6) {
                        jugadores.get(1).setPiezas(new Arquero(j, i));
                        matriz[i][j] = "A";
                    }else if (j==4) {
                        jugadores.get(1).setPiezas(new Rey(j, i));
                        matriz[i][j] = "R";
                    }else if(j==5){
                        jugadores.get(1).setPiezas(new Mago(j, i));
                        matriz[i][j] = "M";
                    }else{
                        matriz[i][j] = "  ";
                    }
                }else{
                    matriz[i][j] = "  ";
                }
            }
        }
        return matriz;
    }
}
