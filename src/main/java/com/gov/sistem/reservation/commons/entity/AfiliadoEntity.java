package com.gov.sistem.reservation.commons.entity;

import com.gov.sistem.reservation.commons.util.enums.EstadoEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "afiliado")
public class AfiliadoEntity {

    @Id
    @Column(name = "codigo_afiliado")
    private String codigoAfiliado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estado_afiliado_fk", referencedColumnName = "id_estado")
    private EstadoEntity estadoReservaFk;

    @Column(name = "nombre_afiliado")
    private String nombreAfiliado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipo_afiliado_fk", referencedColumnName = "id_tipo_afiliado")
    private TipoAfiliadoEntity tipoAfiliadoFk;
}
