package com.gov.sistem.commons.dto;

import com.gov.sistem.commons.entity.TipoEntity;
import lombok.Data;

@Data
public class ServicioDTO {

    private String codigoServicio;

    private String nombreServicio;

    private Double costoServicio;

    private TipoDTO tipoServicioFk;

}
