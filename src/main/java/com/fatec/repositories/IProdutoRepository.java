package com.fatec.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fatec.models.Produto;

// CrudRepository -> operações de CRUD (insert, update, delete)
// PagingAndSortingRepository -> operações de paginação
// JpaRepository -> CrudRepository + PagingAndSortingRepository
//
// Tipo Generic -> <Classe, Tipo da chave primária>
@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Integer> {

}
