package br.scrumban;

import java.util.List;

import org.junit.Test;

import br.scrumban.dao.VendaDAO;
import br.scrumban.dao.VendedorDAO;


public class VendaDAOTest extends BaseDBTest
{
	 	   

    @Test
    public void testarBuscarTotalDeVendasPorVendedorToledoEm2011DeveRetornar200Reais()
    {
    	
        Vendedor vendedor = new Vendedor();
        
        vendedor.setId(7);
        vendedor.setNome("Toledo");
        
        VendaDAO.setEntityManager(emf.createEntityManager());
        int ano = 2011;
        double valorEsperado = 200;
		double total = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, ano);
		
		assertEquals(valorEsperado, total);
    }

    @Test
    public void testarBuscarTotalDeVendasPorVendedorToledoEm2010DeveRetornar300Reais()
    {
    	
        Vendedor vendedor = new Vendedor();
        
        vendedor.setId(7);
        vendedor.setNome("Toledo");
        
        VendaDAO.setEntityManager(emf.createEntityManager());
        int ano = 2010;
        double valorEsperado = 300;
		double total = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, ano);
		
		assertEquals(valorEsperado, total);
    }
    
    @Test
    public void testarBuscarTotalDeVendasPorVendedorMagnoEm2010DeveRetornar0Reais()
    {
    	
        Vendedor vendedor = new Vendedor();
        
        vendedor.setId(5);
        vendedor.setNome("Magno");
        
        VendaDAO.setEntityManager(emf.createEntityManager());
        int ano = 2010;
        double valorEsperado = 0;
		double total = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, ano);
		
		assertEquals(valorEsperado, total);
    }    
    @Test
    public void testarBuscarTotalDeVendasPorVendedorMagnoEm2008DeveRetornar500Reais()
    {
    	
        Vendedor vendedor = new Vendedor();
        
        vendedor.setId(5);
        vendedor.setNome("Magno");
        
        VendaDAO.setEntityManager(emf.createEntityManager());
        int ano = 2008;
        double valorEsperado = 500;
		double total = VendaDAO.buscarTotalDeVendasPorVendedorEAno(vendedor, ano);
		
		assertEquals(valorEsperado, total);
    }    
    
    
    
}
