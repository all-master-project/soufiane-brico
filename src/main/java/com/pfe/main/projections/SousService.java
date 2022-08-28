package com.pfe.main.projections;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "sous-services-view", types = com.pfe.main.entity.SousService.class)
public interface SousService {



	public Long getId();

	public String getNom() ;

	public Long getAdress_id() ;

	public Long getService_id() ;
	

}
