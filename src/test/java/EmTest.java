import db.EntityManagerHelper;
import org.junit.*;

import java.time.LocalDate;

public class EmTest {

    @Test
    public void persistirAutor(){
        Autor autor = new Autor();
/*
        System.out.println("Ingrese Nombre");
        String nombre = Main.pedirPorPantallaString();
        System.out.println("Ingrese el año de su nacimiento");
        int ano = Main.pedirPorPantallaInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = Main.pedirPorPantallaInt();
        System.out.println("Ingrese el dia de su nacimiento");
        int dia = Main.pedirPorPantallaInt();
        System.out.println("Ingrese su nacionalidad");
        String nacionalidad = Main.pedirPorPantallaString();
*/
        autor.setNombre("Pepe");
        autor.setFechaDeNacimiento(LocalDate.of(10,5,25));
        autor.setNacionalidad("Argento");

        EntityManagerHelper.beginTransaction();
        EntityManagerHelper.getEntityManager().persist(autor);
        EntityManagerHelper.commit();

    }
}
