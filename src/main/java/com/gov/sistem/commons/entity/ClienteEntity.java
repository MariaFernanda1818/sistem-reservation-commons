package com.gov.sistem.commons.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @Column(name = "codigo_cliente")
    private String codigoCliente;

    @Column(name = "correo_cliente")
    private String correoCliente;

    @Column(name = "nombre_cliente")
    private String nombreCliente;

    @Column(name = "apellido_cliente")
    private String apellidoCliente;

    @Column(name = "contrasena_cliente")
    private String contrasenaCliente;

}
