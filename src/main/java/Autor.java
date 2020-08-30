import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="autor")
public class Autor extends EntidadPersistente{

    @Column(name="nombre")
    private String nombre;

    @Column(name="fachaDeNacimiento", columnDefinition = "DATE")
    private LocalDate fechaDeNacimiento;

    @Column(name="nacionalidad")
    private String nacionalidad;

    public Autor() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
}
