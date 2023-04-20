package br.com.cotiinformatica.commons.pedidos.dto;

import java.util.Objects;

public class ClienteDto {

	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private EnderecoDto endereco;

	public ClienteDto() {
		// TODO Auto-generated constructor stub
	}

	public ClienteDto(String nome, String cpf, String email, String telefone, EnderecoDto endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public EnderecoDto getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDto endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "ClienteDto [nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", telefone=" + telefone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteDto other = (ClienteDto) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email) && Objects.equals(nome, other.nome)
				&& Objects.equals(telefone, other.telefone);
	}

}
