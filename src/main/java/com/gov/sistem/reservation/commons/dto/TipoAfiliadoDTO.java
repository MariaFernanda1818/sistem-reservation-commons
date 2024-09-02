package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.util.enums.TipoAfiliadoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class  TipoAfiliadoDTO {

    private Long idTipoAfiliado;

    private TipoAfiliadoEnum nombreTipoAfiliado;

}
