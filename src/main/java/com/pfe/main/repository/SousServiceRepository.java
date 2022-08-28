package com.pfe.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfe.main.entity.Adress;
import com.pfe.main.entity.Bricoleur;
import com.pfe.main.entity.Client;
import com.pfe.main.entity.Service;
import com.pfe.main.entity.SousService;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "SousService", path = "SousService", excerptProjection = com.pfe.main.projections.SousService.class)
public interface SousServiceRepository extends PagingAndSortingRepository<SousService, Long> {

}
