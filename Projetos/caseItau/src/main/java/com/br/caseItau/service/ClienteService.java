package com.br.caseItau.service;

import com.br.caseItau.DTO.ClienteDTO;
import com.br.caseItau.entity.Cliente;

public interface ClienteService {

    public Cliente buscarCliente(ClienteDTO clienteDTO);
}
