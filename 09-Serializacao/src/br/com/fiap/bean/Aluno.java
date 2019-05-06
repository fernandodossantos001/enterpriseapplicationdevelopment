package br.com.fiap.bean;

import java.io.Serializable;

public class Aluno implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1992166026929009746L;

	private Integer rm;
	
	private String nome;
	
	private boolean formado;
	
	public Aluno() {
		
	}
	
	public Aluno(Integer rm, String nome, boolean formado) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.formado = formado;
	}

	public Integer getRm() {
		return rm;
	}

	public void setRm(Integer rm) {
		this.rm = rm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFormado() {
		return formado;
	}

	public void setFormado(boolean formado) {
		this.formado = formado;
	}
	
	
}
