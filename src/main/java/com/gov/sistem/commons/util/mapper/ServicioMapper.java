package com.gov.sistem.commons.util.mapper;

import com.gov.sistem.commons.dto.ServicioDTO;
import com.gov.sistem.commons.dto.TipoDTO;
import com.gov.sistem.commons.entity.ServicioEntity;
import com.gov.sistem.commons.entity.TipoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServicioMapper {

    ServicioEntity entityToDto(ServicioDTO servicioDTO);

    ServicioDTO dtoToEntity(ServicioEntity servicioEntity);

    List<ServicioEntity> listEntityToListDto(List<ServicioDTO> servicioDTOList);

    List<ServicioDTO> listDtoToEntity(List<ServicioEntity> servicioEntityList);

}
