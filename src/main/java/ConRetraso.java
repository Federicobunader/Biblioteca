import javax.persistence.*;

@Entity
@Table(name = "conRetraso")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "estado")
public class ConRetraso extends Estado {

    @Override
    public boolean serReservado() {
        return false;
    }

    public int diasDeRetraso(){
        return 0;
    }
}
