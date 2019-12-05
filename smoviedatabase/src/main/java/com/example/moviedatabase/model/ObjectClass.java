package com.example.moviedatabase.model;

import javax.persistence.Entity;
import javax.persistence.Id;


public class ObjectClass {
	
	private String userid;
	private String username;
	private int movieid;
	private float rating;
	/*public ObjectClass(String userid, String username, int movieid, float rating) {
		super();
		this.userid = userid;
		this.username = username;
		this.movieid = movieid;
		this.rating = rating;
	}*/
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "pojo [userid=" + userid + ", username=" + username + ", movieid=" + movieid + ", rating=" + rating
				+ "]";
	}

}
