package com.pauloalecio.crudjavaspring.enums;


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
	
	// public static UF toEnum(String nome) {
		
	// 	if (nome == null) {
	// 		return null;
	// 	}
		
	// 	for (UF uf : UF.values()) {
	// 		if (nome.equals(uf.getNome())) {
	// 			return uf;
	// 		}
	// 	}
		
	// 	throw new IllegalArgumentException("Id inválido: " + nome);
	// }


  // private final String nome;
  // private final String sigla;

  // UF(final String nome, final String sigla) {
  //   this.nome = nome;
  //   this.sigla = sigla;
    
  // }

  
  // public static UF fromUF(final String nomeUf) {
  //   for (final UF uf : UF.values()) {
  //     if (uf.nome.equalsIgnoreCase(nomeUf)) {
  //       return uf;
  //     }
  //   }

  //   throw new IllegalArgumentException(nomeUf);
  // }

 
  // public static UF fromSigla(final String sigla) {
  //   for (final UF uf : UF.values()) {
  //     if (uf.sigla.equalsIgnoreCase(sigla)) {
  //       return uf;
  //     }
  //   }

  //   throw new IllegalArgumentException(sigla);
  // }

 
  // public String sigla() {
  //   return this.sigla;
  // }

 
  // public String nome() {
  //   return this.nome;
  // }

  
  // @Override
  // public String toString() {
  //   final StringBuilder sb = new StringBuilder("UnidadeFederacao{");
  //   sb.append("nome='").append(nome).append('\'');
  //   sb.append(", sigla='").append(sigla).append('\'');
  //   sb.append('}');
  //   return sb.toString();
  // }
}