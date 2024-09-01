package com.gov.sistem.reservation.commons.util.enums;

import lombok.Getter;

@Getter
public enum TipoServicioEnum {

    SPA("SPA"),
    CUARTOS("CUARTOS"),
    COMIDAS("COMIDAS");

    private final String descripcion;

    TipoServicioEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
