import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;

@Entity
@DiscriminatorColumn(name="prestado")
public class Prestado extends Estado {

    private int diasEnPrestamo;

    @Override
    public boolean serReservado() {
        return false;
    }

    public int diasDeRetraso(){
        if(diasEnPrestamo > 30){
            return diasEnPrestamo - 30;
        }
        return 0;
    }
}
