package com.pfe.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfe.main.entity.Adress;

@CrossOrigin(origins = "*")
@RepositoryRestResource(collectionResourceRel = "Adress", path = "Adress", excerptProjection = com.pfe.main.projections.Adress.class)
public interface AdressRepository extends PagingAndSortingRepository<Adress, Long> {

	public List<Adress> findByRegion(@Param("region") String region);
	public List<Adress> findByVille(@Param("ville") String ville);
}
