package com.innova.databaseHomework.cdi;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named(value = "uretenCDI")
	@ApplicationScoped
	public class ProducesExample implements Serializable {
		private static final long serialVersionUID = -4711998929799872984L;
		
		// üreten
		@Produces
		public List<String> ureteLists() {
			List<String> listem = new ArrayList<String>();
			listem.add("Malatya");
			listem.add("Nevşehir");
			listem.add("Kütahya");
			return listem;
		}
		
		@Produces
		private String result() {
			return "Nasılsınız";
		}
		
	}
