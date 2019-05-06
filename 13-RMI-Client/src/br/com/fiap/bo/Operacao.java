package br.com.fiap.bo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Operacao extends Remote{
	int fatorial(int x) throws RemoteException;
	
	double raiz(int x)throws RemoteException;

}
