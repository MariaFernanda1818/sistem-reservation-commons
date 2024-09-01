package com.gov.sistem.reservation.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteDTO {

    private String codigoCliente;

    private String correoCliente;

    private String nombreCliente;

    private String apellidoCliente;

    private String contrasenaCliente;

}
