package com.test.estacionamentotest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.estacionamentotest.model.Carro;
import com.test.estacionamentotest.repositoriy.CarroRepository;


@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepository;

	public List<Carro> getallCarros() {
		return carroRepository.findAll();
	}

	public Carro saveCarro(Carro carro) {
		return carroRepository.save(carro);
	}

	public void removeCarro(Long id) {
		carroRepository.deleteById(id);
	}

	public Optional<Carro> getCarroById(Long id) {
		return carroRepository.findById(id);
	}
}