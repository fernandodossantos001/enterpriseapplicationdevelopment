package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.CarroDAO;
import br.com.fiap.entity.Carro;
import br.com.fiap.entity.LocacaoPK;

public class CarroDAOImpl extends GenericDAOImpl<Carro, LocacaoPK> implements CarroDAO{

	public CarroDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
