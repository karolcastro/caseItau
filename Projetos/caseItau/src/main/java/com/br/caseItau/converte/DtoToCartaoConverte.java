package com.br.caseItau.converte;

import com.br.caseItau.DTO.CartaoDTO;
import com.br.caseItau.entity.CartaoDeCredito;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class DtoToCartaoConverte implements Converter<CartaoDTO, CartaoDeCredito> {

    @Override
    public CartaoDeCredito convert(CartaoDTO cartaoDTO) {
        CartaoDeCredito cartao = new CartaoDeCredito();
        cartao.setDataValidade(cartaoDTO.getValidateDate());
        cartao.setName(cartaoDTO.getName());
        cartao.setNumero(cartaoDTO.getNumber());
        cartao.setCvv(cartaoDTO.getCvv());
        return cartao;

    }

}

