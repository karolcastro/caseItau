package com.br.caseItau.DTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class CompradorDTO {

    @NotEmpty
    private String name;

    @Email
    private String email;

    @NotEmpty
    private String cpf;

    public CompradorDTO(String name, String email, String cpf) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
    }

    public CompradorDTO(){

    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "CompradorDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
