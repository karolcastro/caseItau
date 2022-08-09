package com.br.caseItau.repository;

import com.br.caseItau.entity.Comprador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompradorRepository extends JpaRepository<Comprador, Long> {

    public Comprador findByCpf(String cpf);

}
