package com.training.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

	private String Name;
	private String genre;
	private String language;
	private int movieId;

	public Movie(String name, String genre, String language, int movieId) {
		super();
		Name = name;
		this.genre = genre;
		this.language = language;
		this.movieId = movieId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	@Override
	public String toString() {
		return "Movie [Name=" + Name + ", genre=" + genre + ", language=" + language + ", movieId=" + movieId + "]";
	}

}
