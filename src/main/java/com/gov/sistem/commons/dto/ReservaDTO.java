package com.gov.sistem.commons.dto;

import com.gov.sistem.commons.entity.ClienteEntity;
import com.gov.sistem.commons.entity.EstadoEntity;
import com.gov.sistem.commons.entity.TipoEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReservaDTO {

    private String codigoReserva;

    private LocalDate fechaFinReserva;

    private LocalDate fechaCreacionReserva;

    private LocalDate fechaInicioReserva;

    private Double costoTotalReserva;

    private EstadoDTO estadoReservaFk;

    private TipoDTO tipoReservaFk;

    private ClienteDTO clienteReservaFk;

}
