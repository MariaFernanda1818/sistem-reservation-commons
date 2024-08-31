package com.gov.sistem.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String codigoCliente;

    private String correoCliente;

    private String nombreCliente;

    private String apellidoCliente;

    private String contrasenaCliente;

}
