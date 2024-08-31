package com.gov.sistem.commons.util.mapper;

import com.gov.sistem.commons.dto.EstadoDTO;
import com.gov.sistem.commons.entity.EstadoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoMapper {

    EstadoEntity entityToDto(EstadoDTO estadoDTO);

    EstadoDTO dtoToEntity(EstadoEntity estadoEntity);

    List<EstadoEntity> listEntityToListDto(List<EstadoDTO> estadoDTOList);

    List<EstadoDTO> listDtoToEntity(List<EstadoEntity> estadoEntityList);

}
