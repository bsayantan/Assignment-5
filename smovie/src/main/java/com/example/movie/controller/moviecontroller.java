package com.example.movie.controller;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.movie.model.Pojo;

@RestController
public class moviecontroller {
	@Autowired
	private RestTemplate rest;
	
	
	@RequestMapping("/movie")
	public ModelAndView home()
	{
		ModelAndView  modelAndView = new ModelAndView(); 
		  modelAndView.setViewName("mov.html");
	      return modelAndView;
	}
	
	@RequestMapping("/movie/entry")
	public String signup(Pojo object)
	{
		String s=null;
		System.out.println(s);
		System.out.println(object);
		try {
		s=rest.postForObject("http://localhost:8090/mi2", object, String.class);
	//	s=rest.postForObject("http://demo/mi2", object, String.class);
		}
		catch (HttpStatusCodeException e) {
			e.getMessage();
		}
		System.out.println(s);
		return "movie details submitted";
		
	}

}
