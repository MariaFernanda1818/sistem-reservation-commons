package com.gov.sistem.reservation.commons.entity;

import com.gov.sistem.reservation.commons.entity.embeddable.AfiliadoServicioId;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "afiliado_servicio")
public class AfiliadoServicioEntity {

    @EmbeddedId
    private AfiliadoServicioId afiliadoServicioId;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("codigoReservaFk")
    @JoinColumn(name = "afiliado_fk", referencedColumnName = "codigo_afiliado")
    private AfiliadoEntity afiliadoFk;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("codigoServicioFk")
    @JoinColumn(name = "servicio_fk", referencedColumnName = "codigo_servicio")
    private ServicioEntity servicioFk;

}
