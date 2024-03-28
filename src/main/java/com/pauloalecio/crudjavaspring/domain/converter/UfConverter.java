// package com.pauloalecio.crudjavaspring.domain.converter;

// import com.pauloalecio.crudjavaspring.enums.UF;

// import jakarta.persistence.AttributeConverter;
// import jakarta.persistence.Converter;

// import java.util.stream.Stream;

// @Converter(autoApply = true)
// public class UfConverter implements AttributeConverter<UF,String>{

//   @Override
//     public String convertToDatabaseColumn(UF uf) {
//         if (uf == null) {
//             return null;
//         }
//         return String.valueOf(uf.getSigla());
//     }

//     @Override
//     public UF convertToEntityAttribute(String sigla) {
//         if (sigla == null) {
//             return null;
//         }

//         return Stream.of(UF.values())
//           .filter(u -> u.getSigla().equals(sigla))
//           .findFirst()
//           .orElseThrow(IllegalArgumentException::new);
//     }
  
// }
