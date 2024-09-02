package com.gov.sistem.reservation.commons.util.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gov.sistem.reservation.commons.util.enums.InicialesCodEnum;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

public class Utilidades {

    public static <T> Optional<T> checkType(Object obj, Class<T> clazz) {
        if (Objects.isNull(obj)) {
            return Optional.empty();
        }

        try {
            return switch (clazz.getSimpleName()) {
                case "Long" -> Optional.of(clazz.cast(Long.valueOf(obj.toString())));
                case "String" -> Optional.of(clazz.cast(String.valueOf(obj)));
                case "Integer" -> Optional.of(clazz.cast(Integer.valueOf(obj.toString())));
                case "Double" -> Optional.of(clazz.cast(Double.valueOf(obj.toString())));
                case "LocalDate" -> Optional.of(clazz.cast(LocalDate.parse(obj.toString())));
                case "BigDecimal" -> Optional.of(clazz.cast(BigDecimal.valueOf(Double.parseDouble(obj.toString()))));
                default -> Optional.empty();
            };
        } catch (Exception e) {
            throw new IllegalArgumentException("Error de conversión de tipos: " + e.getMessage(), e);
        }
    }
    public static String generarCodigo(InicialesCodEnum inicial){
        return new StringBuilder().append(inicial.getDescripcion()).append(1000 + new Random().nextInt(9000)).toString();
    }

    /**
     * Convierte un archivo JSON a un objeto DTO.
     *
     * @param jsonFile El archivo JSON que contiene los datos.
     * @param dtoClass La clase del DTO al que se debe convertir el JSON.
     * @param <T> El tipo de DTO al que se debe convertir el JSON.
     * @return El objeto DTO convertido.
     * @throws IOException Si ocurre un error al leer el archivo JSON.
     */
    public static <T> T convertJsonToDto(File jsonFile, Class<T> dtoClass) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonFile, dtoClass);
    }

}
