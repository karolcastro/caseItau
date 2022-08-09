package com.br.caseItau.controller;

import com.br.caseItau.DTO.PagamentoDTO;
import com.br.caseItau.DTO.RespostaPagamentoDTO;
import com.br.caseItau.DTO.SolicitacaoPagamentoDTO;
import com.br.caseItau.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/pagamento")
public class Pagamento {
    @Autowired
    private PagamentoService pagamentoService;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<RespostaPagamentoDTO> efetuarPagamento(
            @Valid @RequestBody SolicitacaoPagamentoDTO solicitacaoPagamentoDTO) {
        return new ResponseEntity<RespostaPagamentoDTO>((MultiValueMap<String, String>) pagamentoService.realizarPagamento(solicitacaoPagamentoDTO), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Pagamento> buscarPagamento(@PathVariable(value = "id") Long id) {
        Pagamento pagamento = pagamentoService.buscarPagamento(id);
        if(ObjectUtils.isEmpty(pagamento)) {
            return new ResponseEntity<Pagamento>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Pagamento>(pagamento, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> removerPagamento(@PathVariable(value = "id") Long idPagamento) {
        if (!pagamentoService.removerPagamento(idPagamento)) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
