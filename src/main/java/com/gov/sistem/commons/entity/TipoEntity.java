package com.gov.sistem.commons.entity;

import com.gov.sistem.commons.util.enums.TipoEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo")
public class TipoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;

    @Column(name = "nombre_tipo")
    private TipoEnum nombreTipo;

}
