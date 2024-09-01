package com.gov.sistem.reservation.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServicioDTO {

    private String codigoServicio;

    private String nombreServicio;

    private Double costoServicio;

    private TipoServicioDTO tipoServicioFk;

}
