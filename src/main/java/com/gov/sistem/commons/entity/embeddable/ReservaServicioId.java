package com.gov.sistem.commons.entity.embeddable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class ReservaServicioId {

    private String codigoReservaFk;

    private String codigoServicioFk;

}
