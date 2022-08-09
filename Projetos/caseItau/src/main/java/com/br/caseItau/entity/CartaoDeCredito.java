package com.br.caseItau.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "cartao_credito")
public class CartaoDeCredito extends Cartao{

    @Column(length = 3)
    private String cvv;

    public CartaoDeCredito(String name, String numero, LocalDate dataValidade, String cvv) {
        super(name, numero, dataValidade);
        this.cvv = cvv;
    }

    public CartaoDeCredito() {

    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CartaoDeCredito{" +
                "cvv='" + cvv + '\'' +
                '}';
    }
}
