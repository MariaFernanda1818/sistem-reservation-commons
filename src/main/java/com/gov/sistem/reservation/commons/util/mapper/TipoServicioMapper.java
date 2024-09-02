package com.gov.sistem.reservation.commons.util.mapper;


import com.gov.sistem.reservation.commons.dto.TipoServicioDTO;
import com.gov.sistem.reservation.commons.entity.TipoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoServicioMapper {

    TipoServicioEntity dtoToEntity(TipoServicioDTO tipoServicioDTO);

    TipoServicioDTO entityToDto(TipoServicioEntity tipoServicioEntity);

    List<TipoServicioEntity> listDtoToListEntity(List<TipoServicioDTO> tipoServicioDTOList);

    List<TipoServicioDTO> listEntityToListDto(List<TipoServicioEntity> tipoServicioEntityList);

}
