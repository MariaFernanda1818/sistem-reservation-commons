package com.gov.sistem.commons.dto;

import com.gov.sistem.commons.util.enums.TipoEnum;
import lombok.Data;

@Data
public class TipoDTO {

    private Long idTipo;

    private TipoEnum nombreTipo;

}
