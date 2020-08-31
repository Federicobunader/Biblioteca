import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="prestamo")
public class Prestamo extends EntidadPersistente{

    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "copiaDelLibro_id", referencedColumnName = "id")
    private CopiaDelLibro copiaDelLibro;

    @Column(name="fechaDePrestacion", columnDefinition = "DATE")
    private LocalDate fechaDePrestacion;

   // @OneToOne(cascade = {CascadeType.ALL})
    //@JoinColumn(name = "lector_id", referencedColumnName = "id")
   @Transient
    private Lector lector;

    public Prestamo(CopiaDelLibro copiaDelLibro, Lector lector) {
        this.copiaDelLibro = copiaDelLibro;
        this.fechaDePrestacion = LocalDate.now();
        this.lector = lector;
    }

    public CopiaDelLibro getCopiaDelLibro() {
        return copiaDelLibro;
    }

    public LocalDate getFechaDePrestacion() {
        return fechaDePrestacion;
    }

    public Lector getLector() {
        return lector;
    }
}
