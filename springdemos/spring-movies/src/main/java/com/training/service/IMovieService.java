package com.training.service;

import java.util.List;

import com.training.model.Movie;

public interface IMovieService {

	List<Movie> getAll();
	List<Movie> getByName(String name);
	List<Movie> getByGenre(String genre);
	List<Movie> getByLanguage(String language);
	Movie getById(int Id);
}
