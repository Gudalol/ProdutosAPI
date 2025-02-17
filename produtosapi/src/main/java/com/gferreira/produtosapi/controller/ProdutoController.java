package com.gferreira.produtosapi.controller;

import com.gferreira.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping
    public Produto SalvarProduto(@RequestBody Produto produto) {
        System.out.println("produto salvo" + produto);
        return produto;
    }
}
