package com.br.caseItau.service;

import com.br.caseItau.DTO.PagamentoDTO;
import com.br.caseItau.DTO.SolicitacaoPagamentoDTO;
import com.br.caseItau.controller.Pagamento;

public interface PagamentoService {

    public PagamentoDTO realizarPagamento(SolicitacaoPagamentoDTO solicitacaoPagamentoDTO);

    public Pagamento buscarPagamento(Long idPagamento);

    public String esconderCPF(String cpf);

    public boolean removerPagamento(Long idPagamento);
}
