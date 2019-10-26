package com.fatec.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fatec.models.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{

}
