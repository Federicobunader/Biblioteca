import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name="enReparacion")
public class EnReparacion extends Estado {
    @Override
    public boolean serReservado() {
        return false;
    }

    public int diasDeRetraso(){
        return 0;
    }
}
