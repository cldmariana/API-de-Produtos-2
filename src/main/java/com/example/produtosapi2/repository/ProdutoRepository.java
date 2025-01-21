package com.example.produtosapi2.repository;

import com.example.produtosapi2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
