import javax.persistence.*;

@Entity
@Table(name = "prestado")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "estado")
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
