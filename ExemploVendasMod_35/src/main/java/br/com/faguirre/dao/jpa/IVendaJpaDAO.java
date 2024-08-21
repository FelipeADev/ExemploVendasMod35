/**
 * 
 */
package br.com.faguirre.dao.jpa;

import br.com.faguirre.dao.generic.IGenericJapDAO;
import br.com.faguirre.domain.VendaJpa;
import br.com.faguirre.exceptions.DAOException;
import br.com.faguirre.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long>{

	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public VendaJpa consultarComCollection(Long id);
}
