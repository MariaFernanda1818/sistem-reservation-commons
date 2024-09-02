package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.ReservaDTO;
import com.gov.sistem.reservation.commons.entity.ReservaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

    ReservaEntity dtoToEntity(ReservaDTO reservaDTO);

    ReservaDTO entityToDto(ReservaEntity reservaEntity);

    List<ReservaEntity> listDtoToListEntity(List<ReservaDTO> reservaDTOList);

    List<ReservaDTO> listEntityToListDto(List<ReservaEntity> reservaEntityList);

}
