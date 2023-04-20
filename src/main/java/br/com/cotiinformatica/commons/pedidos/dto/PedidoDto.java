package br.com.cotiinformatica.commons.pedidos.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

public class PedidoDto {

	private BigDecimal valor;
	private ClienteDto cliente;
	private CobrancaDto cobranca;
	private List<ProdutoDto> produtos;

	public PedidoDto() {
		// TODO Auto-generated constructor stub
	}

	public PedidoDto(BigDecimal valor, ClienteDto cliente, CobrancaDto cobranca, List<ProdutoDto> produtos) {
		super();
		this.valor = valor;
		this.cliente = cliente;
		this.cobranca = cobranca;
		this.produtos = produtos;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public ClienteDto getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDto cliente) {
		this.cliente = cliente;
	}

	public CobrancaDto getCobranca() {
		return cobranca;
	}

	public void setCobranca(CobrancaDto cobranca) {
		this.cobranca = cobranca;
	}

	public List<ProdutoDto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoDto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cliente, cobranca, produtos, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoDto other = (PedidoDto) obj;
		return Objects.equals(cliente, other.cliente) && Objects.equals(cobranca, other.cobranca)
				&& Objects.equals(produtos, other.produtos) && Objects.equals(valor, other.valor);
	}

}
