package br.edu.ifms.tads.dbf2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pessoa")

public class Pessoa {
@Id	
@Column(name="id")	
private int id;

@Column (name="rg")
private int rg;

@Column (name="nome")
private String nome;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getRg() {
	return rg;
}
public void setRg(int rg) {
	this.rg = rg;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

	 

}
