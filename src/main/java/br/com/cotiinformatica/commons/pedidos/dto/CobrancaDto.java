package br.com.cotiinformatica.commons.pedidos.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class CobrancaDto {

	private String numeroCartao;
	private String nomeImpressoNoCartao;
	private Integer mesValidade;
	private Integer anoValidade;
	private Integer codigoSeguranca;
	private BigDecimal valor;

	public CobrancaDto() {
		// TODO Auto-generated constructor stub
	}

	public CobrancaDto(String numeroCartao, String nomeImpressoNoCartao, Integer mesValidade, Integer anoValidade,
			Integer codigoSeguranca, BigDecimal valor) {
		super();
		this.numeroCartao = numeroCartao;
		this.nomeImpressoNoCartao = nomeImpressoNoCartao;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
		this.codigoSeguranca = codigoSeguranca;
		this.valor = valor;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}

	public String getNomeImpressoNoCartao() {
		return nomeImpressoNoCartao;
	}

	public void setNomeImpressoNoCartao(String nomeImpressoNoCartao) {
		this.nomeImpressoNoCartao = nomeImpressoNoCartao;
	}

	public Integer getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(Integer mesValidade) {
		this.mesValidade = mesValidade;
	}

	public Integer getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(Integer anoValidade) {
		this.anoValidade = anoValidade;
	}

	public Integer getCodigoSeguranca() {
		return codigoSeguranca;
	}

	public void setCodigoSeguranca(Integer codigoSeguranca) {
		this.codigoSeguranca = codigoSeguranca;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "CobrancaDto [numeroCartao=" + numeroCartao + ", nomeImpressoNoCartao=" + nomeImpressoNoCartao
				+ ", mesValidade=" + mesValidade + ", anoValidade=" + anoValidade + ", codigoSeguranca="
				+ codigoSeguranca + ", valor=" + valor + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoValidade, codigoSeguranca, mesValidade, nomeImpressoNoCartao, numeroCartao, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CobrancaDto other = (CobrancaDto) obj;
		return Objects.equals(anoValidade, other.anoValidade) && Objects.equals(codigoSeguranca, other.codigoSeguranca)
				&& Objects.equals(mesValidade, other.mesValidade)
				&& Objects.equals(nomeImpressoNoCartao, other.nomeImpressoNoCartao)
				&& Objects.equals(numeroCartao, other.numeroCartao) && Objects.equals(valor, other.valor);
	}

}
