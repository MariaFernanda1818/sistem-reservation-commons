package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.TipoAfiliadoDTO;
import com.gov.sistem.reservation.commons.entity.TipoAfiliadoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoAfiliadoMapper {

    TipoAfiliadoEntity dtoToEntity(TipoAfiliadoDTO tipoAfiliadoDTO);

    TipoAfiliadoDTO entityToDto(TipoAfiliadoEntity tipoAfiliadoEntity);

    List<TipoAfiliadoEntity> listDtoToListEntity(List<TipoAfiliadoDTO> tipoAfiliadoDTOList);

    List<TipoAfiliadoDTO> listEntityToListDto(List<TipoAfiliadoEntity> tipoAfiliadoEntityList);


}
