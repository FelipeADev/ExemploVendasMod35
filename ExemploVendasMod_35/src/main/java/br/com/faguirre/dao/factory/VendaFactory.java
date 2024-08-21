/**
 * 
 */
package br.com.faguirre.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.faguirre.domain.VendaJpa.Status;
import br.com.faguirre.domain.ClienteJpa;
import br.com.faguirre.domain.VendaJpa;

public class VendaFactory {

	public static VendaJpa convert(ResultSet rs) throws SQLException {
		ClienteJpa cliente = ClienteFactory.convert(rs);
		VendaJpa venda = new VendaJpa();
		venda.setCliente(cliente);
		venda.setId(rs.getLong("ID_VENDA"));
		venda.setCodigo(rs.getString("CODIGO"));
		venda.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		venda.setDataVenda(rs.getTimestamp("DATA_VENDA").toInstant());
		venda.setStatus(Status.getByName(rs.getString("STATUS_VENDA")));
		return venda;
	}
}
