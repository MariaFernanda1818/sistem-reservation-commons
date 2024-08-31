package com.gov.sistem.commons.dto;

import com.gov.sistem.commons.entity.embeddable.ReservaServicioId;
import lombok.Data;

@Data
public class ReservaServicioDTO {

    private ReservaServicioId reservaServicioId;

    private ReservaDTO reservaFk;

    private ServicioDTO servicioFk;

}
