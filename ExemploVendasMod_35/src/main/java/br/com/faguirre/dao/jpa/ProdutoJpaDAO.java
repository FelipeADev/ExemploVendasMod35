/**
 * 
 */
package br.com.faguirre.dao.jpa;

import br.com.faguirre.dao.generic.GenericJpaDAO;
import br.com.faguirre.domain.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
