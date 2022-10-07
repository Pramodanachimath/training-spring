package com.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.training.service.IMovieService;
import com.training.service.MovieServiceImpl;

public class MovieMain {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("com.training");
		
		IMovieService service=context.getBean(MovieServiceImpl.class,"MovieServiceImpl");
		service.getAll().forEach(System.out::println);
		System.out.println();
		
		service.getByName("Hulk").forEach(System.out::println);
		System.out.println();
		service.getByGenre("Comedy").forEach(System.out::println);
		System.out.println();
		service.getByLanguage("English").forEach(System.out::println);
		System.out.println();
		System.out.println(service.getById(105));
//		IMovieService service = new MovieServiceImpl();
//		System.out.println("Movie Lists");
//		service.getAll().forEach(System.out::println);
//		System.out.println();
//
//		System.out.println("Movie By Name");
//		service.getByName("Hulk").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Movie By Genre");
//		service.getByGenre("Comedy").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Movie By Language");
//		service.getByLanguage("English").forEach(System.out::println);
//		System.out.println();
//		System.out.println("Movie By Id");
//		System.out.println(service.getById(105));

	}

}
