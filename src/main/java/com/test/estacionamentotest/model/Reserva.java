package com.test.estacionamentotest.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reserva {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long carroId;
    private Long vagaId;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getCarroId() {
		return carroId;
	}
	public void setCarroId(Long carroId) {
		this.carroId = carroId;
	}
	public Long getVagaId() {
		return vagaId;
	}
	public void setVagaId(Long vagaId) {
		this.vagaId = vagaId;
	}
	public LocalDateTime getDataHoraEntrada() {
		return dataHoraEntrada;
	}
	public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
		this.dataHoraEntrada = dataHoraEntrada;
	}
	public LocalDateTime getDataHoraSaida() {
		return dataHoraSaida;
	}
	public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

    
}
