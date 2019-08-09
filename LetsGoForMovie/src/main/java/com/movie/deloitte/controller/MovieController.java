package com.movie.deloitte.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.deloitte.dao.MovieDAO;
import com.movie.deloitte.model.Movie;

@RestController
public class MovieController 
{
	@Autowired
	MovieDAO movieDAO;
	@RequestMapping("/getMovie")
	public String getMovie() {
		return "Watching movie";
	}
	
	@RequestMapping("/saveMovie")
	public String saveProduct() 
	{
		Movie movie=new Movie(1,"ZNMD","yashash",250);
		movieDAO.save(movie);
		return "Saving Movie";
	}
	
}
