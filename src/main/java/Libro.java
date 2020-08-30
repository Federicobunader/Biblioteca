import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="libro")

public class Libro extends EntidadPersistente{

    @Column(name="editorial")
    private String editorial;

    @Column(name="categoria")
    private String categoria;

    @OneToMany(mappedBy = "libro", cascade = {CascadeType.ALL})
    private List<CopiaDelLibro> librosEnPrestamo;

    public Libro(String editorial, String categoria, List<CopiaDelLibro> librosEnPrestamo) {
        this.editorial = editorial;
        this.categoria = categoria;
        this.librosEnPrestamo = librosEnPrestamo;
    }
}
