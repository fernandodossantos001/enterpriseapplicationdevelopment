package br.com.fiap.bo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OperacaoBOImpl extends UnicastRemoteObject implements Operacao {

	public OperacaoBOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -1669405796650401986L;

	@Override
	public int fatorial(int x) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Fatorando...");
		return x==1?1:fatorial(x-1);
	}

	@Override
	public double raiz(int x) throws RemoteException {
		System.out.println("Calculando...");
		return Math.sqrt(x);
	}

}
