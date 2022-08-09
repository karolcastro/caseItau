package com.br.caseItau.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;

public class CartaoDTO {

    @NotEmpty
    private String name;

    @NotEmpty
    private String number;

    @NotNull
    private LocalDate validateDate;

    @NotEmpty
    private String cvv;

    public CartaoDTO(String name, String number, LocalDate validateDate, String cvv) {
        this.name = name;
        this.number = number;
        this.validateDate = validateDate;
        this.cvv = cvv;
    }

    public CartaoDTO(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getValidateDate() {
        return validateDate;
    }

    public void setValidateDate(LocalDate validateDate) {
        this.validateDate = validateDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CartaoDTO{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", validateDate=" + validateDate +
                ", cvv='" + cvv + '\'' +
                '}';
    }
}
