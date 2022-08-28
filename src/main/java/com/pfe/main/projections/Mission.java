package com.pfe.main.projections;


import org.springframework.data.rest.core.config.Projection;



@Projection(name = "Mission-view", types = com.pfe.main.entity.Mission.class)
public interface Mission {

    
    public Long getId();
    public String getTitre();
    public String getDateMission() ;
    public String getDescriptions();
    public String getPrixMission() ;
    
    public Long getClient_id() ;
    
    public Long getService_id();
    

}
