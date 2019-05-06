package br.com.fiap.bo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RMIClient {

	public static void main(String[] args) throws Exception{
		Operacao bo = (Operacao) Naming.lookup("rmi://localhost:1234/banco");
		
		int fatorial = bo.fatorial(5);
		
		
		System.out.println(fatorial);
		
		double raiz = bo.raiz(9);
		
		System.out.println(raiz);
	}

}
