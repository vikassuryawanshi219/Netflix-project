package com.example.service;

import com.example.model.Movies;

public interface IMoviesService {
void updateMovie(Movies movies);
void deleteMovies(Integer movieId);
Movies getMovieById(Integer movieId); 

}
