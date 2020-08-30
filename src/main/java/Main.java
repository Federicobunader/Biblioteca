import jdk.nashorn.internal.ir.LexicalContext;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){

        Biblioteca biblioteca = Biblioteca.GetInstance();
        int opcion = 0;
        int idABuscar;
        int DNIaBuscar;
        CopiaDelLibro libroABuscar;
        Lector lectorABuscar;

        while(opcion != 4){
            menuUsuario();
            opcion = pedirPorPantallaInt();

            switch (opcion){
                case  1:
                    System.out.println("Ingrese su DNI");
                    int DNI = pedirPorPantallaInt();
                    Lector unLector = new Lector(DNI);

                    biblioteca.agregarLector(unLector);
                    break;
                case  2:
                    biblioteca.mostrarLibros();

                    System.out.println("Ingrese la ID del Libro");
                    idABuscar = pedirPorPantallaInt();
                    System.out.println("Ingrese su DNI");
                    DNIaBuscar = pedirPorPantallaInt();
                    libroABuscar = biblioteca.encontrarLibro(idABuscar);
                    lectorABuscar = biblioteca.encontrarLector(DNIaBuscar);
                    biblioteca.agregarPrestamo(libroABuscar,lectorABuscar);

                    break;

                case  3:
                    biblioteca.mostrarLibros();

                    System.out.println("Ingrese la ID del Libro");
                    idABuscar = pedirPorPantallaInt();
                    System.out.println("Ingrese su DNI");
                    DNIaBuscar = pedirPorPantallaInt();
                    libroABuscar = biblioteca.encontrarLibro(idABuscar);
                    lectorABuscar = biblioteca.encontrarLector(DNIaBuscar);
                    biblioteca.sacarPrestamo(libroABuscar,lectorABuscar);

                    break;
                case  4:
                    System.out.println("Saliendo");
                    break;
                   // default:
                       // System.out.println("Opcion incorrecta");
            }
        }
    }

    public static void menuUsuario(){
        System.out.println("Ingrese una opcion:");
        System.out.println(" ");
        System.out.println("1- REGISTRAR USUARIO");
        System.out.println("2- Reservar Libro");
        System.out.println("3- Devolver Libro");
        System.out.println("4- Salir");
        System.out.println(" ");
    }

    public static String pedirPorPantallaString() {
        String res = "";
        try {
            BufferedReader entrada =
                    new BufferedReader(new InputStreamReader(System.in));
            res = entrada.readLine();
        }
        catch (IOException e) {}

        return res;
    }

    public static int pedirPorPantallaInt() {
        String dato = pedirPorPantallaString();

        int res = Integer.parseInt(dato);
        return res;
    }

}
