package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.AfiliadoDTO;
import com.gov.sistem.reservation.commons.entity.AfiliadoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AfiliadoMapper {

    AfiliadoEntity dtoToEntity(AfiliadoDTO afiliadoDTO);

    AfiliadoDTO entityToDto(AfiliadoEntity afiliadoEntity);

    List<AfiliadoEntity> listDtoToListEntity(List<AfiliadoDTO> afiliadoDTOList);

    List<AfiliadoDTO> listEntityToListDto(List<AfiliadoEntity> afiliadoEntityList);


}
