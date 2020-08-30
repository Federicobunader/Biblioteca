import sun.util.calendar.CalendarDate;
import sun.util.calendar.LocalGregorianCalendar;

import java.time.LocalDate;
import java.util.*;


public class Biblioteca {

    private ArrayList<CopiaDelLibro> libros = new ArrayList<>();
    private ArrayList<Prestamo> librosEnPrestamos = new ArrayList<>();
    private ArrayList<Lector> lectores = new ArrayList<>();

    private static Biblioteca instance = null;

    public static Biblioteca GetInstance() {
        if (instance == null)
            instance = new Biblioteca();
        return instance;
    }

    public void agregarPrestamo(CopiaDelLibro unaCopia,Lector unLector){
        if(unaCopia.puedeReservarse() && unLector.puedePedirUnLibro()){
            librosEnPrestamos.add(new Prestamo(unaCopia,unLector));
            unaCopia.reservarLibro();
            unLector.agregarLibro(unaCopia);
        }
    }

    public void agregarLector(Lector unLector){
        lectores.add(unLector);
    }

    public void sacarPrestamo(CopiaDelLibro unaCopia, Lector unLector){
        librosEnPrestamos.remove(unaCopia);
        unaCopia.devolverLibro();
        unLector.devolverLibro(unaCopia);

    }

    private int calcularMulta(CopiaDelLibro unaCopia){
        return unaCopia.getEstado().diasDeRetraso() * 2;
    }

    public void mostrarLibros(){
        System.out.println("INFORMACION DE LIBROS");
        for(int i = 0; i< libros.size(); i++){
            System.out.println( libros.get(i).getId()+")" + libros.get(i).getNombre());
        }
    }

    public CopiaDelLibro encontrarLibro(int id){
        for(int i = 0; i< libros.size(); i++){
            if(id == libros.get(i).getId()){
                return libros.get(i);
            }
        }
        return null;
    }

    public Lector encontrarLector(int DNI){
        for(int i = 0; i< lectores.size(); i++){
            if(DNI == lectores.get(i).getDNI()){
                return lectores.get(i);
            }
        }
        return null;
    }

}
