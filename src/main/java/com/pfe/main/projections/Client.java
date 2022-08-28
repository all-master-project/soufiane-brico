package com.pfe.main.projections;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "Client-view", types = com.pfe.main.entity.Client.class)
public interface Client {
    
    public Long getId();
    public String getNom();
    public String getPrenom();
    public String getEmail();
    public Long getId_ville();

}
