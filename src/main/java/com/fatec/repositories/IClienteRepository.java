package com.fatec.repositories;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fatec.models.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Integer>{

	@Query(value="SELECT * FROM Cliente where nome = :nome")
	List<Cliente> listByNome(@Param("nome") String nome);
	
}
