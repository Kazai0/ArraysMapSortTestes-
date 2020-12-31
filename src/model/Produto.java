package model;

public class Produto {
	
	private long id;
	private String nome;
	private Empresa empresa;
	private double preco;
	
	public Produto(){
		
	}

	public Produto(long id, String nome, Empresa empresa, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.empresa = empresa;
		this.preco = preco;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public double getPreco() {
		return preco;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		Produto other = (Produto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	

}
