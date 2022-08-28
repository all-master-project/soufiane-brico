package com.pfe.main.projections;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "Bricoleur-view", types = com.pfe.main.entity.Bricoleur.class)
public interface Bricoleur {

	
    public Long getId(); 
	public String getNom(); 
	public String getPrenom(); 
	public String getCin(); 
	public String getAdresse(); 
	public String getTel(); 
	public String getPassword(); 
	public String getEmail(); 
	public int getAnneexperience();
	public String getApropos(); 
	public Long getId_ville(); 
	

}
