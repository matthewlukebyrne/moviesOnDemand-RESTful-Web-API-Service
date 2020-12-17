/*
 *  This is the area where the required data is declated in the models package for the Movies information
 */
package groupaaa_final_webapi.models;

/**
 * @author x17492632
 * @author x17138744
 */

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Movie {
    private int movieID;
    private String name;
    private String summary;
    private String organized;
    //private String genre;
    

    
    public Movie() {
    }

    public Movie(int movieID, String name, String summary, String organized) {
        this.movieID = movieID;
        this.name = name;
        this.summary = summary;
        this.organized = organized;
        //this.genre = genre;
        
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
    
    public String getOrganized() {
        return organized;
    }

    public void setOrganized(String organized) {
        this.organized = organized;
    }
    
    /*public String getGenre() {
        return genre;
    }

     public void setGenre(String genre) {
        this.genre = genre;
    }*/
    
     public String printMovie() {
        String str = this.getMovieID() + " " + this.getName() + " "+ this.getSummary() + " "+ this.getOrganized();
        return str;
    }
}
