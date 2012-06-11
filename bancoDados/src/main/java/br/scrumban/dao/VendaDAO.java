package br.scrumban.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.scrumban.Venda;
import br.scrumban.Vendedor;

public class VendaDAO {
	
    @PersistenceContext(unitName = "JPA")
    private static EntityManager entityManager;

    
    public static Venda find(long id)
    {
        return entityManager.find(Venda.class, new Long(id));
    }
    

    public static void remove(long id){
    	entityManager.remove(find(id));
    }
    
    public static EntityManager getEntityManager()
    {
        return entityManager;
    }

    public static void setEntityManager(EntityManager entityManager)
    {
    	VendaDAO.entityManager = entityManager;
    }


	public static Venda findByUserID(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public static double buscarTotalDeVendasPorVendedorEAno(Vendedor vendedor,
			int ano) {
		Query q = entityManager.createNativeQuery("select sum(vv.valorParticipacao) " +
				"from venda v inner join vendaVendedor vv " +
				"on v.id = vv.venda_id where year(dataVenda) = :paramAno and vv.vendedor_id = :paramIdVendedor");
    	
    	q.setParameter("paramAno", ano);
    	q.setParameter("paramIdVendedor",vendedor.getId());
    
    	Object o =q.getSingleResult();
    	if(o == null)
    		return 0;
    	
    	Double valor = (Double) o;
    	return valor;
 	}

}
