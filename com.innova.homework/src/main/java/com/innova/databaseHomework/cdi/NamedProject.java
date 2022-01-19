package com.innova.databaseHomework.cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

// pojo<Bean<managementBean<CdiBEan
	@Named
	@ApplicationScoped
	public class NamedProject implements Serializable {
	
		private String computerName;
		
		// parametresiz constructor
		public NamedProject() {
			this.computerName = "Bilgisayar Adı 544515MXCCCR";
		}
		
		// parametreli constructor
		public NamedProject(String computerName) {
			this.computerName = computerName;
		}
		
		@Override
		public String toString() {
			return "Computer [computerName=" + computerName + "]";
		}
		
		public String getComputerName() {
			return computerName;
		}
		
		public void setComputerName(String computerName) {
			this.computerName = computerName;
		}
		
	
}
