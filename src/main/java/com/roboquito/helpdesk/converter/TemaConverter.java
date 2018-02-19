package com.roboquito.helpdesk.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import com.roboquito.bean.Tema;
import com.roboquito.bean.TemasBean;

@FacesConverter(forClass = Tema.class)
public class TemaConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent componet, String value) {
		if(value != null && !value.isEmpty()) {
			String tema = value;
			for(Tema t : TemasBean.TEMAS) {
				if(tema.equals(t.getNomeTema())) {
					return t;
				}
			}
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent componet, Object value) {
		if(value != null) {
			return ((Tema)value).getNomeTema();
		}
		return null;
	}

}
