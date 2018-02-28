import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.roboquito.helpdesk.model.Cliente;

public class Persistencia {

	public static void main(String[] args) {
		
		//Cria um EntityManagerFactory
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UnidadePU");
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trx = manager.getTransaction();
		
		Cliente cliente = new Cliente();
		
		cliente.setMatricula("SI201510695");
		cliente.setNome("Jones Dhyemison Quito de Oliveira");
		cliente.setEmail("jonesdhy@hotmail.com");
		cliente.setSenha("123456");
		cliente.setDepartamento("Gestão de Pessoas, Financas e Sistemas de Informação");
		
		trx.begin();
		
		manager.persist(cliente);
		
		trx.commit();

	}

}
