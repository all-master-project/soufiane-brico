package com.pfe.main.projections;



import org.springframework.data.rest.core.config.Projection;



@Projection(name = "Service-view", types = com.pfe.main.entity.Service.class)
public interface Service {

	
	public Long getId() ;
	public String getNom() ;


}
