package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;

public class Uco5CasdastrarConvenio{
static ConvenioDAO convenioDAO;
static Convenio convenio;
@BeforeClass
public static void setUpBeforeClass() throws Exception {
convenioDAO = new ConvenioDAO();
convenio = new Convenio() ;
}
@Test
public void CT01UC05CadastrarConvenio_com_sucesso() {
assertEquals(1,convenioDAO.adiciona(convenio));
}
@AfterClass
public static void tearDownAfterClass() throws Exception {
}
@Test
public void CT03UC05A2Cadastrar_convenio_dti_invalida(){
assertFalse(convenio.validaData("42/05/2016"));
}
@AfterClass
public static void tearDownAfterClass1() throws Exception {
}

}