package com.test.estacionamentotest.repositoriy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.estacionamentotest.model.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {

}
