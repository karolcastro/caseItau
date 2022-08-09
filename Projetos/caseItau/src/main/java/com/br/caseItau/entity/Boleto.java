package com.br.caseItau.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "boleto")
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idBoleto;
    private Integer numeroBoleto;
    private LocalDate dataDeVencimento;

    public Integer getNumeroBoleto() {
        return numeroBoleto;
    }

    public void setNumeroBoleto() {
        this.numeroBoleto = numeroBoleto;
    }

    public LocalDate getDataVencimento() {
        return dataDeVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataDeVencimento = dataVencimento;
    }

    public Long getIdBoleto() {
        return idBoleto;
    }

    @Override
    public String toString() {
        return "Boleto [idBoleto=" + idBoleto + ", numeroBoleto=" + numeroBoleto + ", dataVencimento=" + dataDeVencimento
                + "]";
    }


}
