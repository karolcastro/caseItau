package com.br.caseItau.exception;

import com.br.caseItau.entity.CartaoDeCredito;

public class CartaoInvalidoException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private CartaoDeCredito cartaoCredito;

    public CartaoInvalidoException(CartaoDeCredito cartaoCredito) {
        super();
        this.cartaoCredito = cartaoCredito;
    }

    public CartaoDeCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoDeCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }
}
