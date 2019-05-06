package br.com.fiap.test;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import br.com.fiap.bean.Filme;
import br.com.fiap.bean.Genero;

public class SocketClientTest {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		Filme filme = new Filme("O Rei Lei", 2, Genero.AVENTURA);
		
		Socket socket = new Socket("10.20.53.56",1234);
		
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
		
		System.out.println("Serializando Filme");
		out.writeObject(filme);
		
		out.close();
		socket.close();

	}

}
