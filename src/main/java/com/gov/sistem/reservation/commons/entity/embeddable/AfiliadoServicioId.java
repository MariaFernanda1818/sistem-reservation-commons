package com.gov.sistem.reservation.commons.entity.embeddable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AfiliadoServicioId {

    private String codigoAfiliado;

    private  String codigoServicio;

}
