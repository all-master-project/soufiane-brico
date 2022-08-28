package com.pfe.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfe.main.entity.Bricoleur;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "Bricoleur", path = "Bricoleur", excerptProjection = com.pfe.main.projections.Bricoleur.class)
public interface BricoleurRepository extends PagingAndSortingRepository<Bricoleur, Long> {

	public List<Bricoleur> findByNom(@Param("nom") String nom);
}
