package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.util.enums.TipoServicioEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TipoServicioDTO {

    private Long idTipoServicio;

    private TipoServicioEnum nombreTipoServicio;

}
