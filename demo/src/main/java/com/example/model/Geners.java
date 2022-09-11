package com.example.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Geners {
	@Id
	@GeneratedValue(generator = "gener_id",strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "gener_id",sequenceName = "gener_id")
	private Integer generId;
	private String generName;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "netflix_id")
	private Netflix netflix;
	@JsonIgnore
	@ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinTable(name = "gener_movies", joinColumns = @JoinColumn( name="gener_id"),inverseJoinColumns = @JoinColumn( name="movie_id") )
	private Set<Movies> movieList;

	public Geners() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Geners(String generName, Set<Movies> movieList) {
		super();
		this.generName = generName;
		this.movieList = movieList;
	}

	public Integer getGenerId() {
		return generId;
	}

	public void setGenerId(Integer generId) {
		this.generId = generId;
	}

	public String getGenerName() {
		return generName;
	}

	public void setGenerName(String generName) {
		this.generName = generName;
	}

	public Netflix getNetflix() {
		return netflix;
	}

	public void setNetflix(Netflix netflix) {
		this.netflix = netflix;
	}

	public Set<Movies> getMovieList() {
		return movieList;
	}

	public void setMovieList(Set<Movies> movieList) {
		this.movieList = movieList;
	}

	@Override
	public String toString() {
		return "Geners [generName=" + generName + ", movieList=" + movieList + "]";
	}

	
}
