package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Movies;
import com.example.repository.IMoviesRepository;
@Service
public class MoviesServiceImp implements IMoviesService {
	
	@Autowired
    IMoviesRepository iMoviesRepository;
	
	@Override
	public void updateMovie(Movies movies) {
		iMoviesRepository.save(movies);
		
	}

	@Override
	public void deleteMovies(Integer movieId) {
		iMoviesRepository.deleteById(movieId);
		
	}

	@Override
	public Movies getMovieById(Integer movieId) {
		
		return iMoviesRepository.findById(movieId).get();
	}

}
