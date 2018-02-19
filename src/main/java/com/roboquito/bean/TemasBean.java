package com.roboquito.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class TemasBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final List<Tema> TEMAS = new ArrayList<Tema>();

	static {
		TEMAS.add(new Tema("Tema padrão", "tema-padrao", "tema-padrao"));
		TEMAS.add(new Tema("JQuery-UI", "tema-jquery-ui2", "jquery-ui"));
	}

	private Tema tema;


	public List<Tema> getTemas() {
		return TEMAS;
	}


	public void atualizar() {
		// gravar em arquivo o nome do tema escolhido
	}


	public Tema getTema() {
		return tema;
	}


	public void setTema(Tema tema) {
		this.tema = tema;
	}
	
	
}
