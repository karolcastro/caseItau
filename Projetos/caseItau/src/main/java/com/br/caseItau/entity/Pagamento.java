package com.br.caseItau.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pagamento")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPagamento;
    private Double valor;
    private LocalDate dataCadastro;
    @Enumerated(EnumType.STRING)
    private FormaPagamento forma;
    @OneToOne
    @JoinColumn(name = "idCartao")
    private Cartao cartao;
    @OneToOne
    @JoinColumn(name = "idBoleto")
    private Boleto boleto;
    @OneToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;
    @OneToOne
    @JoinColumn(name = "idComprador")
    private Comprador comprador;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Pagamento(Double valor, LocalDate dataCadastro, FormaPagamento forma, Cartao cartao, Boleto boleto,
                     Cliente cliente, Comprador comprador, Status status) {
        super();
        this.valor = valor;
        this.dataCadastro = dataCadastro;
        this.forma = forma;
        this.cartao = cartao;
        this.boleto = boleto;
        this.cliente = cliente;
        this.comprador = comprador;
        this.status = status;
    }

    public Pagamento() {

    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public FormaPagamento getForma() {
        return forma;
    }

    public void setForma(FormaPagamento forma) {
        this.forma = forma;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "idPagamento=" + idPagamento +
                ", valor=" + valor +
                ", dataCadastro=" + dataCadastro +
                ", forma=" + forma +
                ", cartao=" + cartao +
                ", boleto=" + boleto +
                ", cliente=" + cliente +
                ", comprador=" + comprador +
                ", status=" + status +
                '}';
    }
}
