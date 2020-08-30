import javax.persistence.*;

@Entity
@Table(name="copiaDelLibro")

public class CopiaDelLibro extends EntidadPersistente{

    @Column(name="nombre")
    private String nombre;

    @Column(name="anio")
    private int ano;

    @ManyToOne
    @JoinColumn(name = "autor_id", referencedColumnName = "id")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "estado_id", referencedColumnName = "id")
    private Estado estado;

    public CopiaDelLibro(String nombre, int ano, Autor autor, Estado estado) {
        this.nombre = nombre;
        this.ano = ano;
        this.autor = autor;
        this.estado = estado;
    }

    public boolean puedeReservarse(){
        return estado.serReservado();
    }

    public void reservarLibro(){
        estado = new Prestado();
    }
    public void devolverLibro(){
        estado = new EnBiblioteca();
    }

    public Estado getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }
}
