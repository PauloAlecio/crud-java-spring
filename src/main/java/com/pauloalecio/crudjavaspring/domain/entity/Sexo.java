package com.pauloalecio.crudjavaspring.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

import com.pauloalecio.crudjavaspring.enums.Genero;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sexo")
public class Sexo implements Serializable{

	@Id
	private Integer id;

	@Enumerated(EnumType.STRING)
	// @Column(nullable = false, length = 9)
	private Genero nome;

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
		Sexo other = (Sexo) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Sexo [id=" + id + ", nome=" + nome + "]";
	}

}
