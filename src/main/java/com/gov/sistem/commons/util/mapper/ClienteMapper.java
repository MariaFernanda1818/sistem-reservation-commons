package com.gov.sistem.commons.util.mapper;

import com.gov.sistem.commons.dto.ClienteDTO;
import com.gov.sistem.commons.entity.ClienteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity entityToDto(ClienteDTO clienteDTO);

    ClienteDTO dtoToEntity(ClienteEntity clienteEntity);

    List<ClienteEntity> listEntityToListDto(List<ClienteDTO> clienteDTOList);

    List<ClienteDTO> listDtoToEntity(List<ClienteEntity> clienteEntityList);

}
