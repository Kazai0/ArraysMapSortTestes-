package model;

import java.util.Comparator;


public class Pessoa{
	
	
	private String cpf;
	private String nome;
	private double altura;

	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Pessoa(String cpf, String nome, double altura){
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.altura = altura;
	
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		return true;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



//	@Override
//	public int compareTo(Pessoa arg0) {
//		
//		return this.getNome().compareTo(arg0.getNome());
//	}
	
	

}
