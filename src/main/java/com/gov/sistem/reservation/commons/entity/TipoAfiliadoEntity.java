package com.gov.sistem.reservation.commons.entity;

import com.gov.sistem.reservation.commons.util.enums.TipoAfiliadoEnum;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tipo_afiliado")
public class TipoAfiliadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo_afiliado")
    private Long idTipoAfiliado;

    @Column(name = "nombre_tipo_afiliado")
    @Enumerated(EnumType.STRING)
    private TipoAfiliadoEnum nombreTipoAfiliado;
}
