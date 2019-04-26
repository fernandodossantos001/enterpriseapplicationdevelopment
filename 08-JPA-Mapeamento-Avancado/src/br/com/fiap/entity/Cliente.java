package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TM_CLIENTE")
@SequenceGenerator(name="cliente",sequenceName="SQ_TM_CLIENTE",allocationSize=1)
public class Cliente {
	
	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(generator="cliente",strategy=GenerationType.SEQUENCE)
	private long id;
	
	@Column(name="nm_cliente")
	private String nome;
	
	@Column(name="nr_cnh")
	private long cnh;
	
	public Cliente() {
		
	}

	public Cliente(long id, String nome, long cnh) {
		super();
		this.id = id;
		this.nome = nome;
		this.cnh = cnh;
	}

	public Cliente(String nome, long cnh) {
		this.nome = nome;
		this.cnh = cnh;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCnh() {
		return cnh;
	}

	public void setCnh(long cnh) {
		this.cnh = cnh;
	}
	
	

	
	

}
