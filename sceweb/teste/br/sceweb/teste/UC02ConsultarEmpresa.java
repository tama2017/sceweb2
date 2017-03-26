package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC02ConsultarEmpresa {

	static Empresa empresa = new Empresa();
	static EmpresaDAO empresaDAO = new EmpresaDAO();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresa.setNomeDaEmpresa("empresax");
		empresa.setCnpj("89424232000180");
		empresa.setNomeFantasia("empresax");
		empresa.setEndereco("rua taquari");
		empresa.setTelefone("222");
	
	}

	@Before
	public void preCondicao_insereEmpresa(){
		empresaDAO.adiciona(empresa);
	}
	@Test
	public void CT01UC02ConsultaEmpresa_cnpj_valido() {
		assertTrue(empresa.equals(empresaDAO.consultaEmpresa("89424232000180")));
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		empresaDAO.exclui("89424232000180");
	}

}
