package com.gov.sistem.reservation.commons.entity;

import com.gov.sistem.reservation.commons.entity.embeddable.ReservaServicioId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "reserva_servicio")
@Entity
public class ReservaServicioEntity {

    @EmbeddedId
    private ReservaServicioId reservaServicioId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("codigoReservaFk")
    @JoinColumn(name = "reserva_fk", referencedColumnName = "codigo_reserva")
    private ReservaEntity reservaFk;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("codigoServicioFk")
    @JoinColumn(name = "servicio_fk", referencedColumnName = "codigo_servicio")
    private ServicioEntity servicioFk;


}
