package com.br.caseItau.converte;

import com.br.caseItau.DTO.ClienteDTO;
import com.br.caseItau.entity.Cliente;
import com.br.caseItau.exception.ClienteNaoEncontradoException;
import com.br.caseItau.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.ObjectUtils;

public class DtoToClienteConverte implements Converter<ClienteDTO, Cliente> {

    @Autowired
    private ClienteService clienteService;

    @Override
    public Cliente convert(ClienteDTO clienteDTO) {
        Cliente cliente = clienteService.buscarCliente(clienteDTO);
        if (!ObjectUtils.isEmpty(cliente)) {
            return  cliente;
        } else {
            throw new ClienteNaoEncontradoException(clienteDTO.getIdCliente());
        }
    }
}
