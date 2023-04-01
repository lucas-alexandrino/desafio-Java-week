package com.linuxtips.challengejavaweek.controller;

import java.util.List;
import com.linuxtips.challengejavaweek.model.Produto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.linuxtips.challengejavaweek.service.ProdutoService;

@RestController
@RequestMapping("/api/")
public class ProdutoController {

	private ProdutoService produtoService;

	@PostMapping("/produtos")
	public Produto criarProduto(@RequestBody Produto produto) {
		return produtoService.criarProduto(produto);
	}

	@GetMapping("/produtos")
	public List<Produto> listarProdutos() {
		return produtoService.listarProdutos();

	}

	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> buscarProdutoPeloId(@PathVariable Long id) {
		return produtoService.buscarProdutoPeloId(id);
	}

	@GetMapping("/produtos/{id}")
	public ResponseEntity<Produto> atualizarProdutoPeloId(@PathVariable @RequestBody Produto produto, Long Id) {
		return produtoService.atualizarProdutoPeloId(produto, Id);

	}

	@DeleteMapping("/produtos/{id}")
	public ResponseEntity<Object> apagarPeloId(@PathVariable Long Id) {
		return produtoService.apagarPeloId(Id);
	}

}
