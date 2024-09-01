package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.entity.embeddable.ReservaServicioId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservaServicioDTO {

    private ReservaServicioId reservaServicioId;

    private ReservaDTO reservaFk;

    private ServicioDTO servicioFk;

}
