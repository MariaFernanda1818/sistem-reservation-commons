package com.gov.sistem.reservation.commons.util.mapper;

import com.gov.sistem.reservation.commons.dto.ClienteDTO;
import com.gov.sistem.reservation.commons.entity.ClienteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteEntity dtoToEntity(ClienteDTO clienteDTO);

    ClienteDTO entityToDto(ClienteEntity clienteEntity);

    List<ClienteEntity> listDtoToListEntity(List<ClienteDTO> clienteDTOList);

    List<ClienteDTO> listEntityToListDto(List<ClienteEntity> clienteEntityList);

}
