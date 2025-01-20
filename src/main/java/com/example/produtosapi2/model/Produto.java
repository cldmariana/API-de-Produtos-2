package com.example.produtosapi2.model;

import lombok.Data;

@Data
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;


    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
