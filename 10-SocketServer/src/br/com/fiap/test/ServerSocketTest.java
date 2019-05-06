package br.com.fiap.test;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

import br.com.fiap.bean.Filme;

public class ServerSocketTest {

	public static void main(String[] args) throws Exception {
		ServerSocket server = new ServerSocket(1234);
		
		System.out.println("Aguardando conexao");
		
		Socket socket = server.accept();
		
		ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
		
		Filme filme = (Filme)input.readObject();
		
		System.out.println(filme.getNome());
		System.out.println(filme.getDuracao());
		System.out.println(filme.getGenero());
				

	}

}
