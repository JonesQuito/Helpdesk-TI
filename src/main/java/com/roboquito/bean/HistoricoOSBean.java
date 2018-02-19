package com.roboquito.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class HistoricoOSBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Integer> listaChamados;
	
	public HistoricoOSBean() {
		listaChamados = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			listaChamados.add(i);
		}
	}

	public List<Integer> getListaChamados() {
		return listaChamados;
	}
	
}
