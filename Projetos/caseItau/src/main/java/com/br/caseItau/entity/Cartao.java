package com.br.caseItau.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCartao;
    private String name;
    private String numero;
    private LocalDate dataValidade;
    @Enumerated(EnumType.STRING)
    private TipoBandeira tipoBandeira;

    public Cartao(String name, String numero, LocalDate dataValidade) {
        this.name = name;
        this.numero = numero;
        this.dataValidade = dataValidade;
    }

    public Cartao() {

    }

    public Long getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(Long idCartao) {
        this.idCartao = idCartao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public TipoBandeira getTipoBandeira() {
        return tipoBandeira;
    }

    public void setTipoBandeira(TipoBandeira tipoBandeira) {
        this.tipoBandeira = tipoBandeira;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                ", name='" + name + '\'' +
                ", numero='" + numero + '\'' +
                ", dataValidade=" + dataValidade +
                '}';
    }
}
