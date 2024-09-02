package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.entity.EstadoEntity;
import com.gov.sistem.reservation.commons.util.enums.EstadoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AfiliadoDTO {

    private String codigoAfiliado;

    private EstadoDTO estadoReservaFk;

    private String nombreAfiliado;

    private TipoAfiliadoDTO tipoAfiliadoFk;

}
