package com.example.moviedatabase.model2;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity


public class databaseinsertionclass {
	@Id
	private String moviename;
	private String username;
	private float rating;
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
		public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
		public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "pojo [username=" + username + ", moviename=" + moviename + ", rating=" + rating
				+ "]";
	}
}
