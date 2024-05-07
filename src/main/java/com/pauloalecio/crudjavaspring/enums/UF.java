package com.pauloalecio.crudjavaspring.enums;

import java.util.stream.Stream;

public enum UF {

	ACRE(1,"Acre", "AC"),
	ALAGOAS(2,"Alagoas", "AL"),
	AMAZONAS(3,"Amazonas", "AM"),
	AMAPA(4,"Amapá", "AP"),
	BAHIA(5,"Bahia", "BA"),
	CEARA(6,"Ceará", "CE"),
	DISTRITO_FEDERAL(7,"Distrito Federal", "DF"),
	ESPIRITO_SANTO(8,"Espírito Santo", "ES"),
	GOIAS(9,"Goiás", "GO"),
	MARANHAO(10,"Maranhão", "MA"),
	MINAS_GERAIS(11,"Minas Gerais", "MG"),
	MATO_GROSSO_DO_SUL(12,"Mato Grosso do Sul","MS"),
	MATO_GROSSO(13,"Mato Grosso", "MT"),
	PARA(14,"Pará", "PA"),
	PARAIBA(15,"Paraíba", "PB"),
	PERNAMBUCO(16,"Pernambuco", "PE"),
	PIAUI(17,"Piauí", "PI"),
	PARANA(18,"Paraná", "PR"),
	RIO_DE_JANEIRO(19,"Rio de Janeiro", "RJ"),
	RIO_GRANDE_DO_NORTE(20,"Rio Grande do Norte", "RN"),
	RONDONIA(21,"Rondônia", "RO"),
	RORAIMA(22,"Roraima", "RR"),
	RIO_GRANDE_DO_SUL(23,"Rio Grande do Sul", "RS"),
	SANTA_CATARINA(24,"Santa Catarina", "SC"),
	SERGIPE(25,"Sergipe", "SE"),
	SAO_PAULO(26,"São Paulo", "SP"),
	TOCANTINS(27,"Tocantins", "TO");

	private Integer codigo;
  private String nome;
	private String sigla;
	
	UF(Integer codigo, String nome, String sigla) {
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}
	
	public String getSigla () {
		return sigla;
	}
	

	public static UF ofSigla(String sigla){
		return Stream.of(UF.values()).filter(uf -> uf.getSigla().equalsIgnoreCase(sigla))
		.findFirst().orElseThrow(() -> new IllegalArgumentException(String.format("Estado não encontrado com a sigla: %s",sigla)));
	}

	public static UF ofNome(String nome){
		return Stream.of(UF.values()).filter(uf -> uf.getNome().equalsIgnoreCase(nome))
		.findFirst().orElseThrow(() -> new IllegalArgumentException(String.format("Estado não encontrado com nome: %s",nome)));
	}



}