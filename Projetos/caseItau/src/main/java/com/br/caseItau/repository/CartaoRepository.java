package com.br.caseItau.repository;

import com.br.caseItau.entity.CartaoDeCredito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartaoRepository extends JpaRepository<CartaoDeCredito, Long> {

}
