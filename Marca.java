import javax.persistence.*;
import java.util.Set;

@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "marca")
    private Set<Carro> carros;

    // getters and setters
}
