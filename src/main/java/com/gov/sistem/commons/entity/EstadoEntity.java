package com.gov.sistem.commons.entity;

import com.gov.sistem.commons.util.enums.EstadoEnum;
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
    private EstadoEnum nombreEstado;

}
