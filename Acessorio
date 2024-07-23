import javax.persistence.*;
import java.util.Set;

@Entity
public class Acessorio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "acessorios")
    private Set<Carro> carros;

    // getters and setters
}
