package com.pauloalecio.crudjavaspring.enums;

public enum UF {

	ACRE("Acre", "AC"),
	ALAGOAS("Alagoas", "AL"),
	AMAZONAS("Amazonas", "AM"),
	AMAPA("Amapá", "AP"),
	BAHIA("Bahia", "BA"),
	CEARA("Ceará", "CE"),
	DISTRITO_FEDERAL("Distrito Federal", "DF"),
	ESPIRITO_SANTO("Espírito Santo", "ES"),
	GOIAS("Goiás", "GO"),
	MARANHAO("Maranhão", "MA"),
	MINAS_GERAIS("Minas Gerais", "MG"),
	MATO_GROSSO_DO_SUL("Mato Grosso do Sul","MS"),
	MATO_GROSSO("Mato Grosso", "MT"),
	PARA("Pará", "PA"),
	PARAIBA("Paraíba", "PB"),
	PERNAMBUCO("Pernambuco", "PE"),
	PIAUI("Piauí", "PI"),
	PARANA("Paraná", "PR"),
	RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
	RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN"),
	RONDONIA("Rondônia", "RO"),
	RORAIMA("Roraima", "RR"),
	RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS"),
	SANTA_CATARINA("Santa Catarina", "SC"),
	SERGIPE("Sergipe", "SE"),
	SAO_PAULO("São Paulo", "SP"),
	TOCANTINS("Tocantins", "TO");

  private final String nome;
  private final String sigla;

  UF(final String nome, final String sigla) {
    this.nome = nome;
    this.sigla = sigla;
    
  }

  
  public static UF fromUF(final String nomeUf) {
    for (final UF uf : UF.values()) {
      if (uf.nome.equalsIgnoreCase(nomeUf)) {
        return uf;
      }
    }

    throw new IllegalArgumentException(nomeUf);
  }

 
  public static UF fromSigla(final String sigla) {
    for (final UF uf : UF.values()) {
      if (uf.sigla.equalsIgnoreCase(sigla)) {
        return uf;
      }
    }

    throw new IllegalArgumentException(sigla);
  }

 
  public String sigla() {
    return this.sigla;
  }

 
  public String nome() {
    return this.nome;
  }

  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("UnidadeFederacao{");
    sb.append("nome='").append(nome).append('\'');
    sb.append(", sigla='").append(sigla).append('\'');
    sb.append('}');
    return sb.toString();
  }
}