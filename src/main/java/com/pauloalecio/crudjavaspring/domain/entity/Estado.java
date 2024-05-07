package com.pauloalecio.crudjavaspring.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pauloalecio.crudjavaspring.enums.UF;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estado")
public class Estado implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	// @Column(name = "sigla", length = 2, nullable = false)
	private UF sigla;
	
	@Enumerated(EnumType.STRING)
	// @Column(name = "nome", length = 20, nullable = false)
	private UF nome;
	
	@JsonIgnore
	@OneToMany(mappedBy="estado")
	private final List<Cidade> cidades = new ArrayList<>();

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", sigla=" + sigla + ", nome=" + nome + "]";
	}



	
	
	
}
