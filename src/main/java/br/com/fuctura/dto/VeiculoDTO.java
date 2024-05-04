package br.com.fuctura.dto;

public class VeiculoDTO {

	private int codigo;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private float valorAproximado;
	
	
	
	public VeiculoDTO(int codigo, String placa, int ano) {
		super();
		this.codigo = codigo;
		this.placa = placa;
		this.ano = ano;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float getValorAproximado() {
		return valorAproximado;
	}
	public void setValorAproximado(float valorAproximado) {
		this.valorAproximado = valorAproximado;
	}
	
	
	

}
