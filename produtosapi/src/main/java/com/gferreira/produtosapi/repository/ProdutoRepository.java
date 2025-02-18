package com.gferreira.produtosapi.repository;

import com.gferreira.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);
}
