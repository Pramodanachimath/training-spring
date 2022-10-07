package com.training.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.training.Exception.IdNotFoundException;
import com.training.model.Movie;

@Component
public class MovieDAOImpl implements IMovieDAO {
	List<Movie> movieList = showDetails();

	@Override
	public List<Movie> findAll() {
		return showDetails();
	}

	@Override
	public List<Movie> findByName(String name) {

		return showDetails().stream().filter(type -> type.getName().contains("s"))
				.sorted((m1, m2) -> m1.getName().compareTo(m2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Movie> findByGenre(String genre) {
		return movieList.stream().filter(type -> type.getGenre().contains("r"))
				.sorted((m1, m2) -> m1.getName().compareTo(m2.getName())).collect(Collectors.toList());
	}

	@Override
	public List<Movie> findByLanguage(String language) {
		return movieList.stream().filter(type -> type.getLanguage().startsWith("K"))
				.sorted((m1, m2) -> m1.getName().compareTo(m2.getName())).collect(Collectors.toList());
	}

	@Override
	public Movie findById(int id) throws IdNotFoundException {

		Optional<Movie> movieById = showDetails().stream().findAny();

		if (movieById.isPresent()) {
			return movieById.get();

		}

		throw new IdNotFoundException("Id not Found");

	}

	private List<Movie> showDetails() {
		return Arrays.asList(new Movie("Paramatma", "Love", "Kannada", 101), new Movie("Premam", "Love", "Telagu", 102),
				new Movie("Dhoom3", "Action", "Hindi", 103), new Movie("Krish3", "Action", "Hindi", 104),
				new Movie("Rebel", "Comedy", "Telagu", 105), new Movie("Adhyaksha", "Comedy", "Kannada", 106),
				new Movie("Hulk", "Drama", "English", 107), new Movie("HongKong", "Drama", "English", 108),
				new Movie("EnaBela", "Horror", "English", 109), new Movie("Kalpana", "Horror", "Kannada", 110));

	}

}
