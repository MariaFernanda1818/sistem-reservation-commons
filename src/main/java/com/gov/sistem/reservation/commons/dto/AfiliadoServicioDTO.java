package com.gov.sistem.reservation.commons.dto;

import com.gov.sistem.reservation.commons.entity.AfiliadoEntity;
import com.gov.sistem.reservation.commons.entity.ServicioEntity;
import com.gov.sistem.reservation.commons.entity.embeddable.AfiliadoServicioId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AfiliadoServicioDTO {

    private AfiliadoServicioId afiliadoServicioId;

    private AfiliadoDTO afiliadoDTO;

    private ServicioDTO servicioDTO;

}
