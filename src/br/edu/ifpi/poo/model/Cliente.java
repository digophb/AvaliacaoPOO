package br.edu.ifpi.poo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries({
	@NamedQuery(name="Cliente.buscarTodos", query="select c from Cliente c"),
	@NamedQuery(name="Cliente.buscarPorCpf", query="select c from Cliente c where c.cpf = :cpf")
})

public class Cliente {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String cpf;
	private String endereco;
	private String cidade;
	public Cliente() {
		super();
	}
	public Cliente(Long id, String nome, String cpf, String endereco,
			String cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cidade = cidade;
	}
	public Cliente(String nome, String cpf, String endereco, String cidade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.cidade = cidade;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome.equals("")){
			throw new IllegalArgumentException("Não pode deixar o nome em branco");
		}
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf
				+ ", endereco=" + endereco + ", cidade=" + cidade + "]";
	}
	public boolean validarCpf() {
		// TODO Auto-generated method stub
		String regex = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";
		return this.cpf.matches(regex);
	}
	public int contaCpf(String cpf) {
		// TODO Auto-generated method stub
		return cpf.length();
	}
	
	
	

}
