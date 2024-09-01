package com.gov.sistem.reservation.commons.entity;

import com.gov.sistem.reservation.commons.util.enums.TipoServicioEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_servicio")
public class TipoServicioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_servicio")
    private Long idTipoServicio;

    @Column(name = "nombre_tipo_servicio")
    @Enumerated(EnumType.STRING)
    private TipoServicioEnum nombreTipoServicio;

}
