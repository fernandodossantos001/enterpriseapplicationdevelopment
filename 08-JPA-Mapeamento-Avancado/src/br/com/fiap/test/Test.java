package br.com.fiap.test;

import static org.junit.Assert.fail;

import java.util.Calendar;

import org.junit.jupiter.api.BeforeAll;

import br.com.fiap.dao.LocacaoDAO;
import br.com.fiap.dao.impl.LocacaoDAOImpl;
import br.com.fiap.entity.Carro;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Locacao;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class Test {
	
	private static LocacaoDAO dao ;
	
	@BeforeAll
	public static void init() {
		dao = new LocacaoDAOImpl(
				EntityManagerFactorySingleton
				.getInstance()
				.createEntityManager());
		
	}
	
	@org.junit.jupiter.api.Test
	void cadastrar() {
		Cliente cliente = new Cliente("Sergio", 65465654l);
		Carro carro = new  Carro("abc-3214", "BMW-X1");
		Locacao locacao = new Locacao( carro, cliente, Calendar.getInstance(), 45);
		
		try {
			dao.cadastrar(locacao);
			dao.commit();
		} catch (Exception e) {
			fail("Erro");
			e.printStackTrace();
		}
	}

}
