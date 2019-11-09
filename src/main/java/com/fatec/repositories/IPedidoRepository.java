package com.fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fatec.models.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Integer>{

}
