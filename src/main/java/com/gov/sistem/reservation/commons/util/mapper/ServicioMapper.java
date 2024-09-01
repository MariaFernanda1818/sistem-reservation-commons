package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.ServicioDTO;
import com.gov.sistem.reservation.commons.entity.ServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServicioMapper {

    ServicioEntity dtoToEntity(ServicioDTO servicioDTO);

    ServicioDTO entityToDto(ServicioEntity servicioEntity);

    List<ServicioEntity> listDtoToListEntity(List<ServicioDTO> servicioDTOList);

    List<ServicioDTO> listEntityToListDto(List<ServicioEntity> servicioEntityList);

}
