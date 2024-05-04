package br.com.fuctura.aplicacao;

import br.com.fuctura.entidade.Veiculo;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class CicloDeVidaAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var emf = Persistence
				.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager em = emf.createEntityManager();
		
		Veiculo v = new Veiculo();
		v.setPlaca("AAA3J66");
		v.setAno(2000);
		
		//em.getTransaction().begin();
		//em.persist(v);
		//em.getTransaction().commit();
		
	}

}
