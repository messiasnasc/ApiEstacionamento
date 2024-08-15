package com.test.estacionamentotest.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.estacionamentotest.model.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

}

