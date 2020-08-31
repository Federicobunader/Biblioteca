import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name="lector")
public class Lector extends EntidadPersistente{

    @Column(name="dni")
    private int DNI;

    @Column(name="cantidadDeLibrosEnPrestamo")
    private int cantidadDeLibrosEnPrestamo;

    //@OneToMany(mappedBy = "lector"/*, cascade = {CascadeType.ALL}*/)
    @Transient
    private List<CopiaDelLibro> librosEnPrestamo;

    public boolean puedePedirUnLibro(){
        return librosEnPrestamo.size() < 3;
    }

    public void agregarLibro(CopiaDelLibro copiaDelLibro){
        librosEnPrestamo.add(copiaDelLibro);
    }

    public void devolverLibro(CopiaDelLibro copiaDelLibro){
        librosEnPrestamo.remove(copiaDelLibro);
    }

    public Lector(int DNI) {
        this.DNI = DNI;
        this.cantidadDeLibrosEnPrestamo = 0;
        this.librosEnPrestamo = new ArrayList<>();
    }

    public int getDNI() {
        return DNI;
    }

    public int getCantidadDeLibrosEnPrestamo() {
        return cantidadDeLibrosEnPrestamo;
    }

    public List<CopiaDelLibro> getLibrosEnPrestamo() {
        return librosEnPrestamo;
    }
}
