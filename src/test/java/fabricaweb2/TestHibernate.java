package fabricaweb2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fabricadeprogramador.dao.UsuarioDao;
import br.com.fabricadeprogramador.entidade.Usuario;

public class TestHibernate {
 public static void main(String[] args) {
	 //fabrica de entityManager	
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaweb2");
	 //gerenciador de entidades
	 EntityManager em = emf.createEntityManager();
	 //Objeto a ser persistido
	 Usuario usu = new Usuario();
	 usu.setNome("Brenda");
	 usu.setLogin("Califfa");
	 usu.setSenha("ppt");
	
	 
	 
//	 //INiciando a transação
//	 em.getTransaction().begin();;
//	 //Preparando a instrucao
//	 em.persist(usu);
//	 //Confirmando a transação, fazendo a persistencia no banco
//	 em.getTransaction().commit();
//	 
	 UsuarioDao usuarioDao = new UsuarioDao(em);
//	 //usuarioDao.salvar(usu);
//	 //usuarioDao.excluir(usu);
//	 Usuario usuModificar = usuarioDao.buscarPorId(5);
//	 System.out.println(usuModificar);
//	 usuModificar.setLogin("JJ");
//	 usuModificar.setNome("Joao victor");
//	 usuModificar.setSenha("play3");
//	 usuarioDao.salvar(usuModificar);
	 
	 Usuario usuExcluir = usuarioDao.buscarPorId(5);
	 usuarioDao.excluir(usuExcluir);
 }
}
