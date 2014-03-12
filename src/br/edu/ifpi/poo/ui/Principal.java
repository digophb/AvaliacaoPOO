package br.edu.ifpi.poo.ui;

import java.util.List;

import br.edu.ifpi.poo.dao.ClienteDAO;
import br.edu.ifpi.poo.model.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteDAO cdao = new ClienteDAO();
		Cliente c;
		cdao.iniciar();
		c = new Cliente("Steve Wonder", "321.321.321.32", "barangaricotirimiruaro","Parnaiba");
		cdao.salvar(c);		
		c = new Cliente("Michael Jackson","343.343.343.34","Disneyland","Flórida");
		cdao.salvar(c);
		c = new Cliente("Lionel Reetch","683.743.563.33","Alexandria","Las Vegas");
		cdao.salvar(c);		
		cdao.commit();
		
		List<Cliente> l = cdao.listarTodos();
		for(Cliente cliente : l){
			System.out.println(cliente);
		}
		
		c = cdao.procurar(2L);
		c.setCpf("000.000.000-00");
		cdao.atualizar(c);
		System.out.println(c);
	}

}
