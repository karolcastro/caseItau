package com.br.caseItau.exception;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Message<T> {

    private String mensagem;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T corpo;

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public T getCorpo() {
        return corpo;
    }

    public void setCorpo(T corpo) {
        this.corpo = corpo;
    }

    public Message(String mensagem, T corpo) {
        super();
        this.mensagem = mensagem;
        this.corpo = corpo;
    }

    public Message() {
        super();
    }

}
