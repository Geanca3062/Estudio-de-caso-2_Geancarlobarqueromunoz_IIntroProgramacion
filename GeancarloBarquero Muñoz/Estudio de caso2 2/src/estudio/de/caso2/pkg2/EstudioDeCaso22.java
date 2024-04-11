/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.de.caso2.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class EstudioDeCaso22 {

    /**
     * @param args the command line arguments
     */
    public static String[][] CargarCine(String cine[][]) {
        for (int x = 0; x < 6; x++) {
            switch (x) {
                case 0:
                    cine[x][0] = "A";
                    break;
                case 1:
                    cine[x][0] = "B";
                    break;
                case 2:
                    cine[x][0] = "C";
                    break;
                case 3:
                    cine[x][0] = "D";
                    break;
                case 4:
                    cine[x][0] = "E";
                    break;
                case 5:
                    cine[x][0] = " ";
                    break;
            }
            for (int y = 1; y < 7; y++) {
                cine[x][y] = "L";
            }

        }
        for (int y = 1; y < 7; y++) {
            cine[5][y] = String.valueOf(y);
        }

        return cine;
        /*
        for (int x = 0; x < 6; x++) {
            for (int y = 0; y < 7; y++) {
                System.out.print(cine[x][y]);
            }
            System.out.print("\n");
        }
         */

    }

    public static void ShowCine(String cine[][], String Movie) {
        String Display = "Pelicula: " + Movie;
        Display += "\nL) Libre";
        Display += "\nO) Ocupado\n";
        Display += "\n  ------------ Pantalla\n";
        for (int x = 0; x < 6; x++) {
            Display += cine[x][0] + " ";
            for (int y = 1; y < 7; y++) {
                Display += cine[x][y];
                System.out.print(cine[x][y]);
            }
            Display += "\n";
            System.out.print("\n");
        }
        JOptionPane.showMessageDialog(null, Display);
        Menu(Movie,cine);
    }
    
    public static void Asignar(String cine[][], String Movie){
        String LetraFila = JOptionPane.showInputDialog("FIla a asignar: (A / B / C / D / E)");
        
        int Columna = Integer.parseInt(JOptionPane.showInputDialog("Asiento a asignar: (1 / 2 / 3 / 4 / 5 / 6)"));
    }
    
    public static void NewDay() { //Pide por la pelicula que se a reproducir y llama al menu
        String MovieName = JOptionPane.showInputDialog("Ingrese el nombre de la pelicula de hoy");
                //Creacionde las matrices del cine
        String cine[][] = new String[6][7];
        cine = CargarCine(cine);
        Menu(MovieName,cine);
    }

    public static void Menu(String Movie, String cine[][]) { // Se muestra el menu de opciones
        String Display = "Que desea realizar?";
        Display += "\n1)Mostrar cine";
        Display += "\n2)Asignar asiento";
        Display += "\n3)Cambiar pelicula";
        Display += "\n4)Salir";
        int Res = Integer.parseInt(JOptionPane.showInputDialog(Display));



        switch (Res) {
            case 1:
                ShowCine(cine, Movie);
                break;
            case 2:
                Asignar(cine, Movie);
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                throw new AssertionError();
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("estudio.de.caso2.pkg2.EstudioDeCaso22.main()");

        NewDay();
    }

}
