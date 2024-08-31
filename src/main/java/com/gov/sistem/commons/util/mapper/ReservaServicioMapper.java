package com.gov.sistem.commons.util.mapper;

import com.gov.sistem.commons.dto.ReservaDTO;
import com.gov.sistem.commons.dto.ReservaServicioDTO;
import com.gov.sistem.commons.entity.ReservaEntity;
import com.gov.sistem.commons.entity.ReservaServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaServicioMapper {

    ReservaServicioEntity entityToDto(ReservaServicioDTO reservaServicioDTO);

    ReservaServicioDTO dtoToEntity(ReservaServicioEntity reservaServicioEntity);

    List<ReservaServicioEntity> listEntityToListDto(List<ReservaServicioDTO> reservaServicioDTOList);

    List<ReservaServicioDTO> listDtoToEntity(List<ReservaServicioEntity> reservaServicioEntityList);

}
