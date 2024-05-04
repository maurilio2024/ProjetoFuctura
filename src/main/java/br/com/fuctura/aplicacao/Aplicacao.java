package br.com.fuctura.aplicacao;

import java.util.ArrayList;
import java.util.List;

import br.com.fuctura.dto.VeiculoDTO;
import br.com.fuctura.entidade.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Aplicacao {

	public static void main(String[] args) {

		var emf = Persistence.createEntityManagerFactory("FUCTURA-PU");

		EntityManager em = emf.createEntityManager();

		/*
		 * for(int i=0; i<100; i++) { Veiculo v = new Veiculo(); v.setAno(2021);
		 * v.setMarca("VOLKSVAGEM"); v.setModelo("GOL"); v.setPlaca("PFO480"+i);
		 * v.setValorAproximado(100000.00f);
		 * 
		 * 
		 * 
		 * // Transacao em.getTransaction().begin(); // comando inserir em.persist(v);
		 * em.getTransaction().commit(); }
		 */
		// JPQL
		String jpql = "select new br.com.fuctura.dto.VeiculoDTO(codigo, placa, ano) from Veiculo v where valorAproximado < :valorVeiculo";

		TypedQuery<VeiculoDTO> consulta01 = em.createQuery(jpql, VeiculoDTO.class);
		consulta01.setParameter("valorVeiculo", 100000);
		
		int exibicaoPorPagina = 5;
		List<VeiculoDTO> listV2 = consulta01.getResultList();
		

		int quantidadePaginas = (listV2.size() / exibicaoPorPagina);

		for (int pagina = 0; pagina < 1; pagina++) {
			consulta01.setFirstResult(pagina * exibicaoPorPagina);
			consulta01.setMaxResults(exibicaoPorPagina);
			System.out.println("Pagina atual =>" + pagina);

			List<VeiculoDTO> listV = consulta01.getResultList();

			for (VeiculoDTO forV : listV) {
				System.out
						.println("ID -> " + forV.getCodigo() + " Placa: " + forV.getPlaca() + " Ano: " + forV.getAno());
			}
		}
		em.close();
		emf.close();

	}

}
