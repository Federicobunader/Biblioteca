import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name="enBiblioteca")
public class EnBiblioteca extends Estado {

    @Override
    public boolean serReservado() {
        return false;
    }

    public int diasDeRetraso(){
        return 0;
    }
}


