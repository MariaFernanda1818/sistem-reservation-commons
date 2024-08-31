package com.gov.sistem.commons.util.mapper;

import com.gov.sistem.commons.dto.ClienteDTO;
import com.gov.sistem.commons.dto.ReservaDTO;
import com.gov.sistem.commons.entity.ClienteEntity;
import com.gov.sistem.commons.entity.ReservaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

    ReservaEntity entityToDto(ReservaDTO reservaDTO);

    ReservaDTO dtoToEntity(ReservaEntity reservaEntity);

    List<ReservaEntity> listEntityToListDto(List<ReservaDTO> reservaDTOList);

    List<ReservaDTO> listDtoToEntity(List<ReservaEntity> reservaEntityList);

}
