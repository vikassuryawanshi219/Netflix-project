package com.example.model;

import java.util.HashSet;


import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Movies {
	@Id
	@GeneratedValue(generator = "movie_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "movie_id",sequenceName = "movie_id")
	private Integer movieId;
	private String movieName;
	private String movieOrigin;
	private int rating;
	private String directerName;
	@JsonIgnore
	@ManyToMany(mappedBy = "Movies")
	private Set<Geners> gener =new HashSet<>();

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies(String movieName, String movieOrigin, int rating, String directerName) {
		super();
		this.movieName = movieName;
		this.movieOrigin = movieOrigin;
		this.rating = rating;
		this.directerName = directerName;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieOrigin() {
		return movieOrigin;
	}

	public void setMovieOrigin(String movieOrigin) {
		this.movieOrigin = movieOrigin;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getDirecterName() {
		return directerName;
	}

	public void setDirecterName(String directerName) {
		this.directerName = directerName;
	}

	public Set<Geners> getGener() {
		return gener;
	}

	public void setGener(Set<Geners> gener) {
		this.gener = gener;
	}

	@Override
	public String toString() {
		return "Movies [movieName=" + movieName + ", movieOrigin=" + movieOrigin + ", rating=" + rating
				+ ", directerName=" + directerName + "]";
	}

		
	

}
