package com.gov.sistem.reservation.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "reserva")
public class ReservaEntity {

    @Id
    @Column(name = "codigo_reserva")
    private String codigoReserva;

    @Column(name = "fecha_fin_reserva")
    private LocalDate fechaFinReserva;

    @Column(name = "fecha_creacion_reserva")
    private LocalDate fechaCreacionReserva;

    @Column(name = "fecha_inicio_reserva")
    private LocalDate fechaInicioReserva;

    @Column(name = "costo_total_reserva")
    private Double costoTotalReserva;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_reserva_fk", referencedColumnName = "id_estado")
    private EstadoEntity estadoReservaFk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_afiliado_reserva_fk", referencedColumnName = "id_tipo_afiliado")
    private TipoAfiliadoEntity tipoAfiliadoReservaFk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "afiliado_reserva_fk", referencedColumnName = "codigo_afiliado")
    private AfiliadoEntity afiliadoReservaFk;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_reserva_fk", referencedColumnName = "codigo_cliente")
    private ClienteEntity clienteReservaFk;


}
