package com.devsuperior.dsmovie.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {
	
	/*private Movie movie;
	private User user;
	A instrução acima não pode ser usada pois no java quando usamos o JPA
	a chave primaria(o identificador de cada classe) deve ser apenas um atributo.
	Por ser uma chave composta será necessario criar uma chave auxiliar.
	*/
	
	@EmbeddedId
	private ScorePK id = new ScorePK();// ao criar uma chave composta no java tem que ser dado um new para garantir que ela seja instanciada
	private Double value;
	
	public Score() {
	}
	public void setMovie(Movie movie) {
		id.setMovie(movie);
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	
}
