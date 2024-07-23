import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class VerificacaoBancoJPQL {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NomeDaSuaUnidadeDePersistencia");
        EntityManager em = emf.createEntityManager();

        // Verificar a existência da tabela Carro
        Query queryCarro = em.createQuery("SELECT c FROM Carro c");
        List<Carro> carros = queryCarro.getResultList();

        System.out.println("Tabela Carro encontrada com sucesso!");

        // Verificar a existência da tabela Marca
        Query queryMarca = em.createQuery("SELECT m FROM Marca m");
        List<Marca> marcas = queryMarca.getResultList();

        System.out.println("Tabela Marca encontrada com sucesso!");

        // Verificar a existência da tabela Acessorio
        Query queryAcessorio = em.createQuery("SELECT a FROM Acessorio a");
        List<Acessorio> acessorios = queryAcessorio.getResultList();

        System.out.println("Tabela Acessorio encontrada com sucesso!");

        em.close();
        emf.close();
    }
}
