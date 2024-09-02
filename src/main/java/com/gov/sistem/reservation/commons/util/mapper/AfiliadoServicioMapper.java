package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.AfiliadoDTO;
import com.gov.sistem.reservation.commons.dto.AfiliadoServicioDTO;
import com.gov.sistem.reservation.commons.entity.AfiliadoEntity;
import com.gov.sistem.reservation.commons.entity.AfiliadoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AfiliadoServicioMapper {

    AfiliadoServicioEntity dtoToEntity(AfiliadoServicioDTO afiliadoServicioDTO);

    AfiliadoServicioDTO entityToDto(AfiliadoServicioEntity afiliadoServicioEntity);

    List<AfiliadoServicioEntity> listDtoToListEntity(List<AfiliadoServicioDTO> afiliadoServicioDTOList);

    List<AfiliadoServicioDTO> listEntityToListDto(List<AfiliadoServicioEntity> afiliadoServicioEntityList);


}
