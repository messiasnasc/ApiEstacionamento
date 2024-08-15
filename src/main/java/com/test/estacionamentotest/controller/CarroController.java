package com.test.estacionamentotest.controller;

import java.util.List;
import java.util.Optional;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.config.RepositoryNameSpaceHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.test.estacionamentotest.model.Carro;
import com.test.estacionamentotest.service.CarroService;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
	@Autowired
	private CarroService carroService;
	@Operation(description = "Busca todos os carros na lista")
	@GetMapping
	public List<Carro>getAllCarros(){
		return carroService.getallCarros();
	}


	@Operation(description = "Adicionar Carros")
	@PostMapping("/adicionarEntrada")
	public Carro saveCarro(@RequestBody Carro carro) {
		return carroService.saveCarro(carro);
	}

	@Operation(description = "listar os carros pelo id")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Retorna o carro"),
			@ApiResponse(responseCode = "400", description = " Nao existe o carro")})
	@PostMapping("listarCarro/{id}")
	public ResponseEntity<Carro>listarCarroId(@PathVariable Long id){
		Optional<Carro> carro = carroService.getCarroById(id);
		if (carro.isPresent()) {
			return ResponseEntity.ok(carro.get());
		}else {
			return ResponseEntity.notFound().build();
		}

	}


	@Operation(description = "Remove um carro pelo id")
	@DeleteMapping("removerSaida/{id}")
	public ResponseEntity<Void>removeCarro(@PathVariable Long id){
		carroService.removeCarro(id);
		return ResponseEntity.noContent().build();
	}
	}



