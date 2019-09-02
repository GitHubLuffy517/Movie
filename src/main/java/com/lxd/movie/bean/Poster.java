package com.lxd.movie.bean;

public class Poster {
	
	private int MovieId;
	private String MovieName;
	private int PostId;
	private String PostDescription;
	private String PostAddress;
	
	public int getPostId() {
		return PostId;
	}
	
	public void setPostId(int postId) {
		PostId = postId;
	}
	
	public int getMovieId() {
		return MovieId;
	}
	
	public void setMovieId(int movieId) {
		MovieId = movieId;
	}
	
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	
	public String getPostDescription() {
		return PostDescription;
	}
	
	public void setPostDescription(String PostDescription) {
		this.PostDescription = PostDescription;
	}
	public String getPostAddress() {
		return PostAddress;
	}
	
	public void setPostAddress(String PostAddress) {
		this.PostAddress = PostAddress;
	}

	@Override
	public String toString() {
		return "Poster [MovieId=" + MovieId + ", MovieName=" + MovieName + ", PostId=" + PostId + ", PostDescription="
				+ PostDescription + ", PostAddress=" + PostAddress + "]";
	}
}