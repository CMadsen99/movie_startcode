
package dto;

import entities.Movie;

public class MovieDTO {
    
    private String title;
    private String director;
    private int year;

    public MovieDTO(Movie movie) {
        this.title = movie.getTitle();
        this.director = movie.getDirector();
        this.year = movie.getYear();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
