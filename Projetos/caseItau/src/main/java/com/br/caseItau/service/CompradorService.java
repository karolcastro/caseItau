package com.br.caseItau.service;

import com.br.caseItau.entity.Comprador;

public interface CompradorService {

    public Comprador buscarComprador(Comprador comprador);

    public Comprador buscarCompradorCPF(String cpf);

    public Comprador salvarComprador(Comprador comprador);
}
