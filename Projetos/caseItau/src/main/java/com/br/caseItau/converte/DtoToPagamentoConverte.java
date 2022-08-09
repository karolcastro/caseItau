package com.br.caseItau.converte;


import com.br.caseItau.DTO.PagamentoDTO;
import com.br.caseItau.entity.FormaPagamento;
import com.br.caseItau.entity.Pagamento;
import com.br.caseItau.exception.CartaoNuloException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.ObjectUtils;

public class DtoToPagamentoConverte implements Converter<PagamentoDTO, Pagamento> {

    @Autowired
    private DtoToPagamentoConverte cartaoConverte;

    @Override
    public Pagamento convert(PagamentoDTO pagamentoDTO) {
        Pagamento pagamento = new Pagamento();
        if (FormaPagamento.CARTAO.equals(pagamentoDTO.getFormaPagamento())) {
            if (ObjectUtils.isEmpty(pagamentoDTO.getCartao())) {
                throw new CartaoNuloException();
            }
            //pagamento.setCartao(cartaoConverte.convert(pagamentoDTO.getCartao()));
        }

        pagamento.setForma(pagamentoDTO.getFormaPagamento());
        pagamento.setValor(pagamentoDTO.getValor());
        return pagamento;
    }

}
