package com.gov.sistem.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "servicio")
public class ServicioEntity {

    @Id
    @Column(name = "codigo_servicio")
    private String codigoServicio;

    @Column(name = "nombre_servicio")
    private String nombreServicio;

    @Column(name = "costo_servicio")
    private Double costoServicio;

    @ManyToOne
    @JoinColumn(name = "tipo_servicio_fk", referencedColumnName = "id_tipo")
    private TipoEntity tipoServicioFk;

}

