package br.com.fiap.test;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Aluno;

public class Desserializacao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("seila.txt");
		ObjectInputStream input = new ObjectInputStream(file);
		
		Aluno aluno = (Aluno) input.readObject();
		
		System.out.println(aluno.getNome());
		System.out.println("RM " + aluno.getRm());
		System.out.println("Formado " + (aluno.isFormado()?"sim":"nao"));
		
		file.close();
		input.close();

	}

}
