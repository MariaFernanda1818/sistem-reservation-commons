package com.gov.sistem.reservation.commons.util.enums;

import lombok.Getter;

@Getter
public enum EstadoEnum {

    ACTIVO("ACTIVO"),
    CANCELADO("CANCELADO"),
    INACTIVO("INACTIVO"),
    COMPLETADO("COMPLETADO");

    private final String descripcion;

    EstadoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

}
