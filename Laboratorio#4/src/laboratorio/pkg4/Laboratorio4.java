package laboratorio.pkg4;

import java.awt.Color;
import java.util.*;

public class Laboratorio4 {

    static Scanner sc = new Scanner(System.in);
    static String palabra, nombre, lugar, sexo;
    static int edad, op, c;
    static String[][] tablero = new String[10][10];
    static ArrayList<Jugador> jugadores = new ArrayList();
    static Color color;

    public static void main(String[] args) {
        int opcion = 4;
        jugadores.add(new Jugador(Color.white));
        jugadores.add(new Jugador(Color.black));
        jugadores.get(0).setNombre("1");
        jugadores.get(1).setNombre("2");
        tablero = llenar_asignar(tablero);
        menu(opcion);
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
        } while (opcion > 0 && opcion < 5);
    }

    public static void menu(int opcion) {
        switch (opcion) {
            //Añadir jugadores
            case 1:
                System.out.println("_____ Ingresar nuevo Jugador ____");
                if (jugadores.size() >= 2) {
                    System.out.println("... Limite de jugadores alcanzado!!\n");
                } else {
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
                    System.out.print("... Ingrese color\n"
                            + "1. Blanco\n"
                            + "2. Negro\n"
                            + "Ingrese: ");
                    c = sc.nextInt();
                    if (c == 1) {
                        color = Color.white;
                    } else {
                        color = Color.black;
                    }
                    jugadores.add(new Jugador(nombre, palabra, sexo, lugar, 0, edad, color));
                }
                System.out.println("... Jugador añadido!!\n");
                break;
            case 2:
                System.out.println("_____  Eliminar jugador ____");
                if (jugadores.size() == 0) {
                    System.out.println("... No hay jugadores para eliminar!!\n");
                } else {
                    System.out.print("Ingrese posicion del jugador para eliminar: ");
                    op = sc.nextInt();
                    jugadores.remove(op);
                }
                System.out.println("... Jugador eliminado!!\n");
                break;
            case 3:
                System.out.println("_____  Listar jugadores ____");
                if (jugadores.size() == 0) {
                    System.out.println("... No hay jugadores para listar!!\n");
                } else {
                    for (Jugador n : jugadores) {
                        System.out.println(n);
                    }
                }
                System.out.println();
                break;
            case 4:
                if (jugadores.size() == 2) {
                    jugar();
                } else {
                    System.out.println("... No hay jugadores sifucientes para jugar!!!\n ");
                }
                break;
            default:
                System.out.println("... Gracias por su uso!");
                break;
        }
    }

    public static void jugar() {
        int x, y;

        while (true) {
            print(tablero);
            int cont = 1;
            if (cont % 2 == 0) {
                System.out.print("--- Turno jugador: " + jugadores.get(0).getNombre() + " ---\n");
                while (true) {
                    System.out.println("====================================================");
                    print(tablero);
                    System.out.println("====================================================");

                    if (cont % 2 == 0) {
                        System.out.print("--- Turno jugador: " + jugadores.get(0).getNombre() + " ---\n"
                                + "... Posicion de la pieza\n"
                                + "Ingrese x: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese y: ");
                        y = sc.nextInt();
                        try {
                            char simbolo = tablero[y][x].charAt(1);
                            char simbolo2;
                            if (jugadores.get(0).getColor().equals(Color.black)) {
                                simbolo2 = '•';
                            } else {
                                simbolo2 = 'O';
                            }
                            if (simbolo == simbolo2) {
                                for (Pieza pz : jugadores.get(0).getPiezas()) {
                                    if (pz.x == x && pz.y == y) {
                                        System.out.print("- Ingrese nueva posicion x: ");
                                        x = sc.nextInt();
                                        System.out.print("- Ingrese nueva posicion y: ");
                                        y = sc.nextInt();
                                        pz.Movimiento(x, y, (byte) 0, tablero);
                                        break;
                                    }
                                }
                            }
                        } catch (Exception e) {
                        }

                    } else {
                        System.out.print("--- Turno jugador: " + jugadores.get(1).getNombre() + " ---\n"
                                + "... Posicion de la pieza\n"
                                + "Ingrese x: ");
                        x = sc.nextInt();
                        System.out.print("Ingrese y: ");
                        y = sc.nextInt();
                        char simbolo = tablero[y][x].charAt(1);
                        char simbolo2;
                        if (jugadores.get(1).getColor().equals(Color.black)) {
                            simbolo2 = '•';
                        } else {
                            simbolo2 = 'O';
                        }
                        if (simbolo == simbolo2) {
                            for (Pieza pz : jugadores.get(1).getPiezas()) {
                                if (pz.x == x && pz.y == y) {
                                    System.out.print("- Ingrese nueva posicion x: ");
                                    x = sc.nextInt();
                                    System.out.print("- Ingrese nueva posicion y: ");
                                    y = sc.nextInt();
                                    pz.Movimiento(x, y, (byte) 0, tablero);
                                    break;
                                }

                            }
                            cont++;
                        }
                    }
                }
            }
        }
    }
    //Imprimir matriz

    public static void print(String[][] matriz) {
        int cont = 0;
        System.out.println("====================================================");
        for (int i = 0; i < 10; i++) {
            System.out.print("   " + i + ".");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    System.out.print(cont + ".- ");
                }
                System.out.print(" " + matriz[i][j] + " |");
            }
            System.out.println();
            cont++;
        }
        System.out.println("====================================================");
    }

    public static String[][] llenar_asignar(String[][] matriz) {
        Pieza pieza;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //Player 1
                if (i == 1) {
                    if (j == 0 || j == matriz.length - 1) {
                        pieza = new Duende(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 2 || j == 7) {
                        pieza = new Arquero(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 3 || j == 6) {
                        pieza = new Duende(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 4) {
                        pieza = new Caballero(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 5) {
                        pieza = new Dragon(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else {
                        matriz[i][j] = "  ";
                    }
                } else if (i == 0) {
                    if (j == 0 || j == matriz.length - 1) {
                        pieza = new Caballero(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 2 || j == 7) {
                        pieza = new Dragon(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 3 || j == 6) {
                        pieza = new Arquero(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 4) {
                        pieza = new Rey(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 5) {
                        pieza = new Mago(j, i, jugadores.get(0).getColor());
                        jugadores.get(0).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else {
                        matriz[i][j] = "  ";
                    }
                    //Segundo jugador
                } else if (i == 8) {
                    if (j == 0 || j == matriz.length - 1) {
                        pieza = new Duende(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 2 || j == 7) {
                        pieza = new Arquero(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 3 || j == 6) {
                        pieza = new Duende(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 4) {
                        pieza = new Dragon(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 5) {
                        pieza = new Caballero(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else {
                        matriz[i][j] = "  ";
                    }
                } else if (i == 9) {
                    if (j == 0 || j == matriz.length - 1) {
                        pieza = new Caballero(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 2 || j == 7) {
                        pieza = new Dragon(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 3 || j == 6) {
                        pieza = new Arquero(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 4) {
                        pieza = new Rey(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else if (j == 5) {
                        pieza = new Mago(j, i, jugadores.get(1).getColor());
                        jugadores.get(1).setPiezas(pieza);
                        matriz[i][j] = pieza.getFigura();
                    } else {
                        matriz[i][j] = "  ";
                    }
                } else {
                    matriz[i][j] = "  ";
                }
            }
        }
        return matriz;
    }
}
