package br.com.fuctura.entidade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table (name="tb_lojas")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meu-gerador")
	@SequenceGenerator(name = "meu-gerador", initialValue = 1, allocationSize = 1  )
	private int id;
	private String nome;
	private String endereco;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
