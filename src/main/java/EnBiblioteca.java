import javax.persistence.*;

@Entity
@Table(name = "enBiblioteca")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "estado")
public class EnBiblioteca extends Estado {

    @Override
    public boolean serReservado() {
        return false;
    }

    public int diasDeRetraso(){
        return 0;
    }
}


