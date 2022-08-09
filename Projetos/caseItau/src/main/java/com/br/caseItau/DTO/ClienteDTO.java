package com.br.caseItau.DTO;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ClienteDTO {
    @NotNull
    private Long idCliente;

    public ClienteDTO() {

    }

    public ClienteDTO(Long idCliente) {
        super();
        this.idCliente = idCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +
                "idCliente=" + idCliente +
                '}';
    }
}
