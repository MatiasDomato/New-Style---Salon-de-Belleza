package com.mindhub.newStyle.repositorios;

import com.mindhub.newStyle.modelos.Negocio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RepositorioNegocio extends JpaRepository<Negocio, Long> {
   Negocio findByEmail (String email);
}
