package com.pfe.main.repository;

import java.util.List;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfe.main.entity.Client;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "Client", path = "Client", excerptProjection = com.pfe.main.projections.Client.class)
public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

	public List<Client> findByNom(@Param("nom") String nom);
}
