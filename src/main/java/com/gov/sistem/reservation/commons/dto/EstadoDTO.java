package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.util.enums.EstadoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstadoDTO {

    private Long idEstado;

    private EstadoEnum nombreEstado;

}
