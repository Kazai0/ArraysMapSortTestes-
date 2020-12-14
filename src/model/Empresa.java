package model;

public class Empresa {
	
	private String cnpj;
	private String nome;
	private int numeroFuncionarios;
	private double faturamentoAnual;
	private int dataCriacao;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public double getFaturamento() {
		return faturamentoAnual;
	}
	public void setFaturamento(double faturamento) {
		this.faturamentoAnual = faturamento;
	}
	public int getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(int dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public Empresa(String cnpj, String nome,int numeroFuncinario, double faturamentoAnual, int dataCriacao ) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.numeroFuncionarios = numeroFuncinario;
		this.faturamentoAnual = faturamentoAnual;
		this.dataCriacao = dataCriacao;
		
		
		
		
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		return true;
	}
	
	
	
	

}
