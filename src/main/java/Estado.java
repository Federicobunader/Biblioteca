import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="estado")
@DiscriminatorColumn(name="nombreEstado")
public abstract class Estado extends EntidadPersistente{
    public abstract boolean serReservado();
    public abstract int diasDeRetraso();
}
