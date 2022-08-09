package com.br.caseItau.converte;

import com.br.caseItau.DTO.CompradorDTO;
import com.br.caseItau.entity.Comprador;
import org.springframework.core.convert.converter.Converter;

public class DtoToCompradorConverte implements Converter<CompradorDTO, Comprador> {

    @Override
    public Comprador convert(CompradorDTO compradorDTO) {
        Comprador comprador = new Comprador();
        comprador.setCpf(compradorDTO.getCpf());
        comprador.setEmail(comprador.getEmail());
        comprador.setNome(comprador.getNome());

        return comprador;
    }
}
