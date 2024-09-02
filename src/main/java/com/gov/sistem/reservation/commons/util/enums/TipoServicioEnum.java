package com.gov.sistem.reservation.commons.util.enums;

import lombok.Getter;

@Getter
public enum TipoServicioEnum {

    SPA("SPA"),
    CUARTO("CUARTO"),
    LICOR("LICOR"),
    SHOWS("SHOWS"),
    COMIDAS("COMIDAS"),
    BEBIDAS("BEBIDAS");

    private final String descripcion;

    TipoServicioEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
