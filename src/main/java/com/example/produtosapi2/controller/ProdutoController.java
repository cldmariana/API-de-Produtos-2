package com.example.produtosapi2.controller;

import com.example.produtosapi2.model.Produto;
import com.example.produtosapi2.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.print("Produto salvo: " + produto);

        var id = UUID.randomUUID().toString();  //pra gerar um id aleatório
        produto.setId(id);                      //pra setar o id gerado do produto

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterporId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);             //mesma função com melhor codigo

        //Optional<Produto> produto = produtoRepository.findById(id);         //--> ele verifica se exixte produto com o id, caso sim, ele mostra o produto, caso nao, ele retorna nulo
        //return produto.isPresent() ? produto.get() : null;                  //--> "optional" pq ele pode ou nao achar um produto com o id requisitado
    }

//    public void deletarProduto(@PathVariable String id){
//        produtoRepository.delete();
//    }
}
