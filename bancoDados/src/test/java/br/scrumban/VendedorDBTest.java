package br.scrumban;

import java.util.List;

import org.junit.Test;

import br.scrumban.dao.VendedorDAO;


public class VendedorDBTest extends BaseDBTest
{
	 	   

    @Test
    public void testFindUmVendedorEspecifico()
    {
    	
        VendedorDAO.setEntityManager(emf.createEntityManager());

        Vendedor user = VendedorDAO.find(1);

        assertNotNull(user);
        assertEquals(1, user.getId());
        assertEquals("John Doe", user.getNome());
    }
    

    @Test
    public void testRemoverUmVendedorEspecificoConsultarOutro()
    {
    	
        VendedorDAO.setEntityManager(emf.createEntityManager());

        VendedorDAO.remove(1);
        Vendedor vendedor1 = VendedorDAO.find(1);
        assertNull(vendedor1);
        

        Vendedor vendedor2 = VendedorDAO.find(2);
        assertNotNull(vendedor2);
    }


    @Test
    public void testConsultarVendedor()
    {
    	
        VendedorDAO.setEntityManager(emf.createEntityManager());

        List<Vendedor> lista = VendedorDAO.findVendedorByNome("CFC");

        assertEquals( 0, lista.size());
        
    }


    @Test
    public void testConsultarVendedorVamoLa()
    {
    	
        VendedorDAO.setEntityManager(emf.createEntityManager());

        List<Vendedor> lista = VendedorDAO.findVendedorByNome("Felippe");

        assertEquals( 1, lista.size());
        
        //id do usuario felippe
        assertEquals( 2, lista.get(0).getId());
        
        
    }

}
