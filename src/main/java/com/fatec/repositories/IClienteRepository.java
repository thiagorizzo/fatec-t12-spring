package com.fatec.repositories;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fatec.models.Cliente;

@Repository
@Scope(BeanDefinition.SCOPE_SINGLETON)
public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

	// JPQL -> "SELECT c FROM Cliente c WHERE c.nome = :nome"
	// Native Query -> "SELECT * FROM Cliente c WHERE c.nome = :nome"
	@Query(value="SELECT * FROM Cliente c where c.nome LIKE CONCAT('%',:nome,'%')", nativeQuery = true)
	List<Cliente> listByNome(@Param("nome") String nome);
	
}
