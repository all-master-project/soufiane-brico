package com.pfe.main.projections;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "adress-view", types = com.pfe.main.entity.Adress.class)
public interface Adress {

	public Long getId() ;
	public String getRegion() ;
	public String getVille() ;

}
