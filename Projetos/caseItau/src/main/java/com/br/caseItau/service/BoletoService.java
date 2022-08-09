package com.br.caseItau.service;

import com.br.caseItau.entity.Boleto;

public interface BoletoService {

    public Boleto salvarBoleto(Boleto boleto);

    public Boleto gerarBoleto();

}
