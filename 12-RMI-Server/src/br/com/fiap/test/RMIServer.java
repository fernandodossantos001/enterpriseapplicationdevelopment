package br.com.fiap.test;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.bo.Operacao;
import br.com.fiap.bo.OperacaoBOImpl;

public class RMIServer {

	public static void main(String[] args) throws Exception {
		Operacao bo = new OperacaoBOImpl();
		
		Registry registry = LocateRegistry.createRegistry(1234);
		
		System.out.println("Objeto remoto registrado");
		
		registry.bind("banco", bo);

	}

}
