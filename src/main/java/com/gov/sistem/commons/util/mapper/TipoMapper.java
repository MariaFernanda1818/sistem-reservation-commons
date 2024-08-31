package com.gov.sistem.commons.util.mapper;


import com.gov.sistem.commons.dto.TipoDTO;
import com.gov.sistem.commons.entity.TipoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoMapper {

    TipoEntity entityToDto(TipoDTO tipoDTO);

    TipoDTO dtoToEntity(TipoEntity tipoEntity);

    List<TipoEntity> listEntityToListDto(List<TipoDTO> tipoDTOList);

    List<TipoDTO> listDtoToEntity(List<TipoEntity> tipoEntityList);

}
