package com.gov.sistem.commons.dto;

import com.gov.sistem.commons.util.enums.EstadoEnum;
import lombok.Data;

@Data
public class EstadoDTO {

    private Long idEstado;

    private EstadoEnum nombreEstado;

}
