package com.roboquito.bean;

import java.io.Serializable;

public class Tema implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private String nomeTema;
	private String iconeTema;
	
	public Tema() {
		
	}
	
	public Tema(String descricao, String nomeTema, String iconeTema) {
		this.descricao = descricao;
		this.nomeTema = nomeTema;
		this.iconeTema = iconeTema;
	}

	public String getNomeTema() {
		return nomeTema;
	}

	public void setNomeTema(String nomeTema) {
		this.nomeTema = nomeTema;
	}

	public String getIconeTema() {
		return iconeTema;
	}

	public void setIconeTema(String iconeTema) {
		this.iconeTema = iconeTema;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
	

}
