/**
 * 
 */
package br.com.faguirre.dao.factory;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.faguirre.domain.ProdutoJpa;
import br.com.faguirre.domain.ProdutoQuantidadeJpa;

public class ProdutoQuantidadeFactory {

	public static ProdutoQuantidadeJpa convert(ResultSet rs) throws SQLException {
		ProdutoJpa prod = ProdutoFactory.convert(rs);
		ProdutoQuantidadeJpa prodQ = new ProdutoQuantidadeJpa();
		prodQ.setProduto(prod);
		prodQ.setId(rs.getLong("ID"));
		prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
		prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
		return prodQ;
	}
}
