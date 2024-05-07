package com.pauloalecio.crudjavaspring.enums;

import java.util.stream.Stream;

public enum Genero {

	MASCULINO("MASCULINO"),
	FEMININO("FEMININO");
	
	private String descricao;

	private Genero( String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao () {
		return descricao;
	}

	public static Genero ofDescricao(String desc){
		return Stream.of(Genero.values()).filter(genero -> genero.getDescricao().equalsIgnoreCase(desc))
		.findFirst().orElseThrow(() -> new IllegalArgumentException(String.format("Genero não encontrado com nome: %s",desc)));
	}

	
}
