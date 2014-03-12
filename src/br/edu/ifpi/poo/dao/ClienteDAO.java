package br.edu.ifpi.poo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.edu.ifpi.poo.model.Cliente;




public class ClienteDAO {
	private EntityManager em = Persistence.createEntityManagerFactory("cliente").createEntityManager();
	
	public void fechar(){
		em.close();
	}
	
	public void commit(){
		em.getTransaction().commit();
	}
	
	public void iniciar(){
		em.getTransaction().begin();
	}
	
	public void salvar(Cliente c){
		em.persist(c);
	}
	
	public void apagar(Cliente c){
		em.remove(c);
	}
	
	public void atualizar(Cliente c){
		em.merge(c);
	}
	
	public Cliente procurar(Long id){
		return em.find(Cliente.class, id);
	}
	
	public List<Cliente> listarTodos(){
		Query query = em.createNamedQuery("Cliente.buscarTodos");
		return query.getResultList();
	}
	
	public Cliente procurarPorCpf(String cpf){
		Query query = em.createNamedQuery("Cliente.buscarPorCpf");
		query.setParameter("cpf", cpf);
		return (Cliente) query.getSingleResult();
	}

}
