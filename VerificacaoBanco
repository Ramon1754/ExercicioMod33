import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class VerificacaoBanco {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NomeDaSuaUnidadeDePersistencia");
        EntityManager em = emf.createEntityManager();

        // Verificar a existência da tabela Carro
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Carro> cq = cb.createQuery(Carro.class);
        Root<Carro> rootCarro = cq.from(Carro.class);
        cq.select(rootCarro);

        List<Carro> carros = em.createQuery(cq).getResultList();

        System.out.println("Tabela Carro encontrada com sucesso!");

        // Verificar a existência da tabela Marca
        CriteriaQuery<Marca> cqMarca = cb.createQuery(Marca.class);
        Root<Marca> rootMarca = cqMarca.from(Marca.class);
        cqMarca.select(rootMarca);

        List<Marca> marcas = em.createQuery(cqMarca).getResultList();

        System.out.println("Tabela Marca encontrada com sucesso!");

        // Verificar a existência da tabela Acessorio
        CriteriaQuery<Acessorio> cqAcessorio = cb.createQuery(Acessorio.class);
        Root<Acessorio> rootAcessorio = cqAcessorio.from(Acessorio.class);
        cqAcessorio.select(rootAcessorio);

        List<Acessorio> acessorios = em.createQuery(cqAcessorio).getResultList();

        System.out.println("Tabela Acessorio encontrada com sucesso!");

        em.close();
        emf.close();
    }
}
