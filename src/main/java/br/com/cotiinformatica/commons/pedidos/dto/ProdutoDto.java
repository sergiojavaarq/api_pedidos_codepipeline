package br.com.cotiinformatica.commons.pedidos.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProdutoDto {

	private String nome;
	private BigDecimal preco;
	private Integer quantidade;

	public ProdutoDto() {
		// TODO Auto-generated constructor stub
	}

	public ProdutoDto(String nome, BigDecimal preco, Integer quantidade) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "ProdutoDto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProdutoDto other = (ProdutoDto) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco)
				&& Objects.equals(quantidade, other.quantidade);
	}

}
