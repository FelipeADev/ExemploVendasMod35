/**
 * 
 */
package br.com.faguirre.dao.generic;

import java.io.Serializable;
import java.util.Collection;

import br.com.faguirre.dao.Persistente;
import br.com.faguirre.exceptions.DAOException;
import br.com.faguirre.exceptions.MaisDeUmRegistroException;
import br.com.faguirre.exceptions.TableException;
import br.com.faguirre.exceptions.TipoChaveNaoEncontradaException;


public interface IGenericJapDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

  
    public void excluir(T entity) throws DAOException;

   
    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
