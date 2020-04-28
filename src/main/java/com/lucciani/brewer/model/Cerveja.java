package com.lucciani.brewer.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Cerveja {

	@NotBlank(message = "Sku é obrigatorio")
	private String sku;

	@NotBlank(message = "Nome é obrigatorio")
	private String nome;

	@Size(min = 1, max = 50, message = "O tamanho da descrição precisa ta entre 1 e 50 caracters")
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
