package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.EstadoDTO;
import com.gov.sistem.reservation.commons.entity.EstadoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoMapper {

    EstadoEntity dtoToEntity(EstadoDTO estadoDTO);

    EstadoDTO entityToDto(EstadoEntity estadoEntity);

    List<EstadoEntity> listDtoToListEntity(List<EstadoDTO> estadoDTOList);

    List<EstadoDTO> listEntityToListDto(List<EstadoEntity> estadoEntityList);

}
