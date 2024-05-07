package com.pauloalecio.crudjavaspring.domain.converter;

import com.pauloalecio.crudjavaspring.enums.Genero;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class GeneroConverter implements AttributeConverter<Genero,String>{

  @Override
    public String convertToDatabaseColumn(Genero genero) {
        if (genero == null) {
            return null;
        }
        return String.valueOf(genero.getDescricao());
    }

    @Override
    public Genero convertToEntityAttribute(String descricao) {
        if (descricao == null) {
            return null;
        }

        return Genero.ofDescricao(descricao);
    }
  
}
