package com.pauloalecio.crudjavaspring.enums;

public enum Genero {

	MASCULINO(1, "MASCULINO"),
	FEMININO(2, "FEMININO");
	
	private int codigo;
	private String descricao;
	
	private Genero(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public static Genero toEnum(Integer codigo) {
		
		if (codigo == null) {
			return null;
		}
		
		for (Genero s : Genero.values()) {
			if (codigo.equals(s.getCodigo())) {
				return s;
			}
		}
		
		throw new IllegalArgumentException("Genero inválido: " + codigo);
	}
	
	
}
