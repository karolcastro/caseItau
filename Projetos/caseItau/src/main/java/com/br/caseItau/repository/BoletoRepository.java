package com.br.caseItau.repository;

import com.br.caseItau.entity.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoletoRepository extends JpaRepository<Boleto, Long> {

}
