package br.com.cotiinformatica.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.cotiinformatica.commons.pedidos.dto.PedidoDto;
import br.com.cotiinformatica.dtos.PedidoResponseDto;
import br.com.cotiinformatica.producers.PagamentoProducer;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/pedidos")
@Slf4j
public class PedidosController {

	@Autowired
	private PagamentoProducer pagamentoProducer;

	@Autowired
	private ObjectMapper objectMapper;

	@PostMapping
	public ResponseEntity<PedidoResponseDto> post(@RequestBody PedidoDto request) {

		String message = null;

		try {
			message = objectMapper.writeValueAsString(request);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		pagamentoProducer.send(message);
		log.info(message);

		PedidoResponseDto response = new PedidoResponseDto();
		response.setMensagem("Pedido realizado com sucesso.");
		response.setStatus("created");
		response.setNumeroPedido(UUID.randomUUID().toString());

		return ResponseEntity.status(201).body(response);
	}

}
