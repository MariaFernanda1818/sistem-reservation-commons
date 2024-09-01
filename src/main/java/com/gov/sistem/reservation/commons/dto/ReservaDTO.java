package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.entity.AfiliadoEntity;
import com.gov.sistem.reservation.commons.entity.ClienteEntity;
import com.gov.sistem.reservation.commons.entity.EstadoEntity;
import com.gov.sistem.reservation.commons.entity.TipoAfiliadoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReservaDTO {

    private String codigoReserva;

    private LocalDate fechaFinReserva;

    private LocalDate fechaCreacionReserva;

    private LocalDate fechaInicioReserva;

    private Double costoTotalReserva;

    private EstadoDTO estadoReservaFk;

    private TipoAfiliadoDTO tipoAfiliadoReservaFk;

    private AfiliadoDTO afiliadoReservaFk;

    private ClienteDTO clienteReservaFk;

}
