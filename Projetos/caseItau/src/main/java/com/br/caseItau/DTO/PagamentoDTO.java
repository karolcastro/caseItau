package com.br.caseItau.DTO;

import com.br.caseItau.entity.FormaPagamento;

import javax.validation.constraints.NotNull;

public class PagamentoDTO {

    @NotNull
    private Double valor;
    @NotNull
    private FormaPagamento formaPagamento;
    @NotNull
    private CartaoDTO cartao;

    public PagamentoDTO(Double valor, FormaPagamento formaPagamento, CartaoDTO cartao) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.cartao = cartao;
    }

    public PagamentoDTO() {

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public CartaoDTO getCartao() {
        return cartao;
    }

    public void setCartao(CartaoDTO cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "PagamentoDTO{" +
                "valor=" + valor +
                ", formaPagamento=" + formaPagamento +
                ", cartao=" + cartao +
                '}';
    }
}
