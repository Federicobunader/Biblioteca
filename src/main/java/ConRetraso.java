import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name="conRetraso")
public class ConRetraso extends Estado {

    @Override
    public boolean serReservado() {
        return false;
    }

    public int diasDeRetraso(){
        return 0;
    }
}
