package br.com.fuctura.aplicacao;

import java.util.List;

import br.com.fuctura.entidade.Loja;
import br.com.fuctura.entidade.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class AssociacoesAplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		var emf = Persistence
				.createEntityManagerFactory("FUCTURA-PU");
		
		EntityManager em = emf.createEntityManager();
		
		Loja l = new Loja();
		l.setNome("Maurilio");
		l.setEndereco("Rua truta");
		

		Veiculo v = new Veiculo();
		v.setPlaca("QYA-3J62");
		v.setAno(2019);
		v.setMarca("Toyta");
		v.setModelo("Corolla");
		v.setValorAproximado(100000.00f);
		v.setLoja(l);
		
	
		
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();

		em.detach(v);
		em.detach(l);
		
		String consulta1 = "SELECT v FROM Veiculo v";
		TypedQuery<Veiculo> q1 = em.createQuery(consulta1,Veiculo.class);
		List<Veiculo> resultado = q1.getResultList();
		
		for(Veiculo vv : resultado) {
			System.out.println(" Modelo: " + vv.getModelo() + " \n Loja: "+ vv.getLoja().getNome());
			System.out.println("Maurilio");
			
		}
		
	}

}
