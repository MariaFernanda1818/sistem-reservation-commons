package com.gov.sistem.reservation.commons.entity;

import com.gov.sistem.reservation.commons.util.enums.EstadoEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "estado")
@Data
public class EstadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado")
    private Long idEstado;

    @Column(name = "nombre_estado")
    @Enumerated(EnumType.STRING)
    private EstadoEnum nombreEstado;

}
