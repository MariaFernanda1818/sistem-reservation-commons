package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.ReservaServicioDTO;
import com.gov.sistem.reservation.commons.entity.ReservaServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaServicioMapper {

    ReservaServicioEntity dtoToEntity(ReservaServicioDTO reservaServicioDTO);

    ReservaServicioDTO entityToDto(ReservaServicioEntity reservaServicioEntity);

    List<ReservaServicioEntity> listDtoToListEntity(List<ReservaServicioDTO> reservaServicioDTOList);

    List<ReservaServicioDTO> listEntityToListDto(List<ReservaServicioEntity> reservaServicioEntityList);

}
