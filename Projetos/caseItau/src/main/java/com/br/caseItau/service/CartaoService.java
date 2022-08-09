package com.br.caseItau.service;

import com.br.caseItau.entity.CartaoDeCredito;
import com.br.caseItau.entity.TipoBandeira;

import java.time.LocalDate;

public interface CartaoService {

    public boolean validarCartao(CartaoDeCredito cartaoDeCredito);

    public boolean validarNumeroCartao(String numCartao);

    public boolean validarCvvCartao(String cvv);

    public boolean validarDataValidade(LocalDate dataValidade);

    public TipoBandeira identificadorBandeira(String numCartao);

    public CartaoDeCredito salvarCartao(CartaoDeCredito cartaoCredito);

}
