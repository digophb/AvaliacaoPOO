package br.edu.ifpi.poo.model;

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClienteTest {
	private static Cliente c;
	
	@BeforeClass
	public static void inicializar(){
			c = new Cliente();
	}
	
	@Test
	public void testValidarCpf(){
		c.setCpf("123.456.789-12");
		Assert.assertTrue(c.validarCpf());
	}
	@Test(expected = IllegalArgumentException.class)
	public void testExcecao() {
		c.setNome("");
	}
	@Test
	public void testcontaCpf(){		
		Assert.assertEquals(14, c.contaCpf("123.123.123-12"),0);
	}	
}
