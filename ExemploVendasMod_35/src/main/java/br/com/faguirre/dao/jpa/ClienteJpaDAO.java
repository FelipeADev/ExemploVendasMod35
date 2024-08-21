/**
 * 
 */
package br.com.faguirre.dao.jpa;

import br.com.faguirre.dao.generic.GenericJpaDAO;
import br.com.faguirre.domain.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
