package br.com.fiap.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import br.com.fiap.bean.Aluno;

public class SerializacaoTeste {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream("seila.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);
		
		Aluno aluno = new Aluno(80577, "fernando ribeiro", false);
		
		out.writeObject(aluno);
		
		out.close();
		file.close();
		System.out.println("salvo com sucesso");
		

	}

}
