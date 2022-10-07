package com.training.dao;

import java.util.List;

import com.training.Exception.IdNotFoundException;
import com.training.Exception.MovieNotFoundException;
import com.training.model.Movie;

public interface IMovieDAO {

	List<Movie> findAll();
	List<Movie> findByName(String name) throws MovieNotFoundException;
	List<Movie> findByGenre(String genre)  throws MovieNotFoundException;
	List<Movie> findByLanguage(String language)  throws MovieNotFoundException;
	Movie findById(int id)  throws IdNotFoundException;
	
}
